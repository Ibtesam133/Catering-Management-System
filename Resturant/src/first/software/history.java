/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first.software;

import static first.software.Reserve_Page.Final_Recipt_Number;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author And
 */
public class history extends javax.swing.JFrame {

    
    
    public static String recp ;
    public String ssd;
    public String eed;
    
    public history() {
        initComponents();
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edt = new com.toedter.calendar.JDateChooser();
        sdt = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ed = new javax.swing.JTextField();
        sd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(edt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));
        jPanel1.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        tab.setModel(new javax.swing.table.DefaultTableModel(
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
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 650, 410));

        jLabel1.setText("Starting Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        jPanel1.add(ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 110, -1));
        jPanel1.add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 110, -1));

        jLabel2.setText("Ending Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 90, -1));

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 90, -1));

        jMenu2.setText("Eixt         ");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Log Out              ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Back");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        this.hide();
        new Login().show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        this.hide();
        new Bill().show();

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
         ssd = sdf.format(sdt.getDate());
        sd.setText(ssd);
         eed = sdf.format(edt.getDate());
        ed.setText(eed);
        
        
         //table
        try{  
       

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        
        Connection con = 
        DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=owaise;username=admin;password=admin");

        PreparedStatement st = con.prepareStatement
        ("select p.recipt aS [Reciept #],CONVERT(varchar(25), p.[date],106)as [Date],\n" +
        " b.booking_date as [Booking Date],p.cos_name as [Costumer Name]\n" +
        ", (p.bill_amount-P.Discount) aS [Bill Amount],p.amount_payble as [Amount Payble],\n" +
        "p.amount_remain as [Amount Remainig],P.cell#,P.[Target]\n" +
        " from Pay p\n" +
        "inner join book_time b\n" +
        "on p.recipt = b.recipt\n" +
        "where p.[date] between '"+ssd+"' and '"+eed+"'\n" +
        "order by p.[date]");
        
        

                      
             ResultSet rs = st.executeQuery();
             tab.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        //table
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked

         int  i = tab.getSelectedRow();
        TableModel model = tab.getModel();
       recp =  model.getValueAt(i, 0).toString();
       
        this.hide();
        new maxHistory().show();
       
        
        
    }//GEN-LAST:event_tabMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         String input =  JOptionPane.showInputDialog
        ("Press 1 Thermal Printer\nPress 2 A4 Printer", "");
         
        if(input.equals("1")){
        
             try{
            
  
            
Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=owaise;username=admin;password=admin");
//String report="E:\\ibti\\Data\\Java Data\\Owaise Pakwan Center\\Resturant\\src\\first\\software\\newReport.jrxml";

JasperDesign jd = 
JRXmlLoader.load("C:\\Users\\sony\\Documents\\NetBeansProjects\\Catering Software\\Owaise Pakwan Center (aptech)\\Resturant\\src\\first\\software\\historythermal.jrxml");


String qu = "select p.recipt aS [Reciept #],CONVERT(varchar(25), p.[date],106)as [Date],\n" +
" b.booking_date as [Booking Date],p.cos_name as [Costumer Name]\n" +
", (p.bill_amount-P.Discount) aS [Bill Amount],p.amount_payble as [Amount Payble],\n" +
"p.amount_remain as [Amount Remainig],P.cell#,P.[Target]\n" +
" from Pay p\n" +
"inner join book_time b\n" +
"on p.recipt = b.recipt\n" +
"where p.[date] between '"+ssd+"' and '"+eed+"'\n" +
"order by p.[date]";
JRDesignQuery jq = new JRDesignQuery();
jq.setText(qu);
jd.setQuery(jq);

JasperReport jsp = JasperCompileManager.compileReport(jd);
JasperPrint prn = JasperFillManager.fillReport(jsp,null,cn);
JasperViewer.viewReport(prn);
         
            
//        path = getClass().getResource("/first.software/newReport.jasper").getPath();
//        path = URLDecoder.decode(path, "UTF-8");
//        Connection cn =  new Conexion().conectar();
//        Map paramotord = new HashMap();
//        JasperReport report = (JasperReport)JRLoader.loadObject(path);
//        JasperPrint print = JasperFillManager.fillReport(report, paramotord, cn);
//        JasperViewer view = new JasperViewer(print, false);
//        view.setTitle("Owaise Pakwan Center");
//        view.setVisible(true);
        
        }
        
        catch(Exception ex)
        {
                       JOptionPane.showMessageDialog(this, ex);
        }            
            
        }
        
        
        
        else if(input.equals("2")){
        
             try{
            
            
            
            
            
            
Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=owaise;username=admin;password=admin");
//String report="E:\\ibti\\Data\\Java Data\\Owaise Pakwan Center\\Resturant\\src\\first\\software\\newReport.jrxml";

JasperDesign jd = 
JRXmlLoader.load("C:\\Users\\sony\\Documents\\NetBeansProjects\\Catering Software\\Owaise Pakwan Center (aptech)\\Resturant\\src\\first\\software\\HISTORY.jrxml");


String qu = "select p.recipt aS [Reciept #],CONVERT(varchar(25), p.[date],106)as [Date],\n" +
" b.booking_date as [Booking Date],p.cos_name as [Costumer Name]\n" +
", (p.bill_amount-P.Discount) aS [Bill Amount],p.amount_payble as [Amount Payble],\n" +
"p.amount_remain as [Amount Remainig],P.cell#,P.[Target]\n" +
" from Pay p\n" +
"inner join book_time b\n" +
"on p.recipt = b.recipt\n" +
"where p.[date] between '"+ssd+"' and '"+eed+"'\n" +
"order by p.[date]";
JRDesignQuery jq = new JRDesignQuery();
jq.setText(qu);
jd.setQuery(jq);

JasperReport jsp = JasperCompileManager.compileReport(jd);
JasperPrint prn = JasperFillManager.fillReport(jsp,null,cn);
JasperViewer.viewReport(prn);
         
            
//        path = getClass().getResource("/first.software/newReport.jasper").getPath();
//        path = URLDecoder.decode(path, "UTF-8");
//        Connection cn =  new Conexion().conectar();
//        Map paramotord = new HashMap();
//        JasperReport report = (JasperReport)JRLoader.loadObject(path);
//        JasperPrint print = JasperFillManager.fillReport(report, paramotord, cn);
//        JasperViewer view = new JasperViewer(print, false);
//        view.setTitle("Owaise Pakwan Center");
//        view.setVisible(true);
        
        }
        
        catch(Exception ex)
        {
                       JOptionPane.showMessageDialog(this, ex);
        }
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ed;
    private com.toedter.calendar.JDateChooser edt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sd;
    private com.toedter.calendar.JDateChooser sdt;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
