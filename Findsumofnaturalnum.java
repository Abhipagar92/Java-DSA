/* PseudoCode for Find sum of Natural Numbers
 
 Start
 input n
 let val = 1 & sum = 0

 while val <= n  do
    sum = sum + val
    val = val + 1

    print sum

    Exit
 */

import java.util.*;

class Findsumofnaturalnum{

    public static void main(String arg[]){

        int num = 5;

        int val = 1 , sum = 0;

        while (val <= num){
            sum = sum + val; 
            val = val + 1 ;
          
            /* 0 + 1 = 1
               1 + 2 = 3
               3 + 3 = 6
               6 + 4 = 10
               10 + 5 = 15
            */

            System.out.print("\n sum of numbers are:"  +sum);       
            
        }

    }
}