public class IfStatement {
    public static void main(String[] args) {
        // this program will check if the number is positive
        String  trafficLight = "red";
        // if statement to check the condition
        if (trafficLight == "green") { // when it is true, execute the body of the if stat
            System.out.println("You can cross the street");// the body of the if statement
        }
        else if(trafficLight == "red") {
            System.out.println("Stay on the spot. Don't cross  the street");
        } else if (trafficLight == "yellow") {
            System.out.println("Don't cross yet. Wait patiently");
        }

    }
}
