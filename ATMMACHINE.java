import java.util.*;
class Data{
    float balance; 
}
class ATM{
    float balance;
     private int pin;
     Scanner input=new Scanner(System.in);
     HashMap<Integer,Data> map=new HashMap<>();
     public ATM(){
        
        System.out.println("welcome to the atm!!");
        
       
        
            checkpin();
        
    
     }
     
    

    public void checkpin(){
        System.out.println("enter your pin:");
        
        int pin=input.nextInt();
    
        
           if(map.containsKey(pin)==true){
               Data obj=map.get(pin);
               menu(obj);
              
              
          }
          
            else{
                System.out.println("*********************************");
               System.out.println("please create account first :");
               System.out.println("set your pin");
               int pinn=input.nextInt();
               Data obj=new Data();
               map.put(pinn,obj);
               menu(obj);
               
          }
        
    }
    public void menu(Data obj){
            System.out.println("enter your choice:");
            System.out.println("1.check balance:");
            System.out.println("2.withdraw money:");
            System.out.println("3.deposit money:");
            System.out.println("4.check another account");
            System.out.println("5.exit");
            
            int choice=input.nextInt();
            if(choice==1){
                balance(obj);
            }
            else if(choice==2){
                withdraw(obj);
            }
            else if(choice==3){
                deposit(obj);
            }
            else if(choice==4){
                checkpin();
            }
            else if(choice==5){
                System.out.println("Thank you !");
                
            
            }
            else{
                System.out.println("enter a valid choice:");
                menu(obj);
            }


        }

    
        public void balance(Data obj){
        System.out.println("Balance:"+obj.balance);
        menu(obj);

    }
    public void withdraw(Data obj){
        System.out.println("enter the amount");
        
        float amount=input.nextFloat();
        if(amount>obj.balance){
            System.out.println("insufficient balance");

        }
        else{
            obj.balance-=amount;
            System.out.println("money withdrawl is successful");
        }
        menu(obj);
        

    
    }

    


      public void deposit(Data obj){
             System.out.println("enter the amount:");
        
             float amount=input.nextFloat();
             obj.balance+=amount;
            System.out.println("money deposited successfully");
            menu(obj);
}
}
public class ATMMACHINE{
    public static void main(String[]args){
        
        ATM obj=new ATM();
        


        

    }
}