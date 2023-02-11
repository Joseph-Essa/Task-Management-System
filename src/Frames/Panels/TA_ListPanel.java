
package Frames.Panels;

import FCIHCaseStudy.Main;
import FCIHCaseStudy.TeachingAssistant;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TA_ListPanel extends javax.swing.JPanel {

    
    public TA_ListPanel() {
        initComponents();
        addRowsTojTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fname", "Lname", "Username", "Password", "Age", "Salary", "Academic H", "Dept"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addRowsTojTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[9];

        TeachingAssistant ta = new TeachingAssistant();
        ArrayList<TeachingAssistant> TAs = new ArrayList<TeachingAssistant>();

        TAs = ta.listTAs();

        for (TeachingAssistant x : TAs) {
            rowData[0] = x.getID();
            rowData[1] = x.getFName();
            rowData[2] = x.getLName();
            rowData[3] = x.getuserName();
            rowData[4] = x.getPass();
            rowData[5] = x.getAge();
            rowData[6] = x.getSalary();
            rowData[7] = x.getacademicHours();
            rowData[8] = x.myDept.getDeptName();

            model.addRow(rowData);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
