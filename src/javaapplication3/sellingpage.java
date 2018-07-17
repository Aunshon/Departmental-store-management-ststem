/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class sellingpage extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public sellingpage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("store.png")));
        setTitle("Selling page");
        initComponents();
        conn=projectsqlconnetion.ConnecrDb();
        /*try{
			String query = "select max(bill_id) from sellproducts";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			rs.next();
			billId = Integer.valueOf(rs.getString(1));
			billId++;
			pst.execute();
			pst.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}*/
        
    clock();
    refresh();
    }public void clock()
	{
		Thread clock = new  Thread()
		{
			public void run()
			{
				try {
					
					for(;;)
						
					//while(true)
					{
						
					Calendar cal = new GregorianCalendar();
					int day = cal.get(Calendar.DAY_OF_MONTH);
					int month = cal.get(Calendar.MONTH);
					int year = cal.get(Calendar.YEAR);
					
					int second = cal.get(Calendar.SECOND);
					int minute = cal.get(Calendar.MINUTE);
					int hour = cal.get(Calendar.HOUR);
					
					jclock.setText("Time = "+hour+":"+minute+":"+second+"   Date: "+day+"/"+month+"/"+year+"");
					
					sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		clock.start();
		
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
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSerial = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPrice = new javax.swing.JTextField();
        jStock = new javax.swing.JTextField();
        jCatagory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Scarch_field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ComboBox_btn = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonTake = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jclock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Product info");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(160, 10, 80, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Name");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(120, 70, 40, 13);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Catagory");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(110, 110, 46, 13);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Price");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(120, 150, 26, 13);

        jSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSerialActionPerformed(evt);
            }
        });
        jPanel3.add(jSerial);
        jSerial.setBounds(170, 30, 260, 30);

        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });
        jPanel3.add(jName);
        jName.setBounds(170, 70, 260, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("Stock");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(118, 190, 28, 13);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("Serial");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(116, 30, 30, 13);
        jPanel3.add(jPrice);
        jPrice.setBounds(170, 150, 260, 30);
        jPanel3.add(jStock);
        jStock.setBounds(170, 190, 260, 30);
        jPanel3.add(jCatagory);
        jCatagory.setBounds(170, 110, 260, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/orig_81790.jpg"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 450, 230);

        jLabel14.setText("jLabel14");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(140, 10, 40, 14);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(530, 120, 450, 230);

        Scarch_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scarch_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(Scarch_field);
        Scarch_field.setBounds(80, 80, 170, 30);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Name", "Catagory", "Price", "Stock"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 500, 420);

        ComboBox_btn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Serial", "Name", "Catagory", "Stock" }));
        ComboBox_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_btnActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox_btn);
        ComboBox_btn.setBounds(260, 80, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Scarch");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 50, 20);

        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh);
        Refresh.setBounds(370, 80, 140, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Sell");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(690, 430, 140, 100);

        jButtonTake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTake.setText("Add");
        jButtonTake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTakeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTake);
        jButtonTake.setBounds(530, 430, 150, 100);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Setting");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(840, 430, 150, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Product Galary");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 10, 100, 20);

        jclock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jclock.setText("clock");
        jPanel1.add(jclock);
        jclock.setBounds(700, 20, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/b2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new NewJFrame1().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        try{
					int row = Table.getSelectedRow();
					String Serial_=(Table.getModel().getValueAt(row, 0)).toString();
					
					String query = "select * from products where Serial='"+Serial_+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					
					while(rs.next())
					{
						jSerial.setText(rs.getString("Serial"));
						jName.setText(rs.getString("Name"));
						jCatagory.setText(rs.getString("Catagory"));
						jPrice.setText(rs.getString("Price"));
						jStock.setText(rs.getString("Stock"));
					}
					pst.close();
                                       rs.close();
				}	
	
				catch (Exception ef){
				ef.printStackTrace();
				}
    }//GEN-LAST:event_TableMouseClicked

    private void jSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSerialActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        try{
			String query = "select * from products";
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			Table.setModel(DbUtils.resultSetToTableModel(rs));
                        
                        jSerial.setText("");
			jName.setText("");
			jCatagory.setText("");
			jPrice.setText("");
			jStock.setText("");
                        Scarch_field.setText("");
                        
			
			pst.close();
			rs.close();
		}catch (Exception e){
			e.printStackTrace();	
		}
    }//GEN-LAST:event_RefreshActionPerformed

    private void ComboBox_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_btnActionPerformed
        try{
					
					String selection = (String) ComboBox_btn.getSelectedItem();
					String query = "select * from products where "+selection+"=?";
					System.out.println( query);
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1,Scarch_field.getText());
					ResultSet rs = pst.executeQuery();
					Table.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();	
					
				}
				catch (Exception ef){
				ef.printStackTrace();
				}
	
		
    }//GEN-LAST:event_ComboBox_btnActionPerformed

    private void Scarch_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scarch_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scarch_fieldActionPerformed

    private void jButtonTakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTakeActionPerformed
        try
				{
					
					
					//System.out.println("Bill id"+billId);
					String query = " insert into sellproducts (Serial,Name,Catagory,Price,Stock) values (?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query);
					
					if (jSerial.getText().equals(""))
					{
						pst.setString(1, null);
						
					}
					else {
						pst = conn.prepareStatement(query);
						pst.setString(1, jSerial.getText());
					}
					
					pst.setString(2,jName.getText());
					pst.setString(3,jCatagory.getText());
					pst.setString(4,jPrice.getText());
					pst.setString(5,jStock.getText());
                                     
                                       // pst.setString(6, String.valueOf(billId));
					
					pst.execute();
					pst.close();
					
					JOptionPane.showMessageDialog(null, "Product Successfully added");
					
					
				} catch (Exception es) {
					es.printStackTrace();
				}
        
        
    }//GEN-LAST:event_jButtonTakeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new customer().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshMouseClicked

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
            java.util.logging.Logger.getLogger(sellingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellingpage().setVisible(true);
            }
        });
    }
 
   // public static int billId = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_btn;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField Scarch_field;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonTake;
    private javax.swing.JTextField jCatagory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSerial;
    private javax.swing.JTextField jStock;
    private javax.swing.JLabel jclock;
    // End of variables declaration//GEN-END:variables

    public void refresh(){
        try{
			String query = "select * from products";
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			Table.setModel(DbUtils.resultSetToTableModel(rs));
                        
                        jSerial.setText("");
			jName.setText("");
			jCatagory.setText("");
			jPrice.setText("");
			jStock.setText("");
                        Scarch_field.setText("");
                        
			
			pst.close();
			rs.close();
		}catch (Exception e){
			e.printStackTrace();	
		}
    }
}