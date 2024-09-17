/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pinjam.java
 *
 * Created on May 29, 2021, 11:14:32 AM
 */
package ProjekUAS;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Yuu
 */
public class Pinjam extends javax.swing.JFrame {
public static ArrayList<PinjamData> listC = new ArrayList<PinjamData>();
public static ArrayList<DataBuku> listilang = new ArrayList<DataBuku>();
public static ArrayList<KembaliData> listpinjam = new ArrayList<KembaliData>();

ArrayList<KembaliData> listpinjamB = Kembalikan.getList();
ArrayList<DataBuku> listB = DaftarBuku.getList();
ArrayList<AnggotaData> listA = Anggota.getList();

DefaultTableModel tabelModel2;
DefaultTableModel tabelModel;
DefaultTableModel tabelModel3;


    public Pinjam() {
        setSize(900, 600);
        setLocationRelativeTo(null);
        initComponents();
        tampilData();
        tampilDataB();
        tampilDataC();
        tampilkodepinjam();
        tampiltanggal();
    }
    private void tampiltanggal(){
        Date tanggal = new Date();
        Calendar tgl = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        txtTgl.setText(sf.format(tanggal));
    }
    
    private void tampilkodepinjam(){
        Random kode = new Random();
        int k=kode.nextInt(10000)+1;
        String ko=String.valueOf(k);
        txtKpinjam.setText(ko);
    }
    
    private void tampilDataB(){
        String[] kolom = {"KODE","JUDUL","PENERBIT","PENGARANG","TAHUN TERBIT"};
        Object[][] objData = new Object[listB.size()][5];//jumlah kolom
        
        int i = 0;
        for(DataBuku n : listB){
            String[] arrData = {n.getKBuku(), n.getJBuku(),n.getPenerbit(),n.getPengarang(), String.valueOf(n.getTTerbit())};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel2 = new DefaultTableModel(objData,kolom){
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        
        TableBu.setModel(tabelModel2);
    }
    
        private void tampilDataC(){
        String[] kolom = {"KODE PINJAM","KODE ANGGOTA","NAMA","KODE BUKU","JUDUL BUKU"};
        Object[][] objData = new Object[listC.size()][5];//jumlah kolom
        
        int i = 0;
        for(PinjamData n : listC){
            String[] arrData = {String.valueOf(n.getKpinjam()),n.getKang(),n.getNang(),n.getKbuku(),n.getJbuku()};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel3 = new DefaultTableModel(objData,kolom){
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        
        TableP.setModel(tabelModel3);
        
        
    }
    
    
    private void tampilData(){
        String[] kolom = {"ID","NAMA","KELAS","KELAMIN","ALAMAT","NO HP","EMAIL"};
        Object[][] objData = new Object[listA.size()][7]; // 7 merupakan jumlah kolom
        
        int i = 0;
        for(AnggotaData n : listA){
            String[] arrData = { (n.getID()), n.getNamaA(),n.getKelas(),n.getGender(), n.getAlamat(), n.getNHP(), n.getEmail()};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData,kolom){
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        
        TableAng.setModel(tabelModel);
    }
    private int j = 1;
    private int total = 0;
    
    public void isiDataC(int Kpinjam,String Kang,String Nang,String Kbuku, String Jbuku){
        PinjamData ed = new PinjamData(Kpinjam,Kang,Nang,Kbuku, Jbuku);
        listC.add(ed);
    }
    
     public void isiDatailang(String KBuku, String JBuku, String Penerbit,String Pengarang, int TTerbit){
        DataBuku ed = new DataBuku(KBuku, JBuku, Penerbit, Pengarang, TTerbit);
        listilang.add(ed);
    }
     
    public void isiDatapinjam(int Kpinjam, String Kang, String Nang,String Kbuku, String Jbuku, String Penerbit,String Pengarang, int TTerbit,String Tanggalpin){
        KembaliData ed = new KembaliData(Kpinjam, Kang, Nang, Kbuku, Jbuku, Penerbit, Pengarang, TTerbit,Tanggalpin);
        listpinjam.add(ed);
    } 
    
    private void resetInputanB(){
        txtKBuku.setText("");
        txtJBuku.setText("");
        txtPenerbit.setText("");
        txtPengarang.setText("");
        txtTTB.setText("");
        txtKBuku.requestFocus();
    }
    
    private void resetInputanA(){
        txtID.setText("");
        txtNama.setText("");
        txtKelas.setText("");
        txtGender.setText("");
        txtAlamat.setText("");
        txtNHP.setText("");
        txtEma.setText("");
        txtID.requestFocus();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JLabel();
        txtNHP = new javax.swing.JLabel();
        txtGender = new javax.swing.JLabel();
        txtEma = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKBuku = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtJBuku = new javax.swing.JTextField();
        txtTTB = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Reset1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKpinjam = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAng = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableBu = new javax.swing.JTable();
        MSimpan = new javax.swing.JButton();
        Reset2 = new javax.swing.JButton();
        MKembali = new javax.swing.JButton();
        MKeluar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableP = new javax.swing.JTable();
        jumlahP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel1.setText("PEMINJAMAN BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Kode Anggota        :");

        jLabel3.setText("Nama Anggota       :");

        jLabel4.setText("Alamat                  :");

        jLabel5.setText("No HP                    :");

        jLabel6.setText("Email                     :");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamaKeyReleased(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });

        jLabel15.setText("Kelas                     :");

        jLabel16.setText("Jenis kelamin       :");

        txtKelas.setText("-");

        txtAlamat.setText("-");

        txtNHP.setText("-");

        txtGender.setText("-");

        txtEma.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtNHP, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtKelas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKelas)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAlamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNHP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtEma))
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setText("Kode Buku                :");

        jLabel8.setText("Judul Buku                :");

        jLabel9.setText("Pengarang                :");

        jLabel10.setText("Penerbit                    :");

        txtKBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKBukuActionPerformed(evt);
            }
        });
        txtKBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKBukuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKBukuKeyTyped(evt);
            }
        });

        txtPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengarangActionPerformed(evt);
            }
        });
        txtPengarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPengarangKeyTyped(evt);
            }
        });

        txtPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPenerbitActionPerformed(evt);
            }
        });
        txtPenerbit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPenerbitKeyTyped(evt);
            }
        });

        jButton6.setText("Tambahkan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtJBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJBukuActionPerformed(evt);
            }
        });
        txtJBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJBukuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJBukuKeyTyped(evt);
            }
        });

        txtTTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTTBActionPerformed(evt);
            }
        });
        txtTTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTTBKeyTyped(evt);
            }
        });

        jLabel17.setText("Tahun terbit              :");

        Reset1.setText("Reset");
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("*Satu kode peminjaman hanya dapat meminjam 3 buku");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reset1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtJBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTTB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtPenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addComponent(txtKBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addGap(105, 105, 105))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(Reset1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel11.setText("Kode Peminjaman");

        jLabel12.setText("Tanggal");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTgl)
                    .addComponent(txtKpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtKpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TableAng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableAng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAngMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableAng);

        TableBu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableBu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableBu);

        MSimpan.setText("Simpan");
        MSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSimpanActionPerformed(evt);
            }
        });

        Reset2.setText("Reset");
        Reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset2ActionPerformed(evt);
            }
        });

        MKembali.setText("Kembali");
        MKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKembaliActionPerformed(evt);
            }
        });

        MKeluar.setText("Keluar");
        MKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKeluarActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel13.setText("List Anggota");

        jLabel14.setBackground(new java.awt.Color(255, 255, 204));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel14.setText("List Buku");

        TableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableP);

        jumlahP.setBackground(new java.awt.Color(255, 255, 204));
        jumlahP.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jumlahP.setText("Total Pinjam Buku : 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(MSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Reset2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(MKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(196, 196, 196))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(jumlahP, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jumlahP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Reset2)
                                    .addComponent(MKeluar)
                                    .addComponent(MKembali)
                                    .addComponent(MSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset2ActionPerformed
        resetInputanB();
        resetInputanA();
        tampilkodepinjam();
        listB.addAll(listilang);
        listilang.clear();
        listpinjam.clear();
        listC.clear();
        tampilDataC();
        tampilDataB();
        total=0;
        jumlahP.setText("Total Pinjam Buku : "+total);
        TableAng.setRowSorter(null);
        TableBu.setRowSorter(null);
    }//GEN-LAST:event_Reset2ActionPerformed

    private void MKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKembaliActionPerformed
        listB.addAll(listilang);
        listilang.clear();
        listpinjam.clear();
        listC.clear();
        total=0;
        jumlahP.setText("Total Pinjam Buku : "+total);
        int pilih = javax.swing.JOptionPane.showOptionDialog(this, 
                        "Yakin ingin kembali? Jangan lupa simpan data dulu sebelum kembali ya", 
                        "", 
                        javax.swing.JOptionPane.YES_NO_OPTION, 
                        javax.swing.JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(pilih == javax.swing.JOptionPane.YES_OPTION){
        new Utama().setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_MKembaliActionPerformed

    private void MKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKeluarActionPerformed
     int pilih = javax.swing.JOptionPane.showOptionDialog(this, 
                        "Yakin ingin keluar?", 
                        "", 
                        javax.swing.JOptionPane.YES_NO_OPTION, 
                        javax.swing.JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(pilih == javax.swing.JOptionPane.YES_OPTION){
            javax.swing.JOptionPane.showMessageDialog(this, "Program Akan Keluar");
            System.exit(0);
        }
    }//GEN-LAST:event_MKeluarActionPerformed

    private void txtTTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTTBActionPerformed
        String cari = txtTTB.getText();
        TableRowSorter tr = new TableRowSorter(tabelModel2);
        TableBu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)^"+cari,4));//fungsi (?i)Agar huruf kapital dan kecil tetap dibaca
        if (TableBu.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(null, "Tahun tidak ada di list");
            TableBu.setRowSorter(null);
            txtTTB.setText(""); 
        }   
}//GEN-LAST:event_txtTTBActionPerformed

    private void txtTTBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTTBKeyTyped
        char ch=evt.getKeyChar();
        if(!(Character.isDigit(ch)||(ch==KeyEvent.VK_BACK_SPACE)||(ch==KeyEvent.VK_DELETE)))
        evt.consume();       
}//GEN-LAST:event_txtTTBKeyTyped

    private void TableAngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAngMouseClicked
            int i = TableAng.getSelectedRow();
         if(i>=0){                        
        txtID.setText(TableAng.getValueAt(i, 0).toString());
        txtNama.setText(TableAng.getValueAt(i, 1).toString());
        txtKelas.setText(TableAng.getValueAt(i, 2).toString());
        txtGender.setText(TableAng.getValueAt(i, 3).toString());
        txtAlamat.setText(TableAng.getValueAt(i, 4).toString());
        txtNHP.setText(TableAng.getValueAt(i, 5).toString());
        txtEma.setText(TableAng.getValueAt(i, 6).toString());
        tampilkodepinjam();
        
        }
    }//GEN-LAST:event_TableAngMouseClicked

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased

    }//GEN-LAST:event_txtIDKeyReleased

    private void txtNamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyReleased
         
    }//GEN-LAST:event_txtNamaKeyReleased

    private void TableBuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuMouseClicked
           int i = TableBu.getSelectedRow(); 
             if(i>=0)
        {                        
        txtKBuku.setText(TableBu.getValueAt(i, 0).toString());
        txtJBuku.setText(TableBu.getValueAt(i, 1).toString());
        txtPenerbit.setText(TableBu.getValueAt(i, 2).toString());
        txtPengarang.setText(TableBu.getValueAt(i, 3).toString());
        txtTTB.setText(TableBu.getValueAt(i, 4).toString());
      }
    }//GEN-LAST:event_TableBuMouseClicked

    private void txtKBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKBukuKeyTyped
      // TODO add your handling code here:
    }//GEN-LAST:event_txtKBukuKeyTyped

    private void txtJBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJBukuKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJBukuKeyTyped

    private void txtJBukuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJBukuKeyReleased

    }//GEN-LAST:event_txtJBukuKeyReleased

    private void txtKBukuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKBukuKeyReleased
        
    }//GEN-LAST:event_txtKBukuKeyReleased

    private void txtPengarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPengarangKeyTyped
 
    }//GEN-LAST:event_txtPengarangKeyTyped

    private void txtPenerbitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPenerbitKeyTyped

    }//GEN-LAST:event_txtPenerbitKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    int a = TableBu.getSelectedRow();
    int b = TableAng.getSelectedRow();
    int d = TableBu.getSelectedRow();
    d = TableBu.convertRowIndexToModel(a);
    
String nama = jumlahP.getText().toString().trim();
    if (b == -1||d<=-1||a == -1||total==3){javax.swing.JOptionPane.showMessageDialog(null, "Data belum dipilih / Data masih yang ada kosong!! / Total buku sudah melebihi batas max!!");           
    }
        else if(a>=0){
        listB.remove(d);
        isiDatapinjam(Integer.parseInt(txtKpinjam.getText()),txtID.getText(),txtNama.getText(), txtKBuku.getText(),txtJBuku.getText(),txtPenerbit.getText(),txtPengarang.getText(),Integer.parseInt(txtTTB.getText()),txtTgl.getText());
        isiDatailang(txtKBuku.getText(),txtJBuku.getText(), txtPenerbit.getText(),txtPengarang.getText(),Integer.parseInt(txtTTB.getText()));
        isiDataC(Integer.parseInt(txtKpinjam.getText()),txtID.getText(),txtNama.getText(), txtKBuku.getText(),txtJBuku.getText());
        tampilDataC();
        resetInputanB();
        javax.swing.JOptionPane.showMessageDialog(this, "Data telah ditambahkan");
        TableBu.setRowSorter(null);
        tampilDataB();
        total+=j;
        jumlahP.setText("Total Pinjam Buku : " + total);
        }
        else{
        listB.remove(a);
        isiDatapinjam(Integer.parseInt(txtKpinjam.getText()),txtID.getText(),txtNama.getText(), txtKBuku.getText(),txtJBuku.getText(),txtPenerbit.getText(),txtPengarang.getText(),Integer.parseInt(txtTTB.getText()),txtTgl.getText());
        isiDatailang(txtKBuku.getText(),txtJBuku.getText(), txtPenerbit.getText(),txtPengarang.getText(),Integer.parseInt(txtTTB.getText()));
        isiDataC(Integer.parseInt(txtKpinjam.getText()),txtID.getText(),txtNama.getText(), txtKBuku.getText(),txtJBuku.getText());
        tampilDataC();
        resetInputanB();
        javax.swing.JOptionPane.showMessageDialog(this, "Data telah ditambahkan");
        TableBu.setRowSorter(null);
        tampilDataB();
        total+=j;
        jumlahP.setText("Total Pinjam Buku : " + total);
        
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablePMouseClicked

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
    resetInputanB();
    listB.addAll(listilang);
    listilang.clear();
    listC.clear();
    listpinjam.clear();
    tampilDataC();
    tampilDataB();
    total=0;
    jumlahP.setText("Total Pinjam Buku : "+total);
    TableBu.setRowSorter(null);
    }//GEN-LAST:event_Reset1ActionPerformed

    private void MSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSimpanActionPerformed
    listpinjamB.addAll(listpinjam);
    listpinjam.clear();
    listilang.clear();        
    listC.clear();
    tampilDataC();
    tampilDataB();
    total=0;
    tampilkodepinjam();
    resetInputanA();
    resetInputanB();
 jumlahP.setText("Total Pinjam Buku : "+total);
    javax.swing.JOptionPane.showMessageDialog(null, "Data sudah disimpan !!");
    javax.swing.JOptionPane.showMessageDialog(null, "kembalikan buku sebelum hari ke 4 ya");
    TableBu.setRowSorter(null);
    TableAng.setRowSorter(null);
    }//GEN-LAST:event_MSimpanActionPerformed

    private void txtKBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKBukuActionPerformed
  String cari = txtKBuku.getText();
        TableRowSorter tr = new TableRowSorter(tabelModel2);
        TableBu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)^"+cari,0));//fungsi (?i)Agar huruf kapital dan kecil tetap dibaca
        if (TableBu.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(null, "Kode buku tidak ada di list");
            TableBu.setRowSorter(null);
            txtKBuku.setText("");
        }     
    }//GEN-LAST:event_txtKBukuActionPerformed

    private void txtJBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJBukuActionPerformed
   String cari = txtJBuku.getText();
        TableRowSorter tr = new TableRowSorter(tabelModel2);
        TableBu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)^"+cari,1));//fungsi (?i)Agar huruf kapital dan kecil tetap dibaca
        if (TableBu.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(null, "Judul buku tidak ada di list");
            TableBu.setRowSorter(null);
            txtJBuku.setText(""); 
        }   
    }//GEN-LAST:event_txtJBukuActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
         String cari = txtID.getText();
        TableRowSorter tr = new TableRowSorter(tabelModel);
        TableAng.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)^"+cari,0));//fungsi (?i)Agar huruf kapital dan kecil tetap dibaca
        if (TableAng.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(null, "ID anggota tidak ada di list");
            TableAng.setRowSorter(null);
            txtID.setText("");
         }         
    }//GEN-LAST:event_txtIDActionPerformed
   
    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        String cari = txtNama.getText();
        TableRowSorter tr = new TableRowSorter(tabelModel);
        TableAng.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)^"+cari,1));//fungsi (?i)Agar huruf kapital dan kecil tetap dibaca  
        if (TableAng.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(null, "Nama anggota tidak ada di list");
            TableAng.setRowSorter(null);
            txtNama.setText("");
        }
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengarangActionPerformed
        String cari = txtPengarang.getText();
        TableRowSorter tr = new TableRowSorter(tabelModel2);
        TableBu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)^"+cari,3));//fungsi (?i)Agar huruf kapital dan kecil tetap dibaca
        if (TableBu.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(null, "Pengarang buku tidak ada di list");
            TableBu.setRowSorter(null);
            txtPengarang.setText(""); 
        }   
    }//GEN-LAST:event_txtPengarangActionPerformed

    private void txtPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPenerbitActionPerformed
String cari = txtPenerbit.getText();
        TableRowSorter tr = new TableRowSorter(tabelModel2);
        TableBu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)^"+cari,2));//fungsi (?i)Agar huruf kapital dan kecil tetap dibaca
        if (TableBu.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(null, "Penerbit tidak ada di list");
            TableBu.setRowSorter(null);
            txtPenerbit.setText(""); 
        }   
    }//GEN-LAST:event_txtPenerbitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Pinjam().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MKeluar;
    private javax.swing.JButton MKembali;
    private javax.swing.JButton MSimpan;
    private javax.swing.JButton Reset1;
    private javax.swing.JButton Reset2;
    private javax.swing.JTable TableAng;
    private javax.swing.JTable TableBu;
    private javax.swing.JTable TableP;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jumlahP;
    private javax.swing.JLabel txtAlamat;
    private javax.swing.JLabel txtEma;
    private javax.swing.JLabel txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJBuku;
    private javax.swing.JTextField txtKBuku;
    private javax.swing.JLabel txtKelas;
    private javax.swing.JTextField txtKpinjam;
    private javax.swing.JLabel txtNHP;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTTB;
    private javax.swing.JTextField txtTgl;
    // End of variables declaration//GEN-END:variables
}
