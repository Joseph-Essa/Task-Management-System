
package Frames;

import Frames.Panels.Emp_AddPanel;
import Frames.Panels.Emp_ListPanel;
import Frames.Panels.Emp_UpdatePanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class Admin_EmployeesFrame extends javax.swing.JInternalFrame {

   
    GridBagLayout layout = new GridBagLayout();

    Emp_AddPanel p1;
    Emp_ListPanel p2;
    Emp_UpdatePanel p3;

    public Admin_EmployeesFrame() {
        initComponents();
        p1 = new Emp_AddPanel();
        p2 = new Emp_ListPanel();
        p3 = new Emp_UpdatePanel();

        DynamicPanal.setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanal.add(p1, c);
        DynamicPanal.add(p2, c);
        DynamicPanal.add(p3, c);

        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddEmp = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        DynamicPanal = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Employees  Management");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnAddEmp.setBackground(new java.awt.Color(51, 51, 51));
        btnAddEmp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddEmp.setForeground(new java.awt.Color(204, 204, 204));
        btnAddEmp.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\78.png")); // NOI18N
        btnAddEmp.setText("Ask Holiday");
        btnAddEmp.setBorderPainted(false);
        btnAddEmp.setFocusPainted(false);
        btnAddEmp.setFocusable(false);
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        btnList.setBackground(new java.awt.Color(51, 51, 51));
        btnList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnList.setForeground(new java.awt.Color(204, 204, 204));
        btnList.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\44.png")); // NOI18N
        btnList.setText("List ");
        btnList.setBorderPainted(false);
        btnList.setFocusPainted(false);
        btnList.setFocusable(false);
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\001.png")); // NOI18N
        btnUpdate.setText("Update / Delete");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnAddEmp)
                .addGap(66, 66, 66)
                .addComponent(btnList)
                .addGap(49, 49, 49)
                .addComponent(btnUpdate)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        DynamicPanal.setBackground(new java.awt.Color(51, 51, 51));
        DynamicPanal.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout DynamicPanalLayout = new javax.swing.GroupLayout(DynamicPanal);
        DynamicPanal.setLayout(DynamicPanalLayout);
        DynamicPanalLayout.setHorizontalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        DynamicPanalLayout.setVerticalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        p2.setVisible(true);
        p1.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_btnListActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        p3.setVisible(true);
        p1.setVisible(false);
        p2.setVisible(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanal;
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
