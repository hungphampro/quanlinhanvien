/*
 * Created by JFormDesigner on Fri Apr 10 23:38:21 ICT 2015
 */

package lamngaydi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author hung pham
 */
public class giaodienmoi extends JFrame {
	private toikhongbiet gi;
	private giaodiennhanvien hoa;
	private giaodiendanhsach qua;
	private chondi trai;
	public giaodienmoi(toikhongbiet thi) {
		gi=thi;
		initComponents();
	}
	private void button1ActionPerformed(ActionEvent e) {
        this.dispose();
		hoa=new giaodiennhanvien(gi);
		hoa.setVisible(true);
	}

	private void button2ActionPerformed(ActionEvent e) {
		this.dispose();
		qua=new giaodiendanhsach(gi);
		qua.setVisible(true);
	}

	private void button3ActionPerformed(ActionEvent e) {
		this.dispose();
		trai=new chondi(gi);
		trai.setVisible(true);
	}

	private void button4ActionPerformed(ActionEvent e) {
		this.dispose();
		gi.toisexoa();
		gi.setVisible(true);
	}

	private void button5ActionPerformed(ActionEvent e) {
		this.dispose();
		
	}

	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - hung pham
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();

		//======== this ========
		setTitle("chon cong viec");
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== panel1 ========
		{

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panel1.setLayout(null);

			//---- button1 ----
			button1.setText("Them Moi Mot Nhan Vien");
			button1.setIcon(new ImageIcon(getClass().getResource("/khongco/add-icon.png")));
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});
			panel1.add(button1);
			button1.setBounds(0, 5, 225, button1.getPreferredSize().height);

			//---- button2 ----
			button2.setIcon(new ImageIcon(getClass().getResource("/khongco/Actions-view-list-icons-icon.png")));
			button2.setText("Danh Sach Nhan Vien  Phong  Ban");
			
			button2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button2ActionPerformed(e);
				}
			});
			panel1.add(button2);
			button2.setBounds(0, 55, 225, button2.getPreferredSize().height);

			//---- button3 ----
			button3.setText("Thiet Lap Truong Pho Phong Ban");
			button3.setIcon(new ImageIcon(getClass().getResource("/khongco/apply.png")));
			button3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button3ActionPerformed(e);
				}
			});
			panel1.add(button3);
			button3.setBounds(0, 105, 225, button3.getPreferredSize().height);

			//---- button4 ----
			button4.setText("Xoa Phong Ban");
			button4.setIcon(new ImageIcon(getClass().getResource("/khongco/Windows-Close-icon.png")));
			button4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button4ActionPerformed(e);
				}
			});
			panel1.add(button4);
			button4.setBounds(0, 155, 225, button4.getPreferredSize().height);

			//---- button5 ----
			button5.setIcon(new ImageIcon(getClass().getResource("/khongco/edit-validated-icon.png")));
			button5.setText("Sua Phong Ban");
			button5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button5ActionPerformed(e);
				}
			});
			panel1.add(button5);
			button5.setBounds(0, 205, 225, button5.getPreferredSize().height);
            
			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel1.getComponentCount(); i++) {
					Rectangle bounds = panel1.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel1.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel1.setMinimumSize(preferredSize);
				panel1.setPreferredSize(preferredSize);
			}
		}
		contentPane.add(panel1, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - hung pham
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
