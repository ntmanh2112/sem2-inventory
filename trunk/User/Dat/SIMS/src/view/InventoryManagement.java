package view;

import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class InventoryManagement extends Frame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbuser = null;
	private JLabel lbfullname = null;
	private JLabel lbaccuser = null;
	private JLabel lbaccfullname = null;
	private JLabel lbInventoryManagement = null;
	private JButton btnExit = null;
	private JButton btnCustomer = null;
	private JButton btnOrder = null;
	private JButton btnComplaint = null;
	private JScrollPane jScrollPane = null;
	private JTable TableInventory = null;
	private JPanel jContentPane1 = null;
	private JLabel lbsCustomer = null;
	private JLabel lbsStatus = null;
	private JTextField tfCustomer = null;
	private JComboBox cbStatus = null;
	private JButton btnSearch = null;
	private JButton btnAdd = null;
	private JButton btnUpdate = null;
	private JButton btnDetail = null;

	/**
	 * This is the default constructor
	 */
	public InventoryManagement() {
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
		this.setTitle("Inventory Management");

		this.setBounds(new Rectangle(0, 0, 844, 616));
		this.add(getJContentPane(), null);
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbInventoryManagement = new JLabel();
			lbInventoryManagement.setText("Inventory Management");
			lbInventoryManagement.setSize(new Dimension(198, 62));
			lbInventoryManagement.setPreferredSize(new Dimension(165, 48));
			lbInventoryManagement.setIcon(new ImageIcon(getClass().getResource("/images/Administrator-icon.png")));
			lbInventoryManagement.setLocation(new Point(298, 10));
			lbaccfullname = new JLabel();
			lbaccfullname.setBounds(new Rectangle(120, 46, 124, 16));
			lbaccfullname.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			lbaccfullname.setText("");
			lbaccuser = new JLabel();
			lbaccuser.setBounds(new Rectangle(120, 16, 124, 16));
			lbaccuser.setText("");
			lbfullname = new JLabel();
			lbfullname.setBounds(new Rectangle(30, 45, 76, 18));
			lbfullname.setText("Full Name :");
			lbuser = new JLabel();
			lbuser.setBounds(new Rectangle(30, 15, 76, 16));
			lbuser.setText("User Name :");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBounds(new Rectangle(8, 30, 828, 574));
			jContentPane.add(lbuser, null);
			jContentPane.add(lbfullname, null);
			jContentPane.add(lbaccuser, null);
			jContentPane.add(lbaccfullname, null);
			jContentPane.add(lbInventoryManagement, null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(getBtnCustomer(), null);
			jContentPane.add(getBtnOrder(), null);
			jContentPane.add(getBtnComplaint(), null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJContentPane1(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnUpdate(), null);
			jContentPane.add(getBtnDetail(), null);
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
			btnExit.setPreferredSize(new Dimension(91, 42));
			btnExit.setText("Exit");
			btnExit.setIcon(new ImageIcon(getClass().getResource("/images/Log-Out-icon.png")));
			btnExit.setActionCommand("Exit");
		}
		return btnExit;
	}

	/**
	 * This method initializes btnCustomer	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCustomer() {
		if (btnCustomer == null) {
			btnCustomer = new JButton();
			btnCustomer.setBounds(new Rectangle(28, 92, 112, 24));
			btnCustomer.setPreferredSize(new Dimension(105, 26));
			btnCustomer.setText("Customer list");
		}
		return btnCustomer;
	}

	/**
	 * This method initializes btnOrder	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOrder() {
		if (btnOrder == null) {
			btnOrder = new JButton();
			btnOrder.setBounds(new Rectangle(138, 92, 112, 24));
			btnOrder.setText("Order list");
			btnOrder.setPreferredSize(new Dimension(99, 26));
		}
		return btnOrder;
	}

	/**
	 * This method initializes btnComplaint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnComplaint() {
		if (btnComplaint == null) {
			btnComplaint = new JButton();
			btnComplaint.setBounds(new Rectangle(250, 92, 112, 24));
			btnComplaint.setText("Complaint list");
		}
		return btnComplaint;
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
			jScrollPane.setViewportView(getTableInventory());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes TableCallCenter	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableInventory() {
		if (TableInventory == null) {
			TableInventory = new JTable();
		}
		return TableInventory;
	}

	/**
	 * This method initializes jContentPane1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane1() {
		if (jContentPane1 == null) {
			lbsStatus = new JLabel();
			lbsStatus.setBounds(new Rectangle(15, 77, 76, 28));
			lbsStatus.setText("Status :");
			lbsCustomer = new JLabel();
			lbsCustomer.setBounds(new Rectangle(16, 29, 104, 32));
			lbsCustomer.setText("Customer Name :");
			jContentPane1 = new JPanel();
			jContentPane1.setLayout(null);
			jContentPane1.setBounds(new Rectangle(16, 422, 450, 134));
			jContentPane1.setBorder(BorderFactory.createTitledBorder(null, "Search Complaint", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jContentPane1.setName("");
			jContentPane1.add(lbsCustomer, null);
			jContentPane1.add(lbsStatus, null);
			jContentPane1.add(getTfCustomer(), null);
			jContentPane1.add(getCbStatus(), null);
			jContentPane1.add(getBtnSearch(), null);
		}
		return jContentPane1;
	}

	/**
	 * This method initializes tfCustomer	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTfCustomer() {
		if (tfCustomer == null) {
			tfCustomer = new JTextField();
			tfCustomer.setBounds(new Rectangle(135, 31, 166, 30));
		}
		return tfCustomer;
	}

	/**
	 * This method initializes cbStatus	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbStatus() {
		if (cbStatus == null) {
			cbStatus = new JComboBox();
			cbStatus.setBounds(new Rectangle(103, 75, 197, 31));
		}
		return cbStatus;
	}

	/**
	 * This method initializes btnSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton();
			btnSearch.setBounds(new Rectangle(314, 46, 122, 44));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/Search.png")));
			btnSearch.setText("Search");
		}
		return btnSearch;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setBounds(new Rectangle(481, 420, 168, 60));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Add-icon_2.png")));
			btnAdd.setText("Add Complaint");
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setBounds(new Rectangle(570, 496, 168, 58));
			btnUpdate.setIcon(new ImageIcon(getClass().getResource("/images/report_icon.jpg")));
			btnUpdate.setText("Update Status");
		}
		return btnUpdate;
	}

	/**
	 * This method initializes btnDetail	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDetail() {
		if (btnDetail == null) {
			btnDetail = new JButton();
			btnDetail.setBounds(new Rectangle(660, 420, 150, 60));
			btnDetail.setIcon(new ImageIcon(getClass().getResource("/images/Windows_View_Detail.png")));
			btnDetail.setText("Details");
		}
		return btnDetail;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
