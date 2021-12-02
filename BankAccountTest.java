public class BankAccountTest {
    
    public static void main(String[] args) {
        BankAccount result = new BankAccount();

        result.makeDeposit();
        result.makeWithdrawal();
        System.out.println(result.getChecking());
        System.out.println(result.getSavings());
        System.out.println(result.getTotal());
    }
}