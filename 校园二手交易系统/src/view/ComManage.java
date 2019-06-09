/*
 * ComManage.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.CommDao;
import util.Dbutil;

/**
 *
 * @author  __USER__
 */
public class ComManage extends javax.swing.JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form ComManage */
	MainFrom f;

	public ComManage() {
		initComponents();
		filltable();
	}

	private void filltable() {
		DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1
				.getModel();
		defaultTableModel.setRowCount(0);
		Dbutil dbutil = new Dbutil();
		Connection connection = null;
		CommDao commDao = new CommDao();
		try {
			connection = dbutil.getCon();
			ResultSet resultSet = commDao.GetComResultSet(connection);
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getInt(1));
				a.add(resultSet.getString(4));
				a.add(resultSet.getString(2));
				a.add(resultSet.getString(3));
				a.add(resultSet.getInt(10) + "-" + resultSet.getInt(11));
				a.add(resultSet.getFloat(6));
				a.add(resultSet.getInt(5));
				a.add(resultSet.getString(7));
				a.add(resultSet.getString(8));
				defaultTableModel.addRow(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	private void filltable(String s) {
		DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1
				.getModel();
		defaultTableModel.setRowCount(0);
		Dbutil dbutil = new Dbutil();
		Connection connection = null;
		CommDao commDao = new CommDao();
		try {
			connection = dbutil.getCon();
			ResultSet resultSet = commDao.GetComResultSet(connection, s);
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getInt(1));
				a.add(resultSet.getString(4));
				a.add(resultSet.getString(2));
				a.add(resultSet.getString(3));
				a.add(resultSet.getInt(10) + "-" + resultSet.getInt(11));
				a.add(resultSet.getFloat(6));
				a.add(resultSet.getInt(5));
				a.add(resultSet.getString(7));
				a.add(resultSet.getString(8));
				defaultTableModel.addRow(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);

		jLabel1.setText("\u5546\u54c1\u540d");

		jButton1.setText("\u67e5\u627e");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {}, new String[] { "编号", "类型", "商品名", "商品描述    ", "生产日期", "单价",
						"数量", "联系人", "电话" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jTable1MousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jLabel2.setText("\u7f16\u53f7");

		jTextField2.setEnabled(false);

		jLabel3.setText("\u5546\u54c1\u540d");

		jButton2.setText("\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u5220\u9664");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u53d6\u6d88");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(108, 108, 108)
										.addComponent(jLabel1)
										.addGap(43, 43, 43)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												201,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(57, 57, 57)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												137,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																795,
																Short.MAX_VALUE)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												169,
																												169,
																												169)
																										.addComponent(
																												jButton2)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton3))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												78,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												112,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												117,
																												117,
																												117)
																										.addComponent(
																												jLabel3)))
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												32,
																												32,
																												32)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												214,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												71,
																												71,
																												71)
																										.addComponent(
																												jButton4)))
																		.addGap(
																				201,
																				201,
																				201)))));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(22, 22, 22)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1)
														.addComponent(jLabel1))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												328,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				25,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel3)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(34, 34, 34)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton4)
														.addComponent(jButton2))
										.addContainerGap(48, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		if(jTextField2.getText().equals("")||jTextField2.getText()==null)
		{
			JOptionPane.showMessageDialog(null, "没有选择商品");
			return ;
		}
		f.createcomadd(jTextField2.getText());
		dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		Connection connection = null;
		Dbutil dbutil = new Dbutil();
		CommDao commDao = new CommDao();
		try {
			connection = dbutil.getCon();
			if (commDao.comdelete(connection, jTextField2.getText()) == 1) {
				JOptionPane.showMessageDialog(null, "删除成功");
				filltable();
			} else {
				JOptionPane.showMessageDialog(null, "删除不成功");
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
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jTable1MousePressed(java.awt.event.MouseEvent evt) {
		int row = jTable1.getSelectedRow();
		jTextField2.setText(jTable1.getValueAt(row, 0) + "");
		jTextField3.setText(jTable1.getValueAt(row, 1) + "");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jTextField1.getText().equals("") || jTextField1.getText() == null) {
			JOptionPane.showMessageDialog(null, "商品名不能为空");
			return;
		}
		filltable(jTextField1.getText());
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}