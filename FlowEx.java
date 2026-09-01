import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class FlowEx {

    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        Subscriber<String> s = new Subscriber<>() {
            private Subscription subscription;

            @Override
            public void onSubscribe(Subscription s) {
                this.subscription = s;
                s.request(1);// subscriber
            }

            @Override
            public void onNext(String item) {
                System.out.println("Received:" + item);
                subscription.request(1);// subscription
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Done:)");
            }

        };
        publisher.subscribe(s);
        publisher.submit("Asus Vivobook 15");

        Thread.sleep(1000);

        publisher.close();
    }
}