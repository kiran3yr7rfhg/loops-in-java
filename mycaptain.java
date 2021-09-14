package tcs.minutestodays;

import java.util.Scanner;
public class mycaptain {
public static void main(String[] args){
    int ni,ne,i=0;
    float intp=18,extp=12,cost=0,temp;
    Scanner sc= new Scanner(System.in);
    ni=sc.nextInt();
    ne=sc.nextInt();
    if(ni<0||ne<0){
       System.out.println("INVALIDE INPUT:");
    }else if (ni==0&&ne==0) {
        System.out.println("total cost:0.0");
        
    }else{
        for(i=0;i<ni;i++){
            temp=sc.nextFloat();
            cost +=intp * temp;
        }
    for(i=0;i<ne;i++){
                temp=sc.nextFloat();
            cost +=extp * temp;
            }
            System.out.printf("total estimated cost %.1f", cost);
            sc.close();
        }
        }
    
}
    


    
}
