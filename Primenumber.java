/*PSEUDOCODE 

Start
input n
let div =2

while div<n do
  if  
    n % div ==0 do
    print "Not a Prime Number"
    Exit
  else
     div = div+1
     print "It is Prime Number"
     Exit 
  Exit   
*/ 

import java.util.*;
import java.lang.*;
import java.io.*;


class Primenumber{

    public static void main(String arg[]){

        int num = 10;
        int div = 2;

        while(div < num){

            if (num % div == 0){
                System.out.print("It is not prime number");
                break;
            }
            else{
                div = div + 1;
                System.out.print("It is prime Number");
                break;
                
            }
        }
    }
}