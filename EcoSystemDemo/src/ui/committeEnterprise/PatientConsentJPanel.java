/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.committeEnterprise;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PlasmaBankOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import HomePages.TableFormat;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patol
 */
public class PatientConsentJPanel extends javax.swing.JPanel {

    /** Creates new form PatientConsentJPanel */
    private EcoSystem system;
    private UserAccount userAccount;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public PatientConsentJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        tblPatientConsent.getTableHeader().setDefaultRenderer(new TableFormat());
        populatePatientConsentTable();
    }

    

    public void populatePatientConsentTable(){
        DefaultTableModel model = (DefaultTableModel)tblPatientConsent.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
           // row[3] = request.getPatient().getContact();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getStatus();
             
            model.addRow(row);
        }
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientConsent = new javax.swing.JTable();
        jBtnEmailConsent = new javax.swing.JButton();
        btnSign = new javax.swing.JButton();
        btnApproval = new javax.swing.JButton();
        btnRejection = new javax.swing.JButton();
        btnConsentForm = new javax.swing.JButton();
        jLabelTo = new javax.swing.JLabel();
        jLabelFrom = new javax.swing.JLabel();
        jLabelSubject = new javax.swing.JLabel();
        jLabelMessage = new javax.swing.JLabel();
        TextFieldTo = new javax.swing.JTextField();
        TextFieldFrom = new javax.swing.JTextField();
        TextFieldSubject = new javax.swing.JTextField();
        TextFieldMessage = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelConsentPatient = new javax.swing.JLabel();
        llabelSign = new javax.swing.JLabel();
        btnPatientAgreement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatientConsent.setBackground(new java.awt.Color(0, 0, 0));
        tblPatientConsent.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPatientConsent.setForeground(new java.awt.Color(255, 255, 255));
        tblPatientConsent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient ID", "Patient Name", "Patient email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientConsent.setFocusable(false);
        tblPatientConsent.setGridColor(new java.awt.Color(0, 0, 0));
        tblPatientConsent.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPatientConsent.setRowHeight(30);
        tblPatientConsent.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblPatientConsent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 1330, 220));

        jBtnEmailConsent.setBackground(new java.awt.Color(31, 31, 31));
        jBtnEmailConsent.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jBtnEmailConsent.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEmailConsent.setText("Send Consent Form On email");
        jBtnEmailConsent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnEmailConsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEmailConsentActionPerformed(evt);
            }
        });
        add(jBtnEmailConsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 300, 40));

        btnSign.setBackground(new java.awt.Color(31, 31, 31));
        btnSign.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setText("Sign the form");
        btnSign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });
        add(btnSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 690, 150, 40));

        btnApproval.setBackground(new java.awt.Color(31, 31, 31));
        btnApproval.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnApproval.setForeground(new java.awt.Color(255, 255, 255));
        btnApproval.setText("Approval");
        btnApproval.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovalActionPerformed(evt);
            }
        });
        add(btnApproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 210, 40));

        btnRejection.setBackground(new java.awt.Color(31, 31, 31));
        btnRejection.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnRejection.setForeground(new java.awt.Color(255, 255, 255));
        btnRejection.setText("Rejection");
        btnRejection.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRejection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectionActionPerformed(evt);
            }
        });
        add(btnRejection, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, 140, 40));

        btnConsentForm.setBackground(new java.awt.Color(31, 31, 31));
        btnConsentForm.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnConsentForm.setForeground(new java.awt.Color(255, 255, 255));
        btnConsentForm.setText("Consent Form Here");
        btnConsentForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsentFormActionPerformed(evt);
            }
        });
        add(btnConsentForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 250, 40));

        jLabelTo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelTo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTo.setText("To:");
        add(jLabelTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabelFrom.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelFrom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFrom.setText("From:");
        add(jLabelFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        jLabelSubject.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelSubject.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSubject.setText("Subject:");
        add(jLabelSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jLabelMessage.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMessage.setText("Message: ");
        add(jLabelMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, -1));

        TextFieldTo.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldTo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextFieldTo.setForeground(new java.awt.Color(255, 255, 255));
        add(TextFieldTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 290, 40));

        TextFieldFrom.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldFrom.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextFieldFrom.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldFrom.setText("aedprojecttitans@gmail.com");
        add(TextFieldFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 290, 40));

        TextFieldSubject.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldSubject.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextFieldSubject.setForeground(new java.awt.Color(255, 255, 255));
        add(TextFieldSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 290, 40));

        TextFieldMessage.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldMessage.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextFieldMessage.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMessageActionPerformed(evt);
            }
        });
        add(TextFieldMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 290, 130));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabelConsentPatient.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelConsentPatient.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsentPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConsentPatient.setText("Treatment Consent Letter Status");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConsentPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 1566, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConsentPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, -1));

        llabelSign.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        add(llabelSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 420, 230, 250));

        btnPatientAgreement.setBackground(new java.awt.Color(31, 31, 31));
        btnPatientAgreement.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPatientAgreement.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientAgreement.setText("View Patient Agreement Here");
        btnPatientAgreement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPatientAgreement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientAgreementActionPerformed(evt);
            }
        });
        add(btnPatientAgreement, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 360, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/legal.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 130, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovalActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatientConsent.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row", "Info", JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        else{
        WorkRequest request = (WorkRequest)tblPatientConsent.getValueAt(selectedRow, 0);
      
        request.setStatus("Legally Approved. Passing to PlasmaBank");
        //request.setUserAccount(userAccount);
        //userAccount.getWorkQueue().getWorkRequestList().add(request);
        dB4OUtil.storeSystem(system);
        populatePatientConsentTable();
        
        //JOptionPane.showMessageDialog(null,"Legally Approved Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Legally<font color='green'> approved</font> successfully!</I></font></h2></html>"),"Info", JOptionPane.INFORMATION_MESSAGE);
           
        
        Enterprise ent = null;
        Organization org = null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("PlasmaBank")) {
            
                ent = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof PlasmaBankOrganization) {
                org = organization;
                break;
            }
        }
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org.getName()+"Orgcheck");    
        } else {
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        UserAccount userAc = null;
        for (UserAccount userAcc: org.getUserAccountDirectory().getUserAccountList()){
            userAc = userAcc;
            userAc.getWorkQueue().getWorkRequestList().add(request);
            break;
        }
        }
        
       
    }//GEN-LAST:event_btnApprovalActionPerformed

    private void jBtnEmailConsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEmailConsentActionPerformed
        // TODO add your handling code here:
        
        //System.out.println("Preparing to send message ..");
      
       String toEmail = TextFieldTo.getText();
//       String toEmail = "yashwant7kotipalli@gmail.com";
//       final String fromEmail = "yashwant7kotipalli@gmail.com";
       final String fromEmail = TextFieldFrom.getText();
       final String fromEmailPassword = "teamtitans"; //your email password
       String subject = TextFieldSubject.getText();
        
        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.EnableSSL.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com"); 
        properties.put("mail.smtp.auth","true");
        properties.put("mail.debug", "true"); 
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");   
        properties.setProperty("mail.smtp.port", "465");   
        properties.setProperty("mail.smtp.socketFactory.port", "465"); 
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(fromEmail, fromEmailPassword);
        }
       });
        
        try{
          MimeMessage message = new  MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail));
          message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
          message.setSubject(subject);
          message.setText(TextFieldMessage.getText());
          Transport.send(message);
        }
        catch(Exception ex){
            System.out.println(""+ex);
        }
        
        System.out.println("Sent message successfully ...");
    }//GEN-LAST:event_jBtnEmailConsentActionPerformed

    private void btnConsentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsentFormActionPerformed
        // TODO add your handling code here:
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("organ_Agreement.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img1.getScaledInstance(llabelSign.getWidth(), llabelSign.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        llabelSign.setIcon(imageIcon);
        
        
        
    }//GEN-LAST:event_btnConsentFormActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        // TODO add your handling code here:
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("organ_Agreement_DonorReceiverAdvocate.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img1.getScaledInstance(llabelSign.getWidth(), llabelSign.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        llabelSign.setIcon(imageIcon);
        
        
        
        
    }//GEN-LAST:event_btnSignActionPerformed

    private void btnPatientAgreementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientAgreementActionPerformed
        // TODO add your handling code here:
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("organ_Agreement_Donor.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img1.getScaledInstance(llabelSign.getWidth(), llabelSign.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        llabelSign.setIcon(imageIcon);
        
    }//GEN-LAST:event_btnPatientAgreementActionPerformed

    private void TextFieldMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMessageActionPerformed

    private void btnRejectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectionActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPatientConsent.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
        WorkRequest request = (WorkRequest)tblPatientConsent.getValueAt(selectedRow, 0);
      
        request.setStatus("Legally Disapproved");
        request.setUserAccount(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
       
        dB4OUtil.storeSystem(system);
        populatePatientConsentTable();
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I><font color='red'> Legally Disapproved!</I></font></h2></html>"), "Info", JOptionPane.INFORMATION_MESSAGE);
           
        //JOptionPane.showMessageDialog(null,"Legally Disapproved", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnRejectionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldFrom;
    private javax.swing.JTextField TextFieldMessage;
    private javax.swing.JTextField TextFieldSubject;
    private javax.swing.JTextField TextFieldTo;
    private javax.swing.JButton btnApproval;
    private javax.swing.JButton btnConsentForm;
    private javax.swing.JButton btnPatientAgreement;
    private javax.swing.JButton btnRejection;
    private javax.swing.JButton btnSign;
    private javax.swing.JButton jBtnEmailConsent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConsentPatient;
    private javax.swing.JLabel jLabelFrom;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelSubject;
    private javax.swing.JLabel jLabelTo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel llabelSign;
    private javax.swing.JTable tblPatientConsent;
    // End of variables declaration//GEN-END:variables

}
