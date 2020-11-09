/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ssatr.bank;

import java.util.ArrayList;

/**
 *
 * @author liviu.bichescu
 */
public class AccountsManager {  

    ArrayList<BankAccount> accounts; 
    
    public AccountsManager() {
        this.accounts =  new ArrayList<>();
    }
       
    public void addAccount(BankAccount a){
        this.accounts.add(a);
    }
    
    public int getTotalBalance(){
        
        int totalAccount = 0;
        
        for(BankAccount acc : this.accounts){
            totalAccount = totalAccount + acc.getBalance();
        }
        
        return totalAccount;
    }
    
    public boolean transfer(String fromOwnerName, String toOwnerName, int amount){
       
        for(BankAccount acc : this.accounts){
            if (acc.getOwner().equals(toOwnerName)) {
                for(BankAccount c : this.accounts){
                    if (c.getOwner().equals(fromOwnerName)) {
                        int currentFromBalance = c.getBalance();
                        int currentToBalance = acc.getBalance();
                       
                        c.setBalance(currentFromBalance - amount);
                        acc.setBalance(currentToBalance + amount);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
