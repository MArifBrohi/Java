import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try{
         methodA();
        }
        catch(ArithmeticException ex){
        System.out.println("ArithmeticException occured: ");
            ex.printStackTrace();
        }
    }
    public static void methodA() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        int a = 220 , c;
        System.out.println("Enter number: ");
        int b = sc.nextInt();
        if(b==0)
        throw new ArithmeticException();
        else
        c = a/b;
        System.out.println("Value is: "+c);
    }
    
}
