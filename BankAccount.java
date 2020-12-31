package com.company;

public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerMobileNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        this.getAccountBalance();
    }

    public BankAccount(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(int customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void deposit(int depositAmount){
        this.accountBalance=getAccountBalance()+depositAmount;
        setAccountBalance(this.accountBalance);
    }
    public String withdraw(int withdrawAmount){
        if(withdrawAmount>getAccountBalance()){
            return "insufficient balance";
        }else {
            setAccountBalance(getAccountBalance()-withdrawAmount);
            return "now your balance is" + getAccountBalance();
        }
    }
}
