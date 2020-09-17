package Pack;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Peliculas_listar extends JPanel {

	
	public Peliculas_listar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peliculas:");
		lblNewLabel.setBounds(10, 92, 46, 14);
		add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(90, 24, 277, 173);
		add(list);

	}
}
