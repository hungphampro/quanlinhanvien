/*
 * Created by JFormDesigner on Thu Apr 09 11:17:53 ICT 2015
 */

package lamngaydi;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.text.DefaultCaret;




/**
 * @author hung pham
 */
public class toikhongbiet extends JFrame {
	private int i;
	private giaodienmoi khongco;
	private phongban pn;
	public toikhongbiet(toikhongbiet gi) {
		gi=this;
		initComponents();
	}
	private void nhanluu(ActionEvent e) {
		int i=0;
		for(;i<list2.size();i++)
		{
			if(textField1.getText().toString().equals(list2.get(i).getmapb())) break;
		}
		if(i==list2.size())
		{
		pn=new phongban(textField1.getText().toString(),textField2.getText().toString(),"chuaco",0);
		textField1.setText("");
		textField2.setText("");
		list2.addElement(pn);
		list1.setModel(list2);
		list1.setCellRenderer(new phangbander());
		}
		else{
			JOptionPane.showMessageDialog(getParent(),"ma so phong ban da co.");
			textField1.setText("");
			textField2.setText("");
		    }
		//list1.add(vec);
		
	}
	//cap nhap lai phong ban hay la list khi ma bam nut luu ben kia
   public void capnhap(String str1,String str2,String str3,int i){
	  int t=list1.getSelectedIndex();
	  list2.remove(t);
	  pn=new phongban(str1,str2,str3,i);
	  list2.add(t, pn);
	  list1.setModel(list2);
	   
   }
   public void capnhaptiep(String str1,String str2,String str3,String str4,String str5,String str6){
	   nhanvienkhongbiet j=new nhanvienkhongbiet(str1,str2,str3,str4,str5,str6);
	   list4.addElement(j);
   }
   public DefaultListModel<nhanvienkhongbiet> the(){
	   return list4;
   }
   //lsy phong ban duoc chon
	public phongban layphongban(){
		int t=list1.getSelectedIndex();
		return list2.get(t);
	}
	//bat su kien kich chuot
	//tao dao dien la mot list
	private void list1MouseClicked(MouseEvent e) {
		  this.dispose();
		  khongco=new giaodienmoi(this);
		  khongco.setVisible(true);
	}
public void toisexoa(){
	int t=list1.getSelectedIndex();
	 list2.remove(t);
}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - hung pham
		panel1 = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		button1 = new JButton();
		scrollPane1 = new JScrollPane();
		list1 = new JList<phongban>();
		list3=new JList<nhanvienkhongbiet>();
		list4=new DefaultListModel<nhanvienkhongbiet>();
        list2=new DefaultListModel<phongban>();
      
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
			label1.setText("MA PHONG BAN:");
			panel1.add(label1);
			label1.setBounds(30, 60, 135, label1.getPreferredSize().height);
			panel1.add(textField1);
			textField1.setBounds(200, 55, 130, textField1.getPreferredSize().height);

			//---- label2 ----
			label2.setText("TEN PHONG BAN:");
			panel1.add(label2);
			label2.setBounds(30, 100, 110, label2.getPreferredSize().height);
			panel1.add(textField2);
			textField2.setBounds(200, 100, 130, textField2.getPreferredSize().height);

			//---- button1 ----
			button1.setText("LUU");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					nhanluu(e);
				}
			});
			panel1.add(button1);
			button1.setBounds(260, 145, 58, button1.getPreferredSize().height);

			//======== scrollPane1 ========
			{

				//---- list1 ----
				list1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						list1MouseClicked(e);
						
					}
				
				});
				scrollPane1.setViewportView(list1);
			}
			panel1.add(scrollPane1);
			scrollPane1.setBounds(0, 195, 385, 70);

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
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JButton button1;
	private JScrollPane scrollPane1;
	private JList<phongban> list1;
	private DefaultListModel<phongban> list2;
	private JList<nhanvienkhongbiet> list3;
	private DefaultListModel<nhanvienkhongbiet> list4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

public static void main(String args[]){
	toikhongbiet thi=new toikhongbiet(null);
	thi.setVisible(true);
	thi.pack();
}
}
class phongban{
	 private String tenpb;
	 private String mapb;
	 private String truongphong;
	 private int sonv;
	 public phongban(String mapb,String tenpb,String truongphong,int sonv){
		 super();
		 this.tenpb=tenpb;
		 this.mapb=mapb;
		 this.truongphong=truongphong;
		 this.sonv=sonv;
	 }
	 public void settenpb(String tenpb){
		 this.tenpb=tenpb;
	 }
	 public void setmapb(String mapb){
		 this.mapb=mapb;
	 }
	 public String  gettenpb(){
	return tenpb;	 
	 
    }
	 public String  getmapb(){
			return mapb;	 
			 
		}
	 public void settruongphong(String truongphong){
		 this.truongphong=truongphong;
	 }
	 public String gettruongphong(){
		 return truongphong;
	 }
	 public void setsonv(int sonv){
		 this.sonv=sonv; 
	 }
	 public int getsonv()
			 {
		 return sonv;
			 }
			 
	 @Override
	 public String toString(){
		 return tenpb+"-"+mapb+"-"+truongphong+"-"+sonv;
	 }
}
