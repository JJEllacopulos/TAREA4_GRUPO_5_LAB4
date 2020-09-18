package Pack;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
public class Principal extends JFrame {
	
	Ventana frame;
	private static DefaultListModel<Genero_pelicula> listModel;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					listModel=new DefaultListModel<Genero_pelicula>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}





