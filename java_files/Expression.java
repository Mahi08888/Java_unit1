class ExpressionPrecedenceDemo {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        int result1 = a + b * c;        // precedence
        int result2 = (a + b) * c;      // parentheses
        int result3 = a + b * c - 4 / 2;

        System.out.println("a + b * c = " + result1);
        System.out.println("(a + b) * c = " + result2);
        System.out.println("a + b * c - 4 / 2 = " + result3);

        double result4 = a + b / (double) c;
        System.out.println("a + b / (double)c = " + result4);
    }
}
