package pkg;
import java.util.Random;

public class NumberCube{
    
    public static int toss(){
        //In original problem this code is not shown. In order to run I made it myself
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    
    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        int[] x = new int[numTosses];
        for(int i=0;i<numTosses;i++)
            x[i] = toss();
        return x;
    } 
    
    public static int getLongestRun(int[] values){
        int rlength = 1;
        int counter = 1;
        int index = -1;
        
        for(int i=0;i<9;i++){
            if(values[i]==values[i+1]){
                int x=i;
                while(true){
                    counter++;
                    x++;
                    if(x==9)
                        break;
                    if(values[x] != values[x+1])
                        break;
                }    
                if(counter>rlength)
                    index=i;
                    rlength = counter;
            }
            counter = 1;
        }    
        return index;
    } 
}