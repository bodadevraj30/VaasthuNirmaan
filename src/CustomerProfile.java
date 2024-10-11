
import java.sql.PreparedStatement;
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author sujith
 */
public class CustomerProfile extends javax.swing.JFrame {

	/**
	 * Creates new form AgentProfile
	 */
	String aadharNumberPattern = "^[AC][0-9]{12}$";
	String mobileNumberPattern = "[6789]\\d{9}";
	String username = "";

	public CustomerProfile() {
		initComponents();
	}

	public CustomerProfile(String tempUsername) {
		initComponents();
		username = tempUsername;
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        txtAadhar = new javax.swing.JLabel();
        txtFName = new javax.swing.JLabel();
        txtLName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaasthu Nirmaan");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 24, 184));
        jLabel1.setText("Update Customer Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(104, 24, 184));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(104, 24, 184));
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(104, 24, 184));
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, -1, -1));

        txtMNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtMNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(104, 24, 184));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(104, 24, 184));
        jLabel7.setText("Aadhar number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 108, -1, -1));

        updateButton.setBackground(new java.awt.Color(176, 244, 180));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(163, 17, 207));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 536, -1, 50));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 290, 40));

        backButton.setBackground(new java.awt.Color(176, 244, 180));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtAadhar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtAadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 250, 40));
        txtAadhar.getAccessibleContext().setAccessibleName("txtAadhar");

        txtFName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 300, 40));

        txtLName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 310, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_two.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
		// TODO add your handling code here:
		try {
			Connection con = ConnectionProvider.getCon();
			System.out.println(username);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customer where aadharID = '" + username + "'");
			while (rs.next()) {
				txtFName.setText(rs.getString("firstName"));
				txtLName.setText(rs.getString("lastName"));
				txtAadhar.setText(rs.getString("aadharID"));
				txtMNumber.setText(rs.getString("phoneNumber"));
				txtPassword.setText(rs.getString("password"));
			}
		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		}
    }//GEN-LAST:event_formComponentShown

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
		// TODO add your handling code here:
		String fname = txtFName.getText();
		String lname = txtLName.getText();
		String mnumber = txtMNumber.getText();
		String password = new String(txtPassword.getPassword());

		if (fname.equals("")) {
			JOptionPane.showMessageDialog(null, "First Name field required", "Invalid input", JOptionPane.YES_NO_OPTION);
		} else if (lname.equals("")) {
			JOptionPane.showMessageDialog(null, "Last Name field Required. ", "Invalid input", JOptionPane.YES_NO_OPTION);
		} else if (mnumber.equals("")) {
			JOptionPane.showMessageDialog(null, "Mobile Number field Required. ", "Invalid input", JOptionPane.YES_NO_OPTION);
		} else if (username.equals("")) {
			JOptionPane.showMessageDialog(null, "Aadhar field Required. ", "Invalid input", JOptionPane.YES_NO_OPTION);
		} else if (password.equals("")) {
			JOptionPane.showMessageDialog(null, "Password field Required. ", "Invalid input", JOptionPane.YES_NO_OPTION);
		} else if (!mnumber.matches(mobileNumberPattern) || mnumber.length() != 10) {
			JOptionPane.showMessageDialog(null, "Mobile number invalid. ", "Invalid input", JOptionPane.YES_NO_OPTION);
		} else {
			try {
				Connection con = ConnectionProvider.getCon();
				PreparedStatement ps = con.prepareStatement("update customer set phoneNumber = ?, password = ? where aadharID = '" + username + "'");
				ps.setString(1, mnumber);
				ps.setString(2, password);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Succesfully updated");
				setVisible(false);
				new AgentDashboard().setVisible(true);
			} catch (Exception e) {
			}
		}
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
		// TODO add your handling code here:
		setVisible(false);
		new CustomerDashboard(username).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
			java.util.logging.Logger.getLogger(AgentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AgentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AgentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AgentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AgentProfile().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel txtAadhar;
    private javax.swing.JLabel txtFName;
    private javax.swing.JLabel txtLName;
    private javax.swing.JTextField txtMNumber;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
