class OperatorDemo {
    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5;
        System.out.println("c += 5  -> " + c);
        c *= 2;
        System.out.println("c *= 2  -> " + c);
    }
}
