package Pack;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
public class Principal extends JFrame {
	public Principal() {
	}
	
	Ventana frame;
	public static DefaultListModel<Peliculas> listModel = new DefaultListModel<Peliculas>();
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					listModel=new DefaultListModel<Peliculas>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}





