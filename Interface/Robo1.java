package Interface;

 public interface Robo1 {
    public abstract void one();
}

class Devi implements Robo1,Robo2
{
  public void one()
    {
        System.out.println("This is Robo1 method");
    }
    public void two()
    {
    System.out.println("This is Robo2 method");
    }

}