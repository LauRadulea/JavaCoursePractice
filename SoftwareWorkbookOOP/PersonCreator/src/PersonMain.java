public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("James Peterson", 34, 180, 73.5);
        System.out.println("Person 1 detail: " + p1.getName() + " - age " + p1.getAge() + ", height " + p1.getHeight() + ", weight " + p1.getWeight());

        Person p2 = new Person("Bob Thornley",25,171,68.2);
        System.out.println("Person 2 detail: " + p2.getName() + " - age " + p2.getAge() + ", height " + p2.getHeight() + ", weight " + p2.getWeight());

        // p2.growOlder();
        // System.out.println("Person 2 details updated: " + p2.getName() + " - age " + p2.getAge() + ", height " + p2.getHeight() + ", weight " + p2.getWeight());

    }
}
