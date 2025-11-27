class LoopDemo {
    public static void main(String[] args) {

        System.out.println("=== while loop ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("while count: " + i);
            i++;
        }

        System.out.println("\n=== do-while loop ===");
        int j = 1;
        do {
            System.out.println("do-while count: " + j);
            j++;
        } while (j <= 5);

        System.out.println("\n=== for loop (1 to 5) ===");
        for (int k = 1; k <= 5; k++) {
            System.out.println("for count: " + k);
        }
    }
}
