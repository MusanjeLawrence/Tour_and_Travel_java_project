/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
/**
 *
 * @author ANTHONY LAWRENCE
 */
public class Restaurants extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private Object Connections;
    private Component frmlogin;
    //establish connection
  PreparedStatement statement; //execute sql statement more of optimised
  Statement st;//execute sql statement less of optimised
  String cs; //holding path of the database
  String user;//username for the database
  String password;//password for the database
  String query;
  String records;
  Boolean bnext = false;
  Boolean bprevious = true;
    public Restaurants() {
        initComponents();
                         con = null;
    st = null;
    statement = null;
    
    cs = "jdbc:mysql://localhost:3306/tour_and_travel_information_management_system";
    user = "root";
    password = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_cost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txthotelname = new javax.swing.JTextField();
        txtToi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 54, 152, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Restaurant address :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 178, 33));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 315, -1, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back to menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 181, 33));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Save a restaurant");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 181, 33));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Find a restaurant");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 181, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Go to next record");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 181, 32));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Restaurant name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("Room Prices :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 30));

        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 96, 152, 33));
        getContentPane().add(txt_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 142, 152, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Hotel name :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 30));

        txthotelname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotelnameActionPerformed(evt);
            }
        });
        getContentPane().add(txthotelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 152, 30));

        txtToi.setForeground(new java.awt.Color(255, 255, 255));
        txtToi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToiActionPerformed(evt);
            }
        });
        getContentPane().add(txtToi, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 271, 152, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("Area of interest :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Contacts :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, 30));
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 185, 152, 30));

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setText("Delete a restaurant");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 181, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("go to previous record");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESTAURANTS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\java pics\\rest.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //code for cancel button
        Component frmCountry = new JFrame("Cancel");
        if(JOptionPane.showConfirmDialog(frmCountry, "Are you sure?", "login", 
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // code for save button 
        String s1 = txtname.getText();
        String s2= txt_address.getText();
        String s3 = txt_cost.getText();
        String s4 = txtphone.getText();
        String s5 = txthotelname.getText();
        String s6 = txtToi.getText();

        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Register the driver
            
            con=DriverManager.getConnection(cs,user,password); // Maaking connection
            
            st =con.createStatement();// Creating stmt
            
            //insert query stmt
            query= "INSERT INTO Restaurants (restaurant_name,restaurant_address,room_price, Phone_numbers, Hotels_hotel_name, Things_of_interest_toi_name )"
                    + "VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')";
            
            st.executeUpdate(query); //st to execute the query
            
         JOptionPane.showMessageDialog(null,"Record Saved"); // to shop pop up message
            
         txtname.setText("");
         txt_address.setText("");
         txt_cost.setText("");
         txtphone.setText("");
         txthotelname.setText("");
         txtToi.setText("");
            txtname.requestFocus();//Request Focus
            
        }
        catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
    }
        finally{
            
            try{
                if(st != null){
                    st.close();
                }
                if (con != null){
                    con.close();
                }
            }
            catch(SQLException ex){
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // code for the next button
        
        try {
   
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM restuarants ";
    if(!bnext){
      rs = st.executeQuery(query);  
       rs.first();
   
     txtname.setText(rs.getString("restaurant_name"));
               txt_address.setText(rs.getString("restaurant_address"));
               txt_cost.setText(rs.getString("room_price"));
               txtphone.setText(rs.getString("Phone_numbers"));
              txthotelname.setText(rs.getString("Hotels_hotel_name"));
              txtToi.setText(rs.getString("Things_of_interest_toi_name"));
       bnext = true;
    }
    else if(rs.next()){
        txtname.setText(rs.getString("restaurant_name"));
               txt_address.setText(rs.getString("restaurant_address"));
               txt_cost.setText(rs.getString("room_price"));
               txtphone.setText(rs.getString("Phone_numbers"));
              txthotelname.setText(rs.getString("Hotels_hotel_name"));
              txtToi.setText(rs.getString("Things_of_interest_toi_name"));
       
    }
 
}
catch (SQLException | ClassNotFoundException ex){
    ex.printStackTrace();
}


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         // code for the find button        
         try {
    
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM restaurants WHERE restaurant_name = '"+txtname.getText()+"'";
    
    ResultSet rs = st.executeQuery(query);
    if(rs.first()){
       txtname.setText(rs.getString("restaurant_name")); 
       txt_address.setText(rs.getString("restaurant_address"));
       txt_cost.setText(rs.getString("room_price"));
      txtphone.setText(rs.getString("Phone_numbers"));
              txthotelname.setText(rs.getString("Hotels_hotel_name"));
              txtToi.setText(rs.getString("Things_of_interest_toi_name"));
    }
    else{
        JOptionPane.showMessageDialog(null,"Record not found");
        txtname.setText("");
        txtname.requestFocus();
    }
         
}
catch (SQLException | ClassNotFoundException ex){
    ex.printStackTrace();
}

finally{
    
    try{
        if(st != null)
        {
            st.close();
        }
        if(con != null){
            con.close();
        }
    }
        catch (SQLException ex){
                ex.printStackTrace();
                }
    }

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // code for the delete button
        int answer = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete?","confirm",JOptionPane.YES_NO_OPTION);
        
    if(answer == YES_OPTION){
     try {
    
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "DELETE FROM restaurants WHERE restaurant_name='"+txtname.getText()+"'";
    
     if(st.executeUpdate(query) == 1){
         JOptionPane.showMessageDialog(null,"Record with restaurant_name: '"+txtname.getText()+"'deleted");
         
     }
     else if(st.executeUpdate(query) == 0){
         JOptionPane.showMessageDialog(null,"Record with restaurant_name: '"+txtname.getText()+"'does not exist");
     }
  }
     
catch (     SQLException | ClassNotFoundException ex){
    ex.printStackTrace();
}

finally{
    
    try{
        if(st != null)
        {
            st.close();
        }
        if(con != null){
            con.close();
        }
    }
        catch (SQLException ex){
                ex.printStackTrace();
                }
    }}
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       // code for previous button to show rhe previous record
         try {
   
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM restauarants ";
   
    if(!bprevious){
      rs = st.executeQuery(query);  
       rs.last();
   
       txtname.setText(rs.getString("restaurant_name"));
               txt_address.setText(rs.getString("restaurant_address"));
              

       bprevious = true;
    }
    else if(rs.previous()){
        
      txtname.setText(rs.getString("restaurant_name"));
               txt_address.setText(rs.getString("restaurant_address"));
              
     bnext = true;
       
    }
    
    
       
}
catch (SQLException | ClassNotFoundException ex){
    ex.printStackTrace();
}

      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Menu mee = new Menu();
     mee.show();
     dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtToiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToiActionPerformed

    private void txthotelnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthotelnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthotelnameActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtToi;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_cost;
    private javax.swing.JTextField txthotelname;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
