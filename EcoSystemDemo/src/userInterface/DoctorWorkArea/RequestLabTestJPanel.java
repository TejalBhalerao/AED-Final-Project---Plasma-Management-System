/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorWorkArea;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PlasmaBankEnterprise;
import Business.Organization.Organization;
import Business.Account.Account;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author patol
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Account userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, Account account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBtnRequestTest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTextFieldMessage = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBtnRequestTest.setBackground(new java.awt.Color(153, 204, 255));
        JBtnRequestTest.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtnRequestTest.setText("Request Test");
        JBtnRequestTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBtnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnRequestTestActionPerformed(evt);
            }
        });
        add(JBtnRequestTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 485, 250, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        JTextFieldMessage.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(JTextFieldMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 187, 220, -1));

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 380, -1));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 99, 140, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 90, -1));

        btnBack.setBackground(new java.awt.Color(153, 204, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 250, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnRequestTestActionPerformed
        
        String message = JTextFieldMessage.getText();
        
        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof PlasmaBankEnterprise){
                org = organization;
                break;
            }
        }
        if (org!=null){
            //org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
    }//GEN-LAST:event_JBtnRequestTestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorActivityJPanel dwjp = (DoctorActivityJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnRequestTest;
    private javax.swing.JTextField JTextFieldMessage;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
