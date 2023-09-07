import java.util.Scanner;
class gradecaluculator{
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        
        System.out.println("enter the no.of subjects");
        int subjects=input.nextInt();
        int markss[]=new int[subjects];
         int totalmarks=0;
        for(int i=0;i<=subjects-1;i++){
            System.out.println("enter the marks");
            int marks=input.nextInt();
            totalmarks+=marks;
            markss[i]=marks;
            
            
        }
        int averagemarks=totalmarks/(subjects-1);
        if(averagemarks>=91){
            System.out.print("totalmarks are "+":"+totalmarks+"   "+"percantage is"+":"+averagemarks+"     "+"grade is"+":"+"A");
        }
        else if(averagemarks<=90 && averagemarks>=81){
            System.out.print("totalmarks are "+":"+totalmarks+"     "+"percantage is"+":"+averagemarks+"     "+"grade is"+":"+"B");
        }
        else if(averagemarks<=80 && averagemarks>=71){
              System.out.print("totalmarks are "+":"+totalmarks+"     "+"percantage is"+":"+averagemarks+"    "+"grade is"+":"+"C");
        }
        else if(averagemarks<=70 && averagemarks>=61){
              System.out.print("totalmarks are "+":"+totalmarks+"     "+"percantage is"+":"+averagemarks+"    "+"grade is"+":"+"D");
        }
        else{
              System.out.print("totalmarks are "+":"+totalmarks+"    "+"percantage is"+":"+averagemarks+"    "+"grade is"+":"+"fail");
        }
        
        

    }
}

