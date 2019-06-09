/*
 * CommAdd.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import dao.ComTypeDao;
import dao.CommDao;
import util.Dbutil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

import bean.Comm;

/**
 *
 * @author  __USER__
 */
public class CommAdd extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form CommAdd */
	String id;

	@SuppressWarnings("unchecked")
	public CommAdd() {
		initComponents();
		jComboBox1.removeAllItems();
		Connection connection = null;
		Dbutil dbutil = new Dbutil();
		ComTypeDao comTypeDao = new ComTypeDao();
		try {
			connection = dbutil.getCon();
			ResultSet resultSet = comTypeDao.GettypeResultSet(connection);
			while (resultSet.next()) {
				jComboBox1.addItem(resultSet.getString(2) + "");
			}
			jComboBox2.removeAllItems();
			for (int i = 2000; i < 2017; i++) {
				jComboBox2.addItem(i + "");
			}
			jComboBox3.removeAllItems();
			for (int i = 1; i < 13; i++) {
				jComboBox3.addItem(i + "");
			}
			jRadioButton1.setSelected(true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public CommAdd(String s) {
		initComponents();
		id = s;
		jComboBox1.removeAllItems();
		Connection connection = null;
		Dbutil dbutil = new Dbutil();
		ComTypeDao comTypeDao = new ComTypeDao();
		try {
			connection = dbutil.getCon();
			ResultSet resultSet = comTypeDao.GettypeResultSet(connection);
			while (resultSet.next()) {
				jComboBox1.addItem(resultSet.getString(2) + "");
			}
			jComboBox2.removeAllItems();
			for (int i = 2000; i < 2017; i++) {
				jComboBox2.addItem(i + "");
			}
			jComboBox3.removeAllItems();
			for (int i = 1; i < 13; i++) {
				jComboBox3.addItem(i + "");
			}
			jRadioButton1.setSelected(true);
			CommDao commDao = new CommDao();
			int k = Integer.parseInt(s);
			ResultSet resultSet1 = commDao.GetComResultSet(connection, k);
			if (resultSet1.next()) {
				jTextField1.setText(resultSet1.getString(2));
				jTextArea1.setText(resultSet1.getString(3));
				jTextField2.setText(resultSet1.getFloat(6) + "");
				jTextField3.setText(resultSet1.getInt(5) + "");
				jTextField4.setText(resultSet1.getString(7));
				jTextField5.setText(resultSet1.getFloat(8) + "");
				jComboBox1.setSelectedItem(resultSet1.getString(4));
				jComboBox2.setSelectedItem(resultSet1.getInt(10));
				jComboBox3.setSelectedItem(resultSet1.getString(11));
			} else {
				JOptionPane.showMessageDialog(null, "错误");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jButton1.setText("修改");
	}
	@SuppressWarnings("unchecked")
	public CommAdd(String s,int uu) {
		initComponents();
		id = s;
		jComboBox1.removeAllItems();
		Connection connection = null;
		Dbutil dbutil = new Dbutil();
		ComTypeDao comTypeDao = new ComTypeDao();
		try {
			connection = dbutil.getCon();
			ResultSet resultSet = comTypeDao.GettypeResultSet(connection);
			while (resultSet.next()) {
				jComboBox1.addItem(resultSet.getString(2) + "");
			}
			jComboBox2.removeAllItems();
			for (int i = 2000; i < 2017; i++) {
				jComboBox2.addItem(i + "");
			}
			jComboBox3.removeAllItems();
			for (int i = 1; i < 13; i++) {
				jComboBox3.addItem(i + "");
			}
			jRadioButton1.setSelected(true);
			CommDao commDao = new CommDao();
			int k = Integer.parseInt(s);
			ResultSet resultSet1 = commDao.GetComResultSet(connection, k);
			if (resultSet1.next()) {
				jTextField1.setText(resultSet1.getString(2));
				jTextArea1.setText(resultSet1.getString(3));
				jTextField2.setText(resultSet1.getFloat(6) + "");
				jTextField3.setText(resultSet1.getInt(5) + "");
				jTextField4.setText(resultSet1.getString(7));
				jTextField5.setText(resultSet1.getFloat(8) + "");
				jComboBox1.setSelectedItem(resultSet1.getString(4));
				jComboBox2.setSelectedItem(resultSet1.getInt(10));
				jComboBox3.setSelectedItem(resultSet1.getString(11));
			} else {
				JOptionPane.showMessageDialog(null, "错误");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jButton1.setVisible(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {

		jLabel1 = new JLabel();
		jComboBox1 = new JComboBox();
		jLabel2 = new JLabel();
		jTextField1 = new JTextField();
		jScrollPane1 = new JScrollPane();
		jTextArea1 = new JTextArea();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jTextField2 = new JTextField();
		jLabel5 = new JLabel();
		jTextField3 = new JTextField();
		jLabel6 = new JLabel();
		jComboBox2 = new JComboBox();
		jLabel7 = new JLabel();
		jComboBox3 = new JComboBox();
		jLabel8 = new JLabel();
		jTextField4 = new JTextField();
		jLabel9 = new JLabel();
		jTextField5 = new JTextField();
		jLabel10 = new JLabel();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jRadioButton1 = new JRadioButton();
		jRadioButton2 = new JRadioButton();

		setClosable(true);
		setIconifiable(true);

		jLabel1.setText("\u5546\u54c1\u7c7b\u578b\u540d");

		jComboBox1.setModel(new DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));

		jLabel2.setText("\u5546\u54c1\u540d");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jLabel3.setText("\u5546\u54c1\u63cf\u8ff0");

		jLabel4.setText("\u5355\u4ef7");

		jLabel5.setText("\u6570\u91cf");

		jLabel6.setText("\u5546\u54c1\u751f\u4ea7\u65e5\u671f  \u5e74");

		jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));

		jLabel7.setText("\u6708");

		jComboBox3.setModel(new DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));

		jLabel8.setText("\u8054\u7cfb\u4eba");

		jLabel9.setText("\u7535\u8bdd\u53f7\u7801");

		jLabel10.setText("\u6027\u522b");

		jButton1.setText("\u63d0\u4ea4");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u53d6\u6d88");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jRadioButton1.setText("\u7537");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		jRadioButton2.setText("\u5973");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
						.createParallelGroup(
								GroupLayout.Alignment.LEADING)
						.addGroup(layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(layout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(layout
																		.createSequentialGroup()
																		.addGap(204, 204, 204)
																		.addComponent(jButton1)
																		.addGap(30, 30, 30)
																		.addComponent(jButton2))
														.addGroup(layout
																		.createSequentialGroup()
																		.addGroup(layout
																						.createParallelGroup(
																								GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addGroup(layout
																														.createParallelGroup(
																																GroupLayout.Alignment.LEADING)
																														.addComponent(jLabel1)
																														.addGroup(layout
																																		.createSequentialGroup()
																																		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 4, GroupLayout.PREFERRED_SIZE)
																																		.addGroup(layout
																																						.createParallelGroup(GroupLayout.Alignment.TRAILING)
																																						.addComponent(jLabel3)
																																						.addGroup(layout
																																										.createSequentialGroup()
																																										.addComponent(jLabel4)
																																										.addGap(17, 17, 17)))))
																										.addGroup(layout
																														.createParallelGroup(
																																GroupLayout.Alignment.TRAILING)
																														.addGroup(layout
																																		.createSequentialGroup()
																																		.addGap(56, 56, 56)
																																		.addGroup(layout
																																						.createParallelGroup(GroupLayout.Alignment.LEADING)
																																						.addGroup(layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jTextField2,
																																												GroupLayout.PREFERRED_SIZE,
																																												177,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(97, 97, 97)
																																										.addComponent(jLabel5)
																																										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
																																										.addComponent(
																																												jTextField3,
																																												GroupLayout.DEFAULT_SIZE,
																																												149,
																																												Short.MAX_VALUE))
																																						.addGroup(layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jComboBox1,
																																												GroupLayout.PREFERRED_SIZE,
																																												GroupLayout.DEFAULT_SIZE,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addGap(84, 84, 84)
																																										.addComponent(jLabel2)
																																										.addGap(45, 45, 45)
																																										.addComponent(
																																												jTextField1,
																																												GroupLayout.PREFERRED_SIZE,
																																												228,
																																												GroupLayout.PREFERRED_SIZE))))
																														.addGroup(layout
																																		.createSequentialGroup()
																																		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jScrollPane1,
																																				GroupLayout.PREFERRED_SIZE,
																																				512,
																																				GroupLayout.PREFERRED_SIZE))))
																						.addGroup(
																								GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addGap(12, 12, 12)
																										.addGroup(layout
																														.createParallelGroup(
																																GroupLayout.Alignment.LEADING)
																														.addGroup(layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel8,
																																				GroupLayout.PREFERRED_SIZE,
																																				62,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jTextField4,
																																				GroupLayout.PREFERRED_SIZE,
																																				146,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(jLabel9)
																																		.addGap(30, 30, 30)
																																		.addComponent(
																																				jTextField5,
																																				GroupLayout.PREFERRED_SIZE,
																																				133,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addGap(26, 26, 26)
																																		.addComponent(jLabel10))
																														.addGroup(layout
																																		.createSequentialGroup()
																																		.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
																																		.addGap(18, 18, 18)
																																		.addComponent(
																																				jComboBox2,
																																				GroupLayout.PREFERRED_SIZE,
																																				65,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(jLabel7)
																																		.addGap(28, 28, 28)
																																		.addComponent(
																																				jComboBox3,
																																				GroupLayout.PREFERRED_SIZE,
																																				GroupLayout.DEFAULT_SIZE,
																																				GroupLayout.PREFERRED_SIZE)))
																										.addGap(18, 18, 18)
																										.addGroup(layout
																														.createParallelGroup(GroupLayout.Alignment.TRAILING)
																														.addComponent( jRadioButton2)
																														.addComponent( jRadioButton1))
																										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
																		.addGap(539, 539, 539)))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout
										.createSequentialGroup()
										.addGap(47, 47, 47)
										.addGroup(layout
														.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jComboBox1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addGroup(layout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(
																jScrollPane1,
																GroupLayout.PREFERRED_SIZE,
																90,
																GroupLayout.PREFERRED_SIZE))
										.addGap(29, 29, 29)
										.addGroup(layout
														.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField2,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField3,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGroup(layout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(layout
																		.createSequentialGroup()
																		.addGap(37, 37, 37)
																		.addGroup(layout
																						.createParallelGroup(
																								GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jComboBox3,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jComboBox2,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(jLabel6))
																		.addGap(42, 42, 42)
																		.addGroup(layout
																						.createParallelGroup(
																								GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel9)
																						.addComponent(
																								jTextField5,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(jLabel8)
																						.addComponent(
																								jTextField4,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(jLabel10))
																		.addGap(97, 97, 97)
																		.addGroup(layout
																						.createParallelGroup(GroupLayout.Alignment.BASELINE)
																						.addComponent(jButton2)
																						.addComponent(jButton1)))
														.addGroup(layout
																		.createSequentialGroup()
																		.addGap(67, 67, 67)
																		.addComponent(jRadioButton1)
																		.addGap(41, 41, 41)
																		.addComponent(jRadioButton2)))
										.addContainerGap(67, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Connection connection = null;
		try {
			Comm comm = new Comm();
			comm.setComtype(jComboBox1.getSelectedItem() + "");
			if (jTextField1.getText() == null
					|| jTextField1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "商品名填写错误");
				return;
			}
			comm.setComnameString(jTextField1.getText());
			comm.setComdesc(jTextArea1.getText());
			if (jTextField2.getText() == null
					|| jTextField2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "单价填写错误");
				return;
			}
			comm.setPrice(Float.parseFloat(jTextField2.getText()));
			if (jTextField3.getText() == null
					|| jTextField3.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "数量填写错误");
				return;
			}
			comm.setCount(Integer.parseInt(jTextField3.getText()));
			comm
					.setUseyear(Integer.parseInt(jComboBox2.getSelectedItem()
							+ ""));
			comm.setUsemonth(Integer
					.parseInt(jComboBox3.getSelectedItem() + ""));
			if (jTextField4.getText() == null
					|| jTextField4.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "联系人填写错误");
				return;
			}
			comm.setAuthor(jTextField4.getText());
			if (jTextField5.getText() == null
					|| jTextField5.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "联系电话填写错误");
				return;
			}
			comm.setPhone(jTextField5.getText());
			if (jRadioButton1.isSelected()) {
				comm.setSex("男");
			} else {
				comm.setSex("女");
			}
			Dbutil dbutil = new Dbutil();
			connection = dbutil.getCon();
			CommDao commDao = new CommDao();
			if(jButton1.getText().equals("提交"))
			{
				if (commDao.ComAdd(connection, comm) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
			}
			else
			{
				comm.setId(Integer.parseInt(id));
				if (commDao.comupdata(connection, comm) == 1) {
					JOptionPane.showMessageDialog(null, "修改成功");
				}
				else
					JOptionPane.showMessageDialog(null, "修改不成功");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "添加失败");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		jRadioButton2.setSelected(false);
	}

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		jRadioButton1.setSelected(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private JButton jButton1;
	private JButton jButton2;
	@SuppressWarnings("rawtypes")
	private JComboBox jComboBox1;
	@SuppressWarnings("rawtypes")
	private JComboBox jComboBox2;
	@SuppressWarnings("rawtypes")
	private JComboBox jComboBox3;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}