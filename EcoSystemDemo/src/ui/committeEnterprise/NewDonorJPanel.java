/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.committeEnterprise;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.DonorRequest;
import Business.People.DonorRequestDirectory;
import HomePages.DonorRecieverFramePage;
import HomePages.LoginPage;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author patol
 */
public class NewDonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewDonorJPanel
     */
    
    private boolean emailValid;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private byte[] tempdP;
    private ButtonGroup radioGroup1;
    private ButtonGroup radioGroup2;
    private ButtonGroup radioGroup3;
    private ButtonGroup radioGroup4;
            
    public NewDonorJPanel(EcoSystem system)
    {
        initComponents();
        this.system = system;
        this.radioGroup1 = new ButtonGroup();
        this.radioGroup2 = new ButtonGroup();
        this.radioGroup3 = new ButtonGroup();
        this.radioGroup4 = new ButtonGroup();
       
        
        
        curedDateValidateMessage.setVisible(false);
        emailSuccessLabel.setVisible(false);
        emailValidateMessage.setVisible(false);
        
       // ButtonGroup radioGroup1 = new ButtonGroup();
        radioGroup1.add(buttonYesGroup1);
        radioGroup1.add(buttonNoGroup1);
  
      //  ButtonGroup radioGroup2 = new ButtonGroup();
        radioGroup2.add(buttonYesGroup2);
        radioGroup2.add(buttonNoGroup2);
        
      //  ButtonGroup radioGroup3 = new ButtonGroup();
        radioGroup3.add(buttonYesGroup3);
        radioGroup3.add(buttonNoGroup3);
        
       // ButtonGroup radioGroup4 = new ButtonGroup();
        radioGroup4.add(buttonYesGroup4);
        radioGroup4.add(buttonNoGroup4);
        
        populateBloodGroupComboBox();
        populateGenderComboBox();
        populateStateComboBox();
    
    
    }

  private void populateBloodGroupComboBox(){
           
           jComboBoxBloodGroup.addItem("O+");
           jComboBoxBloodGroup.addItem("AB+");
           jComboBoxBloodGroup.addItem("O-");
           jComboBoxBloodGroup.addItem("AB-");
           jComboBoxBloodGroup.addItem("A+");
           jComboBoxBloodGroup.addItem("B+");
           jComboBoxBloodGroup.addItem("A-");
           jComboBoxBloodGroup.addItem("B-");
           
        }
  
  private void populateGenderComboBox(){
           JComboBoxGender.addItem("Male");
           JComboBoxGender.addItem("Female");
           JComboBoxGender.addItem("Other");
        }
  
  private void populateStateComboBox(){
           JComboBoxState.addItem("California");
           JComboBoxState.addItem("Massachusetts");
           JComboBoxState.addItem("Georgia");
           JComboBoxState.addItem("Arizona");
           JComboBoxState.addItem("Texas");
           JComboBoxState.addItem("Florida");
           JComboBoxState.addItem("Illinois");
      }
    public static boolean phoneNumberValidator(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
        }
    public static boolean zipCodeValidator(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
        } 
    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
        }
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
        }

    private void disableAllButton(){
    
        TextID.setEnabled(false);
        TextName.setEnabled(false);
        datechooserpdate.setEnabled(false);
        TextAge.setEnabled(false);
        Textemail.setEnabled(false);
        contactText.setEnabled(false);
        JComboBoxGender.setEnabled(false);
        jComboBoxBloodGroup.setEnabled(false);
        diagnosedDateField.setEnabled(false);
        curedDateField.setEnabled(false);
        lastDonationDateField.setEnabled(false);
        TextStreet.setEnabled(false);
        TextCity.setEnabled(false);
        JComboBoxState.setEnabled(false);
        TextZip.setEnabled(false);
        buttonYesGroup1.setEnabled(false);
        buttonNoGroup1.setEnabled(false);
        buttonYesGroup2.setEnabled(false);
        buttonNoGroup2.setEnabled(false);
        buttonYesGroup3.setEnabled(false);
        buttonNoGroup3.setEnabled(false);
        buttonYesGroup4.setEnabled(false);
        buttonNoGroup4.setEnabled(false);
        addPhotoButton.setEnabled(false);
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDonorName = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        jLabelDOB = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        TextAge = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jLabelBloodGroup = new javax.swing.JLabel();
        TextStreet = new javax.swing.JTextField();
        jLabelDiagnosedDate = new javax.swing.JLabel();
        jLabelRecoveryDate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        TextCity = new javax.swing.JTextField();
        jLabelState = new javax.swing.JLabel();
        jLabelZipCode = new javax.swing.JLabel();
        TextZip = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        Textemail = new javax.swing.JTextField();
        jLabelPlasmaDonationDate = new javax.swing.JLabel();
        jLabelLab = new javax.swing.JLabel();
        jLabelSymptoms = new javax.swing.JLabel();
        jLabel14Days = new javax.swing.JLabel();
        jLabelNegative = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        addPhotoButton = new javax.swing.JButton();
        buttonYesGroup2 = new javax.swing.JRadioButton();
        buttonNoGroup2 = new javax.swing.JRadioButton();
        buttonNoGroup1 = new javax.swing.JRadioButton();
        buttonYesGroup1 = new javax.swing.JRadioButton();
        buttonNoGroup3 = new javax.swing.JRadioButton();
        buttonYesGroup3 = new javax.swing.JRadioButton();
        buttonNoGroup4 = new javax.swing.JRadioButton();
        buttonYesGroup4 = new javax.swing.JRadioButton();
        lblProfilePicture = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        JComboBoxState = new javax.swing.JComboBox();
        JComboBoxGender = new javax.swing.JComboBox();
        curedDateValidateMessage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelDonorRegistrationForm = new javax.swing.JLabel();
        emailValidateMessage = new javax.swing.JLabel();
        emailSuccessLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPersonalDetails = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jComboBoxBloodGroup = new javax.swing.JComboBox<>();
        datechooserpdate = new com.toedter.calendar.JDateChooser();
        datechooserdob = new com.toedter.calendar.JDateChooser();
        datechoosercdate = new com.toedter.calendar.JDateChooser();
        datechooserddate = new com.toedter.calendar.JDateChooser();
        datechooserddate5 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 204, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDonorName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelDonorName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDonorName.setText("Donor Name");
        add(jLabelDonorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        TextName.setBackground(new java.awt.Color(0, 0, 0));
        TextName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNameActionPerformed(evt);
            }
        });
        add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 180, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 218, -1, -1));

        jLabelID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("ID");
        add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        TextID.setBackground(new java.awt.Color(0, 0, 0));
        TextID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 180, -1));

        jLabelDOB.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelDOB.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDOB.setText("Date Of Birth");
        add(jLabelDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabelAge.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelAge.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAge.setText("Age");
        add(jLabelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        TextAge.setBackground(new java.awt.Color(0, 0, 0));
        TextAge.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextAge.setForeground(new java.awt.Color(255, 255, 255));
        TextAge.setEnabled(false);
        TextAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAgeMouseClicked(evt);
            }
        });
        TextAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextAgeKeyPressed(evt);
            }
        });
        add(TextAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 180, -1));

        jLabelGender.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGender.setText("Gender");
        add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabelBloodGroup.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelBloodGroup.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBloodGroup.setText("Blood group");
        add(jLabelBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, 20));

        TextStreet.setBackground(new java.awt.Color(0, 0, 0));
        TextStreet.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextStreet.setForeground(new java.awt.Color(255, 255, 255));
        add(TextStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 180, -1));

        jLabelDiagnosedDate.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelDiagnosedDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiagnosedDate.setText("Covid diagnosed date");
        add(jLabelDiagnosedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, -1));

        jLabelRecoveryDate.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelRecoveryDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRecoveryDate.setText("Covid Recovery date");
        add(jLabelRecoveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Street ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jLabelCity.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelCity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCity.setText("City");
        add(jLabelCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        TextCity.setBackground(new java.awt.Color(0, 0, 0));
        TextCity.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextCity.setForeground(new java.awt.Color(255, 255, 255));
        add(TextCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 180, -1));

        jLabelState.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelState.setForeground(new java.awt.Color(255, 255, 255));
        jLabelState.setText("State");
        add(jLabelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        jLabelZipCode.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelZipCode.setForeground(new java.awt.Color(255, 255, 255));
        jLabelZipCode.setText("ZipCode");
        add(jLabelZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, -1, -1));

        TextZip.setBackground(new java.awt.Color(0, 0, 0));
        TextZip.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextZip.setForeground(new java.awt.Color(255, 255, 255));
        add(TextZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 180, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact Number");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 0, 0));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.setForeground(new java.awt.Color(255, 255, 255));
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 180, -1));

        jLabelEmail.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email ");
        add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        Textemail.setBackground(new java.awt.Color(0, 0, 0));
        Textemail.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Textemail.setForeground(new java.awt.Color(255, 255, 255));
        Textemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextemailMouseClicked(evt);
            }
        });
        Textemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(Textemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 170, -1));

        jLabelPlasmaDonationDate.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelPlasmaDonationDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlasmaDonationDate.setText("Last Plasma donoation date");
        add(jLabelPlasmaDonationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, -1));

        jLabelLab.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelLab.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLab.setText("Was your COVID-19 diagnosis confirmed by a authorized lab?");
        add(jLabelLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, -1));

        jLabelSymptoms.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelSymptoms.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSymptoms.setText("Currently, do you have any symptoms? ");
        add(jLabelSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, -1, -1));

        jLabel14Days.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14Days.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14Days.setText("Has it been at least 14 days since the last day of your symptoms? ");
        add(jLabel14Days, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, 630, -1));

        jLabelNegative.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelNegative.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNegative.setText("Have you had a follow up test that was negative for COVID-19?");
        add(jLabelNegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 740, 600, 20));

        btnSubmit.setBackground(new java.awt.Color(31, 31, 31));
        btnSubmit.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 800, 110, 40));

        addPhotoButton.setBackground(new java.awt.Color(31, 31, 31));
        addPhotoButton.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        addPhotoButton.setForeground(new java.awt.Color(255, 255, 255));
        addPhotoButton.setText("Add photo");
        addPhotoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoButtonActionPerformed(evt);
            }
        });
        add(addPhotoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, 120, 40));

        buttonYesGroup2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup2.setForeground(new java.awt.Color(255, 255, 255));
        buttonYesGroup2.setText("Yes");
        buttonYesGroup2.setOpaque(false);
        add(buttonYesGroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 650, -1, -1));

        buttonNoGroup2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup2.setForeground(new java.awt.Color(255, 255, 255));
        buttonNoGroup2.setText("No");
        buttonNoGroup2.setOpaque(false);
        add(buttonNoGroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 650, -1, -1));

        buttonNoGroup1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup1.setForeground(new java.awt.Color(255, 255, 255));
        buttonNoGroup1.setText("No");
        buttonNoGroup1.setOpaque(false);
        add(buttonNoGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 590, -1, -1));

        buttonYesGroup1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup1.setForeground(new java.awt.Color(255, 255, 255));
        buttonYesGroup1.setText("Yes");
        buttonYesGroup1.setOpaque(false);
        add(buttonYesGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, -1, -1));

        buttonNoGroup3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup3.setForeground(new java.awt.Color(255, 255, 255));
        buttonNoGroup3.setText("No");
        buttonNoGroup3.setOpaque(false);
        add(buttonNoGroup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, -1, -1));

        buttonYesGroup3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup3.setForeground(new java.awt.Color(255, 255, 255));
        buttonYesGroup3.setText("Yes");
        buttonYesGroup3.setOpaque(false);
        add(buttonYesGroup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, -1, -1));

        buttonNoGroup4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonNoGroup4.setForeground(new java.awt.Color(255, 255, 255));
        buttonNoGroup4.setText("No");
        buttonNoGroup4.setOpaque(false);
        add(buttonNoGroup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 770, -1, -1));

        buttonYesGroup4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonYesGroup4.setForeground(new java.awt.Color(255, 255, 255));
        buttonYesGroup4.setText("Yes");
        buttonYesGroup4.setOpaque(false);
        add(buttonYesGroup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 770, -1, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        lblProfilePicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 100, 130, 130));

        lblBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 790, -1, 54));

        btnReset.setBackground(new java.awt.Color(31, 31, 31));
        btnReset.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 800, 120, 40));

        JComboBoxState.setBackground(new java.awt.Color(0, 0, 0));
        JComboBoxState.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        JComboBoxState.setForeground(new java.awt.Color(255, 255, 255));
        JComboBoxState.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JComboBoxState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxStateActionPerformed(evt);
            }
        });
        add(JComboBoxState, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 180, -1));

        JComboBoxGender.setBackground(new java.awt.Color(0, 0, 0));
        JComboBoxGender.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        JComboBoxGender.setForeground(new java.awt.Color(255, 255, 255));
        JComboBoxGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxGenderActionPerformed(evt);
            }
        });
        add(JComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 170, -1));

        curedDateValidateMessage.setBackground(new java.awt.Color(0, 0, 0));
        curedDateValidateMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        curedDateValidateMessage.setText("Cured Date is before the Diagnosed Date!");
        add(curedDateValidateMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabelDonorRegistrationForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDonorRegistrationForm.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDonorRegistrationForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDonorRegistrationForm.setText("Donor Registration Form ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDonorRegistrationForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1666, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDonorRegistrationForm, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, -1));

        emailValidateMessage.setBackground(new java.awt.Color(0, 0, 0));
        emailValidateMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        emailValidateMessage.setText("Email format incorrect!");
        add(emailValidateMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        emailSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.gif"))); // NOI18N
        add(emailSuccessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 30, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 1140, 20));

        jLabelPersonalDetails.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelPersonalDetails.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPersonalDetails.setText("Personal Details");
        add(jLabelPersonalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jLabelAddress.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelAddress.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddress.setText("Address Details");
        add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 20, 360));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("COVID Details");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        jComboBoxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBloodGroupActionPerformed(evt);
            }
        });
        add(jComboBoxBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 180, 20));

        datechooserpdate.setBackground(new java.awt.Color(0, 0, 0));
        datechooserpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datechooserpdate.setForeground(new java.awt.Color(255, 255, 255));
        add(datechooserpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 180, 30));

        datechooserdob.setBackground(new java.awt.Color(0, 0, 0));
        datechooserdob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datechooserdob.setForeground(new java.awt.Color(255, 255, 255));
        add(datechooserdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 180, 30));

        datechoosercdate.setBackground(new java.awt.Color(0, 0, 0));
        datechoosercdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datechoosercdate.setForeground(new java.awt.Color(255, 255, 255));
        add(datechoosercdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, 180, 30));

        datechooserddate.setBackground(new java.awt.Color(0, 0, 0));
        datechooserddate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datechooserddate.setForeground(new java.awt.Color(255, 255, 255));
        add(datechooserddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 180, 30));

        datechooserddate5.setBackground(new java.awt.Color(0, 0, 0));
        datechooserddate5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datechooserddate5.setForeground(new java.awt.Color(255, 255, 255));
        add(datechooserddate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Date currentDate = new Date(); 
         if ( lblProfilePicture == null ){
            lblProfilePicture.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblProfilePicture.setForeground(Color.red);
            addPhotoButton.setBorder(BorderFactory.createLineBorder(Color.RED));
            addPhotoButton.setForeground(Color.red);       
        }
        if ( JComboBoxState.getSelectedItem().equals("") ){
            JComboBoxState.setBorder(BorderFactory.createLineBorder(Color.RED));
            JComboBoxState.setForeground(Color.red);
        }
        if ( JComboBoxGender.getSelectedItem().equals("") ){
            JComboBoxGender.setBorder(BorderFactory.createLineBorder(Color.RED));
            JComboBoxGender.setForeground(Color.red);
        }
        if ( jComboBoxBloodGroup.getSelectedItem().equals("") ){
            jComboBoxBloodGroup.setBorder(BorderFactory.createLineBorder(Color.RED));
            jComboBoxBloodGroup.setForeground(Color.red);
        }
        if (TextName.getText().isEmpty()) {
            TextName.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextName.setForeground(Color.red);
        }
        if (TextID.getText().isEmpty()) {
            TextID.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextID.setForeground(Color.red);
        } 
        if (Textemail.getText().isEmpty()) {
            Textemail.setBorder(BorderFactory.createLineBorder(Color.RED));
            Textemail.setForeground(Color.red);
        }
        if (contactText.getText().isEmpty()) {
            contactText.setBorder(BorderFactory.createLineBorder(Color.RED));
            contactText.setForeground(Color.red);
        }
        if (TextZip.getText().isEmpty()) {
            TextZip.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextZip.setForeground(Color.red);
        }
        if (TextCity.getText().isEmpty()) {
            TextCity.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextCity.setForeground(Color.red);
        }
        if (TextStreet.getText().isEmpty()) {
            TextStreet.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextStreet.setForeground(Color.red);
        }
        if (diagnosedDateField.getDate() == null ) {
            diagnosedDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            diagnosedDateField.setForeground(Color.red);
        }
        if (curedDateField.getDate() == null ) {
            curedDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            curedDateField.setForeground(Color.red);
        }
        if (lastDonationDateField.getDate() == null ) {
            lastDonationDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            lastDonationDateField.setForeground(Color.red);
        }        
        if (datechooserpdate.getDate() == null ) {
            datechooserpdate.setBorder(BorderFactory.createLineBorder(Color.RED));
            datechooserpdate.setForeground(Color.red);
        }
         if (TextAge.getText().isEmpty()) {
            TextAge.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextAge.setForeground(Color.red);
        }
       //
       //
       //
       //
       
        if (    TextName.getText().isEmpty()        || Textemail.getText().isEmpty()        || TextCity.getText().isEmpty() ||
                contactText.getText().isEmpty()     || TextZip.getText().isEmpty()          || TextStreet.getText().isEmpty() || 
                TextID.getText().isEmpty()         || curedDateField.getDate() == null  || diagnosedDateField.getDate() == null || 
                datechooserpdate.getDate() == null      || lastDonationDateField.getDate() == null     || 
                TextAge.getText().isEmpty()         ||
                String.valueOf(JComboBoxGender.getSelectedItem()).equals("") || 
                String.valueOf(jComboBoxBloodGroup.getSelectedItem()).equals("") || 
                String.valueOf(JComboBoxState.getSelectedItem()).equals(""))
            { 
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2><I>All fields are</I><font color='red'> mandatory</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
             return ;
            }
   
        
        else if(  !buttonNoGroup1.isSelected()  &&  !buttonYesGroup1.isSelected()   ||
                  !buttonNoGroup2.isSelected()  &&  !buttonYesGroup2.isSelected()   ||
                  !buttonNoGroup3.isSelected()  &&  !buttonYesGroup3.isSelected()   ||
                  !buttonNoGroup4.isSelected()  &&  !buttonYesGroup4.isSelected()   )
        {
        JOptionPane.showMessageDialog(null,new JLabel("<html><h2><I>All fields are</I><font color='red'> mandatory</font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
    
        else if (!isAlpha(TextName.getText()))
        {
         TextName.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextName.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Name</I></font> must contain only<font color='green'> alphabets</font></h2>!</html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (!isAlpha(TextCity.getText()))
        {
         TextCity.setBorder(BorderFactory.createLineBorder(Color.RED));
            TextCity.setForeground(Color.red);
         JOptionPane.showMessageDialog(null, new JLabel("<html><h2>Name of the<font color='red'><I> City</I></font> must contain only<font color='green'> alphabets</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
            //JOptionPane.showMessageDialog(null, "City name must contain only alphabets." , "Error", JOptionPane.ERROR_MESSAGE);
            //return;
        }
        
        else   if ( !phoneNumberValidator(contactText.getText())   ){
           //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Contact Number</I></font> should be<font color='green'> 10 digit</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           // return;
           return;
        }
        else   if ( !zipCodeValidator(TextZip.getText()) ){
           //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Zip</I></font> should be<font color='green'> 5 digit</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        else   if ( !emailValidator(Textemail.getText()) ){
           //JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Email ID</I></font> must be in<font color='green'> correct format</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

           return;
        } 
        
        else if (currentDate.equals(lastDonationDateField.getDate()) || lastDonationDateField.getDate().after(currentDate)) {
             //JOptionPane.showMessageDialog(null, "Date should be past date", "Error", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Date</I></font> should be<font color='green'> past date</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);

             return;}
        else if(diagnosedDateField.getDate().compareTo(curedDateField.getDate())>0){
            //JOptionPane.showMessageDialog(null, "Cured Date should be ahead of Diagnosed Date", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Cured Date</I></font> should be ahead of<font color='red'><I> Diagnosed Date</I></font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
          
          
          else{

            int n = JOptionPane.showConfirmDialog(null,new JLabel("<html><h2>Would you like to<font color='green'><I> submit</I></font> the form?</h2></html>"),
                    "CONFIRMATION REQUIRED",JOptionPane.YES_NO_OPTION);

            if(n == 0)
            { 
            
        DonorRequest donorRequest = system.getDonorRequestDirectory().addDonorRequest(); 
        donorRequest.setDonorID(TextID.getText()); // UID
        donorRequest.setName(TextName.getText()); // Name
        donorRequest.setDob(datechooserpdate.getDate()); // DOB 
        donorRequest.setCovidDiagnosedDate(diagnosedDateField.getDate()); // covidDiagnosedDate
        donorRequest.setCovidCuredDate(curedDateField.getDate()); // covidCuredDate
        donorRequest.setLastDonationDate(lastDonationDateField.getDate()); // lastDonationDate
        donorRequest.setAge(Integer.parseInt(TextAge.getText())); // Age
        donorRequest.setGender((String) JComboBoxGender.getSelectedItem()); // gender
        donorRequest.setBloodGroup((String) jComboBoxBloodGroup.getSelectedItem()); // Blood group
        donorRequest.setStreetAddress(TextStreet.getText()); // streetAddress
        donorRequest.setCity(TextCity.getText()); // city
        donorRequest.setState((String) JComboBoxState.getSelectedItem()); // state
        donorRequest.setZipCode(Integer.parseInt(TextZip.getText())); // zipCode
        donorRequest.setContact(Integer.parseInt(contactText.getText())); // contact
        donorRequest.setEmailID(Textemail.getText()); // emailID
        donorRequest.setStatus("New Request"); // status
        //donorRequest.setImagePath(photoTextField.getText()); 
        donorRequest.setdP(tempdP);
        
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDonorRequestList()){
            //System.out.println("PRINITNG IT HERE!!");
           // System.out.println(dnr.getName());
        }
        
        if(buttonYesGroup1.isSelected())
        {donorRequest.setLabConfirmation(true); //  labConfirmation
        }
        else if(buttonNoGroup1.isSelected())
        {donorRequest.setLabConfirmation(false); //  labConfirmation
        }
        
        if(buttonYesGroup2.isSelected())
        {donorRequest.setSymptoms(true); //  symptoms
        }
        else if(buttonNoGroup2.isSelected())
        {donorRequest.setSymptoms(false); //  symptoms
        }
        
        if(buttonYesGroup3.isSelected())
        {donorRequest.setLastDaySymptoms(true); //  lastDaySymptoms
        }
        else if(buttonNoGroup3.isSelected())
        {donorRequest.setLastDaySymptoms(false); //  lastDaySymptoms
        }
        
        if(buttonYesGroup4.isSelected())
        {donorRequest.setFollowUpTest(true); //  followUpTest
        }
        else if(buttonNoGroup4.isSelected())
        {donorRequest.setFollowUpTest(false); //  followUpTest
        }

        JOptionPane.showMessageDialog(null, new JLabel("<html><h2>Thank you for registering to<font color='green'><I><B> HELP</B></I></font>!</h2></html>"));
        
        dB4OUtil.storeSystem(system);
        disableAllButton();
        }}
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void addPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoButtonActionPerformed
        // TODO add your handling code here:
       /* JFileChooser chooser1 = new JFileChooser();
        chooser1.showOpenDialog(null);
        File f = chooser1.getSelectedFile();
        String filename = f.getAbsolutePath();
        photoTextField.setText(filename);
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_SMOOTH);
        jLabel23.setIcon(icon);*/
       
       
       JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.dir")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              tempdP = new byte[(int) selectedFile.length()]; 
                FileInputStream fis;
             try {
                 fis = new FileInputStream(selectedFile);
                 fis.read(tempdP);
                 fis.close();
             } catch (IOException ex) {
                 Logger.getLogger(NewDonorJPanel.class.getName()).log(Level.SEVERE, null, ex);
             }             
              lblProfilePicture.setIcon(ResizeImage(selectedFile.getAbsolutePath()));
              lblProfilePicture.setIcon(setPicture(selectedFile.getAbsolutePath(),lblProfilePicture));
          }

          else if(result == JFileChooser.CANCEL_OPTION){
             // System.out.println("No File Select");
          }
       
          
       
    }//GEN-LAST:event_addPhotoButtonActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        
        
        
        
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        NewDonorJPanel.super.setVisible(false);
        dB4OUtil.storeSystem(system);
        
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        lblProfilePicture.setIcon(null);
        radioGroup1.clearSelection();
        radioGroup2.clearSelection();
        radioGroup3.clearSelection();
        radioGroup4.clearSelection();
        TextID.setEnabled(true);
        TextName.setEnabled(true);
        datechooserpdate.setEnabled(true);
        TextAge.setEnabled(false);
        Textemail.setEnabled(true);
        contactText.setEnabled(true);
        JComboBoxGender.setEnabled(true);
        jComboBoxBloodGroup.setEnabled(true);
        diagnosedDateField.setEnabled(true);
        curedDateField.setEnabled(true);
        lastDonationDateField.setEnabled(true);
        TextStreet.setEnabled(true);
        TextCity.setEnabled(true);
        JComboBoxState.setEnabled(true);
        TextZip.setEnabled(true);
        buttonYesGroup1.setEnabled(true);
        buttonNoGroup1.setEnabled(true);
        buttonYesGroup2.setEnabled(true);
        buttonNoGroup2.setEnabled(true);
        buttonYesGroup3.setEnabled(true);
        buttonNoGroup3.setEnabled(true);
        buttonYesGroup4.setEnabled(true);
        buttonNoGroup4.setEnabled(true);
        addPhotoButton.setEnabled(true);
        
        TextID.setText("");
        TextName.setText("");
        TextAge.setText("");
        Textemail.setText("");
        contactText.setText("");
        TextStreet.setText("");
        TextCity.setText("");
        TextZip.setText("");
        
        JComboBoxGender.setSelectedItem("");
        jComboBoxBloodGroup.setSelectedItem("");
        JComboBoxState.setSelectedItem("");
        
        datechooserpdate.setCalendar(null);
        diagnosedDateField.setCalendar(null);
        curedDateField.setCalendar(null);
        lastDonationDateField.setCalendar(null);
        
        buttonYesGroup1.setSelected(false);
        buttonNoGroup1.setSelected(false);
        buttonYesGroup2.setSelected(false);
        buttonNoGroup2.setSelected(false);
        buttonYesGroup3.setSelected(false);
        buttonNoGroup3.setSelected(false);
        buttonYesGroup4.setSelected(false);
        buttonNoGroup4.setSelected(false);
        
        lblProfilePicture.removeAll();
        
        //JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><font color='red'>Hello</font>, world </h2></html>"));
            
       
    }//GEN-LAST:event_btnResetActionPerformed

    private void JComboBoxStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxStateActionPerformed
       
        
    }//GEN-LAST:event_JComboBoxStateActionPerformed

    private void JComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxGenderActionPerformed

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
        if (!emailValidator(Textemail.getText())) {
            emailValidateMessage.setVisible(true);
            emailValid = false;
        } else {
            Textemail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            Textemail.setForeground(Color.WHITE);
            emailValidateMessage.setVisible(false);
            emailSuccessLabel.setVisible(true);
            emailValid = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                   emailSuccessLabel.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
        
        
        
    }//GEN-LAST:event_uEmailKeyTyped

    private void TextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNameActionPerformed

    private void uDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uDobKeyTyped
        // TODO add your handling code here:
        // System.out.println("date");
    /*

        Date dob = dobDateField.getDate();
    
        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);
 
        Period p = Period.between(birthday, today);
        
        ageText.setText(String.valueOf(p.getYears()));
    String dobq=  calculateAge(dob, today);    
        
    }

    
*/
  /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
  
      */
    }//GEN-LAST:event_uDobKeyTyped

    private void TextAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAgeKeyPressed

    private void TextAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAgeMouseClicked
        // TODO add your handling code here:
        Date dob = datechooserpdate.getDate();
        //System.out.println(dob.getYear());
        TextAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    
      /*  LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);
 
        Period p = Period.between(birthday, today);
        
        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);  
        */
        
    }//GEN-LAST:event_TextAgeMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Date dob = datechooserpdate.getDate();
       // System.out.println(dob.getYear());
        TextAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_formMouseClicked

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
  //    Date dob = dobDateField.getDate();
 //       System.out.println(dob.getYear());
    //    ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblProfilePicture.getWidth(), lblProfilePicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
     private ImageIcon setPicture(String carImageLocation, JLabel carImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        
        return selectedCarPicture;  
}    
    
    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed
     
    }//GEN-LAST:event_dobDateFieldMousePressed

    
    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_dobDateFieldFocusLost

    private void UCovidCuredDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UCovidCuredDateKeyTyped
        // TODO add your handling code here:
        if( diagnosedDateField.getDate().compareTo(curedDateField.getDate()) > 0){
                // Date 1 is after Date 2
                curedDateValidateMessage.setVisible(true);
        }
        
  
    }//GEN-LAST:event_UCovidCuredDateKeyTyped

    private void agePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agePop
        // TODO add your handling code here:
        Date dob = datechooserpdate.getDate();
        System.out.println(dob.getYear());
        TextAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
        
    }//GEN-LAST:event_agePop

    private void TextemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextemailMouseClicked
        // TODO add your handling code here:
        
        Date dob = datechooserpdate.getDate();
      //  System.out.println(dob.getYear());
        TextAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_TextemailMouseClicked

    private void jComboBoxBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBloodGroupActionPerformed
        // TODO add your handling code here:
              populateBloodGroupComboBox();
        populateGenderComboBox();
        populateStateComboBox();
    
    
    }

  private void populateBloodGroupComboBox(){
           
           jComboBoxBloodGroup.addItem("O+");
           jComboBoxBloodGroup.addItem("AB+");
           jComboBoxBloodGroup.addItem("O-");
           jComboBoxBloodGroup.addItem("AB-");
           jComboBoxBloodGroup.addItem("A+");
           jComboBoxBloodGroup.addItem("B+");
           jComboBoxBloodGroup.addItem("A-");
           jComboBoxBloodGroup.addItem("B-");
           
        
    }//GEN-LAST:event_jComboBoxBloodGroupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JComboBoxGender;
    private javax.swing.JComboBox JComboBoxState;
    private javax.swing.JTextField TextAge;
    private javax.swing.JTextField TextCity;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextStreet;
    private javax.swing.JTextField TextZip;
    private javax.swing.JTextField Textemail;
    private javax.swing.JButton addPhotoButton;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton buttonNoGroup1;
    private javax.swing.JRadioButton buttonNoGroup2;
    private javax.swing.JRadioButton buttonNoGroup3;
    private javax.swing.JRadioButton buttonNoGroup4;
    private javax.swing.JRadioButton buttonYesGroup1;
    private javax.swing.JRadioButton buttonYesGroup2;
    private javax.swing.JRadioButton buttonYesGroup3;
    private javax.swing.JRadioButton buttonYesGroup4;
    private javax.swing.JTextField contactText;
    private javax.swing.JLabel curedDateValidateMessage;
    private com.toedter.calendar.JDateChooser datechoosercdate;
    private com.toedter.calendar.JDateChooser datechooserddate;
    private com.toedter.calendar.JDateChooser datechooserddate5;
    private com.toedter.calendar.JDateChooser datechooserdob;
    private com.toedter.calendar.JDateChooser datechooserpdate;
    private javax.swing.JLabel emailSuccessLabel;
    private javax.swing.JLabel emailValidateMessage;
    private javax.swing.JComboBox<String> jComboBoxBloodGroup;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14Days;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelBloodGroup;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelDiagnosedDate;
    private javax.swing.JLabel jLabelDonorName;
    private javax.swing.JLabel jLabelDonorRegistrationForm;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLab;
    private javax.swing.JLabel jLabelNegative;
    private javax.swing.JLabel jLabelPersonalDetails;
    private javax.swing.JLabel jLabelPlasmaDonationDate;
    private javax.swing.JLabel jLabelRecoveryDate;
    private javax.swing.JLabel jLabelState;
    private javax.swing.JLabel jLabelSymptoms;
    private javax.swing.JLabel jLabelZipCode;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblProfilePicture;
    // End of variables declaration//GEN-END:variables
}
