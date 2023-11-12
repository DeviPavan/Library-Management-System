package InterfaceEX;

public class Dog extends Frog implements Animal,TerrestrialAnimal {
    public String color = "Parent color";
    private String name;
    private String breed;
    private int age;

    public String getcolor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getname() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void barking() {
        System.out.println("Dog Barks");
    }

    public void eating() {
        System.out.println("Dog Eats");
    }

    @Override
    public void specialCapabilities() {
        System.out.println("Dog Barks");
    }

    @Override
    public void livesIn() {
        System.out.println("Dog Lives on Land");

    }
    //public static void main
}
