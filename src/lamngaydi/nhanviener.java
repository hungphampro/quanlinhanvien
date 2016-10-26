package lamngaydi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class nhanviener extends JPanel implements ListCellRenderer<nhanvienkhongbiet> {

	private JLabel lbIcon = new JLabel();
	private JLabel lbName = new JLabel();
	private JLabel lbms = new JLabel();
	private JLabel chucvu=new JLabel();
	private JLabel sdt=new JLabel();
	
	private JPanel panelText;

	public nhanviener() {
		setLayout(new BorderLayout(2, 2));

		panelText = new JPanel(new GridLayout(0, 1));
		panelText.add(lbName);
		panelText.add(lbms);
		panelText.add(sdt);
		panelText.add(chucvu);
		panelText.add(lbIcon);
		add(panelText, BorderLayout.CENTER);
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends nhanvienkhongbiet> list,
			nhanvienkhongbiet book, int index, boolean isSelected, boolean cellHasFocus) {
		lbName.setText("TenNhanVien:"+book.gettennv());
		lbName.setForeground(Color.green);
		lbms.setText("MaSo:"+book.getmanhv());
		lbms.setForeground(Color.blue);
		sdt.setText("SoDienThoai:"+book.getsdt());
        sdt.setForeground(Color.red);
        chucvu.setText("ChucVu:"+book.getchucvu());
        chucvu.setForeground(Color.LIGHT_GRAY);
        if(book.getgt().toString().equals("Nam"))
        {
        	lbIcon.setIcon(new ImageIcon(getClass().getResource("/khongco/boyicon.png")));
        }
        else{
        	lbIcon.setIcon(new ImageIcon(getClass().getResource("/khongco/girlicon.png")));
        	}
		// set Opaque to change background color of JLabel
		lbName.setOpaque(true);
		lbms.setOpaque(true);
        sdt.setOpaque(true);
        chucvu.setOpaque(true);
        lbIcon.setOpaque(true);
		// when select item
		if (isSelected) {
			lbName.setBackground(list.getSelectionBackground());
			lbms.setBackground(list.getSelectionBackground());
			sdt.setBackground(list.getSelectionBackground());
			chucvu.setBackground(list.getSelectionBackground());
			lbIcon.setBackground(list.getSelectionBackground());
			//panelIcon.setBackground(list.getSelectionBackground());
		} else { // when don't select
			lbName.setBackground(list.getBackground());
			lbms.setBackground(list.getBackground());
			sdt.setBackground(list.getBackground());
			chucvu.setBackground(list.getBackground());
			lbIcon.setBackground(list.getBackground());
			//panelIcon.setBackground(list.getBackground());
		}
		return this;
	}
}
