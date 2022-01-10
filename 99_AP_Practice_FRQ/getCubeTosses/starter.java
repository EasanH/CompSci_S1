import pkg.*;


public class starter{
    
    public static void main(String[] args){
        NumberCube b = new NumberCube();
        int[] a = {2,1,3,2,3,2,2,4,4,4};
        for(int i = 0;i<a.length;i++)
            System.out.println(a[i]);
        System.out.println("The longest run starts on index: " + b.getLongestRun(a));
    }
}