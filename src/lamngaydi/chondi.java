/*
 * Created by JFormDesigner on Wed Apr 15 20:58:57 ICT 2015
 */

package lamngaydi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author hung pham
 */
public class chondi extends JFrame {
	private toikhongbiet thich;
	private ButtonGroup khong;
	private ButtonGroup can;
	int t=0;
	public chondi(toikhongbiet gi) {
		thich=gi;
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		this.dispose();
		int i=0;
		t=1;
		for(;i<thich.the().size();i++){
		     if(thich.layphongban().gettruongphong().equals(thich.the().get(i).gettennv())) break;
		}
		if(i<thich.the().size())
		{
			
	       JOptionPane.showMessageDialog(getParent(), "phong ban nay da co mot truong phong la :"+thich.the().get(i).gettennv());
			int cont=JOptionPane.showConfirmDialog(null, "Do you want to change "+thich.the().get(i).gettennv()+" toi vi tri moi","",JOptionPane.YES_NO_CANCEL_OPTION);
			  if(cont==JOptionPane.YES_OPTION)
			  { 
				  chonlai nao=new chonlai(thich,i,t);
				  nao.setVisible(true);
				  this.dispose();
			  }
		}
		else {
			batdaunao khi=new batdaunao(thich,t);
		    khi.setVisible(true);
		    this.dispose();
		    }
	}

	private void button2ActionPerformed(ActionEvent e) {
		t=2;
		batdaunao cung=new batdaunao(thich,t);
		cung.chonphophong();
	   cung.setVisible(true);
       	this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - hung pham
		label1 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- label1 ----
		label1.setText("Chon chuc vu ban muon thiet lap");
		contentPane.add(label1);
		label1.setBounds(85, 25, 200, label1.getPreferredSize().height);

		//---- button1 ----
		button1.setText("Truong Phong");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button1ActionPerformed(e);
			}
		});
		contentPane.add(button1);
		button1.setBounds(65, 55, 115, button1.getPreferredSize().height);

		//---- button2 ----
		button2.setText("Pho Phong");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button2ActionPerformed(e);
			}
		});
		contentPane.add(button2);
		button2.setBounds(210, 55, 110, button2.getPreferredSize().height);

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
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
