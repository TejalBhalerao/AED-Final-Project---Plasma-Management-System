/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.committeEnterprise;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.People.Donor;
import Business.People.DonorDirectory;
import Business.People.DonorRequest;
import Business.People.DonorRequestDirectory;
import Business.UserAccount.UserAccount;
import HomePages.TableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patol
 */
public class DonorStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorStatusJPanel
     */
    
   //private DonorDirectory donorDirectory;
    private EcoSystem system;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public DonorStatusJPanel(EcoSystem system) {
        initComponents();
        //this.donorDirectory =  donorDirectory;
        this.system = system;
        TblDonorRequest.getTableHeader().setDefaultRenderer(new TableFormat());
        tblManageDonor.getTableHeader().setDefaultRenderer(new TableFormat());
        populateTable();
        populateTableS();
    }
    
         
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) TblDonorRequest.getModel();
        
        dtm.setRowCount(0);
        
         for(Donor donor: system.getDonorDirectory().getDonorList()){            
            Object row[] = new Object[4];
            row[0]= donor;
            row[1]=donor.getName();
            row[2]=donor.getContact();
            row[3]=donor.getStatus();
              
            dtm.addRow(row);
        }
        
    }
    private void populateTableS() {
        DefaultTableModel dtm = (DefaultTableModel) tblManageDonor.getModel();
        
        dtm.setRowCount(0);
        
         for(DonorRequest donor: system.getDonorRequestDirectory().getDonorRequestList()){            
            Object row[] = new Object[4];
            row[0]= donor;
            row[1]=donor.getName();
            row[2]=donor.getContact();
            row[3]=donor.getStatus();
              
            dtm.addRow(row);
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblDonorRequest = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabelManageDonor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblManageDonor = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblDonorRequest.setBackground(new java.awt.Color(0, 0, 0));
        TblDonorRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TblDonorRequest.setForeground(new java.awt.Color(255, 255, 255));
        TblDonorRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor ID", "Name", "Contact", "Status"
            }
        ));
        TblDonorRequest.setGridColor(new java.awt.Color(0, 0, 0));
        TblDonorRequest.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TblDonorRequest.setRowHeight(30);
        TblDonorRequest.setShowVerticalLines(false);
        jScrollPane1.setViewportView(TblDonorRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 1030, 160));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabelManageDonor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelManageDonor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageDonor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManageDonor.setText("Manage Donors");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelManageDonor, javax.swing.GroupLayout.DEFAULT_SIZE, 1696, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelManageDonor, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1720, -1));

        jButton1.setBackground(new java.awt.Color(31, 31, 31));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 117, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blood-donation_2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, 141));

        tblManageDonor.setBackground(new java.awt.Color(0, 0, 0));
        tblManageDonor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblManageDonor.setForeground(new java.awt.Color(255, 255, 255));
        tblManageDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Donor Name", "Contact Number", "Status"
            }
        ));
        tblManageDonor.setGridColor(new java.awt.Color(0, 0, 0));
        tblManageDonor.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblManageDonor.setRowHeight(30);
        tblManageDonor.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblManageDonor);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 1030, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         //TODO add your handling code here:
        
        // DonorRequestDirectory ddr = new DonorRequestDirectory();
         int selectedRow = tblManageDonor.getSelectedRow(); 
          DonorRequest dr =((DonorRequest) tblManageDonor.getValueAt(selectedRow, 0));
 
          system.getDonorRequestDirectory().removeDonorRequest(dr);
          
          //ddr.removeDonorRequest(dr);
             
          
          dB4OUtil.storeSystem(system);
          populateTableS();
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblDonorRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelManageDonor;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblManageDonor;
    // End of variables declaration//GEN-END:variables
}