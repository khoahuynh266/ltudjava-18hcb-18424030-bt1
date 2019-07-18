/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien_01;

import java.util.*;
import java.awt.Frame;
import javax.swing.JFileChooser;

import component.LopHoc;
import component.School;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import static jdk.management.resource.ResourceType.FILE_OPEN;

/**
 *
 * @author Gogojungle
 */
public class ManagementClassRoom extends javax.swing.JFrame {    
    private final int IMPORT_FILE = 1;
    private final int EXPORT_FILE = 2;
    
    private String[] columName = {
        "STT", "MSSV", "Họ Tên", "Giới Tính", "CMND"
    };
    
        
    /**
     * Creates new form ManagementStudent
     */
    public ManagementClassRoom() {
        initComponents();
        this.initLayout();
    }
    
    addClass item;
    addSV sv;
    
    static School sc = new School();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        svTable = new javax.swing.JTable();
        className = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAddClass = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        classCombo = new javax.swing.JComboBox<>();
        btnAddSVToClass = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);

        jScrollPane1.setAutoscrolls(true);

        svTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(svTable);

        className.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        className.setToolTipText("");
        className.setAlignmentY(0.0F);
        className.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Lớp Học");

        btnAddClass.setBackground(new java.awt.Color(102, 153, 255));
        btnAddClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddClass.setText("Thêm Lớp");
        btnAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassActionPerformed(evt);
            }
        });

        btnImport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        classCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddSVToClass.setBackground(new java.awt.Color(204, 204, 255));
        btnAddSVToClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddSVToClass.setText("Thêm SV");
        btnAddSVToClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSVToClassActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExport.setText("Export");
        btnExport.setActionCommand("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(className, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(btnAddClass)
                        .addGap(84, 84, 84)
                        .addComponent(btnAddSVToClass)
                        .addGap(69, 69, 69)
                        .addComponent(classCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnImport)
                        .addGap(68, 68, 68)
                        .addComponent(btnExport)))
                .addGap(0, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddClass)
                            .addComponent(btnImport)
                            .addComponent(classCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddSVToClass)
                            .addComponent(btnExport)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(className, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classNameActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        importExportFile("Choose file import", IMPORT_FILE);
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassActionPerformed
        item = new addClass();
        item.setVisible(true);        
    }//GEN-LAST:event_btnAddClassActionPerformed

    private void btnAddSVToClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSVToClassActionPerformed
        sv = new addSV();
        sv.setVisible(true);
            
    }//GEN-LAST:event_btnAddSVToClassActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        importExportFile("Export File", EXPORT_FILE);
    }//GEN-LAST:event_btnExportActionPerformed

    
    private void importExportFile(String title, int type){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle(title);
        int choose = -1;
        switch(type){
            case IMPORT_FILE:
                choose = fileChooser.showOpenDialog(null);
                break;
            case EXPORT_FILE:
                choose = fileChooser.showSaveDialog(null);
                break;
        }
        
        if(choose == JFileChooser.APPROVE_OPTION){
            File f = fileChooser.getSelectedFile();
            switch (type) {
                case IMPORT_FILE:
                    readFile(f);
                    break;
                case EXPORT_FILE:
                    writeFile(f);
                    break;
            }
        }
    }
    
    private void readFile(File file){
        
    }
    
    private void writeFile(File file){
        
    }
    
    private void initLayout(){
        if(sc.getsoLop()> 0){
            ArrayList<LopHoc> listLH = new ArrayList<LopHoc>();
            listLH.getClass();
            
           DefaultTableModel tbModel = new DefaultTableModel();
           tbModel.setColumnIdentifiers(columName);
                                  
           svTable.setModel(tbModel);
        }
        else {
            DefaultTableModel tbModel = new DefaultTableModel();
            tbModel.setColumnIdentifiers(columName);
            svTable.setModel(tbModel);
        }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ManagementClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementClassRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnAddSVToClass;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JComboBox<String> classCombo;
    private javax.swing.JTextField className;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable svTable;
    // End of variables declaration//GEN-END:variables
}
