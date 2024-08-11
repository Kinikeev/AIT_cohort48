package class_work_15.bank_account;

public class BankAppl {
    public static void main(String[] args) {

        // create object
        BankAccount account_001 = new BankAccount(100L,"Adam Smith","Bank_1",1,100);

        // print object
        account_001.displayAccount();
        // print to String
        System.out.println(account_001);

        BankAccount account_002 = new BankAccount(200L,"Willi Smal","Bank_1",1);
        account_002.displayAccount();
        System.out.println(account_002);

        BankAccount account_003 = new BankAccount(300L,"Bank_1",1,3_000_000);
        account_003.displayAccount();

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println(account_001.getBalance());
        account_001.deposit(500);
        System.out.println(account_001.getBalance());
        account_001.withdraw(200);
        System.out.println(account_001.getBalance());
        account_001.withdraw(400);
        System.out.println(account_001.getBalance());
        account_001.withdraw(200);
        System.out.println(account_001.getBalance());
        account_001.deposit(400);
        account_001.withdraw(500);
        System.out.println(account_001.getBalance());
        account_001.displayAccount("Mr.");



    }
}
