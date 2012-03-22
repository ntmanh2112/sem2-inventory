package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

public class SalesManagement extends Frame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbSalesManagement = null;
	private JLabel lbuser = null;
	private JLabel lbfullname = null;
	private JLabel lbaccuser = null;
	private JLabel lbaccfullname = null;
	private JButton btnExit = null;
	private JButton btnDispatch = null;
	private JButton btnCustomer = null;
	private JScrollPane jScrollPane = null;
	private JTable TableSalesManagement = null;
	private JButton btnUpdate = null;
	private JButton btnPaid = null;
	private JPanel jContentPane1 = null;
	private JLabel lbsCustomer = null;
	private JTextField tfCustomer = null;
	private JLabel lbsPhone = null;
	private JTextField tfPhone = null;
	private JButton btnSearch = null;

	/**
	 * This is the default constructor
	 */
	public SalesManagement() {
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
		this.setSize(844, 616);
		this.setTitle("Sales Management");

		this.add(getjContentPane(), null);
	}
	
	/**
	 * This method initializes jContentPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getjContentPane() {
		if (jContentPane == null) {
			lbuser = new JLabel();
			lbuser.setBounds(new Rectangle(30, 15, 76, 16));
			lbuser.setText("User Name :");
			lbfullname = new JLabel();
			lbfullname.setBounds(new Rectangle(30, 45, 76, 18));
			lbfullname.setText("Full Name :");
			lbaccuser = new JLabel();
			lbaccuser.setBounds(new Rectangle(120, 16, 124, 16));
			lbaccuser.setText("");
			lbaccfullname = new JLabel();
			lbaccfullname.setBounds(new Rectangle(120, 46, 124, 16));
			lbaccfullname.setText("");
			lbSalesManagement = new JLabel();
			lbSalesManagement.setBounds(new Rectangle(298, 10, 186, 62));
			lbSalesManagement.setIcon(new ImageIcon(getClass().getResource("/images/Administrator-icon.png")));
			lbSalesManagement.setText("Sales Management");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBounds(new Rectangle(8, 30, 828, 574));
			jContentPane.add(lbSalesManagement, null);
			jContentPane.add(lbuser, null);
			jContentPane.add(lbfullname, null);
			jContentPane.add(lbaccuser, null);
			jContentPane.add(lbaccfullname, null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(getBtnDispatch(), null);
			jContentPane.add(getBtnCustomer(), null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBtnUpdate(), null);
			jContentPane.add(getBtnPaid(), null);
			jContentPane.add(getjContentPane1(), null);
		}
		return jContentPane;
		}
	
	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setBounds(new Rectangle(659, 16, 120, 40));
			btnExit.setIcon(new ImageIcon(getClass().getResource("/images/Log-Out-icon.png")));
			btnExit.setText("Exit");
		}
		return btnExit;
	}
	
	/**
	 * This method initializes btnDispatch
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnDispatch(){
		if(btnDispatch == null){
			btnDispatch = new JButton();
			btnDispatch.setBounds(new Rectangle(28, 92, 112, 24));
			btnDispatch.setText("Dispatch list");
		}
		return btnDispatch;
	}
	
	/**
	 * This method initializes btnCustomer
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnCustomer(){
		if(btnCustomer == null){
			btnCustomer = new JButton();
			btnCustomer.setBounds(new Rectangle(138, 92, 112, 24));
			btnCustomer.setText("Customer list");
		}
		return btnCustomer;
	}
	
	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(29, 135, 767, 273));
			jScrollPane.setViewportView(getTableSalesManagement());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes TableDispatch	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableSalesManagement() {
		if (TableSalesManagement == null) {
			TableSalesManagement = new JTable();
		}
		return TableSalesManagement;
	}
	
	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setBounds(new Rectangle(102, 419, 180, 48));
			btnUpdate.setIcon(new ImageIcon(getClass().getResource("/images/report_icon.jpg")));
			btnUpdate.setHorizontalTextPosition(SwingConstants.TRAILING);
			btnUpdate.setText("Update Dispatch");
		}
		return btnUpdate;
	}

	/**
	 * This method initializes btnPaid	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPaid() {
		if (btnPaid == null) {
			btnPaid = new JButton();
			btnPaid.setBounds(new Rectangle(346, 419, 180, 48));
			btnPaid.setIcon(new ImageIcon(getClass().getResource("/images/nuke.png")));
			btnPaid.setHorizontalTextPosition(SwingConstants.TRAILING);
			btnPaid.setText("Paid/Unpaid");
		}
		return btnPaid;
	}
	/**
	 * This method initializes jContentPane1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getjContentPane1() {
		if (jContentPane1 == null) {
			lbsCustomer = new JLabel();
			lbsCustomer.setBounds(new Rectangle(28, 30, 108, 28));
			lbsCustomer.setHorizontalAlignment(SwingConstants.CENTER);
			lbsCustomer.setHorizontalTextPosition(SwingConstants.CENTER);
			lbsCustomer.setText("Customer Name :");
			lbsPhone = new JLabel();
			lbsPhone.setBounds(new Rectangle(330, 30, 90, 28));
			lbsPhone.setHorizontalAlignment(SwingConstants.CENTER);
			lbsPhone.setHorizontalTextPosition(SwingConstants.CENTER);
			lbsPhone.setText("Phone :");
			jContentPane1 = new JPanel();
			jContentPane1.setLayout(null);
			jContentPane1.setBounds(new Rectangle(32, 479, 768, 78));
			jContentPane1.setBorder(BorderFactory.createTitledBorder(null, "Search Order and Dispatch", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jContentPane1.add(lbsCustomer, null);
			jContentPane1.add(getTfCustomer(), null);
			jContentPane1.add(lbsPhone, null);
			jContentPane1.add(gettfPhone(), null);
			jContentPane1.add(getBtnSearch(), null);
		}
		return jContentPane1;
	}
	
	/**
	 * This method initializes tfKeyWord	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTfCustomer() {
		if (tfCustomer == null) {
			tfCustomer = new JTextField();
			tfCustomer.setBounds(new Rectangle(144, 30, 172, 30));
		}
		return tfCustomer;
	}

	/**
	 * This method initializes tfFullName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField gettfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setBounds(new Rectangle(430, 30, 155, 30));
		}
		return tfPhone;
	}

	/**
	 * This method initializes btnSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton();
			btnSearch.setBounds(new Rectangle(600, 16, 132, 44));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/Search.png")));
			btnSearch.setHorizontalTextPosition(SwingConstants.TRAILING);
			btnSearch.setText("Search");
		}
		return btnSearch;
	}
}

