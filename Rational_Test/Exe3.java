
class Rational{
        private int numerator;
        private int dominator;

        //constructor with default values
        public Rational()
        {
            numerator = 4;
            dominator = 5;
        }
        //constructor with initialized values
        public Rational(int numerator , int dominator)
        {
            this.numerator = numerator;
            this.dominator = dominator;
        }

        // operation;

        // addition operations
        public Rational add(Rational r1 , Rational r2)
        {
     
            int new_numerator = r1.numerator * r2.dominator ; 
            int new_dominator = r1.dominator * r2.dominator;
            // better way use new keyword, don't make compiler confuse :)
            return new Rational(new_numerator , new_dominator); 
        }
        // substraction operations
        public Rational sub(Rational r1, Rational r2){
            int new_numerator = (r1.numerator * r2.dominator) - (r2.numerator * r1.dominator);
            int new_dominator = r1.dominator * r2.dominator;

             // better way use new keyword, don't make compiler confuse :)
            return new Rational(new_numerator, new_dominator);
        }
        // multiplication operations
        public Rational multply(Rational r1, Rational r2){
            int new_numerator = r1.numerator * r2.numerator;
            int new_dominator = r1.dominator * r2.dominator;
            
             // don't make compiler confuse :) use new keyword!
            return new Rational(new_numerator, new_dominator);
        }
        // division of 2 Rational numbers
        // just cross multiplication , there is no rocket science :)
        public Rational division(Rational r1, Rational r2){
        int new_numerator = r1.numerator * r2.dominator;
        int new_dominator = r1.dominator * r2.numerator;
        return new Rational(new_numerator, new_dominator);
    }
    // Rational numbers in floating-point format
    public void Print()
    {
        double num  = this.numerator;
        double dom = this.dominator;
        double result = num/dom;
        System.out.println(result);
    }

        public String toString()
        {
            return numerator+"/"+dominator;
        }




}
class Exe3{
    // Main method, compiler always checks this portion first 

    public static void main(String[] args){
    Rational obj1 = new Rational(4 , 8);
    Rational obj2 = new Rational(6 , 2);
    Rational objTest = new Rational(); // I found this very useful for easy to access values throuh toString()
    System.out.println("Value of obj1 "+obj1);
    System.out.println("Value of obj2 "+obj2);

    objTest = objTest.add(obj1 , obj2);
                        // r1  ,  r2
        // no need to put dot(.),  if you are accessing through toString()
    System.out.println("Value of objTest after addition with default values : " + objTest);
    
    objTest = objTest.sub(obj1 , obj2);
                        // r1  ,  r2
        // no need to put dot(.),  if you are accessing through toString()
    System.out.println("Value of objTest after substraction with default values : " + objTest);

    objTest = objTest.multply(obj1 , obj2);
                        // r1  ,  r2
    // no need to put dot(.),  if you are accessing through toString()
    System.out.println("Value of objTest after multiplication with default values : " + objTest);

    objTest = objTest.division(obj1 , obj2);
                             // r1  ,  r2
    // no need to put dot(.),  if you are accessing through toString()
    System.out.println("Value of objTest after multiplication with default values : " + objTest);
    System.out.println("Rational in floating point");
    objTest.Print();
    }
}
