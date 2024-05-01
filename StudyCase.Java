public class StudyCase {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java StudyCase [expression]");
            return;
        }

        String expression = args[0];
        String[] elements = expression.split("\\s*\\*\\s*");

        int result = 1;
        for (String element : elements) {
            result *= Integer.parseInt(element);
        }

        System.out.println(expression + " - " + (result % 2 == 0 ? "Genap" : "Ganjil"));
    }
}
