import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        
        Account acc = new SavingsAccount("101", 5000, 4.5, 1000);

        System.out.println("Creating an account: ");
        Customer c1 = new Customer(1, "Rahul", "PAN123", "AAD123",
                "Mumbai", "01-01-2000", "9999999999");

        while(true){
        System.out.println("Choose an option from the menu: ");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");
        System.out.println("4. Add nominees");
        System.out.println("5. Display Customer");
        System.out.println("6. Take loan");
        System.out.println("7. Pay loan amount");
        System.out.println("8. Close account");
        System.out.println("9. Exit");

        int choice = sc.nextInt();

        System.out.println("You selected option: " + choice);

        LoanAccount loanAcc = new LoanAccount("L101", 0);

        switch(choice) 
        {

            case 1:
                System.out.println("Enter amount");
                double dep = sc.nextDouble();
                acc.credit(dep);
                break;
             
            case 2:
                System.out.print("Enter amount: ");
                 double wd = sc.nextDouble();
                 acc.debit(wd);
                 break;

            case 3:
                acc.checkBalance();
                 break;

            case 4:
                sc.nextLine(); // clear buffer

                System.out.print("Enter nominee name: ");
                String nom = sc.nextLine();

                c1.addNominees(nom); // ✅ PASS the value

                break;

            case 5:
                c1.displayCustomer();
                break;

            case 6:
                System.out.print("Enter loan amount: ");
                double loanAmt = sc.nextDouble();
                loanAcc.takeLoan(loanAmt);
                break;

            case 7:
                System.out.print("Enter amount to pay: ");
                double payAmt = sc.nextDouble();
                loanAcc.payLoan(payAmt);
                break;

            case 8:
                acc.closeAccount();
                break;

            case 9:
                System.out.println("Exiting...");
                sc.close();
                return;



            default:
                System.out.println("Invalid choice");
}
        
    }
}}