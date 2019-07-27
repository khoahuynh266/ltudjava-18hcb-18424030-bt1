/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien_01;

/**
 *
 * @author Gogojungle
 */

import component.LopHoc;
import component.MonHoc;
import component.School;
import component.ThoiKhoaBieu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static quanlysinhvien_01.managementClassRoom.sc;

public class managementSchedule extends javax.swing.JFrame {

    private String className = "";
    private final int IMPORT_FILE = 1;
    private final int EXPORT_FILE = 2;
    
    private String[] columnNames = {
        "STT", "Mã môn", "Tên môn", "Phòng học"
    };
    
//    static managementClassRoom manageCR;
    managementClassRoom manageCR;
    /**
     * Creates new form managementSchedule
     */
    public managementSchedule() {
//        this.manageCR.setVisible(false);
        initComponents();
        initLayout();
//        manageCR = new managementClassRoom();
//        manageCR.setVisible(false);
        
    }
    
    public managementSchedule(String className){
        this.className = className;
        initComponents();
        initLayout();
        this.manageCR.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableTKB = new javax.swing.JTable();
        panelInfo = new java.awt.Panel();
        textScheduleClass = new javax.swing.JTextField();
        btnExportTKB = new javax.swing.JButton();
        btnImportTKB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbBoxClass = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lableClass = new javax.swing.JLabel();
        lableNotify = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thời Khóa Biểu");
        setFocusCycleRoot(false);

        tableTKB.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableTKB);

        textScheduleClass.setEditable(false);
        textScheduleClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textScheduleClass.setToolTipText("");
        textScheduleClass.setAlignmentY(0.0F);

        btnExportTKB.setBackground(new java.awt.Color(153, 204, 255));
        btnExportTKB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExportTKB.setText("Export");
        btnExportTKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportTKBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(textScheduleClass, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnExportTKB, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textScheduleClass, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportTKB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnImportTKB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImportTKB.setText("Import");
        btnImportTKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportTKBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thời Khóa Biểu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Môn Học:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Thoát");

        lableClass.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        lableNotify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lableNotify.setForeground(new java.awt.Color(255, 0, 0));
        lableNotify.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBoxClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(95, 95, 95)
                                .addComponent(btnImportTKB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lableNotify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(578, 578, 578))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lableClass, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(28, 28, 28))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lableClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(lableNotify)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(cbBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportTKB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportTKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportTKBActionPerformed
//        importExportFile("Export File", EXPORT_FILE);
    }//GEN-LAST:event_btnExportTKBActionPerformed

    private void btnImportTKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportTKBActionPerformed
        // TODO add your handling code here:
        importExportFile("Choose file import", IMPORT_FILE);
    }//GEN-LAST:event_btnImportTKBActionPerformed
    
    private void initLayout(){
        addDataForComboBoxClass();
    }
    
    private void addDataForComboBoxClass(){
        manageCR = new managementClassRoom();
//        System.out.println("Class Name:  " + className);
        lableClass.setText(className);
        
        ArrayList<LopHoc> listLH = sc.getList();
//        System.out.println(listLH.size());
        DefaultComboBoxModel cbBox = new DefaultComboBoxModel();
        DefaultTableModel tblTKB = new DefaultTableModel();
        
        for (LopHoc i : listLH) {                   
            ArrayList<ThoiKhoaBieu> listSchedule = i.getTKB();
            if(listSchedule.size() > 0){
                lableNotify.setVisible(false);
                tblTKB.setColumnIdentifiers(columnNames);
                int stt = 1;
                for(ThoiKhoaBieu item : listSchedule){
                    
                    String[] info = new String[4];
                    info[0] = String.valueOf(stt);
                    info[1] = item.getMH().getMaMH();
                    info[2] = item.getMH().getTenMH();
                    info[3] = item.getPH();
                    
//                    System.out.println("Mã MH: " + item.getMH().getMaMH());

                    cbBox.addElement(item.getMH().getMaMH()); // add từng mã môn vào comboBox
                    tblTKB.addRow(info);
                    stt++;
                }                
                tableTKB.setModel(tblTKB);
                cbBoxClass.setModel(cbBox);
            } else {
                lableNotify.setText("Chưa Có Thời Khóa Biểu!!!!");
                tblTKB.setColumnIdentifiers(columnNames);
                tableTKB.setModel(tblTKB);
            }           
        }          
//        cbBoxClass.setModel(cbBox);
    }
    
    private void addDataTableSchedule(){
        
                  
    }
    
    private void importExportFile(String title, int type) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle(title);
        int choose = -1;
        switch (type) {
            case IMPORT_FILE:
                choose = fileChooser.showOpenDialog(null);
                break;
            case EXPORT_FILE:
                choose = fileChooser.showSaveDialog(null);
                break;
        }

        if (choose == JFileChooser.APPROVE_OPTION) {
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
    
    private void readFile(File file) {
        try {
            try (FileReader reader = new FileReader(file)) {
                BufferedReader buffer = new BufferedReader(reader);

                String line;
                line = buffer.readLine();
//                System.out.println("File import: " + line);
                String[] tenLop = line.split(",");
                LopHoc lh = new LopHoc();
                lh = sc.getLopHoc(tenLop[0]);
//                System.out.println("tenLop[0]: " + tenLop[0]);
                                                                 
                    // get tkb
                    while ((line = buffer.readLine()) != null) {
                        String[] info = line.split(",");
                        
                        MonHoc monHoc = new MonHoc(info[0], info[1]);
                        ThoiKhoaBieu tKB = new ThoiKhoaBieu(monHoc, info[2]);
                        
                        // Add TKB vào lớp học
                        lh.addThoiKhoaBieu(tKB);
                    }
                
                buffer.close();
            }
            initLayout();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error to open file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void writeFile(File file) {
        try{              
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error to export file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(managementSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managementSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managementSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managementSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managementSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportTKB;
    private javax.swing.JButton btnImportTKB;
    private javax.swing.JComboBox<String> cbBoxClass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableClass;
    private javax.swing.JLabel lableNotify;
    private java.awt.Panel panelInfo;
    private javax.swing.JTable tableTKB;
    private javax.swing.JTextField textScheduleClass;
    // End of variables declaration//GEN-END:variables
}
