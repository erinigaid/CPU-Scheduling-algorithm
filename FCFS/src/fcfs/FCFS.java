/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

import java.util.Scanner;

/**
 *
 * @author Erini
 */
public class FCFS {



    public static void main(String[] args) { 
     
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of processes:");
        int size=scan.nextInt();
        int[]bt=new int[size];
        int []wt=new int[size+1];
        wt[0]=0;
        float avg=0;
        for(int i=0;i<size;i++){
            System.out.println("Enter the brust time of process number "+(i+1));
            bt[i]=scan.nextInt();
        
        for(int j =1;j<size;j++){
            wt[i+1]=bt[i]+wt[i];
      }
        }
        System.out.println("Processes     Burst time      Waiting time");
        for(int i=0;i<size;i++){
            System.out.print((i+1)+"               ");
            System.out.print(bt[i]+"               ");
            System.out.print(wt[i]+"               ");
            
            System.out.println(" ");
        }
        System.out.print("\n0");
        for(int i=0;i<size;i++){

            System.out.print("-p"+(i+1)+"-"+bt[i]);
            
        }

        for(int i=0;i<size;i++){
            avg+=wt[i];
        }
        System.out.println("\n\nAverage waiting time: "+avg/(float)size);

    }
} 
    

