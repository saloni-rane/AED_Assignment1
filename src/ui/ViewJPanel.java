/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableRowSorter;
import model.DataHistory;
import model.Employee;

/**
 *
 * @author LENOVO
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    
    DataHistory history;
    String photo;
    
    public ViewJPanel(DataHistory history) {
        initComponents();
        
        this.history = history;
     
        populateTable();
    }
    
     void viewphoto(){
        
    ImageIcon I = new ImageIcon(this.photo);

        Image D = I.getImage();
        Image M = D.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
        I = new ImageIcon(M);
        photolbl.setIcon(I);
        
     
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        lblContact = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        txtPositionTitle1 = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        textAge = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        photolbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnphoto = new javax.swing.JButton();

        setBackground(new java.awt.Color(90, 153, 148));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 10, 1351, -1));

        tblEmployee.setBackground(new java.awt.Color(204, 204, 204));
        tblEmployee.setBorder(new javax.swing.border.MatteBorder(null));
        tblEmployee.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emp ID", "Age", "Gender", "Start Date", "Level", "Team info", "Position title", "Phone number", "Email address"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 950, 90));

        lblContact.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblContact.setText("Contact info:");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 270, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblPhoneNumber.setText("phone number:");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, 20));

        lblEmailAddress.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblEmailAddress.setText("email address:");
        add(lblEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 83, -1));

        txtPositionTitle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitle1ActionPerformed(evt);
            }
        });
        add(txtPositionTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 300, -1));

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });
        add(txtEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 300, -1));

        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 300, -1));

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 300, -1));

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });
        add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 300, -1));

        textAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAgeActionPerformed(evt);
            }
        });
        add(textAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 300, -1));

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });
        add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 270, -1));

        lblName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 50, -1));

        lblEmpID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEmpID.setText("Emp ID:");
        add(lblEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        lblAge.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblAge.setText("Age:");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 50, -1));

        lblGender.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblGender.setText("Start Date:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        lblStartDate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblStartDate.setText("Gender:");
        add(lblStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        lblLevel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblLevel.setText("Level:");
        add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 50, -1));

        lblTeamInfo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTeamInfo.setText("Team info:");
        add(lblTeamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });
        add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 300, -1));

        lblPositionTitle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPositionTitle.setText("Position title:");
        add(lblPositionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });
        add(txtTeamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 300, -1));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 90, -1));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 80, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));
        add(photolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, 130));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("  Search :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/updateimagee.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 340, 320));

        btnphoto.setText("Photo");
        btnphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphotoActionPerformed(evt);
            }
        });
        add(btnphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtPositionTitle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitle1ActionPerformed

    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDActionPerformed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void textAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAgeActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        
       int selectedRowIndex = tblEmployee.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Select a row to View");
            return;
            
        } 
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedemployee = (Employee)model.getValueAt(selectedRowIndex, 0);
        
        txtName1.setText(String.valueOf(selectedemployee.getName()));
        txtEmpID.setText(String.valueOf(selectedemployee.getEmployee_ID()));
        textAge.setText(String.valueOf(selectedemployee.getAge()));
        txtGender.setText(String.valueOf(selectedemployee.getGender()));
        txtStartDate.setText(String.valueOf(selectedemployee.getStart_Date()));
        txtLevel.setText(String.valueOf(selectedemployee.getLevel()));
        txtTeamInfo.setText(String.valueOf(selectedemployee.getTeam_info()));
        txtPositionTitle1.setText(String.valueOf(selectedemployee.getPosition_title()));
        txtPhoneNumber.setText(String.valueOf(selectedemployee.getPhone_number()));
        txtEmailAddress.setText(String.valueOf(selectedemployee.getEmail_address()));
        this.photo = selectedemployee.getImage();
        viewphoto(); 
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmployee.getSelectedRow();
        
        if (selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedemployee = (Employee)model.getValueAt(selectedRowIndex , 0);
        
        history.deleteEmployee(selectedemployee);
        
        JOptionPane.showMessageDialog(this, "Employee deleted");
        
        populateTable();
        
        
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRowIndex = tblEmployee.getSelectedRow();
        
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
                
        }
        
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee emp = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        
        
        
        if (selectedRowIndex>=0) {
            
            emp.setName(txtName1.getText());
            emp.setEmployee_ID(txtEmpID.getText());
            emp.setAge(Integer.parseInt(textAge.getText()));
            emp.setGender(txtGender.getText());
            emp.setStart_Date(txtStartDate.getText());
            emp.setLevel(txtLevel.getText());
            emp.setTeam_info(txtTeamInfo.getText());
            emp.setTeam_info(txtPositionTitle1.getText());
            emp.setPhone_number(Integer.parseInt (txtPhoneNumber.getText()));
            emp.setEmail_address(txtEmailAddress.getText());
            emp.setImage(photolbl.getText());

        
        }
         
        JOptionPane.showMessageDialog(this, "Employee Information Updated");
        populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel defaultTableModel = (DefaultTableModel)tblEmployee.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        tblEmployee.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphotoActionPerformed
        // TODO add your handling code here:
        
        JFileChooser img = new JFileChooser();
        img.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg", "gif", "png", "jpeg");
        img.addChoosableFileFilter(filter);
        int result = img.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = img.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            this.photo = path; 
        } //image.setIcon (Resize Image (path));
        else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("NO File Selected");
    }//GEN-LAST:event_btnphotoActionPerformed

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnphoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel photolbl;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPositionTitle1;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        
        for (Employee ep : history.getHistory()){
        
        Object[] row = new Object[10];
        row[0] = ep;
        row[1] = ep.getEmployee_ID();
        row[2] = ep.getAge();
        row[3] = ep.getGender();
        row[4] = ep.getStart_Date();
        row[5] = ep.getLevel();
        row[6] = ep.getTeam_info();
        row[7] = ep.getPosition_title();
        row[8] = ep.getPhone_number();
        row[9] = ep.getEmail_address();
        
        model.addRow(row);
                }
    }
}
