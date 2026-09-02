class ByteCodeGenFeatureEx {
    /**
     * @Summary calculated interest rate
     * @param args balance account balance
     * @return computed tax value
     */
    public double calculateBal(double balance) {
        return balance * 0.05;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        for (int n : numbers) {
            System.out.println(n);
        }

        // Java 10 optimized bytecode equivalent:
        int[] arr = numbers;
        int len = arr.length; // Fetched once
        for (int i = 0; i < len; i++) {
            int n = arr[i];
            System.out.println(n);
        }

        ByteCodeGenFeatureEx ex = new ByteCodeGenFeatureEx();
        System.out.println(ex.calculateBal(100));

    }
}
