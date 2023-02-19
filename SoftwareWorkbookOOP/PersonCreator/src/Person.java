// blueprint of our person objects
public class Person {
    //declare private attributes for encapsulation purpose
    private String name;
    private int age;
    private double height;
    private double weight;

    //method constuctor
    public Person(String name, int age, double height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    //setter method:  no static keyword, void return type, pass parameters
    public void setName (String name){
        this.name = name;
    }

    //getter method: return type accordingly, no parameter passing
    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void growOlder () {
        setAge(getAge()+1);
        setHeight(getHeight()-1);
        setWeight(getWeight()-0.5);
    }
}
