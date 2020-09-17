package Pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	
	
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenuPeliculas = new JMenu("Peliculas");
		menuBar.add(mnMenuPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				
				Peliculas_agregar pan_agregar = new Peliculas_agregar();
				contentPane.add(pan_agregar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		
		mnMenuPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				
				Peliculas_listar pan_agregar = new Peliculas_listar();
				contentPane.add(pan_agregar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnMenuPeliculas.add(mntmListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
