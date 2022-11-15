/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.HoaDon;
import Model.KhachHang;
import Services.DAOHoaDonServices;
import Services.DAOKhachHangServices;
import Services.DAONhanvienServices;
import Services.HoaDonServices;
import Services.KhachHangServices;
import Services.NhanVienServices;
import ViewModel.QLHD;
import ViewModel.QLNV;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class FormHDTest extends javax.swing.JFrame {
private final DAOKhachHangServices qlkh = new KhachHangServices();
private final DAONhanvienServices qlnv = new NhanVienServices();
private final DAOHoaDonServices qlhd = new HoaDonServices();
    
    public FormHDTest() {
        initComponents();
        rdoDanggiao.setSelected(true);
        cbbMaKH.removeAllItems();
        List<KhachHang> kh = qlkh.getList();
        List<QLNV> nv = qlnv.getList();
        
        for(KhachHang k : kh){
        cbbMaKH.addItem(k.getMaKh());
        }
        for(QLNV n : nv){
        cbbMaNV.addItem(n.getMa());
        }
        
        loadtable();
    }

  
    public void loadtable(){
        DefaultTableModel dtm = (DefaultTableModel) tblBang.getModel();
        dtm.setRowCount(0);
        List<QLHD> list = qlhd.getList();
        for (QLHD q : list) {
            Object d[]={
            q.getMakh(),
            q.getManv(),
            q.getMa(),
            q.getNgaytao(),
            q.getNgaythanhtoan(),
            q.getNgayship(),
            q.getNgaynhan(),
            q.getTinhtrang() == 1 ? "Đã giao" : "Đang giao",
            q.getDiachi(),
            q.getSdt()
            };
            dtm.addRow(d);
        }
        
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbMaKH = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbbMaNV = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNgaytao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNgaythanhtoan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNgayShip = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNgaynhan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        rdoDagiao = new javax.swing.JRadioButton();
        rdoDanggiao = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Mã NV", "Mã hóa đơn", "Ngày tạo", "Ngày Thanh toán", "Ngày Ship", "Ngày nhận", "Tình trạng", "Địa chỉ", "SĐT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý hóa đơn");

        jLabel2.setText("Mã khách hàng");

        jLabel3.setText("Mã nhân viên");

        jLabel4.setText("Mã hóa đơn");

        jLabel5.setText("Ngày tạo");

        jLabel6.setText("Ngày thanh toán");

        jLabel7.setText("Ngày Ship");

        txtNgayShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayShipActionPerformed(evt);
            }
        });

        jLabel8.setText("Ngày nhận");

        txtNgaynhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaynhanActionPerformed(evt);
            }
        });

        jLabel9.setText("Địa chỉ");

        txtDiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiachiActionPerformed(evt);
            }
        });

        jLabel10.setText("SĐT");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoDagiao);
        rdoDagiao.setText("Đã giao");

        buttonGroup1.add(rdoDanggiao);
        rdoDanggiao.setText("Đang giao");

        jLabel11.setText("Tình trạng");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgaythanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(229, 229, 229)
                                        .addComponent(rdoDagiao)
                                        .addGap(36, 36, 36)
                                        .addComponent(rdoDanggiao)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(308, 308, 308)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNgayShip, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNgaynhan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(241, 241, 241)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnXoa)
                                                    .addComponent(btnThem)
                                                    .addComponent(btnSua))))))
                                .addGap(61, 61, 61)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoDagiao)
                    .addComponent(rdoDanggiao)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayShip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(txtNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnXoa)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaynhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaythanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSua)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayShipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayShipActionPerformed

    private void txtNgaynhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaynhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaynhanActionPerformed

    private void txtDiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiachiActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
    int row = tblBang.getSelectedRow();
    String kh = tblBang.getValueAt(row,0).toString();
    String nv = tblBang.getValueAt(row,1).toString();
    String ma = tblBang.getValueAt(row,2).toString();
    String ngaytao = tblBang.getValueAt(row,3).toString();
    String ngaytt = tblBang.getValueAt(row,4).toString();
    String ngayship = tblBang.getValueAt(row,5).toString();
    String ngaynhan = tblBang.getValueAt(row,6).toString();
    String tt = tblBang.getValueAt(row,7).toString();
    String diachi = tblBang.getValueAt(row,8).toString();
    String sdt = tblBang.getValueAt(row,9).toString();
    
    cbbMaKH.setSelectedItem(kh);
    cbbMaNV.setSelectedItem(nv);
    txtMa.setText(ma);
    txtNgaytao.setText(ngaytao);
    txtNgaythanhtoan.setText(ngaytt);
    txtNgayShip.setText(ngayship);
    txtNgaynhan.setText(ngaynhan);
    txtDiachi.setText(diachi);
    txtSDT.setText(sdt);
    
    if(tt.equalsIgnoreCase("Đã giao")){
    rdoDagiao.setSelected(true);
    }
    else{
    rdoDanggiao.setSelected(true);
    }
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
   HoaDon hd = getData();
   if(hd==null){
   return;
   }
   String makh = cbbMaKH.getSelectedItem().toString();
    String manv = cbbMaNV.getSelectedItem().toString();
    
    int kq = qlhd.themHD(makh, manv, hd);
    if(kq!=0){
     JOptionPane.showMessageDialog(this,"Thêm thành công");
       loadtable();
    }
    else{
         JOptionPane.showMessageDialog(this,"Thêm thất bại");
    }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       int row = this.tblBang.getSelectedRow();
       if(row==-1){
       JOptionPane.showMessageDialog(this,"Vui lòng chọn 1 dòng để xóa");
       return;
       }
       
       String ma = tblBang.getValueAt(row, 2).toString();
       int kq = qlhd.xoa(ma);
     
    if(kq!=0){
     JOptionPane.showMessageDialog(this,"Xóa thành công");
       loadtable();
    }
    else{
         JOptionPane.showMessageDialog(this,"Xóa thất bại");
    }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
     int row = this.tblBang.getSelectedRow();
       if(row==-1){
       JOptionPane.showMessageDialog(this,"Vui lòng chọn 1 dòng để Sửa");
       return;
       }
       
       HoaDon hd = getData();
       if(hd == null){
       return;
       }
       
       String makh = cbbMaKH.getSelectedItem().toString();
    String manv = cbbMaNV.getSelectedItem().toString();
    String ma = tblBang.getValueAt(row, 2).toString();
    
    if(!ma.equalsIgnoreCase(txtMa.getText())){
     JOptionPane.showMessageDialog(this,"Không được sửa mã hóa đơn");
       return;
    }
    int kq = qlhd.suaHD(makh, manv, hd, ma);
     if(kq!=0){
     JOptionPane.showMessageDialog(this,"Sửa thành công");
       loadtable();
    }
    else{
         JOptionPane.showMessageDialog(this,"Sửa thất bại");
    }
    }//GEN-LAST:event_btnSuaActionPerformed

    public HoaDon getData(){
    String makh = cbbMaKH.getSelectedItem().toString();
    String manv = cbbMaNV.getSelectedItem().toString();
    String ma = txtMa.getText();
    String ngaytao = txtNgaytao.getText();
    String ngaythanhtoan = txtNgaythanhtoan.getText();
    String ngayship = txtNgayShip.getText();
    String ngaynhan = txtNgaynhan.getText();
    int tt = rdoDagiao.isSelected() ? 1 : 0;
    String diachi = txtDiachi.getText();
    String sdt = txtSDT.getText();
    
    if(ma.trim().isEmpty()||ngaytao.trim().isEmpty()||ngaythanhtoan.trim().isEmpty()||ngayship.trim().isEmpty()||ngaynhan.trim().isEmpty()||diachi.trim().isEmpty()||sdt.trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Không được để trống dữ liệu");
        return null;
    }
    
            HoaDon hd = new HoaDon(ma, ngaytao, ngaythanhtoan, ngayship, ngaynhan,tt, diachi, sdt);
      return hd;      
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
            java.util.logging.Logger.getLogger(FormHDTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHDTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHDTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHDTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHDTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbMaKH;
    private javax.swing.JComboBox<String> cbbMaNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDagiao;
    private javax.swing.JRadioButton rdoDanggiao;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgayShip;
    private javax.swing.JTextField txtNgaynhan;
    private javax.swing.JTextField txtNgaytao;
    private javax.swing.JTextField txtNgaythanhtoan;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
