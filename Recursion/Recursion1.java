// Recursion between 5 to 10 addition
public class Recursion1 {
    public static void main(String[] args){
        int result  = sum(5 , 10);
        System.out.println(result);
    }

    // recursion method
    public static int sum(int start , int end){
        if(end>=start)
        {
            return end+sum(start, end-1);
            //10+sum(10-1)+9+sum(9-1)+8+sum(8-1)+7...+
        }
        else 
            return 0;

    }

    
}
