package view;

import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Button;

public class SalesPerson extends Frame {

	private static final long serialVersionUID = 1L;
	private JTabbedPane jTabbedPane = null;
	private JTabbedPane tpproductlist = null;
	private JTabbedPane tpbill = null;
	private JTabbedPane jTabbedPane3 = null;
	private JTabbedPane jTabbedPane4 = null;
	private JTabbedPane jTabbedPane5 = null;
	private JLabel lbuser = null;
	private JLabel lbfullname = null;
	private JLabel lbaccuser = null;
	private JLabel lbaccfullname = null;
	private JLabel lbSalesPerson = null;
	private JButton btnExit = null;
	/**
	 * This is the default constructor
	 */
	public SalesPerson() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		lbSalesPerson = new JLabel();
		lbSalesPerson.setHorizontalAlignment(SwingConstants.CENTER);
		lbSalesPerson.setIcon(new ImageIcon(getClass().getResource("/images/Administrator-icon.png")));
		lbSalesPerson.setBounds(new Rectangle(311, 44, 186, 62));
		lbSalesPerson.setText("Sales Person");
		lbaccfullname = new JLabel();
		lbaccfullname.setText("");
		lbaccfullname.setBounds(new Rectangle(120, 75, 121, 16));
		lbaccuser = new JLabel();
		lbaccuser.setText("");
		lbaccuser.setBounds(new Rectangle(120, 45, 121, 16));
		lbfullname = new JLabel();
		lbfullname.setText("Full Name :");
		lbfullname.setBounds(new Rectangle(30, 75, 76, 16));
		lbuser = new JLabel();
		lbuser.setText("User Name :");
		lbuser.setBounds(new Rectangle(30, 45, 76, 16));
		this.setLayout(null);
		this.setSize(844, 616);
		this.setTitle("Sales Person");

		this.add(getJTabbedPane(), null);
		this.add(lbuser, null);
		this.add(lbfullname, null);
		this.add(lbaccuser, null);
		this.add(lbaccfullname, null);
		this.add(lbSalesPerson, null);
		this.add(getBtnExit(), null);
	}

	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setBounds(new Rectangle(8, 122, 828, 270));
			jTabbedPane.addTab("Product list", null, getTpproductlist(), null);
			jTabbedPane.addTab("Bill list", null, getTpbill(), null);
			jTabbedPane.addTab("Ba", null, getJTabbedPane3(), null);
			jTabbedPane.addTab("Bốn", null, getJTabbedPane4(), null);
			jTabbedPane.addTab("Năm", null, getJTabbedPane5(), null);
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes jTabbedPane1	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getTpproductlist() {
		if (tpproductlist == null) {
			tpproductlist = new JTabbedPane();
		}
		return tpproductlist;
	}

	/**
	 * This method initializes jTabbedPane2	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getTpbill() {
		if (tpbill == null) {
			tpbill = new JTabbedPane();
		}
		return tpbill;
	}

	/**
	 * This method initializes jTabbedPane3	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane3() {
		if (jTabbedPane3 == null) {
			jTabbedPane3 = new JTabbedPane();
		}
		return jTabbedPane3;
	}

	/**
	 * This method initializes jTabbedPane4	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane4() {
		if (jTabbedPane4 == null) {
			jTabbedPane4 = new JTabbedPane();
		}
		return jTabbedPane4;
	}

	/**
	 * This method initializes jTabbedPane5	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane5() {
		if (jTabbedPane5 == null) {
			jTabbedPane5 = new JTabbedPane();
		}
		return jTabbedPane5;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setText("Exit");
			btnExit.setBounds(new Rectangle(659, 46, 120, 46));
			btnExit.setIcon(new ImageIcon(getClass().getResource("/images/Log-Out-icon.png")));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
