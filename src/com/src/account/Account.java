package com.src.account;

public class Account {
    /**this field has been made private to
     * avoid direct modification access
     * from external calls.
     * This is how encapsulation is implemented
    **/
    private float balance;
    public Account(){
        this.balance = 0;
    }

    public void deposit(float amount){
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(float amount){
        if(amount > 0 && amount <= balance)
            balance -= amount;
    }

    public float getBalance(){
        return this.balance;
    }
}
