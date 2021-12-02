import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsDouble;
    private static int accountsCreated;
    private static double total;
    private Long accountNumber;

    public BankAccount(){
        accountsCreated++;
    }

    public double getChecking(){
        return checkingBalance;
    }

    public double getSavings(){
        return savingsDouble;
    }

    public double getTotal(){
        return total;
    }

    public void makeDeposit(){
        System.out.println("Enter bank account:");
        String accountType = System.console().readLine();

        System.out.println("Enter deposit amount:");
        String deposit = System.console().readLine();
        int amountDeposit = Integer.parseInt(deposit);

        if(accountType.contains("checking")){
            checkingBalance += amountDeposit;
            total += amountDeposit;
            System.out.println("Checkings deposit amount: " + checkingBalance);
        }
        else if(accountType.contains("saving")) {
            savingsDouble += amountDeposit;
            total += amountDeposit;
            System.out.println("Checkings deposit amount: " + savingsDouble);
        }
    }

    public void makeWithdrawal(){
        System.out.println("Enter bank account:");
        String accountType = System.console().readLine();

        System.out.println("Enter withdrawal amount:");
        String withdrawal = System.console().readLine();
        int amountWithdrawal = Integer.parseInt(withdrawal);

        if(accountType.contains("checking")){
            if(checkingBalance > amountWithdrawal){
                checkingBalance -= amountWithdrawal;
                total -= amountWithdrawal;
                System.out.println("Checkings withdrawal amount: " + checkingBalance);
            } else {
                System.out.println("Nah, you're broke or whatever.");
            }
        }
        else if(accountType.contains("saving")) {
            if(savingsDouble > amountWithdrawal){
                savingsDouble -= amountWithdrawal;
                total -= amountWithdrawal;
                System.out.println("Checkings withdrawal amount: " + savingsDouble);
            } else {
                System.out.println("Nah, you're broke or whatever.");
            }
        }
    }

}