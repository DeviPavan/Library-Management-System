package Interface;

interface WIFI1 {
     void one();
}
interface WIFI2 {
    void two();
    void one();
}
class Dev implements WIFI1,WIFI2
{

    @Override
    public void one() {
        System.out.println("WIFI1");
    }

    @Override
    public void two() {
        System.out.println("WIFI2");
    }
public static void main(String args[]){
WIFI1 obj1=new WIFI1() {
    @Override
    public void one() {
        System.out.println("void one");

    }
};

}
}