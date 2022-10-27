package hm5;

public class Dog {
    private   String name;
    private int age;
    private String color;
    private int height;

    public Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }

    public Dog(String color, int height) {
        this.color = color;
        this.height = height;
        this.age=5;
        this.name= "good_boy";

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }
}



