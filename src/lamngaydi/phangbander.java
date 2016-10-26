package lamngaydi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class phangbander extends JPanel implements ListCellRenderer<phongban> {

	//private JLabel lbIcon = new JLabel();
	private JLabel lbName = new JLabel();
	private JLabel lbAuthor = new JLabel();
	private JLabel soluong=new JLabel();
	private JLabel truongphong=new JLabel();
	
	private JPanel panelText;

	public phangbander() {
		setLayout(new BorderLayout(2, 2));

		panelText = new JPanel(new GridLayout(0, 1));
		panelText.add(lbName);
		panelText.add(lbAuthor);
		panelText.add(truongphong);
		panelText.add(soluong);
		add(panelText, BorderLayout.CENTER);
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends phongban> list,
			phongban book, int index, boolean isSelected, boolean cellHasFocus) {
		lbName.setText("TenPhongBan:"+book.gettenpb());
		lbName.setForeground(Color.green);
		lbAuthor.setText("MaSo:"+book.getmapb());
		lbAuthor.setForeground(Color.blue);
		truongphong.setText("TruongPhong:"+book.gettruongphong());
        truongphong.setForeground(Color.red);
        soluong.setText("soluong:"+book.getsonv());
        soluong.setForeground(Color.LIGHT_GRAY);
		// set Opaque to change background color of JLabel
		lbName.setOpaque(true);
		lbAuthor.setOpaque(true);
        truongphong.setOpaque(true);
        soluong.setOpaque(true);
		// when select item
		if (isSelected) {
			lbName.setBackground(list.getSelectionBackground());
			lbAuthor.setBackground(list.getSelectionBackground());
			truongphong.setBackground(list.getSelectionBackground());
			soluong.setBackground(list.getSelectionBackground());
			//panelIcon.setBackground(list.getSelectionBackground());
		} else { // when don't select
			lbName.setBackground(list.getBackground());
			lbAuthor.setBackground(list.getBackground());
			truongphong.setBackground(list.getBackground());
			soluong.setBackground(list.getBackground());
			//panelIcon.setBackground(list.getBackground());
		}
		return this;
	}
}
