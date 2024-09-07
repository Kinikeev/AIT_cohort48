package class_work_15.bank_account;

public class BankAccount {

    // fields
    private long id;             // индификационный номер
    private String owner;        // владелец
    private String bankName;     // наименование ванка
    private int branch;          // номер филиала ванка
    private double balance;      // остаток на счету

    // тип счёта, валюта, адрес, паспортные данные - полезные поля

    // constructor
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }
    // constructor without balance
    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
    }
    // anonimus client

    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    // getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // display
    public void displayAccount(){
        System.out.println("Account: " + id+ ", owner: "+owner+", bank name: "+bankName+", balance: "+balance);
    }
    public void displayAccount(String message){
        System.out.println("Account: " + id+ ", owner: "+message+" "+owner+", bank name: "+bankName+", balance: "+balance);
    }

    // print to String
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", owner='" + owner + '\'' +
                ", branch=" + branch +
                '}';
    }
    // add money to account
    public boolean deposit(double sum){
        balance = balance + sum;
        return true;
    }
    // withdraw money from account
    public boolean withdraw(double sum){
        if (sum <= balance){
            balance = balance - sum;
            return true;
        }
        return false;
    }




}






















