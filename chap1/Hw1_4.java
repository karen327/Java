package school.chap1;

public class Hw1_4 {
    public static void main(String[] args) {
        Person myself = new Person();
        myself.printInfo();
    }
}

class Person{
    String name = "Karen";
    String gender = "Woman";
    String hometown = "Fu Jian";
    String address = "WHU";

    public void printInfo(){
        System.out.println("NAME: " + name);
        System.out.println("GENDER: " + gender);
        System.out.println("HOMETOWN: " + hometown);
        System.out.println("ADDRESS: " + address);
    }
}
