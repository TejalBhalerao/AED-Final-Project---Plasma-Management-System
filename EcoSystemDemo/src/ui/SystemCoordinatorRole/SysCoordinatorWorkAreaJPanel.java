/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.SysCoordinatorOrganization;
import Business.People.DonorDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;

/**
 *
 * @author TEJAL
 */
public class SysCoordinatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysCoordinatorWorkAreaJPanel
     */
    private UserAccount userAccount;
    boolean a=true;
    private SysCoordinatorOrganization systorganization;
    private Enterprise enterprise;
    private EcoSystem system;
    private DonorDirectory donorDirectory;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public SysCoordinatorWorkAreaJPanel(UserAccount account, SysCoordinatorOrganization systorganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userAccount = account;
        this.systorganization = systorganization;
        this.enterprise = enterprise;
        this.system = business;
        this.network = network;
    }

    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    public void changeimage(JLabel button, String resourcecheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcecheimg));
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        
        if(dashboard == true){
            
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
        }
        
        else{
            
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        BtnHideMenu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        BtnDonorList = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        BtnPatientsList = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        BtnManageDonorRequests = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        BtnManagePatientRequests = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        BtnProfile = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Header.add(jPanel1, java.awt.BorderLayout.CENTER);

        menu.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(50, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hidemenu.setBackground(new java.awt.Color(15, 29, 52));
        hidemenu.setPreferredSize(new java.awt.Dimension(50, 50));

        BtnHideMenu.setBackground(new java.awt.Color(204, 204, 204));
        BtnHideMenu.setForeground(new java.awt.Color(204, 204, 204));
        BtnHideMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnHideMenu.setText("<");
        BtnHideMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHideMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnHideMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnHideMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hidemenuLayout = new javax.swing.GroupLayout(hidemenu);
        hidemenu.setLayout(hidemenuLayout);
        hidemenuLayout.setHorizontalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hidemenuLayout.createSequentialGroup()
                    .addComponent(BtnHideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        hidemenuLayout.setVerticalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BtnHideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        jPanel2.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, -1));

        menu.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(220, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));

        BtnDonorList.setBackground(new java.awt.Color(153, 153, 153));
        BtnDonorList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDonorList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDonorList.setText("Donors List");
        BtnDonorList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDonorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDonorListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnDonorList, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnDonorList, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 50));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        BtnPatientsList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnPatientsList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnPatientsList.setText("Patients(Recievers) List");
        BtnPatientsList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPatientsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPatientsListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnPatientsList, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnPatientsList, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));

        BtnManageDonorRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageDonorRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageDonorRequests.setText("Manage Donor Requests");
        BtnManageDonorRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageDonorRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageDonorRequestsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageDonorRequests, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageDonorRequests, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setForeground(new java.awt.Color(31, 31, 31));

        BtnManagePatientRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManagePatientRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManagePatientRequests.setText("Manage Patient Requests");
        BtnManagePatientRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManagePatientRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManagePatientRequestsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManagePatientRequests, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManagePatientRequests, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));

        BtnProfile.setBackground(new java.awt.Color(153, 153, 153));
        BtnProfile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnProfile.setText("Profile");
        BtnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jPanel14.setBackground(new java.awt.Color(31, 31, 31));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        menu.add(jPanel3, java.awt.BorderLayout.CENTER);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    private void BtnHideMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHideMenuMouseClicked
        // TODO add your handling code here:

        clickmenu(hidemenu, hidemenu, 1);

        // reate void for methods hide and show panel menu

        if(a==true){
            hideshow(menu,a, BtnHideMenu );
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }
        else{

            hideshow(menu, a, BtnHideMenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_BtnHideMenuMouseClicked

    private void BtnHideMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHideMenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHideMenuMouseEntered

    private void BtnHideMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHideMenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHideMenuMouseExited

    private void BtnDonorListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDonorListMouseClicked
        // TODO add your handling code here:
        DonorsJPanel donorListJPanel = new DonorsJPanel(userAccount, system, network);
        userProcessContainer.add("DonorListJPanel",donorListJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnDonorListMouseClicked

    private void BtnPatientsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPatientsListMouseClicked
        // TODO add your handling code here:
        PatientsJPanel patientListJPanel = new PatientsJPanel(userAccount, system, network, systorganization);
        userProcessContainer.add("PatientListJPanel",patientListJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnPatientsListMouseClicked

    private void BtnManageDonorRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageDonorRequestsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnManageDonorRequestsMouseClicked

    private void BtnManagePatientRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManagePatientRequestsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnManagePatientRequestsMouseClicked

    private void BtnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProfileMouseClicked
        // TODO add your handling code here:
        ManageSysCoordinatorProfile manageSystCoordinatorProfile = new ManageSysCoordinatorProfile(userAccount,systorganization,enterprise);
        userProcessContainer.add("ManageSystemCoordinatorProfile",manageSystCoordinatorProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnProfileMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnDonorList;
    private javax.swing.JLabel BtnHideMenu;
    private javax.swing.JLabel BtnManageDonorRequests;
    private javax.swing.JLabel BtnManagePatientRequests;
    private javax.swing.JLabel BtnPatientsList;
    private javax.swing.JLabel BtnProfile;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
