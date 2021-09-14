package tcs;

import java.util.Scanner;

public class oxygen {
     public static void main(String[] args) {
        
     int [][] trainee = new int[3][3];
     int[] average = new int[3];
     int max=0;
     int i,j;
     Scanner sc = new Scanner(System.in);
     for(i=0;i<3;i++){
         for(j=0;j<3;j++){
             trainee[i][j]=sc.nextInt();
             if(trainee[i][j]<1||trainee[i][j]>100){
                 trainee[i][j]=0;
             }
         }
     }
     for(i=0;i<3;i++){
         for(j=0;j<3;j++){
             average[i] = average[i] + trainee[j][i];
         }
             average[i]=average[i]/3;
         
     }
     for(i=0;i<3;i++){
         if (average[i]>max) {
             max=average[i];
             
         }
     }
     for(i=0;i<3;i++){
         if (average[i]==max) {
             System.out.println("trainee number:"+(i+1));
             
         }
         if (average[i] <70) {
             System.out.println("the trainee is unfit");
             
         }
     }

        
    }
    
}
