class Outer{
    int outer_x = 100;
  // this class to be called in Main Method
    void Test(){
    for(int i = 0 ; i<10 ; i++){
        class Inner{
            void display(){
                System.out.println(outer_x);
            }
        }
      
        Inner in = new Inner();
        // this will loop 10 times
        in.display();
    }
    }
}
class NestedClass{
    public static void main(String[] args){
        Outer out = new Outer();
        out.Test();
    }
}
