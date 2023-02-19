// Create a Main class
public class Main {

// Create a class attribute integer called x
public int x;

// Create a class constructor for the Main class
// Set the initial value for the class attribute x as 5
public Main() {
    this.x = 5;
}

//Add a main method
public void printX(){
    System.out.println("the value of x is " + this.x);
}

    public static void main(String[] args) {
        Main myObj = new Main();

        myObj.printX();
    }
}