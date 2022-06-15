interface myInterface{
    void meth1();
    void meth2();
    void meth3();
    void meth4(); //it will give error, if its not defined in class A
} 
class A implements myInterface{
    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
     public void meth3(){
         System.out.println("Meth 3");          
    }
    public void meth4(){
        System.out.println("Meth 4 implementation"); // makes class A obj, 
                                                        //if you want to print this one
    }
}
class B extends A{
    @Override
    public void meth4(){
        System.out.println("Meth 4 ");
    }
} 
class InterfaceDemo{
    public static void main(String [] args){
        B ob = new B();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        ob.meth4();
        A obA = new A(); // as described at 18 line
        obA.meth4();
    }
}
