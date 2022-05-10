import java.util.Scanner;
//In this program you are supposed to give input of three numbers and the output will their average
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Printing average of 3 numbers\n ");
    System.out.println("Enter number ");
    int a = sc.nextInt();
    System.out.println("Enter number ");
    int b = sc.nextInt();
    System.out.println("Enter number ");
    int c = sc.nextInt();
   
    System.out.println("AVerage of numbers "+ average(a,b,c));
    
  }
  public static double average(double a, double b , double c){
    double ave =(a+b+c)/3; 
  return ave;
  
   }
}
