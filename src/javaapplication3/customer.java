/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class customer extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public customer() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("store.png")));
        setTitle("Customer Page after selling");
        initComponents();
        conn=projectsqlconnetion.ConnecrDb();
        refresh();
       /* try{
			String query1 = "select max(bill_id) from sellproducts";
			PreparedStatement pst = conn.prepareStatement(query1);
			ResultSet rs=pst.executeQuery();
			rs.next();
			sellingpage.billId = Integer.valueOf(rs.getString(1));

			pst.execute();
			pst.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}*/
        clock();
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldbill = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jclock = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("Sell");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Name", "Catagory", "Price", "Stock"
            }
        ));
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 50, 590, 450);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Total bill");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 60, 20));
        jPanel3.add(jTextFieldbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 260, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/orig_81790.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 130));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 260, 380, 130);

        jPanel2.setLayout(null);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(110, 110, 260, 30);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(110, 70, 260, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(110, 30, 260, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Customer info");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(140, 0, 87, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Date");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(70, 110, 41, 13);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Contact");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 70, 38, 13);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Customer Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 30, 80, 13);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/orig_81790.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 380, 160);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 380, 160);

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 400, 120, 100);

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 400, 120, 100);

        jButton4.setText("Finish Sell");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(270, 400, 120, 100);

        jclock.setText("clock");
        jPanel1.add(jclock);
        jclock.setBounds(790, 20, 190, 20);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 50, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Customer info");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(490, 10, 90, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/4k-Wallpapers-6.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
        
    }//GEN-LAST:event_Table2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
					String query = "select * from sellproducts";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					
					Table2.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					
					pst.close();
					rs.close();
				}catch (Exception e1){
					e1.printStackTrace();	
				}	
			
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        	refresh();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void refresh(){
        try{
					String query = "select Name,Catagory,Price from sellproducts";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					
					Table2.setModel(DbUtils.resultSetToTableModel(rs));
					
					
			                jTextField5.setText("");
			                jTextField4.setText("");
			                jTextField3.setText("");
			                jTextFieldbill.setText("");
                                        
					pst.close();
					rs.close();
				}catch (Exception e1){
					e1.printStackTrace();	
				}
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
				{
					String query = "select sum(Price) from sellproducts";
					PreparedStatement pst=conn.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					if (rs.next())
					{
						String sum = rs.getString("sum(Price)");
						jTextFieldbill.setText(sum);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				
				
			
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField5.setText("");
        jTextField4.setText("");
        jTextField3.setText("");
        jTextFieldbill.setText("");
        
       
				try {
					String query="DELETE FROM `sellproducts` WHERE 1";
					PreparedStatement pst = conn.prepareStatement(query);					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Cleared everything");
						
					pst.close();
				}
				catch(Exception ed){
					ed.printStackTrace();
				}
                                
        
        JOptionPane.showMessageDialog(null, "Bill paid");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new sellingpage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldbill;
    private javax.swing.JLabel jclock;
    // End of variables declaration//GEN-END:variables
}
