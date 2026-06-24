//Parent class
class fruits {
}

// subclass
class Apple extends fruits {
}

// subclass
class Mango extends fruits {
}

// other class
class stone {
}

// security guard
// those extends fruit subclasses in place of T
class juiceMaker<T extends fruits> {
    public void makeJuice(T item) {
        System.out.println(item.getClass().getSimpleName());
    }
}

public class GenericsTypes {

    public static void main(String[] args) {
        // Apple check is that fruit yes makejuice
        juiceMaker<Apple> j = new juiceMaker<>();
        j.makeJuice(new Apple());

        // check is that fruit? yes makejuice
        juiceMaker<Mango> m = new juiceMaker<>();
        m.makeJuice(new Mango());

    }
}
