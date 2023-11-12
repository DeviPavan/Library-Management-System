package Interface;

 interface Box1 {
    int Cones=100;
  //  String Box1="Cone";
    double height1=10;
     double width1=20;
     double depth1=30;
     void print();
    //void add();

}
interface Box2{
    int Rectangles=250;
   // String Box2="Rectangle";
    double height2=110;
    double width2=120;
    double depth2=130;
    void print();

}
//interface Box3 {
  //  int Squares = 25;
    //  String Box3 = "Squares";
    //double height3 = 15;
    //double width3 = 15;
    //double depth3 = 15;

   // void print();
//}

    class Boxes implements Box1, Box2 {
        @Override
        public void print() {

            System.out.println("Height1:" + height1);
            System.out.println("width1:" + width1);
            System.out.println("Depth2:" + depth2);
            System.out.println("Height2:" + height2);
        }

        public static class Box {
            public static void main(String args[]) {
                Boxes b = new Boxes();
                b.print();

            }
        }
    }
