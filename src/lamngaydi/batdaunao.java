/*
 * Created by JFormDesigner on Thu Apr 16 20:51:53 ICT 2015
 */

package lamngaydi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author hung pham
 */
public class batdaunao extends JFrame {
	private toikhongbiet nen;
	private ButtonGroup chung,tinh;
	private JRadioButton b1[]=new JRadioButton[20];
	private JRadioButton b2[]=new JRadioButton[20];
	int k;
	public batdaunao(toikhongbiet gi,int j) {
		k=j;
		nen=gi;
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		if(k==1)
		{
		for(int i=0;i<=b1.length;i++)
		if(b1[i].isSelected())
		{
			nen.the().get(i).setchucvu("Truong Phong");
			nen.capnhap(nen.layphongban().getmapb(),nen.layphongban().gettenpb(),b1[i].getText(), nen.layphongban().getsonv());
			break;
		}
		}
		else{
			int z=0;
			for(;z<nen.the().size();z++)
			{
			if(nen.layphongban().gettenpb().equals(nen.the().get(z).getPhongban()))
			{
			if(nen.the().get(z).getchucvu().equals("Nhan Vien"))
			{
			if(b2[z].isSelected())
			nen.the().get(z).setchucvu("Pho Phong");
		   }
		}
		}
		}
		nen.setVisible(true);
		this.dispose();
	}

	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - hung pham
		panel1 = new JPanel();
		label1 = new JLabel();
		button1 = new JButton();
        chung=new ButtonGroup();
        //tinh=new ButtonGroup();
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
			label1.setText("Danh sach ung vien cua phong ban de ban co the chon ");
			panel1.add(label1);
			label1.setBounds(30, 10, 315, 30);
           //radioButton nhan vien
			if(k==1) chontruongphong();
			else chonphophong();
			
			//---- button1 ----
			button1.setText("LUU LAI");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});
			panel1.add(button1);
			button1.setBounds(250, 220, 90, button1.getPreferredSize().height);

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
	private JButton button1;
	
	public void chontruongphong(){
		int j=0;
		int z=0;
		for(;z<nen.the().size();z++)
		{
		if(nen.layphongban().gettenpb().equals(nen.the().get(z).getPhongban()))
		{
		b1[j]=new JRadioButton();
		b1[j].setText(nen.the().get(z).gettennv());
		b1[j].setBounds(50,30+30*z, 100,b1[z].getPreferredSize().height);
		chung.add(b1[j]);
		panel1.add(b1[j]);
		j=j+1;
		}
		}
	}
	public void chonphophong(){
		int j=0;
		int z=0;
		for(;z<nen.the().size();z++)
		{
		if(nen.layphongban().gettenpb().equals(nen.the().get(z).getPhongban()))
		{
		if(nen.the().get(z).getchucvu().equals("Nhan Vien"))
		{
		b2[z]=new JRadioButton();
		b2[z].setText(nen.the().get(z).gettennv());
		b2[z].setBounds(50,30+30*j, 100,b2[z].getPreferredSize().height);
		panel1.add(b2[z]);
		j=j+1;
		}
		}
		}
		
	}
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
