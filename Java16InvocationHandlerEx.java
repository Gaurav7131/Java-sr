import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Java16InvocationHandlerEx {
    // interface
    public interface OrderService {
        default String getOrderStatus() {
            return "ORDER_RECEIVED";
        }
    }

    public static void main(String[] args) {
        // Java 16:invocationMethodHandler.invokeDefault dispatch
        OrderService proxy = (OrderService) Proxy.newProxyInstance(OrderService.class.getClassLoader(),
                new Class<?>[] { OrderService.class }, (proxyObj, method, methodargs) -> {
                    if (method.isDefault()) {
                        return InvocationHandler.invokeDefault(proxyObj, method, methodargs);
                    }
                    return null;
                });
        System.out.println("Order Service Status:" + proxy.getOrderStatus());// ORDER_RECEIVED
    }
}