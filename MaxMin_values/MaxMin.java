import java.util.Scanner;
class ArraysToMethod{
    int max = 0;
    public int max(int [] array){
        for(int i = 0 ; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            
            }
        }
        return max;
    }
    
    public int min(int [] array){
        int min = array[0];
        for(int i = 0 ; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            
            }
        }
        return min;
    }
    
}
class MaxMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter The size of array That will Be created ");
        int size = sc.nextInt();
        int myArray[] = new int[size];
        System.out.println("Enter the elements of an array");
        for(int i = 0 ; i<size ; i++){
            myArray[i] = sc.nextInt();
        }
        ArraysToMethod ob = new ArraysToMethod();
        System.out.println("Max of element of an array "+ob.max(myArray));
        System.out.println("Min of element of an array "+ob.min(myArray));
        
    }
}
