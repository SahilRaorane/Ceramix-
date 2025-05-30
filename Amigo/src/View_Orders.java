
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubh
 */
public class View_Orders extends javax.swing.JFrame {

    /**
     * Creates new form View_Orders
     */
    public View_Orders() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oid", "Customer Name", "Delivery Address", "Tiles", "Quantity", "Delivery Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Oid");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Delivery Date");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Quantity");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Show Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setText("Enter Date in yyyy-mm-dd Format");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer Name", "OID", "Delivery Date" }));

        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(237, 237, 237)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String oid;
        String nam;
        String Addr;
        String DD;
        String til;
        int NOFT;
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amigo","root","Sahilgmail@12");
            String query1="select Customer.*,Orders.* from Customer,Orders where customer.cid=orders.cid";
            String query2="select Tiles.*,Orders.* from Tiles,Orders where tiles.tid=orders.tid";
            PreparedStatement statement1 = conn.prepareStatement(query1);
            PreparedStatement statement2 = conn.prepareStatement(query2);
            ResultSet result1 = statement1.executeQuery();
            ResultSet result2 = statement2.executeQuery();
            DefaultTableModel tblModel;
            tblModel =(DefaultTableModel)jTable1.getModel();
            tblModel.setRowCount(0);
            while(result1.next() && result2.next())
            {
                oid=String.valueOf(result1.getInt("Oid"));
                nam=result1.getString("Name");
                Addr=result1.getString("Address");
                DD=result1.getString("Delivery_Date");
                til=result2.getString("name");
                NOFT=result1.getInt("Number_Of_Tiles");
                String NOFT1=Integer.toString(NOFT);
                String tbData[]={oid,nam,Addr,til,NOFT1,DD};
                tblModel.addRow(tbData);
            }
            
        }
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        View_Orders.this.setVisible(false);
        Orders_HomePage OH=new Orders_HomePage();
        OH.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Connection conn;
        DefaultTableModel tblModel;
        tblModel =(DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();  
        try {
            if(jTable1.getSelectedRowCount()==1)
            {
                Object  j=jTable1.getModel().getValueAt(i,0);
                System.out.println(j);
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amigo","root","Sahilgmail@12");    
                String sql = "DELETE FROM Orders WHERE oid = '"+j+"'";
                tblModel.removeRow(jTable1.getSelectedRow());
                PreparedStatement statement1 = conn.prepareStatement(sql);
                statement1.execute();
                JOptionPane.showMessageDialog(this,"Entry Deleted Successfully");
                
            }
            else
            {
                if(jTable1.getSelectedRowCount()==0)
                {
                    JOptionPane.showMessageDialog(this,"Table is Empty");
                }    
                else
                {
                    JOptionPane.showMessageDialog(this,"Please Select A Single Data For Delete");
                }
            }
        }
        catch (SQLException ex) {
                Logger.getLogger(View_Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String info1=jTextField1.getText();
        String info2=jTextField2.getText();
        Connection conn;
                if(info1.isEmpty() || info2.isEmpty())
        {
                JOptionPane.showMessageDialog(null,"Enter Data In The Box");
        }
        else{
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amigo","root","Sahilgmail@12");
                if(jRadioButton1.isSelected())
                {
                    String query1="Update Orders set Number_Of_Tiles='"+info2+"' where oid=?";
                    PreparedStatement statement1 = conn.prepareStatement(query1);
                    statement1.setString(1, info1);
                    boolean r1=statement1.execute();
                    if (r1=true){
                        JOptionPane.showMessageDialog(null,"Successful Updated The Number Of Tiles");
                        DefaultTableModel tblModel;
                        tblModel =(DefaultTableModel)jTable1.getModel();
                        tblModel.setRowCount(0);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"UnSuccessful");
                    }

                }
                if(jRadioButton2.isSelected())
                {
                    String query1="Update Orders set Delivery_Date='"+info2+"'  where oid=?";
                    PreparedStatement statement1 = conn.prepareStatement(query1);
                    statement1.setString(1, info1);
                    boolean r1=statement1.execute();
                    if (r1=true){
                        JOptionPane.showMessageDialog(null,"Successful Updated The Delivery Date");
                        DefaultTableModel tblModel;
                        tblModel =(DefaultTableModel)jTable1.getModel();
                        tblModel.setRowCount(0);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"UnSuccessful");
                    }

                }

            }
            catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String oid;
        String nam;
        String Addr;
        String DD;
        String til;
        int NOFT;
        String info1=jTextField3.getText();
        String CB=jComboBox1.getSelectedItem().toString();
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amigo","root","Sahilgmail@12");
            if("Customer Name".equals(CB))
            {
                String query1="select Customer.*,Orders.* from Customer,Orders where customer.cid=orders.cid and Customer.name=?";
                String query2="select Tiles.*,Orders.* from Tiles,Orders where tiles.tid=orders.tid";
                PreparedStatement statement1 = conn.prepareStatement(query1);
                PreparedStatement statement2 = conn.prepareStatement(query2);
                statement1.setString(1, info1);
                ResultSet result = statement1.executeQuery();
                ResultSet result1 = statement2.executeQuery();
                DefaultTableModel tblModel;
                tblModel =(DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);
                while(result.next() && result1.next())
                {
                    oid=String.valueOf(result.getInt("oid"));
                    nam=result.getString("Name");
                    Addr=result.getString("Address");
                    DD=result.getString("Delivery_Date");
                    til=result1.getString("Name");
                    NOFT=result.getInt("Number_Of_Tiles");
                    String NOFT1=Integer.toString(NOFT);
                    String tbData[]={oid,nam,Addr,til,NOFT1,DD};
                    tblModel.addRow(tbData);
                }
            }
            else
            {
                if("OID".equals(CB))
                {
                    String query1="select Customer.*,Orders.* from Customer,Orders where customer.cid=orders.cid and Orders.Oid=?";
                    String query2="select Tiles.*,Orders.* from Tiles,Orders where tiles.tid=orders.tid";
                    PreparedStatement statement1 = conn.prepareStatement(query1);
                    PreparedStatement statement2 = conn.prepareStatement(query2);
                    statement1.setString(1, info1);
                    ResultSet result = statement1.executeQuery();
                    ResultSet result1 = statement2.executeQuery();
                    DefaultTableModel tblModel;
                    tblModel =(DefaultTableModel)jTable1.getModel();
                    tblModel.setRowCount(0);
                    while(result.next() && result1.next())
                    {
                        oid=String.valueOf(result.getInt("oid"));
                        nam=result.getString("Name");
                        Addr=result.getString("Address");
                        DD=result.getString("Delivery_Date");
                        til=result1.getString("Name");
                        NOFT=result.getInt("Number_Of_Tiles");
                        String NOFT1=Integer.toString(NOFT);
                        String tbData[]={oid,nam,Addr,til,NOFT1,DD};
                        tblModel.addRow(tbData);
                    }
                }
                else
                {
                    if("Delivery Date".equals(CB))
                    {
                        String query1="select Customer.*,Orders.* from Customer,Orders where customer.cid=orders.cid and Orders.Delivery_Date=?";
                        String query2="select Tiles.*,Orders.* from Tiles,Orders where tiles.tid=orders.tid";
                        PreparedStatement statement1 = conn.prepareStatement(query1);
                        PreparedStatement statement2 = conn.prepareStatement(query2);
                        statement1.setString(1, info1);
                        ResultSet result = statement1.executeQuery();
                        ResultSet result1 = statement2.executeQuery();
                        DefaultTableModel tblModel;
                        tblModel =(DefaultTableModel)jTable1.getModel();
                        tblModel.setRowCount(0);
                        while(result.next() && result1.next())
                        {
                            oid=String.valueOf(result.getInt("oid"));
                            nam=result.getString("Name");
                            Addr=result.getString("Address");
                            DD=result.getString("Delivery_Date");
                            til=result1.getString("Name");
                            NOFT=result.getInt("Number_Of_Tiles");
                            String NOFT1=Integer.toString(NOFT);
                            String tbData[]={oid,nam,Addr,til,NOFT1,DD};
                            tblModel.addRow(tbData);
                        }
                    }  
                }            
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c) || Character.isISOControl(c))
        {
            jTextField1.setEditable(true);
        }
        else
        {
            jTextField1.setEditable(false);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            char c=evt.getKeyChar();
            if(Character.isDigit(c) || Character.isISOControl(c))
            {
                jTextField2.setEditable(true);
            }
            else
            {
                jTextField2.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField2KeyPressed

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
            java.util.logging.Logger.getLogger(View_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
