import java.util.Scanner;
class Main{
  public static void main(String[] args){
    //Scanner is used to take input 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter 2nd number: ");
    int n2 = sc.nextInt();
    System.out.println("Enter 3rd number: ");
    int n3 = sc.nextInt();
    System.out.println("Minimum number is ");
    //accessing method 
   System.out.println(Small(n1,n2,n3));
  }
  // method with return type
  public static int Small(int x1 , int x2 , int x3){
    return Math.min(Math.min(x1,x2),x3);
  }
}