public class Continue {

    public static void main(String[] args) {
        for (int grapes = 1; grapes <= 5; grapes++) {
            System.out.println("Grapes" + grapes);

            // we found 3 grapes spoiled then
            if (grapes == 3) {
                System.out.println("third grape is spoiled");
                continue;
            }

        }
        System.out.println("Skip the box");
    }

}
