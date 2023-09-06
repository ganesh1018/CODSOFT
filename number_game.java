 import java.util.Random;
 import java.util.Scanner;
 class number_game{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int lowerrange = 1;
        int upperrange = 100;
        int maxattempts=10;
        int score = 0;
        System.out.print("Welcome to the number game");
        while(true){
            int randomnum=random.nextInt(upperrange-lowerrange+1)+lowerrange;
            int attempts=0;
            while(attempts<maxattempts){
                System.out.println("Guess the number between  "+lowerrange+" and  "+upperrange);
                int guessnum=scanner.nextInt();
                attempts++;
                if(randomnum<guessnum){
                    System.out.println(" your number is too high");
                }else if(randomnum>guessnum){
                    System.out.println("your number is too low");
                }
                else{
                    System.out.println("congratulations !! your guessing  number is correct and you made it in "+attempts+"  attempts");
                    score++;
                    break;
                }
            }
            System.out.println("do you want to play one more time then enter 1 ");
            int onemore=scanner.nextInt();
            if(onemore!=1){
                break;
            }
        }
        System.out.println("thank you! your game is over.your score is  "+score);
        
    }
 }




    

 
