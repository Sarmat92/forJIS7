package JavaHomework.Lectures_6.Objects.Dog;

public class Dog {

    private String color;
    private String name;
    private Integer age;

    public Dog(String color, String name, Integer age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void voice (){
        System.out.println("will rap for fod");
    }

    public void sleep(){
        System.out.println("Zzzzzz");
    }

    public void eat(){
        System.out.println("OM-NOM-NOM");
    }

}
