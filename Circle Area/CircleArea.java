class Circle{
    private double radius;
     String color;
    // default constructor with default values
    Circle(){
        this.radius = 1.0;
        this.color = "Red";
    }
    // argumentative constructor with double typed parametrized
    Circle(double r){
        this.radius = r;
        this.color = "Red";
    }
    public double getRadius(){
        return radius;
        }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
class CircleArea{
    public static void main(String[] args){
        Circle ob = new Circle(8.0);
        System.out.println("Radius of Circle "+ob.getRadius()+" Color of Cirle "+ob.color);
        System.out.println("Area of circle "+ob.getArea());
    }
}
//                      GOOD LUCK HAVE FUN WITH PROGRAMS
