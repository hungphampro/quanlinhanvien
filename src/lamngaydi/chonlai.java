/*
 * Created by JFormDesigner on Fri Apr 17 21:21:37 ICT 2015
 */

package lamngaydi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author hung pham
 */
public class chonlai extends JFrame {
	toikhongbiet gi;
	private ButtonGroup thachthuc;
	int k,h;
	public chonlai(toikhongbiet nen,int t,int l) {
		k=t;
		h=l;
		gi=nen;
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		if(!radioButton1.isSelected()&&!radioButton2.isSelected()&&!radioButton3.isSelected())
			JOptionPane.showMessageDialog(getParent(), "ban phai chon mot chuc vu de luu ");
		else if(radioButton1.isSelected()) {
			this.dispose();
			gi.setVisible(true);
		}
		else if(radioButton2.isSelected()){
		    gi.the().get(k).setchucvu(radioButton2.getText());
			this.dispose();
			batdaunao hung=new batdaunao(gi,h);
			hung.setVisible(true);
		}
		else if(radioButton3.isSelected())
		{
			gi.the().get(k).setchucvu(radioButton3.getText());
			this.dispose();
			batdaunao hung=new batdaunao(gi,h);
			hung.setVisible(true);
		}
	}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - hung pham
		panel1 = new JPanel();
		label1 = new JLabel();
		radioButton1 = new JRadioButton();
		radioButton2 = new JRadioButton();
		radioButton3 = new JRadioButton();
		button1 = new JButton();
        khong=new ButtonGroup();
		//======== this ========
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

			//---- label1 ----
			label1.setText("chon lai chuc vu cho nhan vien nao");
			panel1.add(label1);
			label1.setBounds(90, 15, 215, label1.getPreferredSize().height);

			//---- radioButton1 ----
			radioButton1.setText("Truong phong");
			panel1.add(radioButton1);
			radioButton1.setBounds(50, 70, 105, radioButton1.getPreferredSize().height);
            khong.add(radioButton1);
			//---- radioButton2 ----
			radioButton2.setText("Pho phong");
			panel1.add(radioButton2);
			radioButton2.setBounds(160, 70, 90, radioButton2.getPreferredSize().height);
            khong.add(radioButton2);
			//---- radioButton3 ----
			radioButton3.setText("Nhan vien");
			panel1.add(radioButton3);
			radioButton3.setBounds(255, 70, 85, radioButton3.getPreferredSize().height);
            khong.add(radioButton3);
			//---- button1 ----
			button1.setText("CHON");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});
			panel1.add(button1);
			button1.setBounds(275, 100, 55, button1.getPreferredSize().height);

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
	private JLabel label1;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private JButton button1;
	private ButtonGroup khong;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
