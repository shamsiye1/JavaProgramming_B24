package day59_exceptions;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) { // null

        if (name == null || name.isEmpty()) { // null.isEmpty()
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {

        if (age < 0 || age > 150) {

            throw new Exception();
        }

        this.age = age;
    }
}
