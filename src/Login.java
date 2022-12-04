import java.awt.Color;
import static java.lang.System.in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import java.lang.*;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Passwd = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        St = new javax.swing.JRadioButton();
        Te = new javax.swing.JRadioButton();
        Login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        REG = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 300));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(108, 255, 140));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("QUIZ MANAGEMENT ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SYSTEM");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_test_passed_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel7)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_shield_25px.png"))); // NOI18N

        Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(108, 255, 140));
        Username.setText("UserID");
        Username.setBorder(null);
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(57, 175, 82));
        jSeparator1.setForeground(new java.awt.Color(57, 175, 82));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_lock_25px.png"))); // NOI18N

        Passwd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Passwd.setForeground(new java.awt.Color(108, 255, 140));
        Passwd.setText("password");
        Passwd.setBorder(null);
        Passwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswdFocusLost(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(57, 182, 85));
        jSeparator2.setForeground(new java.awt.Color(57, 175, 82));

        St.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(St);
        St.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        St.setForeground(new java.awt.Color(108, 255, 140));
        St.setText("Student");

        Te.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Te);
        Te.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Te.setForeground(new java.awt.Color(108, 255, 140));
        Te.setText("Teacher");

        Login.setBackground(new java.awt.Color(108, 255, 140));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_close_window_35px_1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        REG.setBackground(new java.awt.Color(108, 255, 140));
        REG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REGMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");

        javax.swing.GroupLayout REGLayout = new javax.swing.GroupLayout(REG);
        REG.setLayout(REGLayout);
        REGLayout.setHorizontalGroup(
            REGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        REGLayout.setVerticalGroup(
            REGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(St)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Te))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(REG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Passwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(St)
                    .addComponent(Te))
                .addGap(18, 18, 18)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(REG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
if(St.isSelected()==false && Te.isSelected()==false)
{
   JOptionPane.showMessageDialog(this,"Please Select if you are a Student or a Teacher"); 
}
else{
    String uid=Username.getText();
    String pass=Passwd.getText();
    String utype;
    if(St.isSelected()==true)
    {
        utype="S";
    }
    else{
    utype="T";    
    }
         try {
          Class.forName("java.sql.DriverManager");
          Connection con=(Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/quiz","root","root");
          Statement s=(Statement)con.createStatement();
          String q="select* from details where userid='"+uid+"' and password='"+pass+"';";
          ResultSet r1=s.executeQuery(q);
   if(r1.next())
    {
             if(r1.getString(4).equals(utype))
             {
              
              //JOptionPane.showMessageDialog(this,"Login Successful");
              if(utype.equals("T"))
              {
                 String q1="select name from details where userid='"+uid+"';"; 
                 r1.beforeFirst();
                 r1.next();
                 Dashboard_T d=new Dashboard_T();
                  d.show();
                  Dashboard_T.Tname.setText(r1.getString(2));
                  Dashboard_T.UID.setText(uid.toUpperCase());
                   dispose();
                }
              else
              {
              r1.beforeFirst();
                 r1.next();
                 Dashboard_S e=new Dashboard_S();
                  e.show();
                  Dashboard_S.Sname.setText(r1.getString(2));
                  Dashboard_S.UID.setText(uid.toUpperCase());
                   dispose();
              
               }
              } 
             else
             {
              JOptionPane.showMessageDialog(this,"Incorrect UserType selected");   
             }
    
          } 
          else
          {
             JOptionPane.showMessageDialog(this,"Incorrect UserID or Password. If not registered, click on the button below to do so."); 
          }
                
      }
      catch(ClassNotFoundException | SQLException e)
      {
          JOptionPane.showMessageDialog(this,e);
    }
        //JOptionPane.showMessageDialog(this,"Details Not Found. Please click on Register.");
    }//GEN-LAST:event_LoginMouseClicked
    }
    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
    Login.setBackground(new Color(40,189,73));
    }//GEN-LAST:event_LoginMouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
         Login.setBackground(new Color(108,255,140));
    }//GEN-LAST:event_LoginMouseExited

    private void REGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGMouseClicked
Registration re=new Registration();
   re.show();        // TODO add your handling code here:
    }//GEN-LAST:event_REGMouseClicked

    private void REGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGMouseEntered
REG.setBackground(new Color(40,189,73));        
    }//GEN-LAST:event_REGMouseEntered

    private void REGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGMouseExited
 REG.setBackground(new Color(108,255,140));        
    }//GEN-LAST:event_REGMouseExited

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
if(Username.getText().equals("UserID"))
{
  Username.setText("");  
    }//GEN-LAST:event_UsernameFocusGained
    }
    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
if(Username.getText().equals(""))
{
    Username.setText("UserID");
}
    }//GEN-LAST:event_UsernameFocusLost

    private void PasswdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswdFocusLost
        if(Passwd.getText().equals(""))
        {
            Passwd.setText("password");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_PasswdFocusLost

    private void PasswdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswdFocusGained
        if(Passwd.getText().equals("password"))
        {
            Passwd.setText("");
        }
    }//GEN-LAST:event_PasswdFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPasswordField Passwd;
    private javax.swing.JPanel REG;
    private javax.swing.JRadioButton St;
    private javax.swing.JRadioButton Te;
    public static javax.swing.JTextField Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
