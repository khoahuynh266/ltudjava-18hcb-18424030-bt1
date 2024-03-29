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
import component.SinhVien;
import component.Lop_MonHoc;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.ContinueNode;
import static quanlysinhvien_01.managementClassRoom.sc;

public class addSV extends javax.swing.JFrame {
       
    /**
     * Creates new form addSV
     */
    
    private String className = "";
    private String idSubject = "";
    
    

    public addSV() {
        initComponents();
        init();        
    }

    public addSV(String lop) {
        this.className = lop;
        initComponents();
        init();
    }
    
    public addSV(String lop, String idMH) {
        this.className = lop;
        this.idSubject = idMH;
        initComponents();
        init();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMSSV = new javax.swing.JLabel();
        lblMSSV1 = new javax.swing.JLabel();
        lblMSSV2 = new javax.swing.JLabel();
        textMSSV = new javax.swing.JTextField();
        textCMND = new javax.swing.JTextField();
        rBtnNu = new javax.swing.JRadioButton();
        rBtnNam = new javax.swing.JRadioButton();
        textName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblMSSV3 = new javax.swing.JLabel();
        cbBoxClass = new javax.swing.JComboBox<>();
        show_validate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm Sinh Viên");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thông Tin Sinh Viên ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Họ Tên:");
        jLabel2.setToolTipText("");

        lblMSSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMSSV.setText("Lớp:");

        lblMSSV1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMSSV1.setText("CMND:");

        lblMSSV2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMSSV2.setText("Giới tính:");

        textMSSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textMSSV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textMSSVKeyTyped(evt);
            }
        });

        textCMND.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCMNDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCMNDKeyTyped(evt);
            }
        });

        rBtnNu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rBtnNu.setText("Nữ");
        rBtnNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnNuActionPerformed(evt);
            }
        });

        rBtnNam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rBtnNam.setText("Nam");

        textName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(153, 204, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblMSSV3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMSSV3.setText("MSSV:");

        cbBoxClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbBoxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblMSSV)
                                .addGap(40, 40, 40)
                                .addComponent(cbBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMSSV3)
                                .addGap(40, 40, 40)
                                .addComponent(textMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show_validate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblMSSV2)
                                    .addGap(51, 51, 51)
                                    .addComponent(rBtnNam)
                                    .addGap(81, 81, 81)
                                    .addComponent(rBtnNu))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblMSSV1)
                                    .addGap(41, 41, 41)
                                    .addComponent(textCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(88, 88, 88)))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblMSSV))
                    .addComponent(cbBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblMSSV3))
                    .addComponent(textMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(show_validate)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblMSSV2))
                    .addComponent(rBtnNam)
                    .addComponent(rBtnNu))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblMSSV1))
                    .addComponent(textCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblMSSV.getAccessibleContext().setAccessibleName("Lớp");
        cbBoxClass.setSelectedItem(null);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rBtnNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnNuActionPerformed

    private void init(){        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ArrayList<LopHoc> listClass = sc.getList();
        
//        for(LopHoc item : listClass){
//            model.addElement(item.getTenLop());                    
//        }        
//        cbBoxClass.setModel(model);
        
        if (this.idSubject.equals("")) {
            model.addElement(this.className);
        } else {
            model.addElement(this.className + '-' + this.idSubject);
        }
        cbBoxClass.setModel(model);
    }
    
    private boolean validCheck(){
        boolean isValid = false;
        StringBuilder msgErr = new StringBuilder();
        
        String mssv = textMSSV.getText();
        String hoTen = textName.getText();
        String cmnd = textCMND.getText();
        
        if (this.idSubject.equals("")) {
            LopHoc lh = sc.getLopHoc(this.className);
            for (SinhVien sv : lh.getListSinhVien()) {
                if (sv.isExistsMSSV(mssv)) {
                    msgErr.append("MSSV đã tồn tại.");
                    msgErr.append("\n");
                }
            }
        } else {
            Lop_MonHoc lop_mh = sc.getLopMonHoc(this.className, this.idSubject);
            for (SinhVien sv : lop_mh.getListSV()) {
                if (sv.isExistsMSSV(mssv)) {
                    msgErr.append("MSSV đã tồn tại.");
                    msgErr.append("\n");
                }
            }
        }
        
        if (mssv.equals("")) {
            isValid = true;
            msgErr.append("MSSV không thể trống");
            msgErr.append("\n");
        }

        if (hoTen.equals("")) {
            isValid = true;
            msgErr.append("Tên không thể trống");
            msgErr.append("\n");
        }

        if (cmnd.equals("")) {
            isValid = true;
            msgErr.append("CMND không thể trống");
            msgErr.append("\n");
        }

        if (rBtnNam.isSelected() == false && rBtnNu.isSelected() == false) {
            isValid = true;
            msgErr.append("Vui lòng chọn giới tính");
            msgErr.append("\n");
        }

        if (isValid == true) {
            JOptionPane.showMessageDialog(null, msgErr, "Error", JOptionPane.ERROR_MESSAGE);
        }
                
        return isValid;  
    }
        
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String mssv = textMSSV.getText();
        String hoTen = textName.getText();
        String cmnd = textCMND.getText();  
        int gt = -1;
        if(rBtnNam.isSelected()){
            gt = 1;
        } else {
            gt = 0;
        }
        
        boolean isCheck = validCheck();
        if(!isCheck){
            String nameClass = String.valueOf(cbBoxClass.getItemAt(cbBoxClass.getSelectedIndex()));
            SinhVien sv = new SinhVien(mssv, hoTen, gt, cmnd);

            if (this.idSubject.equals("")) {
                sc.addSVToClass(nameClass, sv);
                JOptionPane.showMessageDialog(null, "Thêm Sinh Viên Thành Công :)");
            } else {
                sc.addSVBySubject(this.className, this.idSubject, sv);
                JOptionPane.showMessageDialog(null, "Thêm Sinh Viên Thành Công :)");
            }
            textMSSV.setText("");
            textName.setText("");
            textCMND.setText("");
            rBtnNam.setSelected(false);
            rBtnNu.setSelected(false);
        } else{
            JOptionPane.showMessageDialog(null, "Kiểm Tra Lại Thông Tin !!");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void textCMNDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCMNDKeyPressed
        // TODO add your handling code here:       
    }//GEN-LAST:event_textCMNDKeyPressed

    private void textCMNDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCMNDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_textCMNDKeyTyped

    private void textMSSVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMSSVKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        } 
    }//GEN-LAST:event_textMSSVKeyTyped

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
            java.util.logging.Logger.getLogger(addSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbBoxClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblMSSV1;
    private javax.swing.JLabel lblMSSV2;
    private javax.swing.JLabel lblMSSV3;
    private javax.swing.JRadioButton rBtnNam;
    private javax.swing.JRadioButton rBtnNu;
    private javax.swing.JLabel show_validate;
    private javax.swing.JTextField textCMND;
    private javax.swing.JTextField textMSSV;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
