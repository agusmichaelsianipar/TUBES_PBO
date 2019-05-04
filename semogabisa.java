import com.sun.awt.AWTUtilities;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class semogabisa extends javax.swing.JFrame{
    java.util.Date tglsekarang = new java.util.Date();
    private final SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    //diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private final String tanggal = smpdtfmt.format(tglsekarang);

    int awal;
    private Connection Con;
    private Connection Conn;
    private Statement stm;
    private PreparedStatement ps;
    
    public semogabisa() {
        initComponents();
        open_db();
            tgl.setText(tanggal);
    setJam();
         Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
    }

    public final void setJam(){
    ActionListener taskPerformer = new ActionListener() {

    @Override
        public void actionPerformed(ActionEvent evt) {
            String nol_jam = "", nol_menit = "",nol_detik = "";

            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();

            if(nilai_jam <= 9) nol_jam= "0";
            if(nilai_menit <= 9) nol_menit= "0";
            if(nilai_detik <= 9) nol_detik= "0";

            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);

            lblwktu.setText(jam+":"+menit+":"+detik+"");
        }
    };
    
    new Timer(1000, taskPerformer).start();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fCari = new javax.swing.JTextField();
        fcek = new javax.swing.JButton();
        ftambahsaldo = new javax.swing.JButton();
        tgl = new javax.swing.JLabel();
        lblwktu = new javax.swing.JLabel();
        fisisaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fbayar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fisibayar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fcek.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fcek.setText("Cek");
        fcek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcekActionPerformed(evt);
            }
        });

        ftambahsaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ftambahsaldo.setText("Tambah Saldo");
        ftambahsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftambahsaldoActionPerformed(evt);
            }
        });

        tgl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tgl.setText("Waktu");

        lblwktu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblwktu.setText("Jam");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Masukkan Saldo          :");

        fbayar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fbayar.setText("Bayar");
        fbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbayarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Masukkan Biaya Bayar : ");

        fisibayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fisibayarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Masukkan ID_Kartu     :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fcek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftambahsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblwktu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(fCari, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fisisaldo)
                                    .addComponent(fisibayar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblwktu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fCari, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fisisaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fisibayar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fcek, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftambahsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fcekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcekActionPerformed
        String transaksi = fCari.getText();
        int coba;
        ceksaldo();
    }//GEN-LAST:event_fcekActionPerformed

    private void ftambahsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftambahsaldoActionPerformed
        ceksaldo();   
        String transaksi = fCari.getText();
        String saldo=fisisaldo.getText();
        int saldo1=Integer.parseInt(saldo);
         try{
            saldo1=saldo1+awal;
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Con = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");
            
            String sql="update aktivasikartu set Saldo ='"+saldo1+"'where ID_Kartu='"+fCari.getText()+"'";
            ps = Con.prepareStatement(sql);
            ps.execute(sql);
            JOptionPane.showMessageDialog(null, "Suksess");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ftambahsaldoActionPerformed

    private void fbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbayarActionPerformed
                ceksaldo();   
        String transaksi = fCari.getText();
        String saldo=fisibayar.getText();
        int saldo1=Integer.parseInt(saldo);
         try{
            saldo1=awal-saldo1;
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Con = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");            
            String sql="update aktivasikartu set Saldo ='"+saldo1+"'where ID_Kartu='"+fCari.getText()+"'";
            ps = Con.prepareStatement(sql);
            ps.execute(sql);
            JOptionPane.showMessageDialog(null, "Suksess");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_fbayarActionPerformed

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
            java.util.logging.Logger.getLogger(semogabisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(semogabisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(semogabisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(semogabisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new semogabisa().setVisible(true);
            }
        });
    }

    public void ceksaldo(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            Con = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");
            stm = Con.createStatement();
            String sql="select * from aktivasikartu where "+ "ID_Kartu='" +fCari.getText() +"'";
            ResultSet RUser = stm.executeQuery(sql); 
            
            if(RUser.next()){
                awal=RUser.getInt(3);
                JOptionPane.showMessageDialog(null, RUser.getInt(3));
            }else{
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void open_db() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Con = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");
            stm = Con.createStatement();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
            System.out.println(e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fCari;
    private javax.swing.JButton fbayar;
    private javax.swing.JButton fcek;
    private javax.swing.JTextField fisibayar;
    private javax.swing.JTextField fisisaldo;
    private javax.swing.JButton ftambahsaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblwktu;
    private javax.swing.JLabel tgl;
    // End of variables declaration//GEN-END:variables
}
