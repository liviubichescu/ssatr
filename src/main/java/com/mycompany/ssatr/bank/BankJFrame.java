/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ssatr.bank;

/**
 *
 * @author liviu.bichescu
 */
public class BankJFrame extends javax.swing.JFrame {
    
    AccountsManager am = new AccountsManager();
    
    /**
     * Creates new form BankJFrame
     */
    public BankJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Accounts = new javax.swing.JPanel();
        AddAccountButton = new javax.swing.JButton();
        OwnerInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BalanceInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccountsArea = new javax.swing.JTextArea();
        Management = new javax.swing.JPanel();
        ShowAccountsButton = new javax.swing.JButton();
        ShowTotalButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AccountListArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TotalArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        FromAccount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ToAccount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ToAccount1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddAccountButton.setText("Add Account");
        AddAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountButtonActionPerformed(evt);
            }
        });

        OwnerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Owner");

        jLabel2.setText("Balance");

        AccountsArea.setColumns(20);
        AccountsArea.setRows(5);
        jScrollPane1.setViewportView(AccountsArea);

        javax.swing.GroupLayout AccountsLayout = new javax.swing.GroupLayout(Accounts);
        Accounts.setLayout(AccountsLayout);
        AccountsLayout.setHorizontalGroup(
            AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BalanceInput)
                    .addComponent(OwnerInput)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(AddAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        AccountsLayout.setVerticalGroup(
            AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OwnerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(BalanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(AddAccountButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountsLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        jTabbedPane1.addTab("Accounts", Accounts);

        ShowAccountsButton.setText("Show Total");
        ShowAccountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAccountsButtonActionPerformed(evt);
            }
        });

        ShowTotalButton.setText("Show Accounts");
        ShowTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTotalButtonActionPerformed(evt);
            }
        });

        AccountListArea.setColumns(20);
        AccountListArea.setRows(5);
        jScrollPane2.setViewportView(AccountListArea);

        TotalArea.setColumns(20);
        TotalArea.setRows(5);
        jScrollPane3.setViewportView(TotalArea);

        javax.swing.GroupLayout ManagementLayout = new javax.swing.GroupLayout(Management);
        Management.setLayout(ManagementLayout);
        ManagementLayout.setHorizontalGroup(
            ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowAccountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addGroup(ManagementLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ManagementLayout.setVerticalGroup(
            ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagementLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManagementLayout.createSequentialGroup()
                        .addComponent(ShowTotalButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ManagementLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManagementLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ShowAccountsButton)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagementLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Management", Management);

        FromAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromAccountActionPerformed(evt);
            }
        });

        jLabel3.setText("From");

        jLabel4.setText("To");

        ToAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToAccountActionPerformed(evt);
            }
        });

        jLabel5.setText("Ammount");

        ToAccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToAccount1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ToAccount1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(FromAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FromAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transfers", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowAccountsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAccountsButtonActionPerformed
        this.TotalArea.append("Total =" + am.getTotalBalance());
    }//GEN-LAST:event_ShowAccountsButtonActionPerformed

    private void OwnerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerInputActionPerformed

    }//GEN-LAST:event_OwnerInputActionPerformed

    private void AddAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountButtonActionPerformed
        String owner = this.OwnerInput.getText();
        int balance = Integer.parseInt(this.BalanceInput.getText());
        
        BankAccount bankAccount = new BankAccount(owner, balance);
        am.addAccount(bankAccount);
        
        this.AccountsArea.append("Account added succesfully. Owner =" + bankAccount.getOwner() + ", balance = " + bankAccount.getBalance() + "\n");
    }//GEN-LAST:event_AddAccountButtonActionPerformed

    private void ShowTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTotalButtonActionPerformed

        int number = 0;
        for(BankAccount acc : am.accounts){
            number++;
            this.AccountListArea.append(number + ". " + "Owner =" + acc.getOwner() + ". Balance = " + acc.getBalance() + "\n");
        }
    }//GEN-LAST:event_ShowTotalButtonActionPerformed

    private void FromAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromAccountActionPerformed

    private void ToAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToAccountActionPerformed

    private void ToAccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToAccount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToAccount1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AccountListArea;
    private javax.swing.JPanel Accounts;
    private javax.swing.JTextArea AccountsArea;
    private javax.swing.JButton AddAccountButton;
    private javax.swing.JTextField BalanceInput;
    private javax.swing.JTextField FromAccount;
    private javax.swing.JPanel Management;
    private javax.swing.JTextField OwnerInput;
    private javax.swing.JButton ShowAccountsButton;
    private javax.swing.JButton ShowTotalButton;
    private javax.swing.JTextField ToAccount;
    private javax.swing.JTextField ToAccount1;
    private javax.swing.JTextArea TotalArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}