package InterfaceEX;

public class Frog implements Animal,TerrestrialAnimal,AcquaticAnimal {
    @Override
    public void specialCapabilities() {
        System.out.println("Frog is an Amphibian animal");
        System.out.println("Frog lives in both land and water");
    }

    @Override
    public void livesIn() {
        System.out.println("Frog can live both on land and in water");

    }
}
