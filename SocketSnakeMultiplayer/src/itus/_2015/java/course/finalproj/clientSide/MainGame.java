package itus._2015.java.course.finalproj.clientSide;

import itus._2015.java.course.finalproj.common.Message;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class MainGame extends javax.swing.JFrame  implements inReceiveMessage {

    String username;
    ListenServer listenServer;
    /** Creates new form MainGame */
    public MainGame(String username, ListenServer listenServer) {
        initComponents();
        setLocationRelativeTo(null);
        this.username = username;
        this.listenServer = listenServer;
        this.listenServer.receive = this;
        txtUsername.setText("Welcome. " + this.username);
        bntStartGame.setEnabled(false);
        
        try {
            listenServer.SendMessage(21, null);
        } catch (IOException ex) {
            Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
    private void updateTextPaneForMe(String Line)
    {
        StyledDocument doc = textPane.getStyledDocument();

        //  Define a keyword attribute

        SimpleAttributeSet keyWord = new SimpleAttributeSet();
        StyleConstants.setForeground(keyWord, Color.GREEN);
        StyleConstants.setBackground(keyWord, Color.WHITE);
        StyleConstants.setBold(keyWord, true);
        
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_LEFT);
        textPane.setParagraphAttributes(attribs, true);


        //  Add some text

        try
        {
            //doc.insertString(0, "Start of text\n", null );
            doc.insertString(doc.getLength(), "\n" + Line, keyWord );
        }
        catch(Exception e) { System.out.println(e); }

       }
    
    private void updateTextPaneForPartner(String Line)
    {
        StyledDocument doc = textPane.getStyledDocument();

        //  Define a keyword attribute

        SimpleAttributeSet keyWord = new SimpleAttributeSet();
        StyleConstants.setForeground(keyWord, Color.PINK);
        StyleConstants.setBackground(keyWord, Color.WHITE);
        StyleConstants.setBold(keyWord, true);
        
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_RIGHT);
        textPane.setParagraphAttributes(attribs, true);


        //  Add some text

        try
        {
            //doc.insertString(0, "Start of text\n", null );
            doc.insertString(doc.getLength(), "\n" + Line, keyWord );
        }
        catch(Exception e) { System.out.println(e); }

       }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCreateRoom = new javax.swing.JButton();
        btnJoinRoom = new javax.swing.JButton();
        txtUsername = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        jButton5 = new javax.swing.JButton();
        txt_msg = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumberPlayers = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRoomCode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOwner = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bntStartGame = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListInRoom = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOnlineUsers = new javax.swing.JList<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 50, 54));

        jPanel4.setBackground(new java.awt.Color(60, 65, 71));

        btnCreateRoom.setBackground(new java.awt.Color(26, 177, 136));
        btnCreateRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new_room.jpg"))); // NOI18N
        btnCreateRoom.setText("Create New Room ");
        btnCreateRoom.setBorder(null);
        btnCreateRoom.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCreateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRoomActionPerformed(evt);
            }
        });

        btnJoinRoom.setBackground(new java.awt.Color(0, 153, 204));
        btnJoinRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnJoinRoom.setText("Join Available Room");
        btnJoinRoom.setBorder(null);
        btnJoinRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinRoomActionPerformed(evt);
            }
        });

        txtUsername.setForeground(new java.awt.Color(255, 255, 0));
        txtUsername.setText("Welcome, ...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnJoinRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsername)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJoinRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        textPane.setBackground(new java.awt.Color(60, 65, 71));
        jScrollPane2.setViewportView(textPane);

        jButton5.setBackground(new java.awt.Color(0, 204, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/send_1.png"))); // NOI18N
        jButton5.setText("Send");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txt_msg.setBackground(new java.awt.Color(60, 65, 71));
        txt_msg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_msg.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(60, 65, 71));

        jPanel6.setBackground(new java.awt.Color(45, 50, 54));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("USER IN ROOM");

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Players:");

        txtNumberPlayers.setForeground(new java.awt.Color(255, 255, 255));
        txtNumberPlayers.setText("0");

        jLabel17.setForeground(new java.awt.Color(255, 51, 0));
        jLabel17.setText("# Code");

        txtRoomCode.setForeground(new java.awt.Color(0, 204, 204));
        txtRoomCode.setText("-1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumberPlayers)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRoomCode)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumberPlayers)
                    .addComponent(jLabel17)
                    .addComponent(txtRoomCode))
                .addContainerGap())
        );

        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Creator");

        txtOwner.setForeground(new java.awt.Color(255, 255, 255));
        txtOwner.setText("....");

        bntStartGame.setBackground(new java.awt.Color(234, 76, 135));
        bntStartGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntStartGame.setForeground(new java.awt.Color(255, 255, 255));
        bntStartGame.setText("START GAME");
        bntStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntStartGameActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ListInRoom);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOwner)
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(bntStartGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOwner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(bntStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER ONLINE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        listOnlineUsers.setBackground(new java.awt.Color(60, 65, 71));
        listOnlineUsers.setForeground(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(listOnlineUsers);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRoomActionPerformed
        try {
            listenServer.SendMessage(123, null);
        } catch (IOException ex) {
            Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateRoomActionPerformed

    private void btnJoinRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinRoomActionPerformed
       String code = JOptionPane.showInputDialog("Code to Join?");
       if (code.trim().equals("") || code == null) return;
        try {
            listenServer.SendMessage(124, this.username+"#"+code);
        } catch (IOException ex) {
            Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnJoinRoomActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String receiver = this.listOnlineUsers.getSelectedValue().toString();
       String msg = txt_msg.getText();
       if (receiver == null || receiver.equals("") || msg.trim().equals(""))
           return;
        this.updateTextPaneForMe("ME: " + msg);
        try {
            listenServer.SendMessage(147, receiver + "#" +  msg);
        } catch (IOException ex) {
            Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void bntStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntStartGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntStartGameActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainGame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListInRoom;
    private javax.swing.JButton bntStartGame;
    private javax.swing.JButton btnCreateRoom;
    private javax.swing.JButton btnJoinRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listOnlineUsers;
    private javax.swing.JTextPane textPane;
    private javax.swing.JLabel txtNumberPlayers;
    private javax.swing.JLabel txtOwner;
    private javax.swing.JLabel txtRoomCode;
    private javax.swing.JLabel txtUsername;
    private javax.swing.JTextField txt_msg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ReceiveMessage(Message msg) throws IOException {
        switch(msg.getType())
        {
            case 21:
            {
                //listOnlineUsers.removeAll();
               List<String> users = (ArrayList<String>)msg.getObject();
                //List<String> users =  Arrays.asList("king", "alice", "hoang");
                //listOnlineUsers = new JList(users.toArray());
                updateOnline(users);
                break;
            }
            
            case 123:
            {
                String RoomCode = (String)msg.getObject();
                txtRoomCode.setText(RoomCode);
                txtNumberPlayers.setText("1");
                txtOwner.setText(this.username);
                bntStartGame.setEnabled(true);
                break;
            }
            
            case 124:
            {
                String response = (String)msg.getObject();
                JOptionPane.showMessageDialog(null, response, "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
            
            case 125:
            {
                String response = (String)msg.getObject();
                JOptionPane.showMessageDialog(null, response, "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
            
            case 126:
            {
                String response = (String)msg.getObject();
                JOptionPane.showMessageDialog(null, response, "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
            
            case 127:
            {
                String response = (String)msg.getObject();
                JOptionPane.showMessageDialog(null, response, "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
            
            case 128: 
            {
                 ImageIcon icon = new ImageIcon("resources/IMG/ok.png");
                JOptionPane.showMessageDialog(null, "JOIN ROOM SUCCESSFULLY", 
                "SUCESS MESSAGE", JOptionPane.INFORMATION_MESSAGE, icon);
                 List<String> users = (ArrayList<String>)msg.getObject();
                //List<String> users =  Arrays.asList("king", "alice", "hoang");
                //listOnlineUsers = new JList(users.toArray());
                txtOwner.setText(users.get(0));
                if(this.username.equals(users.get(0)))
                     bntStartGame.setEnabled(true);
                else  bntStartGame.setEnabled(false);
                this.updateJoinRoom(users);
                this.txtNumberPlayers.setText(Integer.toString(users.size()));
                
                break;
            }
            
            case 147: {
                String[] tokens = ((String)msg.getObject()).split("#");
                
                this.updateTextPaneForPartner(tokens[0] + ": " + tokens[1]);
                 break;
                
            }
        }
    }
    
    private void updateOnline(List<String> users)
    {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < users.size(); i++)
        {
            if(users.get(i).equals(this.username))
                continue;
            listModel.addElement(users.get(i));
        }
        listOnlineUsers.setModel(listModel);
    }
    
     private void updateJoinRoom(List<String> joiners)
    {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < joiners.size(); i++)
        {
            listModel.addElement(joiners.get(i));
        }
        ListInRoom.setModel(listModel);
    }

}
