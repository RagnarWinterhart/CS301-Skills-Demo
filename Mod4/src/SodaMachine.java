import java.util.Scanner;

public class SodaMachine {
    private int balance;
    /*
        Create a data type SodaMachine that has methods
        insertCoin(), getChange(), buy(), etc. The program
         should be named SodaMachine.java.
     */
    // If this were a more robust program, a Soda data type could be created
    // and stored by the SodaMachine.
    public SodaMachine(){
        balance = 0;
    }
    //Adds one quarter to balance
    public void insertCoin(){
        balance += 25;
        System.out.println("Quarter Inserted.");
        System.out.println("Balance: " + balance + " cents.");
    }

    //Checks to see if total balance is enough to buy selected soda, subtracts price from balance
    public void buy(int price){
        if(balance >= price){
            balance -= price;
            System.out.println("Purchase successful!");
            System.out.println("Remaining balance: " + balance + " cents");
        }else{
            System.out.println("Not enough money inserted.");
            System.out.println("Remaining balance: " + balance + " cents");
        }
    }

    //Prints out change balance and returns the total balance to zero
    public void getChange(){
        System.out.println("Your change is: " + balance + " cents");
        balance = 0;
    }

    //Helper for the Terminal UI, should probably be in another class
    //if this were a larger project
    public static int getPrice(int selection){
        switch(selection){
            case 1:
                return 25;
            case 2:
                return 10;
            case 3:
                return 30;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        SodaMachine machine = new SodaMachine();
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while(running){
            System.out.println("Welcome to the Soda Machine, please " +
                    "insert a coin to make a selection from: ");
            System.out.println("1. Insert Quarter ");
            System.out.println("2. Get Change ");
            System.out.println("3. Buy Selection ");
            System.out.println("4. Leave ");


            System.out.println("Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    machine.insertCoin();
                    break;

                case 2:
                    machine.getChange();
                    break;
                case 3:
                    System.out.println("Soda Options:");
                    System.out.println("1. Cola ($0.25)");
                    System.out.println("2. Water ($0.10)");
                    System.out.println("3. Diet ($0.30)");
                    System.out.println("Choice: ");
                    int sodaChoice = input.nextInt();
                    input.nextLine();
                    int price = getPrice(sodaChoice);
                    if(price != -1){
                        machine.buy(price);
                    }else{
                        System.out.println("Invalid selection.");
                    }
                    break;
                case 4:
                    System.out.println("You left");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid menu choice.");
                    break;
            }
        }
        input.close();
    }
}
