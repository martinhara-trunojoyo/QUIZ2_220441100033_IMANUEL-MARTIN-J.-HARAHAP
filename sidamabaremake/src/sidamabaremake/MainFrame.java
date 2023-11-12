/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sidamabaremake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Martin Hara
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
   //int tabIndexToHide = 1;
            

    private String idAkun; // Menyimpan idAkun di level kelas

    private String noPendaftaran;

    public MainFrame(String idAkun, String noPendaftaran) {
    
    initComponents(); // Panggil sekali di awal untuk inisialisasi komponen
    cmbfakultas.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (cmbfakultas.getSelectedIndex() == 0) { // Saat fakultas index 0 dipilih
            // Hapus semua item dari cmbProdi
            cmbprodi.removeAllItems();

            // Tambahkan item-item yang ingin ditampilkan di cmbProdi untuk fakultas index 0
            cmbprodi.addItem("S1 ILMU HUKUM");
            // ...Tambahkan item-item lainnya sesuai kebutuhan
        } else if (cmbfakultas.getSelectedIndex() == 1) { // Misalnya, untuk fakultas index 1
            // Hapus semua item dari cmbProdi
            cmbprodi.removeAllItems();

            // Tambahkan item-item yang ingin ditampilkan di cmbProdi untuk fakultas index 1
            cmbprodi.addItem("D3 ENTREPRENEURSHIP");//"", "", "", "", ""
            cmbprodi.addItem("D3 AKUTANSI");
            cmbprodi.addItem("S1 AKUTANSI");
            cmbprodi.addItem("S1 EKONOMI PEMBANGUNAN");
            cmbprodi.addItem("S1 MANAJEMEN");
            // ...Tambahkan item-item lainnya sesuai kebutuhan
        }
        else if (cmbfakultas.getSelectedIndex() == 2) { // Misalnya, untuk fakultas index 1
            // Hapus semua item dari cmbProdi
            cmbprodi.removeAllItems();

            // Tambahkan item-item yang ingin ditampilkan di cmbProdi untuk fakultas index 1
            cmbprodi.addItem("S1 ILMU KELAUTAN");//"", "", "", "", ""
            cmbprodi.addItem("S1 MANAJEMEN SUMBERDAYA PERAIRAN");
            cmbprodi.addItem("S1 TEKNOLOGI INDUSTRI PERTANIAN");
            cmbprodi.addItem("S1 AGROTEKNOLOGI");
            cmbprodi.addItem("S1 AGRIBSNIS");
            // ...Tambahkan item-item lainnya sesuai kebutuhan
        }
        else if (cmbfakultas.getSelectedIndex() == 3) { // Misalnya, untuk fakultas index 1
            // Hapus semua item dari cmbProdi
            cmbprodi.removeAllItems();

            // Tambahkan item-item yang ingin ditampilkan di cmbProdi untuk fakultas index 1
            cmbprodi.addItem("S1 SISTEM INFORMASI");//"", "", "", "", ""
            cmbprodi.addItem("S1 TEKNIK INFORMATIKA");
            cmbprodi.addItem("S1 TEKNIK INDUSTRI");
            cmbprodi.addItem("S1 TEKNIK MEKATRONIKA");
            cmbprodi.addItem("S1 TEKNIK MESIN");
            cmbprodi.addItem("S1 TEKNIK ELEKTRO");

            // ...Tambahkan item-item lainnya sesuai kebutuhan
        }
        else if (cmbfakultas.getSelectedIndex() == 4) { // Misalnya, untuk fakultas index 1
            // Hapus semua item dari cmbProdi
            cmbprodi.removeAllItems();

            // Tambahkan item-item yang ingin ditampilkan di cmbProdi untuk fakultas index 1
            cmbprodi.addItem("S1 PSIKOLOGI");//"", "", "", "", ""
            cmbprodi.addItem("S1 SOSIOLOGI");
            cmbprodi.addItem("S1 ILMU KOMUNIKASI");
            cmbprodi.addItem("S1 SASTRA INGGRIS");
            
            // ...Tambahkan item-item lainnya sesuai kebutuhan
        }
        else if (cmbfakultas.getSelectedIndex() == 5) { // Misalnya, untuk fakultas index 1
            // Hapus semua item dari cmbProdi
            cmbprodi.removeAllItems();

            // Tambahkan item-item yang ingin ditampilkan di cmbProdi untuk fakultas index 1
            cmbprodi.addItem("S1 PGPAUD");//"", "", "", "", ""
            cmbprodi.addItem("S1 PGSD");
            cmbprodi.addItem("S1 PEND. INFORMATIKA");
            cmbprodi.addItem("S1 PEND. IPA ");
            cmbprodi.addItem("S1 PEND. BAHASA SASTRA IND. ");

            
            // ...Tambahkan item-item lainnya sesuai kebutuhan
        }
        else if (cmbfakultas.getSelectedIndex() == 6) { // Misalnya, untuk fakultas index 1
            // Hapus semua item dari cmbProdi
            cmbprodi.removeAllItems();

            // Tambahkan item-item yang ingin ditampilkan di cmbProdi untuk fakultas index 1
            cmbprodi.addItem("S1 HUKUM BISNIS SYARIAH");//"", "", "", "", ""
            cmbprodi.addItem("S1 EKONOMI SYARIAH");
            

            
            // ...Tambahkan item-item lainnya sesuai kebutuhan
        }
        // Dan seterusnya, tambahkan kondisi untuk fakultas lain jika diperlukan
    }
});    
       
        //fakultas = new JComboBox<>;
        

    // ... kode lainnya
    setLocationRelativeTo(null);
    jTabbedPane2.addTab("Data Orang Tua", jPanel6);
    //jTabbedPane2.remove(tabIndexToHide);
    this.idAkun = idAkun;
    this.noPendaftaran = noPendaftaran;
    setNoPendaftaranLabel(); // Mengatur label setelah inisialisasi komponen
}

    private void setNoPendaftaranLabel() {
        // Menetapkan nilai noPendaftaran ke JLabel di MainFrame
        fnopend.setText(noPendaftaran);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fnopend = new javax.swing.JTextField();
        fnama = new javax.swing.JTextField();
        fnisn = new javax.swing.JTextField();
        fnik = new javax.swing.JTextField();
        ftmptlhr = new javax.swing.JTextField();
        ftl = new javax.swing.JTextField();
        cmbagama = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        falamat = new javax.swing.JTextArea();
        fnotelp = new javax.swing.JTextField();
        femil = new javax.swing.JTextField();
        cmbukalmet = new javax.swing.JComboBox<>();
        simpandatamaba = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cmbfakultas = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        cmbprodi = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fnama_ayah = new javax.swing.JTextField();
        fpeng_ayah = new javax.swing.JTextField();
        fnama_ibu = new javax.swing.JTextField();
        fpeng_ibu = new javax.swing.JTextField();
        fnohp = new javax.swing.JTextField();
        cmbpek_ayah = new javax.swing.JComboBox<>();
        cmbpek_ibu = new javax.swing.JComboBox<>();
        cmbpend_ayah = new javax.swing.JComboBox<>();
        cmbpend_ibu = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        slipgja = new javax.swing.JButton();
        slipgji = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jInternalFrame2.setVisible(true);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEM PENDATAAN MAHASISWA BARU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nama :");

        jLabel3.setText("Tempat Lahir :");

        jLabel4.setText("Tanggal Lahir :");

        jLabel5.setText("No NISN  :");

        jLabel6.setText("No Pendaftaran :");

        jLabel7.setText("NIK :");

        jLabel8.setText("Agama : ");

        jLabel9.setText("Alamat :");

        jLabel10.setText("No Telp : ");

        jLabel11.setText("Email : ");

        jLabel12.setText("Ukuran Almamater :");

        fnopend.setEditable(false);
        fnopend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnopendActionPerformed(evt);
            }
        });

        fnisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnisnActionPerformed(evt);
            }
        });

        ftl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftlActionPerformed(evt);
            }
        });

        cmbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen Protestan", "Katolik", "Hindu", "Buddha", "Konghucu", "Kepercayaan Lokal" }));
        cmbagama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbagamaActionPerformed(evt);
            }
        });

        falamat.setColumns(20);
        falamat.setRows(5);
        jScrollPane1.setViewportView(falamat);

        cmbukalmet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL", "XXXL", "XXXXLL" }));

        simpandatamaba.setText("simpan data");
        simpandatamaba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpandatamabaActionPerformed(evt);
            }
        });

        jLabel26.setText("Fakultas :");

        cmbfakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HUKUM", "EKONOMI DAN BISNIS", "PERTANIAN", "TEKNIK", "SOSIAL DAN ILMU BUDAYA", "PENDIDIKAN", "KEISLAMAN" }));
        cmbfakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfakultasActionPerformed(evt);
            }
        });

        jLabel27.setText("Prodi       :");

        cmbprodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1 ILMU HUKUM", "S1 AKUTANSI", "D3 AKUTANSI", "D3 ENTREPRENEURSHIP", "S1 MANAJEMEN", "S1 EKONOMI PEMBANGUNAN", "S1 ILMU KELAUTAN", "SI MANAJEMEN SUMBERDAYA PERAIRAN", "S1 AGRIBISNIS", "S1 AGROTEKNOLOGI", "S1 SISTEM INFORMASI", "SI TEKNIK INFORMATIKA", "S1 TEKNIK MESIN", "S1 TEKNIK INDUSTRI", "S1 TEKNIK MEKATRONIKA", "S1 TEKNIK ELEKTRO", "S1 PGPAUD", "S1 PGSD", "S1 PEND. INFORMATIKA", "S1 PBSI", "S1 PEND. IPA", "S1 PSIKOLOGI", "S1 ILMU KOMUNIKASI", "S1 SOSIOLOGI", "S1 SASTRA INGGRIS", "S1 H. BISNIS SYARIAH", "S1 EKONOMI SYARIAH" }));
        cmbprodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbprodiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(12, 12, 12)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(63, 63, 63)))
                .addGap(0, 49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(fnopend, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(simpandatamaba))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fnama)
                        .addComponent(fnotelp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbagama, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ftl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ftmptlhr, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(cmbfakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbprodi, 0, 1, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(fnik, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fnisn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cmbukalmet, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(femil, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnopend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpandatamaba))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fnisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbfakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(cmbprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftmptlhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ftl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(femil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbukalmet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Data Pribadi", jPanel1);

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SISTEM PENDATAAN MAHASISWA BARU");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(26, 26, 26))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Nama Ayah :");

        jLabel15.setText("Pendidikan Ayah : ");

        jLabel16.setText("Pekerjaan Ayah : ");

        jLabel17.setText("Penghasilan Ayah : ");

        jLabel18.setText("Nama Ibu : ");

        jLabel19.setText("Pendidikan Ibu : ");

        jLabel20.setText("Pekerjaan Ibu :");

        jLabel21.setText("Penghasilan Ibu");

        jLabel22.setText("Nomor Hp Orang Tua :");

        fpeng_ayah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpeng_ayahActionPerformed(evt);
            }
        });

        cmbpek_ayah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Bekerja", "Petani/Nelayan", "Buruh", "Guru/Dosen", "PNS/ASN", "Dokter/Perawat", "Lainnya" }));

        cmbpek_ibu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Bekerja", "Petani/Nelayan", "Buruh", "Guru/Dosen", "PNS/ASN", "Dokter/Perawat", "Lainnya" }));

        cmbpend_ayah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Berpendidikan", "SD", "SMP", "SMA", "Diploma 1", "Diploma 2", "Diploma 3", "Diploma 4/ Strata 1", "Strata 2", "Strata 3", " " }));

        cmbpend_ibu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Berpendidikan", "SD", "SMP", "SMA", "Diploma 1", "Diploma 2", "Diploma 3", "Diploma 4/ Strata 1", "Strata 2", "Strata 3", " " }));

        jButton4.setText("SIMPAN DATA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel23.setText("Slip Gaji Ayah : ");

        jLabel24.setText("Slip Gaji Ibu : ");

        slipgja.setText("Pilih File");
        slipgja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slipgjaActionPerformed(evt);
            }
        });

        slipgji.setText("Pilih File");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbpend_ayah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fnama_ayah)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(fpeng_ayah, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnohp)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(slipgja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(slipgji, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnama_ibu)
                                    .addComponent(cmbpek_ibu, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fpeng_ibu)
                                    .addComponent(cmbpend_ibu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbpek_ayah, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnama_ayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpend_ayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbpek_ayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fpeng_ayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnama_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpend_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpek_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fpeng_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slipgja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slipgji)
                    .addComponent(jButton4))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Data Orang Tua", jPanel6);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slipgjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slipgjaActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        int returnValue = filechooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filechooser.getSelectedFile(); // Mendapatkan file yang dipilih

            // Lakukan sesuatu dengan file yang dipilih
            // Misalnya, kirim file ini ke sistem untuk diproses
            kirimSlipGaji(selectedFile);
        } else {
            // Aksi jika pembatalan pemilihan file dilakukan
            System.out.println("Pemilihan file dibatalkan");
        }
    }//GEN-LAST:event_slipgjaActionPerformed

    private void fpeng_ayahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpeng_ayahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fpeng_ayahActionPerformed

    private void cmbprodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbprodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbprodiActionPerformed

//...
//Pastikan JComboBox sudah ditambahkan ke frame atau panel

    private void cmbfakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfakultasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbfakultasActionPerformed
    private boolean isDataSaved = false; 
    private void simpandatamabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpandatamabaActionPerformed
        // TODO add your handling code here:
        
        if (!isDataSaved) {
        // Tampilkan pesan peringatan
        int choice = JOptionPane.showConfirmDialog(this, "Pastikan data sudah benar. Simpan data?", "Peringatan", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            try {
                String query = "INSERT INTO mahasiswa VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; // Sesuaikan struktur query sesuai dengan kolom di tabel
                java.sql.Connection connection = DatabaseConnection.getConnection();
                java.sql.PreparedStatement statement = connection.prepareStatement(query);
                //konversi fak
                int selectedIndex = cmbfakultas.getSelectedIndex();
                String selectedText = (String) cmbfakultas.getItemAt(selectedIndex);
                System.out.println("Indeks terpilih: " + selectedIndex);
                System.out.println("Teks terpilih: " + selectedText);
                //konversi prodi
                int selectedIndexProdi = cmbprodi.getSelectedIndex();
                String selectedTextProdi = (String) cmbprodi.getItemAt(selectedIndexProdi);
                System.out.println("Indeks terpilih: " + selectedIndexProdi);
                System.out.println("Teks terpilih: " + selectedTextProdi);
                //almamater
                int selectedIndexuk = cmbukalmet.getSelectedIndex();
                String selectedTextuk = (String) cmbukalmet.getItemAt(selectedIndexuk);
                System.out.println("Indeks terpilih: " + selectedIndexuk);
                System.out.println("Teks terpilih: " + selectedTextuk);
                //agama
                int selectedIndexAgama = cmbagama.getSelectedIndex();
                String selectedTextAgama = (String) cmbagama.getItemAt(selectedIndexAgama);
                System.out.println("Indeks terpilih: " + selectedIndexAgama);
                System.out.println("Teks terpilih: " + selectedTextAgama);
                // Mengatur nilai parameter
                statement.setString(1,idAkun );
                statement.setString(2, fnopend.getText());
                statement.setString(3, fnama.getText());
                statement.setString(4, fnik.getText());
                statement.setString(5, fnisn.getText());
                statement.setString(6, selectedText);
                statement.setString(7, selectedTextProdi);
                statement.setString(8, ftmptlhr.getText());
                statement.setString(9, ftl.getText());
                statement.setString(10, selectedTextAgama);//agaama
                statement.setString(11, falamat.getText());
                statement.setString(12, fnotelp.getText());
                statement.setString(13, femil.getText());
                statement.setString(14, selectedTextuk);//almet
                // Eksekusi pernyataan
                statement.executeUpdate();

                // Tutup statement dan koneksi
                statement.close();
                connection.close();

                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

                // Set status data tersimpan menjadi true
                isDataSaved = true;
                simpandatamaba.setVisible(false);
                fnopend.setEnabled(false);
                fnama.setEnabled(false);
                fnik.setEnabled(false);
                fnisn.setEnabled(false);
                cmbfakultas.setEnabled(false);
                cmbprodi.setEnabled(false);
                ftmptlhr.setEnabled(false);
                ftl.setEnabled(false);
                cmbagama.setEnabled(false);
                femil.setEnabled(false);
                cmbukalmet.setEnabled(false);
                //simpandatamaba.setVisible(false);
            }catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
        }
    }
        jTabbedPane2.add("dataorangtua", jPanel6);
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_simpandatamabaActionPerformed

    private void cmbagamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbagamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbagamaActionPerformed

    private void ftlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftlActionPerformed

    private void fnisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnisnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnisnActionPerformed

    private void fnopendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnopendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnopendActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_jButton4ActionPerformed
    
   
// Metode untuk mengirim file slip gaji
private void kirimSlipGaji(File file) {
    // Lakukan proses pengiriman file ke tempat tujuan
    // Contoh:
    System.out.println("File slip gaji terpilih: " + file.getAbsolutePath());
    // Proses pengiriman ke tempat tujuan
}
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        String idAkun = "contohIdAkun";
    String noPendaftaran = "contohNoPendaftaran";
    
MainFrame frame = new MainFrame(idAkun, noPendaftaran);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
            
        // Tampilkan frame
frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbagama;
    private javax.swing.JComboBox<String> cmbfakultas;
    private javax.swing.JComboBox<String> cmbpek_ayah;
    private javax.swing.JComboBox<String> cmbpek_ibu;
    private javax.swing.JComboBox<String> cmbpend_ayah;
    private javax.swing.JComboBox<String> cmbpend_ibu;
    private javax.swing.JComboBox<String> cmbprodi;
    private javax.swing.JComboBox<String> cmbukalmet;
    private javax.swing.JTextArea falamat;
    private javax.swing.JTextField femil;
    private javax.swing.JTextField fnama;
    private javax.swing.JTextField fnama_ayah;
    private javax.swing.JTextField fnama_ibu;
    private javax.swing.JTextField fnik;
    private javax.swing.JTextField fnisn;
    private javax.swing.JTextField fnohp;
    private javax.swing.JTextField fnopend;
    private javax.swing.JTextField fnotelp;
    private javax.swing.JTextField fpeng_ayah;
    private javax.swing.JTextField fpeng_ibu;
    private javax.swing.JTextField ftl;
    private javax.swing.JTextField ftmptlhr;
    private javax.swing.JButton jButton4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton simpandatamaba;
    private javax.swing.JButton slipgja;
    private javax.swing.JButton slipgji;
    // End of variables declaration//GEN-END:variables
}
