enum Tshirt {
    SMALL(100),
    MEDIUM(200),
    LARGE(300);

    // set price
    int price;

    // constructor for price
    Tshirt(int p) {
        price = p;
    }

    // get price of t shirt
    public int getPrice() {
        return price;

    }
}

class Enum {
    public static void main(String[] args) {
        System.out.println("Welcome to shop");
        // Tshirt size
        Tshirt mysize = Tshirt.MEDIUM;
        System.out.println("urs chose size" + mysize);
        System.out.println("Price is:" + mysize.getPrice());

        // compare size
        if (mysize == Tshirt.MEDIUM) {
            System.out.println("Suits u");
        } else {
            System.out.println("Not suits u");

        }

        // check all avaialaible size using values methof
        for (Tshirt size : Tshirt.values()) {
            System.out.println("size" + size + "|price is" + size.getPrice());
        }

    }
}