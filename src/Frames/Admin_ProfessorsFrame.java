
package Frames;

import Frames.Panels.Prof_AddPanel;
import Frames.Panels.Prof_ListPanel;
import Frames.Panels.Prof_UpdatePanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Admin_ProfessorsFrame extends javax.swing.JInternalFrame {

   
    GridBagLayout layout = new GridBagLayout();

    Prof_AddPanel p1;
    Prof_ListPanel p2;
    Prof_UpdatePanel p3;

    public Admin_ProfessorsFrame() {
        initComponents();
        p1 = new Prof_AddPanel();
        p2 = new Prof_ListPanel();
        p3 = new Prof_UpdatePanel();

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
        btnAddProf = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        DynamicPanal = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setTitle("Professors  Management");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnAddProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddProf.setForeground(new java.awt.Color(204, 204, 204));
        btnAddProf.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\101.png")); // NOI18N
        btnAddProf.setText("Add New Prof");
        btnAddProf.setBorderPainted(false);
        btnAddProf.setContentAreaFilled(false);
        btnAddProf.setDefaultCapable(false);
        btnAddProf.setFocusPainted(false);
        btnAddProf.setFocusable(false);
        btnAddProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfActionPerformed(evt);
            }
        });

        btnList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnList.setForeground(new java.awt.Color(204, 204, 204));
        btnList.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\44.png")); // NOI18N
        btnList.setText("List All Prof");
        btnList.setBorderPainted(false);
        btnList.setContentAreaFilled(false);
        btnList.setDefaultCapable(false);
        btnList.setFocusPainted(false);
        btnList.setFocusable(false);
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\001.png")); // NOI18N
        btnUpdate.setText("Update / Delete");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddProf, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAddProf)
                .addGap(64, 64, 64)
                .addComponent(btnList)
                .addGap(59, 59, 59)
                .addComponent(btnUpdate)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        DynamicPanal.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout DynamicPanalLayout = new javax.swing.GroupLayout(DynamicPanal);
        DynamicPanal.setLayout(DynamicPanalLayout);
        DynamicPanalLayout.setHorizontalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        DynamicPanalLayout.setVerticalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_btnAddProfActionPerformed

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
    private javax.swing.JButton btnAddProf;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
