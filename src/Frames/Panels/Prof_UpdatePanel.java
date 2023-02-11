
package Frames.Panels;

import FCIHCaseStudy.Main;
import FCIHCaseStudy.Professor;


public class Prof_UpdatePanel extends javax.swing.JPanel {

    
    public Prof_UpdatePanel() {
        initComponents();
        jTextFieldID.setEditable(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldID = new javax.swing.JTextField();
        jTextFieldFname = new javax.swing.JTextField();
        jLabelSucessOrFail = new javax.swing.JLabel();
        jTextFieldLname = new javax.swing.JTextField();
        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextFieldAge = new javax.swing.JTextField();
        jComboBoxDept = new javax.swing.JComboBox<>();
        jTextFieldOfficeHours = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jTextFieldSearchKey = new javax.swing.JTextField();
        jTextFieldSalary = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabelSucessOrFail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelSucessOrFail.setForeground(new java.awt.Color(204, 204, 204));
        jLabelSucessOrFail.setText("Write Prof  ID to get all info ... !       before Update or Delete ... !");

        jComboBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IS", "IT", "SW" }));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\up404.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setDefaultCapable(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(204, 204, 204));
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\delll.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setDefaultCapable(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(204, 204, 204));
        btnSearch.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\shea.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setDefaultCapable(false);
        btnSearch.setFocusPainted(false);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\bb1.png")); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\col11.png")); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\ss12.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Password");

        jLabel20.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\jj.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Repeat Pass");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Age");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Salary");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Department");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Worke Hours");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID");

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\nnn.png")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\nnn.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("First name");

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\e11.png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\pas101.png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\pas101.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Last name");

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\age11.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(16, 16, 16))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(6, 6, 6)))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldOfficeHours, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDept, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete))
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(62, 62, 62)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldOfficeHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                            .addComponent(jLabel2))
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jLabel3))
                                                                                    .addComponent(jLabel12))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel4))
                                                                            .addComponent(jLabel13))
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jLabel5))
                                                                    .addComponent(jLabel14))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6))
                                                            .addComponent(jLabel15))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel7))
                                                    .addComponent(jLabel16))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9))
                                            .addComponent(jLabel17))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldID.getText().equals("") && !jTextFieldFname.getText().equals("") && !jTextFieldLname.getText().equals("") && !jTextFieldUserName.getText().equals("") && !jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("") && !jTextFieldAge.getText().equals("") && !jTextFieldOfficeHours.getText().equals("") && !jTextFieldSalary.getText().equals("")) {

            Professor x = new Professor();
            x.setID(Integer.parseInt(jTextFieldID.getText()));
            x.setFName(jTextFieldFname.getText());
            x.setLName(jTextFieldLname.getText());
            x.setUserName(jTextFieldUserName.getText());
            if (jPasswordField1.getText().equals(jPasswordField2.getText())) {
                x.setPass(jPasswordField1.getText());
            }

            x.setAge(Integer.parseInt(jTextFieldAge.getText()));

            if (jComboBoxDept.getSelectedItem().equals("CS")) {
                x.setDept(Main.cs);
            } else if (jComboBoxDept.getSelectedItem().equals("IS")) {
                x.setDept(Main.is);
            } else if (jComboBoxDept.getSelectedItem().equals("IT")) {
                x.setDept(Main.it);
            } else if (jComboBoxDept.getSelectedItem().equals("SW")) {
                x.setDept(Main.sw);
            }

            x.setOfficeHours(jTextFieldOfficeHours.getText());
            x.setSalary(Double.parseDouble(jTextFieldSalary.getText()));

            if (x.updateProf()) {
                jLabelSucessOrFail.setText("Updated Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to Update ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldSearchKey.getText().equals("")) {
            Professor x = new Professor();
            Professor returned = x.searchProfById(Integer.parseInt(jTextFieldSearchKey.getText()));
            if (returned.getID() > 0) {
                setPanelData(returned);
            } else {
                jLabelSucessOrFail.setText("Not Found ...!");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldSearchKey.getText().equals("")) {
            Professor x = new Professor();
            if (x.deleteProf(Integer.parseInt(jTextFieldSearchKey.getText()))) {
                jLabelSucessOrFail.setText("Deleted Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to delete ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    protected void resetPanelData() {
        jTextFieldID.setText("");
        jTextFieldFname.setText("");
        jTextFieldLname.setText("");
        jTextFieldUserName.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jTextFieldAge.setText("");
        jTextFieldOfficeHours.setText("");
        jTextFieldSalary.setText("");
        jComboBoxDept.setSelectedIndex(0);

    }

    protected void setPanelData(Professor x) {
        jTextFieldID.setText("" + x.getID());
        jTextFieldFname.setText("" + x.getFName());
        jTextFieldLname.setText("" + x.getLName());
        jTextFieldUserName.setText("" + x.getuserName());
        jPasswordField1.setText("" + x.getPass());
        jPasswordField2.setText("" + x.getPass());
        jTextFieldAge.setText("" + x.getAge());
        jTextFieldOfficeHours.setText("" + x.getOfficeHours());

        if (x.myDept.getDeptName().equals("CS")) {
            jComboBoxDept.setSelectedIndex(0);
        } else if (x.myDept.getDeptName().equals("IS")) {
            jComboBoxDept.setSelectedIndex(1);
        } else if (x.myDept.getDeptName().equals("IT")) {
            jComboBoxDept.setSelectedIndex(2);
        } else if (x.myDept.getDeptName().equals("SW")) {
            jComboBoxDept.setSelectedIndex(3);
        }
        jTextFieldSalary.setText("" + x.getSalary());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBoxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldOfficeHours;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JTextField jTextFieldSearchKey;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
