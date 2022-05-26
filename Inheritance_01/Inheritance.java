class ParentClass{

    ParentClass()
    {
        System.out.println("Constructor of parent class");
    }
}
 class ChildClass extends ParentClass{

   // super.ParentClass();
   // Parentclass constructor automatically invokes here, no need to define super keyword
    ChildClass()
    {
        System.out.println("Constructor of child class");
    }
}
class Inheritance{
    public static void main(String[] args){
      // obj of child class
        new ChildClass();
    }
}
