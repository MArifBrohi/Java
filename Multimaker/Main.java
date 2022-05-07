class Multimaker{
    private String shape ="rectangular";
    private int model = 22;
    
    public void draw(){
        System.out.println("its printing");
    }
    void setmodel(){
        this.model = model;
    }
    void setshape(){
        this.shape = shape;
    }
    public int getmodel(){
        return model;
    }
    public String getshape(){
        return shape;
    }
    public String toString()
    {
        return "{Multimaker : { model: " + model + " }}\n";
    }
    
}
class Main{
    public static void main(String[] args){
        Multimaker ob = new Multimaker();
        ob.draw();
       
        System.out.println(ob);
        System.out.println(ob.getmodel());
        System.out.println(ob.getshape());
    }
}
