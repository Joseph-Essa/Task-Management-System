
package FCIH_GUI;

import FCIHCaseStudy.Student;
import Frames.Admin_CoursesFrame;
import Frames.Admin_EmployeesFrame;
import Frames.Admin_ProfessorsFrame;
import Frames.Admin_StudentsFrame;
import Frames.Admin_TAsFrame;
import Frames.Panels.ChartPanel;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AdminDashboard extends javax.swing.JFrame {

    
    public AdminDashboard() {
        setLocation(350, 100);
        setTitle("User Dashboard");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        menuProfessors = new javax.swing.JButton();
        menuTAs = new javax.swing.JButton();
        menuEmployees = new javax.swing.JButton();
        menuCourses = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\att.png")); // NOI18N
        jButton1.setText("  Attendance");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        menuProfessors.setBackground(new java.awt.Color(51, 51, 51));
        menuProfessors.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        menuProfessors.setForeground(new java.awt.Color(204, 204, 204));
        menuProfessors.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\proo.png")); // NOI18N
        menuProfessors.setText(" Professor");
        menuProfessors.setBorderPainted(false);
        menuProfessors.setContentAreaFilled(false);
        menuProfessors.setDefaultCapable(false);
        menuProfessors.setFocusPainted(false);
        menuProfessors.setFocusable(false);
        menuProfessors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProfessorsActionPerformed(evt);
            }
        });

        menuTAs.setBackground(new java.awt.Color(51, 51, 51));
        menuTAs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        menuTAs.setForeground(new java.awt.Color(204, 204, 204));
        menuTAs.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\ta.png")); // NOI18N
        menuTAs.setText(" TeachingAssistant");
        menuTAs.setBorderPainted(false);
        menuTAs.setContentAreaFilled(false);
        menuTAs.setDefaultCapable(false);
        menuTAs.setFocusPainted(false);
        menuTAs.setFocusable(false);
        menuTAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTAsActionPerformed(evt);
            }
        });

        menuEmployees.setBackground(new java.awt.Color(51, 51, 51));
        menuEmployees.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        menuEmployees.setForeground(new java.awt.Color(204, 204, 204));
        menuEmployees.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\holl.png")); // NOI18N
        menuEmployees.setText("  Holidays");
        menuEmployees.setBorderPainted(false);
        menuEmployees.setContentAreaFilled(false);
        menuEmployees.setDefaultCapable(false);
        menuEmployees.setFocusPainted(false);
        menuEmployees.setFocusable(false);
        menuEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmployeesActionPerformed(evt);
            }
        });

        menuCourses.setBackground(new java.awt.Color(51, 51, 51));
        menuCourses.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        menuCourses.setForeground(new java.awt.Color(204, 204, 204));
        menuCourses.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project_1\\New folder\\ad8.png")); // NOI18N
        menuCourses.setText("  Tasks");
        menuCourses.setBorderPainted(false);
        menuCourses.setContentAreaFilled(false);
        menuCourses.setDefaultCapable(false);
        menuCourses.setFocusPainted(false);
        menuCourses.setFocusable(false);
        menuCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCoursesActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (2)\\Semester (1)\\Computer Programming-2\\Project\\New folder\\Picture2.png")); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(menuEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuProfessors)
                            .addComponent(menuCourses))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuTAs)
                            .addComponent(jButton1))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuProfessors)
                    .addComponent(menuTAs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(menuCourses)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(menuEmployees)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admin_StudentsFrame f = new Admin_StudentsFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuProfessorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProfessorsActionPerformed
         // TODO add your handling code here:
        Admin_ProfessorsFrame f = new Admin_ProfessorsFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuProfessorsActionPerformed

    private void menuTAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTAsActionPerformed
     // TODO add your handling code here:
        Admin_TAsFrame f = new Admin_TAsFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuTAsActionPerformed

    private void menuEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmployeesActionPerformed
        // TODO add your handling code here:
        Admin_EmployeesFrame f = new Admin_EmployeesFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuEmployeesActionPerformed

    private void menuCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCoursesActionPerformed
        // TODO add your handling code here:
        Admin_CoursesFrame f = new Admin_CoursesFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuCoursesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton menuCourses;
    private javax.swing.JButton menuEmployees;
    private javax.swing.JButton menuProfessors;
    private javax.swing.JButton menuTAs;
    // End of variables declaration//GEN-END:variables
}
