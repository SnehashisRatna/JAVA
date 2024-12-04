class Pen {
    String color;
    String type;

    /**
     * 
     */
    public void write() {
        System.out.print("writing Some");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

}

public class OOPSS {

    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.write();

        Student s1 = new Student();
        s1.name = "sneha";
        s1.age = 22;
        s1.printInfo(s1.age);

    }
}