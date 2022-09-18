import java.util.Arrays;
class CopyArray_02{
    public static void main(String[] args)
    {
        int orignal[] = {12,23,45,67,89,56,78};
        System.out.println("Array before sorting: "+Arrays.toString(orignal));
        Arrays.sort(orignal);
        System.out.println("Arrays after sorting: "+Arrays.toString(orignal));
       
     
    }
}
