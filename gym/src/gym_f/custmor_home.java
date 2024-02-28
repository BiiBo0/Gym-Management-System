/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_f;

import java.sql.PreparedStatement;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
public class custmor_home extends javax.swing.JFrame {
int find_id;
Connection con;
    Map<Integer,String> name_and_id=new HashMap<>();
    public custmor_home() {
        initComponents();
          setLocationRelativeTo(null);
          try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_system", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");       
        }
          getname();
          getdata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sub_start = new javax.swing.JTextField();
        coach_name = new javax.swing.JTextField();
        sub_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sub_expired = new javax.swing.JTextField();
        enter_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/HOME.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Coach Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 143, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Subscrabtion Start:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 176, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Subscrabtion Expire:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Subscrabtion Price:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 176, -1));
        getContentPane().add(sub_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 152, -1));
        getContentPane().add(coach_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 152, -1));
        getContentPane().add(sub_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 152, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/weight.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 60, 40));
        getContentPane().add(sub_expired, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 152, -1));
        getContentPane().add(enter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 24));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("ID:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/magnifying-glass (1).png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 24, 24));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/HOME.png"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 800, 500));

        back.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/left-arrow.png"))); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new StartFrame().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        find_id=DataOfCustomer.getId();
        try {
            PreparedStatement stmt = con.prepareStatement("select customer_id,coach_id,start_date,expired_date,price from subscribtion");
            ResultSet rs=stmt.executeQuery();
            boolean pass=false;
            while(rs.next()){
                if(rs.getInt(1)==find_id){
                    pass=true;
                    
                    coach_name.setText( name_and_id.get(rs.getInt(2 )));
                    sub_start.setText( rs.getString(3 ));
                    sub_expired.setText( rs.getString(4));
                    sub_price.setText( rs.getString(5 ));
               
                }

            }
            if(pass==false)
            JOptionPane.showMessageDialog(this,"customer not found");
        }
        catch (SQLException ex) {
     JOptionPane.showMessageDialog(this,"Server IS Closed");
        }
    }//GEN-LAST:event_searchActionPerformed
    private void getname(){
    try{
      PreparedStatement stmt = con.prepareStatement("select f_name,s_name,coach_id from Coach");
      ResultSet rs=stmt.executeQuery();
      while(rs.next()){
          String fullName=rs.getString(1)+rs.getString(2);
         name_and_id.put(rs.getInt(3),fullName);
      }
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(this, "please add coach");
      }
   }
    private void getdata(){
          find_id=DataOfCustomer.getId();
        try {
            PreparedStatement stmt = con.prepareStatement("select customer_id,coach_id,start_date,expired_date,price from subscribtion");
            ResultSet rs=stmt.executeQuery();
           
            while(rs.next()){
                if(rs.getInt(1)==find_id){         
                    coach_name.setText( name_and_id.get(rs.getInt(2 )));
                    sub_start.setText( rs.getString(3 ));
                    sub_expired.setText( rs.getString(4));
                    sub_price.setText( rs.getString(5 ));
               
                }

            }
           
        }
        catch (SQLException ex) {
     JOptionPane.showMessageDialog(this,"Server IS Closed");
        }
    }
    
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
            java.util.logging.Logger.getLogger(custmor_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(custmor_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(custmor_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(custmor_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new custmor_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField coach_name;
    private javax.swing.JTextField enter_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton search;
    private javax.swing.JTextField sub_expired;
    private javax.swing.JTextField sub_price;
    private javax.swing.JTextField sub_start;
    // End of variables declaration//GEN-END:variables
}