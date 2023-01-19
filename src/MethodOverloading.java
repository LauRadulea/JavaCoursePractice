public class MethodOverloading {
    public static void main(String[] args) { //main method
        fName(); // passing no arguments
        fName("William"); // passing 1  parameter
        fName ("Diana", "Spencer"); // passing 2 paramters
        }    // methods to pass on first name

    static void fName() {
        System.out.println("Your name is Ada Lovelace");
    }
    static void fName(String firstName) {
        // passing fname  parameter
        System.out.println(firstName + " Smith");
    }
    static void fName (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}
