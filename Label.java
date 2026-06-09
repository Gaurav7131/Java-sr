public class Label {
    public static void main(String[] args) {
        // Lable name
        Search_Home:
        // [room >> box] we used for becoz we know exactly how many times we want to
        // iterate
        for (int room = 1; room <= 3; room++) {
            for (int box = 1; box <= 3; box++) {
                System.out.println("Checking" + room + "Box" + box);

                // if we found toy in box2 of room2 then
                if (room == 2 && box == 2) {
                    System.out.println("hey I found the toy");

                    // stop the entire loop rather than finding room3>box3
                    break Search_Home;
                }

            }

        }
        System.out.println("I Am Going play");
    }
}
