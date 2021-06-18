/**This program uses arrays
 * @author (Fikri San Koktas)
 * @version (4 March 2021) **/
import java.util.Scanner;
import java.util.Random;
public class KFS_ArrayComputations_Main
{
    public static void main(String[] args) 
    { 
        int ar[]=new int[10]; // declare an array
        int i,sum=0,min,max; // declaration of required variables
        for(i=0; i<10; i++)
        {
            Random r = new Random(); //create random object
            ar[i] = r.nextInt(100); // I will limit the biggest random number to 99 because otherwise, numbers tend to be so long and confusing                     
        }
        System.out.println(""); //a random array is created 
        
        System.out.print("Elements are: ");
        for(i=0; i<10; i++)
        {
            System.out.print(ar[i] + " "); // print all elements
        }
        System.out.println(""); //elements are printed without sorting
        
        System.out.print("Elements at even index are: ");
        for(i=0; i<10; i+=2)
        {
            System.out.print(ar[i] + " "); //print elements at even index
        }
        System.out.println(""); 
        
        System.out.print("Even elements are: ");
        for(i=0; i<10; i++)
        {
            if (ar[i]%2 == 0)
            {
                System.out.print(ar[i] + " "); //print even elements
            }
        }
        System.out.println(""); 
        
        System.out.print("Elements in reverse order: ");
        for(i=9; i>=0; i--) // reverse loop for reverse printing
        {
            System.out.print(ar[i] + " "); //print elements in reverse order
        }
        System.out.println("");
        
        System.out.println("First element: "+ ar[0]); 
        System.out.println("Last element: "+ ar[9]);
        
        min=ar[0]; max=ar[0]; sum+=ar[0];
        for(i=1; i<10; i++)
        {
            sum+=ar[i]; // adding each element
            if(ar[i] > max)
            {
                max = ar[i]; // storing maximum value and updating with iteration
            }
            if(ar[i] < min) // storing minimum value and updating with iteration
            {
                min = ar[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    } 
}
