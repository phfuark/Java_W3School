public class AddingVariablesInPrint {
    public static void main(String[] args) {
        String firstName = "John ";
        String lastName = "Doe";
        int x = 5;
        int y = 6;

        //You can use the '+' character to add a variable to another variable
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //For numeric values, the + character works as a mathematical operator
        System.out.println(x + y); // Print the value of x + y
    }
}
