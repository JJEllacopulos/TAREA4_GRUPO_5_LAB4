package Pack;

import javax.swing.JPanel;



import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Peliculas_listar extends JPanel {
	
private  JList<Peliculas> list;
private  DefaultListModel<Peliculas> dlModel;
	
	public Peliculas_listar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peliculas:");
		lblNewLabel.setBounds(10, 92, 46, 14);
		add(lblNewLabel);
		
		 list = new JList<Peliculas>();
		list.setBounds(90, 24, 277, 173);

 
		add(list);

	}
	public void setDefaultListModel(DefaultListModel<Peliculas> listModel2)
	{
		this.dlModel = listModel2;
		list.setModel(this.dlModel);
	}
}
