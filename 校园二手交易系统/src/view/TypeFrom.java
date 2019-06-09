/*
 * TypeFrom.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.JOptionPane;

import bean.ComType;
import dao.ComTypeDao;
import util.Dbutil;

/**
 *
 * @author  __USER__
 */
public class TypeFrom extends JInternalFrame {

	/** Creates new form TypeFrom */
	public TypeFrom() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jTextField1 = new JTextField();
		jScrollPane1 = new JScrollPane();
		jTextArea1 = new JTextArea();
		jButton1 = new JButton();
		jButton2 = new JButton();

		setClosable(true);
		setForeground(java.awt.Color.white);
		setIconifiable(true);

		jLabel1.setText("\u7c7b\u578b\u540d\u79f0");

		jLabel2.setText("\u7c7b\u578b\u63cf\u8ff0");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton1.setText("\u6dfb\u52a0");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u91cd\u7f6e");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(78, 78, 78)
										.addGroup(
												layout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addComponent(jLabel2))
										.addGap(34, 34, 34)
										.addGroup(
												layout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				34,
																				34,
																				34)
																		.addComponent(
																				jButton2))
														.addGroup(
																layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				jTextField1)
																		.addComponent(
																				jScrollPane1,
																				GroupLayout.DEFAULT_SIZE,
																				233,
																				Short.MAX_VALUE)))
										.addContainerGap(96, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(51, 51, 51)
										.addGroup(
												layout
														.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2)
														.addComponent(
																jScrollPane1,
																GroupLayout.PREFERRED_SIZE,
																149,
																GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addGroup(
												layout
														.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton1))
										.addContainerGap(50, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(ActionEvent evt) {
		ComType comtype=new ComType(jTextField1.getText(),jTextArea1.getText());
		ComTypeDao comTypeDao=new ComTypeDao();
		Dbutil dbutil=new Dbutil();
		try {
			Connection connection=dbutil.getCon();
			if(comTypeDao.ComTypeAdd(connection, comtype)==1)
			{
				JOptionPane.showMessageDialog(null, "添加成功");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "添加失败，此类型已经存在");
		}
		
		
	}

	private void jButton2ActionPerformed(ActionEvent evt) {
		jTextArea1.setText("");
		jTextField1.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private JButton jButton1;
	private JButton jButton2;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}