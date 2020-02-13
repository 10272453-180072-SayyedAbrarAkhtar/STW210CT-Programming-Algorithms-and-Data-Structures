/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationapplication;


import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sayyed Abrar Akhtar
 */
public class NewQuestionSetJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewQuestionSetJFrame
     */
    int operation = 0, row = 0, id;
    MySQLConnect mySqlConn;
    public NewQuestionSetJFrame() {
        initComponents();
        setLocationRelativeTo(null);  // *** center appearance of the app ***
        mySqlConn = new MySQLConnect();
        retrieveSet();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonNavigator = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQSet = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableQSet = new javax.swing.JTable();
        jButtonAddQSet = new javax.swing.JButton();
        jButtonDelQSet = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Question");

        jButtonNavigator.setBackground(new java.awt.Color(44, 62, 80));
        jButtonNavigator.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNavigator.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNavigator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/undo2.png"))); // NOI18N
        jButtonNavigator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavigatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(221, 221, 221))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jButtonNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Set Name:");

        jTextFieldQSet.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N

        jTableQSet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Set ID", "Set Name"
            }
        ));
        jTableQSet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQSetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableQSet);

        jButtonAddQSet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAddQSet.setText("Add New Question Set");
        jButtonAddQSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQSetActionPerformed(evt);
            }
        });

        jButtonDelQSet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDelQSet.setText("Delete");
        jButtonDelQSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelQSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldQSet, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAddQSet, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDelQSet, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelQSet, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddQSet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddQSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQSetActionPerformed
       
        String setname = jTextFieldQSet.getText();
        if ("Add New Question Set".equals(jButtonAddQSet.getText())){
            addNewSet(setname);
        
        }
        if ("Update".equals(jButtonAddQSet.getText())){
            updateSet(setname, id);
        }
        retrieveSet();
    }//GEN-LAST:event_jButtonAddQSetActionPerformed

    private void jTableQSetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQSetMouseClicked
        loadTable();
    }//GEN-LAST:event_jTableQSetMouseClicked

    private void jButtonDelQSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelQSetActionPerformed
        String setname = jButtonAddQSet.getText();
        if("".equals(jButtonAddQSet.getText())){
            JOptionPane.showMessageDialog(null, "please select set from table to delete!");
        } else {
            deleteSet(setname, id);
        }
        
    }//GEN-LAST:event_jButtonDelQSetActionPerformed

    private void jButtonNavigatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavigatorActionPerformed
        
        
        NewQuestionJFrame question = new NewQuestionJFrame();
        question.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNavigatorActionPerformed

    private void loadTable(){
        
        operation=1;
        row = jTableQSet.getSelectedRow();
        id = (int) jTableQSet.getModel().getValueAt(row,0);
        String value = jTableQSet.getModel().getValueAt(row,1).toString();
        jTextFieldQSet.setText(value);
        jButtonAddQSet.setText("Update");

    
    }
    public Boolean addNewSet(String setname){
        try{
            String query = "insert into questionset (setname) values('" + setname + "')";
            return mySqlConn.executeSQLQuery(query, "New set Added ");
        } catch (Exception ex){
            System.out.println("Error in NewQuestionSetJframe at line 173: " + ex);
        }
        return false;
    }
    
    
    
    public Boolean retrieveSet() {
        try {
            String query = "select * from questionset";
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            DefaultTableModel model = (DefaultTableModel) jTableQSet.getModel();
            if (resultset.next()) {
            	while(resultset.next())
                {
                 model.addRow(new Object[]{resultset.getInt("id"),resultset.getString("setname")});
                }
            	return true;
            }
               
        } catch (SQLException ex){
            System.out.println("Error in NewQuestionSetJframe at line 190: " + ex);
        }
        return false;
        
    }
    
    public Boolean updateSet(String setname, int setid){
    	
    	String query = "select * from questions where setid = " + setid;
    	ResultSet resultset;
        try {
        	resultset = mySqlConn.retrieveData(query);
        	if (resultset.next()) {
        		JOptionPane.showMessageDialog(null, "This set has been referenced in questions so it is not advisable to update. Please create a new set!");
        		return false;
        	} else {
        		query = "UPDATE `questionset` SET `setname` = '" + setname +"' WHERE `questionset`.`id` =" + setid;
                return mySqlConn.executeSQLQuery(query, "Setname update ");
        	}
            
            
        } catch (HeadlessException | SQLException ex){
            System.out.println("Error in NewQuestionSetJframe at line 190: " + ex);
        }
        return false;
    }
    
    
    public Boolean deleteSet(String setname, int setid){
        try {
            String query = "DELETE FROM `questionset` WHERE `questionset`.`id` =" + setid;
            return mySqlConn.executeSQLQuery(query, "Setname DELETED ");
        } catch (Exception ex){
            System.out.println("Error in NewQuestionSetJframe at line 190: " + ex);
        }
        return false;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewQuestionSetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewQuestionSetJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddQSet;
    private javax.swing.JButton jButtonDelQSet;
    private javax.swing.JButton jButtonNavigator;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableQSet;
    private javax.swing.JTextField jTextFieldQSet;
    // End of variables declaration//GEN-END:variables
}