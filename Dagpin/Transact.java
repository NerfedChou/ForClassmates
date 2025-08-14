class Transact {
   private String name;
   private int accountNo;
   private int balance;

   void Transaction(String name, int accountNo, int balance){
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }
    void print(){
        System.out.println("Name: " + name + "\nAccount No: " + accountNo + "\nBalance: " + balance);
    }

    void setName(String name){
       this.name = name;
    }
    void setAccountNo(int accountNo){
       this.accountNo = accountNo;
    }
    void setBalance(int balance){
       this.balance = balance;
    }

    String getName(){
       return name;
    }
    int getAccountNo(){
       return accountNo;
    }
    int getBalance(){
       return balance;
    }
}
