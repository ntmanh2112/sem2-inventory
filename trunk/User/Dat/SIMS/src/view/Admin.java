package view;

import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Point;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class Admin extends Frame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPanel = null;
	private JLabel lbAdmin = null;
	private JButton btnCategory = null;
	private JButton btnProduct = null;
	private JButton btnCustomer = null;
	private JButton btnComplaint = null;
	private JButton btnOderandDispatch = null;
	private JButton btnAccountManager = null;
	private JScrollPane jScrollPane = null;
	private JTable TableAdmin = null;
	private JButton btnAdd = null;
	private JButton btnUpdate = null;
	private JButton btnDelete = null;
	private JPanel jContentPanel1 = null;
	private JLabel lbsKeyWord = null;
	private JTextField tfKeyWord = null;
	private JLabel lbsFullName = null;
	private JTextField tfFullName = null;
	private JButton btnSearch = null;
	private JLabel lbuser = null;
	private JLabel lbfullname = null;
	private JLabel lbaccuser = null;
	private JLabel lbaccfullname = null;
	private JButton btnExit = null;
	/**
	 * This is the default constructor
	 */
	public Admin() {
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
		this.setTitle("Admin");

		this.add(getJContentPanel(), null);
	}

	/**
	 * This method initializes jContentPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPanel() {
		if (jContentPanel == null) {
			lbaccfullname = new JLabel();
			lbaccfullname.setBounds(new Rectangle(120, 46, 124, 16));
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
			lbAdmin = new JLabel();
			lbAdmin.setBounds(new Rectangle(298, 10, 186, 62));
			lbAdmin.setIcon(new ImageIcon(getClass().getResource("/images/Administrator-icon.png")));
			lbAdmin.setHorizontalTextPosition(SwingConstants.RIGHT);
			lbAdmin.setHorizontalAlignment(SwingConstants.CENTER);
			lbAdmin.setText("Admin");
			jContentPanel = new JPanel();
			jContentPanel.setLayout(null);
			jContentPanel.setBounds(new Rectangle(8, 30, 828, 574));
			jContentPanel.add(lbAdmin, null);
			jContentPanel.add(getBtnCategory(), null);
			jContentPanel.add(getBtnProduct(), null);
			jContentPanel.add(getBtnCustomer(), null);
			jContentPanel.add(getBtnComplaint(), null);
			jContentPanel.add(getBtnOderandDispatch(), null);
			jContentPanel.add(getBtnAccountManager(), null);
			jContentPanel.add(getJScrollPane(), null);
			jContentPanel.add(getBtnAdd(), null);
			jContentPanel.add(getBtnUpdate(), null);
			jContentPanel.add(getBtnDelete(), null);
			jContentPanel.add(getJContentPanel1(), null);
			jContentPanel.add(lbuser, null);
			jContentPanel.add(lbfullname, null);
			jContentPanel.add(lbaccuser, null);
			jContentPanel.add(lbaccfullname, null);
			jContentPanel.add(getBtnExit(), null);
		}
		return jContentPanel;
	}

	/**
	 * This method initializes btnCategory	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCategory() {
		if (btnCategory == null) {
			btnCategory = new JButton();
			btnCategory.setBounds(new Rectangle(28, 92, 112, 24));
			btnCategory.setText("Category list");
		}
		return btnCategory;
	}

	/**
	 * This method initializes btnProduct	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnProduct() {
		if (btnProduct == null) {
			btnProduct = new JButton();
			btnProduct.setBounds(new Rectangle(138, 92, 112, 24));
			btnProduct.setText("Product list");
		}
		return btnProduct;
	}

	/**
	 * This method initializes btnCustomer	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCustomer() {
		if (btnCustomer == null) {
			btnCustomer = new JButton();
			btnCustomer.setBounds(new Rectangle(250, 92, 112, 24));
			btnCustomer.setText("Customer list");
		}
		return btnCustomer;
	}

	/**
	 * This method initializes btnComplaint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnComplaint() {
		if (btnComplaint == null) {
			btnComplaint = new JButton();
			btnComplaint.setBounds(new Rectangle(362, 92, 112, 24));
			btnComplaint.setText("Complaint list");
		}
		return btnComplaint;
	}

	/**
	 * This method initializes btnOderandDispatch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOderandDispatch() {
		if (btnOderandDispatch == null) {
			btnOderandDispatch = new JButton();
			btnOderandDispatch.setBounds(new Rectangle(474, 92, 144, 24));
			btnOderandDispatch.setText("Order and Dispatch");
		}
		return btnOderandDispatch;
	}

	/**
	 * This method initializes btnAccountManager	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAccountManager() {
		if (btnAccountManager == null) {
			btnAccountManager = new JButton();
			btnAccountManager.setBounds(new Rectangle(618, 92, 134, 24));
			btnAccountManager.setText("Account Manager");
		}
		return btnAccountManager;
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
			jScrollPane.setViewportView(getTableAdmin());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes TableAdmin	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableAdmin() {
		if (TableAdmin == null) {
			TableAdmin = new JTable();
		}
		return TableAdmin;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setBounds(new Rectangle(102, 419, 168, 48));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/add-user-icon.png")));
			btnAdd.setText("Add Account");
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
			btnUpdate.setBounds(new Rectangle(346, 419, 180, 48));
			btnUpdate.setIcon(new ImageIcon(getClass().getResource("/images/report_icon.jpg")));
			btnUpdate.setText("Update Account");
		}
		return btnUpdate;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setBounds(new Rectangle(600, 419, 182, 48));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/remove-user-icon.png")));
			btnDelete.setText("Delete Account");
		}
		return btnDelete;
	}

	/**
	 * This method initializes jContentPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPanel1() {
		if (jContentPanel1 == null) {
			lbsFullName = new JLabel();
			lbsFullName.setBounds(new Rectangle(256, 30, 90, 28));
			lbsFullName.setText("Full Name :");
			lbsKeyWord = new JLabel();
			lbsKeyWord.setBounds(new Rectangle(28, 30, 64, 28));
			lbsKeyWord.setText("Key Word :");
			jContentPanel1 = new JPanel();
			jContentPanel1.setLayout(null);
			jContentPanel1.setBounds(new Rectangle(32, 479, 768, 78));
			jContentPanel1.setBorder(BorderFactory.createTitledBorder(null, "Search Account Manager", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jContentPanel1.add(lbsKeyWord, null);
			jContentPanel1.add(getTfKeyWord(), null);
			jContentPanel1.add(lbsFullName, null);
			jContentPanel1.add(getTfFullName(), null);
			jContentPanel1.add(getBtnSearch(), null);
		}
		return jContentPanel1;
	}

	/**
	 * This method initializes tfKeyWord	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTfKeyWord() {
		if (tfKeyWord == null) {
			tfKeyWord = new JTextField();
			tfKeyWord.setBounds(new Rectangle(104, 30, 136, 30));
		}
		return tfKeyWord;
	}

	/**
	 * This method initializes tfFullName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTfFullName() {
		if (tfFullName == null) {
			tfFullName = new JTextField();
			tfFullName.setBounds(new Rectangle(358, 30, 172, 30));
		}
		return tfFullName;
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
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/users_search.png")));
			btnSearch.setText("Search");
		}
		return btnSearch;
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

}  //  @jve:decl-index=0:visual-constraint="-5,14"
