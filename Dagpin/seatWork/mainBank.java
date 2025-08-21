package seatWork;

public class mainBank {
    private String name;
    private int password;
    private int balance;
    private int accountNo;

    void setName(String name){
        this.name = name;
    }
    void setPassword(int password){
        this.password = password;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
    void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }

    String getName(){
        return name;
    }
    int getPassword(){
        return password;
    }
    int getBalance(){
        return balance;
    }
    int getAccountNo(){
        return accountNo;
    }

}
