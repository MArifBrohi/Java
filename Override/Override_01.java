class A{
   void show(){
        System.out.println("Cant say color of circle");
    }
}
class B extends A{
  
    void show(){
        super.show();  //if you don't use super keyword then class B method will be invoked
        System.out.println("color is red");
    }
}
class Override_01
{
    public static void main(String[] args){
        B ob = new B();
        ob.show();
    }
}
