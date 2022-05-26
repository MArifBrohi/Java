//this program is all about heirachical where child classes extends 
//properties of same one class...........
class A{
    A()
    {
        System.out.println("Constructor in super class or base class");
    }
    void SuperA()
    {
        System.out.println("Method in Super class");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor in child class b");
    }
    void ChildB()
    {
        super.SuperA();
        System.out.println("Method in child class B");
    }
}
class C extends A{
    C()
    {
        System.out.println("Constructor in Child class C");
    }
    void ChildC()
    {
        super.SuperA();
        System.out.println("Method in child class C");
    }
}

class Inheritance_04{
    public static void main(String[] args){
        C ob1 = new C();
        // it access its own and super class properties(not Class B)
        ob1.ChildC();
        B ob2 = new B();
         // it access its own and super class properties(not class C)
        ob2.ChildB();


    }
}
