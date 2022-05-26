class A{

    void a(){
        System.out.println("SUper class Method");
    }
}

class B{
        void b(){
            System.out.println("Child class method");
        }
}
class C extends A{
    void c()
    {
        super.a();
        System.out.println("child class method");
       
    }
}
// Error will occure because java does'nt support multiple Inheritance
class C extends B{
    void f(){
        super.b();
        System.out.println("Child class extends b");

    }
}
class Inheritance_03{
    public static void main(String[] args){
        C ob =  new C();
        ob.c();
        ob.f();
    }
}
