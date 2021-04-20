/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TEJAL
 * 
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form ManageEnterprizeJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
           
        enterpriseJTable.getTableHeader().setDefaultRenderer(new TableFormat());

        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
    
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();
                row[3] = enterprise.getContact();
                row[4] = enterprise.getZipcode();
                row[5] = enterprise.getEmail();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
        }

    }

    public static boolean ValidatePhoneNumber(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
    }
     public static boolean ValidateZipCode(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
    }
    public static boolean ValidateEmail(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCreateEnterprise = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        enterpriseJTable.setBackground(new java.awt.Color(0, 0, 0));
        enterpriseJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        enterpriseJTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Enterprise Type", "Network", "Contact", "Zipcode", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setGridColor(new java.awt.Color(0, 0, 0));
        enterpriseJTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        enterpriseJTable.setRowHeight(30);
        enterpriseJTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(enterpriseJTable);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create Enterprise");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 14, 408, 36));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Network:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        networkJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        networkJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 163, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Enterprise Type:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        enterpriseTypeJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        enterpriseTypeJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterpriseTypeJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 110, 160, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 155, 163, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Contact:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtContact.setBackground(new java.awt.Color(204, 204, 204));
        txtContact.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtContact.setForeground(new java.awt.Color(255, 255, 255));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel2.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 163, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Zipcode:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtZipCode.setBackground(new java.awt.Color(204, 204, 204));
        txtZipCode.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtZipCode.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 163, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 299, 163, -1));

        btnCreateEnterprise.setBackground(new java.awt.Color(31, 31, 31));
        btnCreateEnterprise.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCreateEnterprise.setText("Create Enterprise");
        btnCreateEnterprise.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 200, 33));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Manage Enterprise");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void btnCreateEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEnterpriseActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if(networkJComboBox.getSelectedItem().equals(null)){

            //JOptionPane.showMessageDialog(null, "Select a Network Please!");
            networkJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            networkJComboBox.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Select a<font color='red'> Network</font> please!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            check1 = "no";
        }

        if(enterpriseTypeJComboBox.getSelectedItem().equals(null)){
            //JOptionPane.showMessageDialog(null, "Select Enterprise Type Please!");
            enterpriseTypeJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            enterpriseTypeJComboBox.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Select an<font color='red'> Enterprise Type</font> please!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            check1 = "no";
        }

        if(txtName.getText().isEmpty())
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtName.setForeground(Color.red);
        }

        if(txtContact.getText().isEmpty())
        {
            txtContact.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtContact.setForeground(Color.red);
        }
        if(txtEmail.getText().isEmpty())
        {
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtEmail.setForeground(Color.red);
        }
        if(txtZipCode.getText().isEmpty())
        {
            txtZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtZipCode.setForeground(Color.red);
        }

        if(txtName.getText().isEmpty() || txtContact.getText().isEmpty() || txtEmail.getText().isEmpty() || txtZipCode.getText().isEmpty()
            || network == null || type == null){
            //JOptionPane.showMessageDialog(null, "All fields are mandatory!");
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2><I>All fields are</I><font color='red'> mandatory</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            check1 = "no";
            //return;
        }

        else   if ( !ValidatePhoneNumber(txtContact.getText())  ){
            //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit " , "Error", JOptionPane.ERROR_MESSAGE);
            check1 = "no";
            txtContact.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtContact.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Contact Number</I></font> should be<font color='green'> 10 digit</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            //    return;
        }

        else   if (  !ValidateZipCode(txtZipCode.getText()) ){
            //JOptionPane.showMessageDialog(null, " Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
            check1 = "no";
            txtZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtZipCode.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Zip</I></font> should be<font color='green'> 5 digit</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            //  return;
        }

        else   if ( !ValidateEmail(txtEmail.getText()) ){
            //JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
            check1 = "no";
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtEmail.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Email ID</I></font> must be in<font color='green'> correct format</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

            //return;
        }

        else {

            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (ent.getName().equals(txtName.getText())) {
                    JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Enterprise Name</I></font> can not be<font color='red'> same</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                    check1 = "no";
                    txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
                    txtName.setForeground(Color.red);
                    return;
                }
            }

            // the main process after validation checks-
            if(check1.equals(""))
            {
                String name = txtName.getText();

                Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
                enterprise.setContact((int) (Double.parseDouble(txtContact.getText())));
                enterprise.setZipcode(Integer.parseInt(txtZipCode.getText()));
                enterprise.setEmail(txtEmail.getText());

                populateTable();

                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>New Enterprise</I><font color='green'> created </font><I>successfully!/I<></h2></html>"));

                //JOptionPane.showMessageDialog(null, "New Enterprise Created Successfully!");

                dB4OUtil.storeSystem(system);

                txtName.setText("");
                txtContact.setText("");
                txtZipCode.setText("");
                txtEmail.setText("");

            }}
    }//GEN-LAST:event_btnCreateEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEnterprise;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
