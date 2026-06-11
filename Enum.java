//Enum 
enum Tshirt {
    SMALL(100),
    MEDIUM(200),
    LARGE(300);

    // set price
    int price;

    Tshirt(int p) {
        price = p;

    }

    public int getPrice() {
        return price;

    }
}

class Enum {
    public static void main(String[] args) {
        System.out.println("Welcome to Shop");

        // ur chose size and thier price
        Tshirt mysize = Tshirt.MEDIUM;
        System.out.println("Urs choose size is:" + mysize);
        System.out.println("Price is" + mysize.getPrice());

        // comapre with ==
        if (mysize == Tshirt.MEDIUM) {
            System.out.println("Suits u");
        } else {
            System.out.println("not suits u");
        }

        // check all size and their prices in shop
        for (Tshirt size : Tshirt.values()) {
            System.out.println("Size" + size);
            System.out.print("Price is $" + size.getPrice());

        }
    }
}