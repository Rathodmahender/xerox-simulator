import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

         int balance = 9000, withdraw, deposit;
        String pinSystem="0123",pinUser,temp;
          
        Scanner s = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("<-- Automated Teller Machine -->\n");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Pin change");  
            System.out.println("Choose 5 for EXIT");  
            System.out.print("Choose the above options you want to perform: ");  
            
            int choice = s.nextInt();
              
            switch(choice)  
            {
                case 1:
                    System.out.println("Enter Four digit Pin: ");
                    pinUser=s.next();
                    if(pinUser.length()==4 && pinSystem.equals(pinUser))
                    {
                        System.out.print("Enter money to be withdrawn:");  
                        withdraw = s.nextInt();  
                        if(withdraw%100==0 && withdraw<=10000 && withdraw>0){
                            if(balance >= withdraw)
                            {
                                balance = balance - withdraw;  
                                System.out.println("Please collect your money.....");
                            }
                            else
                               {               
                                System.out.println("*** Insufficient Balance ***");
                            }
                        }
                        else{
                            System.out.println("Enter money in multiples of 100's or 200's or 500's Or enter valid amount(>0 or <10000)\n");
                           
                        }

                    }
                    else
                    {
                        System.out.println("*** Invalid pin ***");
                    }
                    System.out.println("\n\n");  
                    break;  
   
                case 2:
                    System.out.println("Enter Four digit Pin: ");
                    pinUser=s.next();
                    if(pinUser.length()==4 && pinSystem.equals(pinUser))
                    {
                        System.out.print("Enter money to be deposited:");  
                        deposit = s.nextInt();  
                        if(deposit%100==0 || deposit%200==0 || deposit%500==0){
                            balance = balance + deposit;  
                            System.out.println("Your Money has been successfully depsited"); 
                        }
                        else{
                            System.out.println("Your deposit "+deposit+" is unsuccessful..");
                            System.out.println("Deposit money should be multiples of 100's or 500's");
                        }
                         }
                    else
                    {
                        System.out.println("*** Invalid pin ***");
                    }
                    System.out.println("\n\n"); 
                     
                    break;  
   
                case 3:
                    System.out.println("Enter Four digit Pin: ");
                    pinUser=s.next();
                    if(pinUser.length()==4 && pinSystem.equals(pinUser))
                    {
                        System.out.println("Balance : "+balance);
                    }
                    else
                    {
                        System.out.println("*** Invalid pin ***");
                    }
                    System.out.println("\n\n");     
                    break;  
   
                case 4:
                    System.out.println(" Reset Password ");
                    System.out.print("Enter your old pin: ");
                    temp=s.next();
                    if(pinSystem.equals(temp)){
			System.out.print("\nEnter new pin: ");
			pinSystem=s.next();
                        System.out.println("Pin Successfully changed...");
                    }else{
                        System.out.println("*** Invalid pin ***");
                    }
                    System.out.println("\n\n");
                    break;

                case 5:
                    System.exit(0);
            }
        }
        }
    }

