package Pack;
import javax.swing.JPanel;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;

public class Peliculas_agregar extends JPanel {
	
	private JTextField textField;
	private  DefaultListModel<Peliculas> listModel;
	private JComboBox<Categorias> comboBox;


	Peliculas peliculas = new Peliculas();
	
	public Peliculas_agregar() {
		
		//generos();
		
		setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(76, 24, 46, 14);
		add(lblId);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(76, 65, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Genero:");
		lblNewLabel_1.setBounds(76, 100, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(String.valueOf(peliculas.getId()));
		lblNewLabel_2.setBounds(203, 24, 46, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(203, 62, 125, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().isEmpty() && comboBox.getSelectedItem().toString()!="Seleccione un genero")
				{

					Peliculas pelicula = new Peliculas();
					pelicula.setNombre(textField.getText());
					pelicula.setCategorias(comboBox.getSelectedItem());
										
					listModel.addElement(pelicula);
					setDefaultListModel(listModel);
					textField.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null, "No se selecciono un genero o no se agrego nombre de pelicula");
					
				}
			
			}
		});
		btnNewButton.setBounds(71, 147, 113, 31);
		add(btnNewButton);
		
		comboBox = new JComboBox<Categorias>();
		comboBox.setBounds(203, 97, 125, 20);
	    
		
			add(comboBox);
			comboBox.addItem(new Categorias("Seleccione un genero"));
			comboBox.addItem(new Categorias("Terror"));
			comboBox.addItem(new Categorias("Accion"));
			comboBox.addItem(new Categorias("Suspenso"));
			comboBox.addItem(new Categorias("Romantica"));
			comboBox.addItem(new Categorias("Thriller"));


	}
	
	/*private void generos() {
		
		genero_1 = new Categorias("Seleccione un genero");
		genero_2 = new Categorias("Terror");
		genero_3 = new Categorias("Accion");
		genero_4 = new Categorias("Suspenso");
		genero_5 = new Categorias("Romantica");
		genero_6 = new Categorias("Thriller");
		
	}
	*/
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
	}
	
}
