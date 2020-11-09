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
    
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>(); 
    
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
}
