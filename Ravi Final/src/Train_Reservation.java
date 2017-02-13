
import java.awt.Frame;
import java.sql.*;

import javax.swing.JOptionPane;
public class Train_Reservation extends javax.swing.JFrame {
    private Frame jFrame;

   public Train_Reservation() {
        initComponents();
    
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        loginpage = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        add_details = new javax.swing.JMenu();
        Add_client_menuitem = new javax.swing.JMenuItem();
        Book_ticket_MenuItem = new javax.swing.JMenuItem();
        Add_trains_menuitem = new javax.swing.JMenuItem();
        Display_details = new javax.swing.JMenu();
        Employee_details_menuitem = new javax.swing.JMenuItem();
        Client_details_MenuItem = new javax.swing.JMenuItem();
        Booked_ticket_menuitem = new javax.swing.JMenuItem();
        Update_password_menuitem = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        Update_clientdetails_menuitem = new javax.swing.JMenuItem();
        Update_Employeedetails_menuitem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Train Reservation");

        loginpage.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Enter your username");
        jLabel1.setBounds(90, 120, 130, -1);
        loginpage.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField2.setBounds(230, 120, 110, -1);
        loginpage.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(255, 102, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Password");
        jLabel2.setBounds(94, 160, 70, -1);
        loginpage.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPasswordField1.setBounds(230, 160, 110, -1);
        loginpage.add(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(147, 220, 80, -1);
        loginpage.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton2.setText("SIGNUP");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(260, 220, 90, -1);
        loginpage.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel3.setBounds(0, -200, -1, 860);
        loginpage.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ravi_and_laqshay/indian-railways-wallpapers.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBounds(0, 0, 630, 460);
        loginpage.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        add_details.setText("ADD Details");
        add_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_detailsMouseClicked(evt);
            }
        });
        add_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_detailsActionPerformed(evt);
            }
        });

        Add_client_menuitem.setText("Add Client");
        Add_client_menuitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_client_menuitemMouseClicked(evt);
            }
        });
        Add_client_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_client_menuitemActionPerformed(evt);
            }
        });
        add_details.add(Add_client_menuitem);

        Book_ticket_MenuItem.setText("Book Ticket");
        Book_ticket_MenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Book_ticket_MenuItemMouseClicked(evt);
            }
        });
        Book_ticket_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_ticket_MenuItemActionPerformed(evt);
            }
        });
        Book_ticket_MenuItem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Book_ticket_MenuItemAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add_details.add(Book_ticket_MenuItem);

        Add_trains_menuitem.setText("Add Trains");
        Add_trains_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_trains_menuitemActionPerformed(evt);
            }
        });
        add_details.add(Add_trains_menuitem);

        menuBar.add(add_details);

        Display_details.setText("Display Details");
        Display_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_detailsMouseClicked(evt);
            }
        });
        Display_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_detailsActionPerformed(evt);
            }
        });

        Employee_details_menuitem.setText("Employees");
        Employee_details_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_details_menuitemActionPerformed(evt);
            }
        });
        Display_details.add(Employee_details_menuitem);

        Client_details_MenuItem.setText("Client Details");
        Client_details_MenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_details_MenuItemMouseClicked(evt);
            }
        });
        Client_details_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_details_MenuItemActionPerformed(evt);
            }
        });
        Display_details.add(Client_details_MenuItem);

        Booked_ticket_menuitem.setText("Booked Tickets");
        Booked_ticket_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Booked_ticket_menuitemActionPerformed(evt);
            }
        });
        Display_details.add(Booked_ticket_menuitem);

        menuBar.add(Display_details);

        Update_password_menuitem.setText(" Update Details");
        Update_password_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_password_menuitemActionPerformed(evt);
            }
        });

        contentMenuItem.setText("Change Password");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        Update_password_menuitem.add(contentMenuItem);

        Update_clientdetails_menuitem.setText("Change Client Details");
        Update_clientdetails_menuitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update_clientdetails_menuitemMouseClicked(evt);
            }
        });
        Update_clientdetails_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_clientdetails_menuitemActionPerformed(evt);
            }
        });
        Update_password_menuitem.add(Update_clientdetails_menuitem);

        Update_Employeedetails_menuitem.setText("Change Employee Details");
        Update_Employeedetails_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Employeedetails_menuitemActionPerformed(evt);
            }
        });
        Update_password_menuitem.add(Update_Employeedetails_menuitem);

        jMenuItem1.setText("Delete Trains");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Update_password_menuitem.add(jMenuItem1);

        menuBar.add(Update_password_menuitem);

        exit.setText(" Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuBar.add(exit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loginpage, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginpage, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_detailsMouseClicked
    
}//GEN-LAST:event_add_detailsMouseClicked

    private void Book_ticket_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_ticket_MenuItemActionPerformed
    bookticket b=new bookticket();
     loginpage.add(b);
     b.setVisible(true);
}//GEN-LAST:event_Book_ticket_MenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String aid=jTextField2.getText();
String p=jPasswordField1.getText();

 try
{   Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","dps123");
    String strSQL = "select password,id from signup;";
   ResultSet rs2 = con.createStatement().executeQuery(strSQL);

        while (rs2.next())
        {
            String nid=rs2.getString("id");
          String np=rs2.getString("password");
        }
     if (aid.equals(aid)&&p.equals(p))
   {  JOptionPane.showMessageDialog(null,"Welcome to Irctc");
      add_details.setEnabled(true);
      Display_details.setEnabled(true);
      Update_password_menuitem.setEnabled(true);
      exit.setEnabled(true);
   }
 con.close();
}
   catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Display_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_detailsActionPerformed
      

}//GEN-LAST:event_Display_detailsActionPerformed

    private void Employee_details_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_details_menuitemActionPerformed
        Employees d=new Employees();
     loginpage.add(d);
     d.setVisible(true);
}//GEN-LAST:event_Employee_details_menuitemActionPerformed

    private void Booked_ticket_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Booked_ticket_menuitemActionPerformed
       BookedTickets e=new BookedTickets();
     loginpage.add(e);
     e.setVisible(true);
}//GEN-LAST:event_Booked_ticket_menuitemActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
      System.exit(0);
}//GEN-LAST:event_exitMouseClicked

    private void Display_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Display_detailsMouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_Display_detailsMouseClicked

    private void add_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_detailsActionPerformed
      
}//GEN-LAST:event_add_detailsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0);
}//GEN-LAST:event_exitActionPerformed

    private void Update_password_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_password_menuitemActionPerformed
        
}//GEN-LAST:event_Update_password_menuitemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
  changepassword q=new changepassword();
       loginpage.add(q);
       q.setVisible(true);
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void Update_Employeedetails_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Employeedetails_menuitemActionPerformed
       changeEmployeedetails j=new changeEmployeedetails();
       loginpage.add(j);
       j.setVisible(true);
}//GEN-LAST:event_Update_Employeedetails_menuitemActionPerformed

    private void Book_ticket_MenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Book_ticket_MenuItemMouseClicked
       bookticket r=new bookticket();
     loginpage.add(r);
     r.setVisible(true);
}//GEN-LAST:event_Book_ticket_MenuItemMouseClicked

    private void Book_ticket_MenuItemAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Book_ticket_MenuItemAncestorAdded

}//GEN-LAST:event_Book_ticket_MenuItemAncestorAdded

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      signup a=new signup();
     loginpage.add(a);
     a.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void Add_client_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_client_menuitemActionPerformed
        Addclient a=new Addclient();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Add_client_menuitemActionPerformed

    private void Add_client_menuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_client_menuitemMouseClicked
        Addclient a=new Addclient();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Add_client_menuitemMouseClicked

    private void Client_details_MenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_details_MenuItemMouseClicked
        Clientdetails a=new Clientdetails();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Client_details_MenuItemMouseClicked

    private void Update_clientdetails_menuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_clientdetails_menuitemMouseClicked
 changeclientdetails b=new changeclientdetails();
     loginpage.add(b);
     b.setVisible(true);
}//GEN-LAST:event_Update_clientdetails_menuitemMouseClicked

    private void Update_clientdetails_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_clientdetails_menuitemActionPerformed
        changeclientdetails b=new changeclientdetails();
     loginpage.add(b);
     b.setVisible(true);
}//GEN-LAST:event_Update_clientdetails_menuitemActionPerformed

    private void Client_details_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_details_MenuItemActionPerformed
        Clientdetails a=new Clientdetails();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Client_details_MenuItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Add_trains_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_trains_menuitemActionPerformed
       ADD_Trains a=new ADD_Trains();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Add_trains_menuitemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     delete_trains a=new delete_trains();
     loginpage.add(a);
     a.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Train_Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_client_menuitem;
    private javax.swing.JMenuItem Add_trains_menuitem;
    private javax.swing.JMenuItem Book_ticket_MenuItem;
    private javax.swing.JMenuItem Booked_ticket_menuitem;
    private javax.swing.JMenuItem Client_details_MenuItem;
    private javax.swing.JMenu Display_details;
    private javax.swing.JMenuItem Employee_details_menuitem;
    private javax.swing.JMenuItem Update_Employeedetails_menuitem;
    private javax.swing.JMenuItem Update_clientdetails_menuitem;
    private javax.swing.JMenu Update_password_menuitem;
    private javax.swing.JMenu add_details;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenu exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JDesktopPane loginpage;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
