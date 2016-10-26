/*
 * Created by JFormDesigner on Mon Apr 13 23:36:40 ICT 2015
 */

package lamngaydi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author hung pham
 */
public class giaodiendanhsach extends JFrame {
	private toikhongbiet nen;
	private giaodiennhanvien co;
	nhanvienkhongbiet nv;
	private DefaultListModel<nhanvienkhongbiet> list2,list3;
	public giaodiendanhsach(toikhongbiet ca) {
		nen=ca;
		initComponents();
		
	}
	
    
	private void button1ActionPerformed(ActionEvent e) {
		list2=nen.the();
		list3=new DefaultListModel<nhanvienkhongbiet>();
		for(int i=0;i<list2.size();i++)
		{
			//JOptionPane.showMessageDialog(getParent(), "co nhan vien:");
			if(nen.layphongban().gettenpb().equals(list2.get(i).getPhongban())){
				list3.addElement(list2.get(i));
				list1.setModel(list3);
				list1.setCellRenderer(new nhanviener());
			}
		}
		
	}
	
	@Override
	public synchronized void addWindowListener(WindowListener arg0) {
		super.addWindowListener(arg0);
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - hung pham
		panel1 = new JPanel();
		scrollPane1 = new JScrollPane();
		list1 = new JList<nhanvienkhongbiet>();
		list2=new DefaultListModel<nhanvienkhongbiet>();
		list3=new DefaultListModel<nhanvienkhongbiet>();
		label1 = new JLabel();
		button1 = new JButton();

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

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(list1);
			}
			panel1.add(scrollPane1);
			scrollPane1.setBounds(0, 65, 385, 205);

			//---- label1 ----
			label1.setText("Danh sach nhan vien.");
			panel1.add(label1);
			label1.setBounds(130, 5, 265, label1.getPreferredSize().height);

			//---- button1 ----
			button1.setText("Hien thi");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});
			panel1.add(button1);
			button1.setBounds(130, 25, 140, button1.getPreferredSize().height);

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
		nen.setVisible(true);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - hung pham
	private JPanel panel1;
	private JScrollPane scrollPane1;
	private JList<nhanvienkhongbiet> list1;
	//private DefaultListModel<nhavienkhongbiet> list3;
	private JLabel label1;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
class nhanvienkhongbiet{
	private String phongban;
	private String tennv;
	private String manhv;
	private String gt;
	private String chucvu;
	private String sdt;
	
	public nhanvienkhongbiet(String phongban,String tennv,String manhv,String gt,String chucvu,String sdt){
		this.phongban=phongban;
		this.tennv=tennv;
		this.manhv=manhv;
		this.gt=gt;
		this.chucvu=chucvu;
		this.sdt=sdt;
	}
	public void setphongban(String phongban){
		this.phongban=phongban;
	}
	public String getPhongban(){
		return phongban;
	}
	public void settennv(String tennv){
		this.tennv=tennv;
	}
	public String gettennv(){
		return tennv;
	}
	public void setmanhv(String manhv){
		this.manhv=manhv;
	}
	public String getmanhv(){
		return manhv;
	}
	public void setchucvu(String chucvu){
		this.chucvu=chucvu;
	}
	public String getchucvu(){
		return chucvu;
	}
	public void setsdt(String sdt){
		this.sdt=sdt;
	}
	public String getsdt(){
		return sdt;
	}
	public void setgt(String gt){
		this.gt=gt;
	}
	public String getgt(){
		return gt;
	}
	@Override
	public String toString(){
		return tennv+"--"+manhv+"--"+chucvu+"--"+"--"+sdt+"--"+gt;
	}
	
}

