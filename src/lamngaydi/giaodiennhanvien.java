/*
 * Created by JFormDesigner on Sat Apr 11 09:46:05 ICT 2015
 */

package lamngaydi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author hung pham
 */
public class giaodiennhanvien extends JFrame {
     giaodiendanhsach noi;
     nhanvienkhongbiet met;
     private giaodiendanhsach ho;
     private ButtonGroup khong;
 	private ButtonGroup can;
 	private DefaultListModel<nhanvienkhongbiet> list1;
 	private JList<nhanvienkhongbiet> list2;
 	private phongban pb;
 	private toikhongbiet toi;
 	private nhanvienkhongbiet nv;
	public giaodiennhanvien(toikhongbiet khi) {
		toi=khi;
		initComponents();
	}
  public DefaultListModel<nhanvienkhongbiet> thi(){
	  return list1;
  }
	private void button1ActionPerformed(ActionEvent e) {
		if(textField1.getText().toString().equals("")||textField2.getText().toString().equals("")||textField3.getText().toString().equals("")||
				(!radioButton2.isSelected()&&!radioButton3.isSelected()&&!radioButton4.isSelected())||(!radioButton5.isSelected()&&!radioButton1.isSelected()))
			 JOptionPane.showMessageDialog(getParent(), "ban vui long dieu day du thong tin");
		else{
		
			pb=toi.layphongban();
			String str;
			if(radioButton3.isSelected()) str=radioButton3.getText();
			else if(radioButton2.isSelected()) str=radioButton2.getText();
			else str=radioButton4.getText();
			String str1;
			if(radioButton5.isSelected()) str1=radioButton5.getText();
			else str1=radioButton1.getText();
		    met=new nhanvienkhongbiet(pb.gettenpb(),textField1.getText().toString(),textField2.getText().toString(),textField3.getText().toString(),str,str1);
			 //nv=new nhanvienkhongbiet(pb.gettenpb(),textField1.getText().toString(),textField2.getText().toString(),str1,str,textField3.getText().toString());
			list1.addElement(met);
			list2.setModel(list1);
			if(radioButton3.isSelected())
			{
				
				toi.capnhap(pb.getmapb(),pb.gettenpb(),textField1.getText().toString(),pb.getsonv()+1);
			}
			else toi.capnhap(pb.getmapb(),pb.gettenpb(),pb.gettruongphong(),pb.getsonv()+1);
			toi.capnhaptiep(pb.gettenpb(),textField1.getText().toString(),textField2.getText().toString(),str1,str,textField3.getText().toString());
			this.dispose();
			toi.setVisible(true);
		}
		 
	}
 
	private void button2ActionPerformed(ActionEvent e) {
		toi.setVisible(true);
		this.dispose();
	}

	private void textField3KeyPressed(KeyEvent e) {
		int i=1;
		if(!textField3.getText().equals("0")&&!textField3.getText().equals("1")&&!textField3.getText().equals("2")
				&&!textField3.getText().equals("3")&&!textField3.getText().equals("4")&&!textField3.getText().equals("5")
				&&!textField3.getText().equals("6")&&!textField3.getText().equals("7")&&!textField3.getText().equals("8")
				&&!textField3.getText().equals("9"))
			{
			JOptionPane.showMessageDialog(getParent(),"ban nhap sai ki tu vua roi");
		       textField3.remove(i);
		     }
		else i++;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - hung pham
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		label3 = new JLabel();
		textField3 = new JTextField();
		radioButton3 = new JRadioButton();
		radioButton4 = new JRadioButton();
		radioButton1 = new JRadioButton();
		label4 = new JLabel();
		radioButton2 = new JRadioButton();
		label5 = new JLabel();
		radioButton5 = new JRadioButton();
		button1 = new JButton();
		button2 = new JButton();
        list1=new DefaultListModel<nhanvienkhongbiet>();
        list2=new JList<nhanvienkhongbiet>();
        ButtonGroup khong=new ButtonGroup();
     	ButtonGroup can=new ButtonGroup();
		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- label1 ----
		label1.setText("Ten Nhan Vien:");
		contentPane.add(label1);
		label1.setBounds(50, 45, 90, label1.getPreferredSize().height);
		contentPane.add(textField1);
		textField1.setBounds(180, 45, 125, textField1.getPreferredSize().height);

		//---- label2 ----
		label2.setText("Ma Nhan Vien:");
		contentPane.add(label2);
		label2.setBounds(50, 85, 85, label2.getPreferredSize().height);
		contentPane.add(textField2);
		textField2.setText(toi.layphongban().getmapb()+toi.layphongban().getsonv());
		textField2.disable();
		textField2.setBounds(180, 85, 125, textField2.getPreferredSize().height);

		//---- label3 ----
		label3.setText("So Dien Thoai:");
		contentPane.add(label3);
		label3.setBounds(55, 130, 80, label3.getPreferredSize().height);

		//---- textField3 ----
		textField3.setText("0");
		textField3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				textField3KeyPressed(e);
			}
		});
		contentPane.add(textField3);
		textField3.setBounds(180, 125, 125, textField3.getPreferredSize().height);

		//---- radioButton3 ----
		radioButton3.setText("Truong Phong");
		contentPane.add(radioButton3);
		radioButton3.setBounds(75, 175, 100, radioButton3.getPreferredSize().height);
        khong.add(radioButton3);
		//---- radioButton4 ----
		radioButton4.setText("Pho Phong");
		contentPane.add(radioButton4);
		radioButton4.setBounds(180, 175, 80, 20);
        khong.add(radioButton4);
		//---- radioButton1 ----
		radioButton1.setText("Nam");
		contentPane.add(radioButton1);
		radioButton1.setBounds(75, 215, 50, radioButton1.getPreferredSize().height);
        can.add(radioButton1);
		//---- label4 ----
		label4.setText("Chuc Vu:");
		contentPane.add(label4);
		label4.setBounds(new Rectangle(new Point(60, 150), label4.getPreferredSize()));

		//---- radioButton2 ----
		radioButton2.setText("Nhan Vien");
		contentPane.add(radioButton2);
		radioButton2.setBounds(265, 175, 80, radioButton2.getPreferredSize().height);
        khong.add(radioButton2);
		//---- label5 ----
		label5.setText("Gioi Tinh:");
		contentPane.add(label5);
		label5.setBounds(new Rectangle(new Point(60, 195), label5.getPreferredSize()));

		//---- radioButton5 ----
		radioButton5.setText("Nu");
		contentPane.add(radioButton5);
		radioButton5.setBounds(185, 215, 70, radioButton5.getPreferredSize().height);
        can.add(radioButton5);
		//---- button1 ----
		button1.setText("Save");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button1ActionPerformed(e);
			}
		});
		contentPane.add(button1);
		button1.setBounds(255, 245, 75, button1.getPreferredSize().height);

		//---- button2 ----
		button2.setText("Cancel");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button2ActionPerformed(e);
			}
		});
		contentPane.add(button2);
		button2.setBounds(new Rectangle(new Point(180, 245), button2.getPreferredSize()));

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - hung pham
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label3;
	private JTextField textField3;
	private JRadioButton radioButton3;
	private JRadioButton radioButton4;
	private JRadioButton radioButton1;
	private JLabel label4;
	private JRadioButton radioButton2;
	private JLabel label5;
	private JRadioButton radioButton5;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	//lay doi tuong hientai
	public giaodiennhanvien lay(){
		return this;
	}
}
