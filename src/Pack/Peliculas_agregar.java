package Pack;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Peliculas_agregar extends JPanel {
	private JTextField textField;

	Genero_pelicula genero_1;
	Genero_pelicula genero_2;
	Genero_pelicula genero_3;
	Genero_pelicula genero_4;
	Genero_pelicula genero_5;
	
	public Peliculas_agregar() {
		
		generos();
		
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
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setBounds(203, 24, 46, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(203, 62, 125, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(71, 147, 113, 31);
		add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(203, 97, 125, 20);
		add(comboBox);
		
		comboBox.addItem(genero_1);
		comboBox.addItem(genero_2);
		comboBox.addItem(genero_3);
		comboBox.addItem(genero_4);
		comboBox.addItem(genero_5);

	}
	
	private void generos() {
		
		genero_1 = new Genero_pelicula("Terror");
		genero_2 = new Genero_pelicula("Accion");
		genero_3 = new Genero_pelicula("Suspenso");
		genero_4 = new Genero_pelicula("Romantica");
		genero_5 = new Genero_pelicula("Thriller");
		
	}
	
}