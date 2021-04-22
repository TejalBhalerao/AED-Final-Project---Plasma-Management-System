/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PlasmaMatchWorkSpace;

import Business.EcoSystem;
import Business.People.Donor;
import Business.People.Recipient;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.AdministrativeWorkSpace.WorkArea;

/**
 *
 * @author TEJAL
 */
public class ManagePlasmaMatchJPanel extends javax.swing.JPanel {
    
    JPanel rightPanel;
   EcoSystem ecoSystem;

    /**
     * Creates new form ManageOrganMatchJPanel
     */
    public ManagePlasmaMatchJPanel(JPanel rightPanel, EcoSystem eco) {
        initComponents();
        this.ecoSystem = eco;
        this.rightPanel = rightPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        matchByRecipientBtn = new javax.swing.JButton();
        matchByDonor = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        matchByRecipientBtn.setBackground(new java.awt.Color(255, 204, 204));
        matchByRecipientBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        matchByRecipientBtn.setText("Match Organ by Recipient severity");
        matchByRecipientBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        matchByRecipientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchByRecipientBtnActionPerformed(evt);
            }
        });

        matchByDonor.setBackground(new java.awt.Color(255, 204, 204));
        matchByDonor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        matchByDonor.setText("Match Organ by Donor availability");
        matchByDonor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        matchByDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchByDonorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(matchByRecipientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matchByDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(matchByDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(matchByRecipientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       WorkArea manageCitiesJPanel = new WorkArea(rightPanel,ecoSystem);
        rightPanel.add("manageCitiesJPanel", manageCitiesJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void matchByRecipientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchByRecipientBtnActionPerformed

        List<Recipient> recipientList = createListOfRecipients();
        if(recipientList.size() > 0){
            PlasmaMatchRecipientJPanel organMatch = new PlasmaMatchRecipientJPanel(rightPanel, ecoSystem, recipientList);
            rightPanel.add("organMatch", organMatch);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }else {
            JOptionPane.showMessageDialog(null, "Currently there are no recipients.");
        }
    }//GEN-LAST:event_matchByRecipientBtnActionPerformed

    private void matchByDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchByDonorActionPerformed

        List<Donor> donorList = createListOfDonors();
        if(donorList.size() > 0){
            OrganMatchByDonorJPanel organMatch = new OrganMatchByDonorJPanel(rightPanel, ecoSystem, donorList);
            rightPanel.add("organMatch", organMatch);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }else {
            JOptionPane.showMessageDialog(null, "Currently there are no donors.");
        }
    }//GEN-LAST:event_matchByDonorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton matchByDonor;
    private javax.swing.JButton matchByRecipientBtn;
    // End of variables declaration//GEN-END:variables
}
