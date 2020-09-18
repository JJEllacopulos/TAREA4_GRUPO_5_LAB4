package Pack;

import javax.swing.JPanel;



import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Peliculas_listar extends JPanel {
	
private  JList<Genero_pelicula> list;
private  DefaultListModel<Genero_pelicula> dlModel;
	
	public Peliculas_listar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peliculas:");
		lblNewLabel.setBounds(10, 92, 46, 14);
		add(lblNewLabel);
		
		 list = new JList<Genero_pelicula>();
		list.setBounds(90, 24, 277, 173);
 
		add(list);

	}
	public void setDefaultListModel(DefaultListModel<Genero_pelicula> listModel2)
	{
		this.dlModel = listModel2;
		list.setModel(this.dlModel);
	}
}
