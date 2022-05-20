class Rectangle{
    private double length;
    private double width;
// constructor with default values
    Rectangle(){
        length = 1;
        width  = 1;
    }
    // setter method for length
    public void setLength(double l)
    {
        if(l>0.0 && l<20.0){
        this.length = l;
        }
    }
    // getter method for length
    public double getLength()
    {
        return length;
    }
    // setter method for width
    public void setWidth(double w)
    {
        if(w>0.0 && w<20.0){
            this.width = w;
            }
    }
    // getter method for width
    public double getWidth()
    {
        return width;
    }
    // method for calculating parameter of rectangle
    public void parameter()
    {
        double para = 2*(length + width);
        System.out.println("Parameter of rectangle "+para);
    }
    // method for calculating Area of rectangle
    public void Area()
    {
        double area = width*length;
        System.out.println("Area of rectangle "+area);
    }



}
class Exe4{
    public static void main(String[] args){
        Rectangle obj  = new Rectangle();
        obj.setLength(12.0);
        System.out.println("Length of rectangle: "+obj.getLength());
        obj.setWidth(8.0);
        System.out.println("Width of rectangle: "+obj.getWidth());

        obj.parameter();
        obj.Area();
        
    }
}
