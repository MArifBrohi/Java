class Rational{
    // member variables
    private int nomerator, denominator;

    // constructors
    public Rational(){
        nomerator = 2;
        denominator = 4;
    }
    public Rational(int nomerator, int denominator){
        this.nomerator = nomerator;
        this.denominator = denominator;
    }

    // operational methods
    // addition of 2 Rational numbers
    public Rational add(Rational r1, Rational r2){
        int new_nomerator = (r1.nomerator * r2.denominator) + (r2.nomerator * r1.denominator);
        int new_denominator = r1.denominator * r2.denominator;
        return new Rational(new_nomerator, new_denominator);
    }

    // subtraction of 2 Rational numbers
    public Rational sub(Rational r1, Rational r2){
        int new_nomerator = (r1.nomerator * r2.denominator) - (r2.nomerator * r1.denominator);
        int new_denominator = r1.denominator * r2.denominator;
        return new Rational(new_nomerator, new_denominator);
    }

    // multiplication of 2 Rational numbers
    public Rational multply(Rational r1, Rational r2){
        int new_nomerator = r1.nomerator * r2.nomerator;
        int new_denominator = r1.denominator * r2.denominator;
        return new Rational(new_nomerator, new_denominator);
    }

    // division of 2 Rational numbers
    public Rational division(Rational r1, Rational r2){
        int new_nomerator = r1.nomerator * r2.denominator;
        int new_denominator = r1.denominator * r2.nomerator;
        return new Rational(new_nomerator, new_denominator);
    }

    //printing in floating points
    public void print(){
        double nom = this.nomerator;
        double denom = this.denominator;
        double result = nom / denom;
        System.out.println(result);
    }

    public String toString(){
        return  nomerator + "/" + denominator;
    }
}

public class RationalTest{
    public static void main(String args[]){
        Rational obj1;
        Rational obj2;
        Rational objTest;

        obj1 = new Rational(3,5);
        obj2 = new Rational(2,4);
        objTest = new Rational();

        System.out.println("Value of obj1 is : " + obj1);
        System.out.println("Value of obj2 is : " + obj2);

        // operations with default values
        objTest = objTest.add(obj1,obj2);
        System.out.println("Value of objTest after addition with default values : " + objTest);
        objTest.print();

        objTest = objTest.sub(obj1,obj2);
        System.out.println("Value of objTest after subtraction with default values : " + objTest);
        objTest.print();

        objTest = objTest.multply(obj1,obj2);
        System.out.println("Value of objTest after multiply with default values : " + objTest);
        objTest.print();

        objTest = objTest.division(obj1,obj2);
        System.out.println("Value of objTest after division with default values : " + objTest);
        objTest.print();
        

    }
}