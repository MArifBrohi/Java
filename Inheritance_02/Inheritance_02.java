class A{
    A()
    {
        System.out.println("Constructor of parent class");
    }

    void disp()
    {
        System.out.println("Method of parent class");
    }
}
class B extends A{
    B()
    {
        System.out.println("Constructor of child class");
    }
    void disp1()
    {
        System.out.println("Method of child class");
        super.disp();
    }
   
}
class Inheritance_02{
    public static void main(String[] args){
        B ob = new B();
      // constructor of class A and class B automatically invokes
        ob.disp1();
    }
}
