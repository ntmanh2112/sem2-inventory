package view;

import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Cursor;

public class Login extends Frame {

	private static final long serialVersionUID = 1L;
	private Panel JContentPane = null;
	private Label user = null;
	private Label pass = null;
	private JButton btnOk = null;
	private JButton btnexit = null;
	private JTextField tfUser = null;
	private JPasswordField tfPass = null;
	private JPanel jContentPane1 = null;
	private JButton btnReset = null;
	/**
	 * This is the default constructor
	 */
	public Login() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setLayout(null);
		this.setSize(422, 288);
		this.setTitle("Welcome To Login Form");

		this.add(getJContentPane(), null);
	}

	/**
	 * This method initializes JContentPane	
	 * 	
	 * @return java.awt.Panel	
	 */
	private Panel getJContentPane() {
		if (JContentPane == null) {
			pass = new Label();
			pass.setText("Password :");
			pass.setBounds(new Rectangle(15, 119, 76, 31));
			user = new Label();
			user.setText("User Name :");
			user.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			user.setBounds(new Rectangle(15, 61, 78, 31));
			JContentPane = new Panel();
			JContentPane.setLayout(null);
			JContentPane.setBounds(new Rectangle(7, 30, 406, 256));
			JContentPane.setBackground(new Color(238, 238, 238));
			JContentPane.add(getJContentPane1(), null);
		}
		return JContentPane;
	}

	/**
	 * This method initializes btnOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("OK");
			btnOk.setBounds(new Rectangle(16, 165, 105, 38));
		}
		return btnOk;
	}

	/**
	 * This method initializes btnexit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnexit() {
		if (btnexit == null) {
			btnexit = new JButton();
			btnexit.setText("Exit");
			btnexit.setBounds(new Rectangle(256, 165, 105, 38));
		}
		return btnexit;
	}

	/**
	 * This method initializes tfUser	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(new Rectangle(105, 61, 242, 30));
		}
		return tfUser;
	}

	/**
	 * This method initializes tfPass	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTfPass() {
		if (tfPass == null) {
			tfPass = new JPasswordField();
			tfPass.setBounds(new Rectangle(105, 121, 242, 30));
		}
		return tfPass;
	}

	/**
	 * This method initializes jContentPane1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane1() {
		if (jContentPane1 == null) {
			jContentPane1 = new JPanel();
			jContentPane1.setLayout(null);
			jContentPane1.setBounds(new Rectangle(16, 1, 376, 240));
			jContentPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray), "Login Form", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Arial", Font.BOLD, 30), new Color(51, 51, 51)));
			jContentPane1.add(user, null);
			jContentPane1.add(pass, null);
			jContentPane1.add(getBtnOk(), null);
			jContentPane1.add(getTfUser(), null);
			jContentPane1.add(getTfPass(), null);
			jContentPane1.add(getBtnReset(), null);
			jContentPane1.add(getBtnexit(), null);
		}
		return jContentPane1;
	}

	/**
	 * This method initializes btnReset	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton();
			btnReset.setBounds(new Rectangle(135, 165, 105, 38));
			btnReset.setText("Reset");
		}
		return btnReset;
	}

}  //  @jve:decl-index=0:visual-constraint="16,10"
