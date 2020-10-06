import java.util.Scanner;

public class main {
//main method, is where the program starts

        public static void main(String[] args) {
        //program starts here...
         Account account = new Account(1000);
        Person bagger = new Person("Bagger", "Bagger123", account );
        //system.in standard takes in on driver
        Scanner scanner = new Scanner(System.in);


         while(true) {
             System.out.println("Please enter username");
             //waits until you enter an input in the console and saves it in variable
             String username = scanner.next();
             System.out.println("Please enter password");
             String password = scanner.next();
             System.out.println("Username: " + username);
             System.out.println("Password: " + password);

             //Login success
             if(username.equals(bagger.getUsername()) && password.equals(bagger.getPassword())){
                 Account personAccount = bagger.getAccount();
                 System.out.println("Welcome " + bagger.getUsername() + " your current balance is: " + personAccount.getBalance());
                 System.out.println("Press 1 to withdraw");
                 System.out.println("Press 2 to deposit");
                 int choice = scanner.nextInt();
                 // Withdraw
                 if(choice == 1){
                     System.out.println("How much do you wish to withdraw?");
                     int amount = scanner.nextInt();
                     personAccount.withdraw(amount);
                     System.out.println("New balance: " + personAccount.getBalance());

                 }
                 // Deposit
                 if(choice == 2){
                     System.out.println("How much do you wish to deposit?");
                     int amount = scanner.nextInt();
                     personAccount.deposit(amount);
                     System.out.println("New balance: " + personAccount.getBalance());
                 }

             }
             else{
                 System.out.println("Wrong username or password");
             }
             }
         }





    }








