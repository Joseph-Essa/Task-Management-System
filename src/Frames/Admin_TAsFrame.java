
package Frames;

import Frames.Panels.TA_AddPanel;
import Frames.Panels.TA_ListPanel;
import Frames.Panels.TA_UpdatePanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class Admin_TAsFrame extends javax.swing.JInternalFrame {

    
    GridBagLayout layout = new GridBagLayout();

    TA_AddPanel p1;
    TA_ListPanel p2;
    TA_UpdatePanel p3;

    public Admin_TAsFrame() {
        initComponents();
        p1 = new TA_AddPanel();
        p2 = new TA_ListPanel();
        p3 = new TA_UpdatePanel();

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
        btnAddTA = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        DynamicPanal = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setTitle("TAs  Management");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnAddTA.setBackground(new java.awt.Color(51, 51, 51));
        btnAddTA.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddTA.setForeground(new java.awt.Color(204, 204, 204));
        btnAddTA.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\101.png")); // NOI18N
        btnAddTA.setText("Add New TA");
        btnAddTA.setBorderPainted(false);
        btnAddTA.setContentAreaFilled(false);
        btnAddTA.setDefaultCapable(false);
        btnAddTA.setFocusPainted(false);
        btnAddTA.setFocusable(false);
        btnAddTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTAActionPerformed(evt);
            }
        });

        btnList.setBackground(new java.awt.Color(51, 51, 51));
        btnList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnList.setForeground(new java.awt.Color(204, 204, 204));
        btnList.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\44.png")); // NOI18N
        btnList.setText("List All TAs");
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

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
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
                    .addComponent(btnAddTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnAddTA)
                .addGap(65, 65, 65)
                .addComponent(btnList)
                .addGap(58, 58, 58)
                .addComponent(btnUpdate)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        DynamicPanal.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout DynamicPanalLayout = new javax.swing.GroupLayout(DynamicPanal);
        DynamicPanal.setLayout(DynamicPanalLayout);
        DynamicPanalLayout.setHorizontalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        DynamicPanalLayout.setVerticalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTAActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_btnAddTAActionPerformed

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
    private javax.swing.JButton btnAddTA;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
