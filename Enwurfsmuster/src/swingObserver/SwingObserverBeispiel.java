package swingObserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverBeispiel {
	
	private JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingObserverBeispiel beispiel = new SwingObserverBeispiel();
		beispiel.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Soll ich es tun?");
		button.addActionListener(new EngelListener());
		button.addActionListener(new TeufelListener());
		
		JButton buttonLamda = new JButton("Lamda: Soll ich es tun?");
		buttonLamda.addActionListener(event -> System.out.println("Tu es nicht, du könntest es bereuen!"));
		buttonLamda.addActionListener(event -> System.out.println("Los, mach es!"));
		
		frame.add(button);
		frame.add(buttonLamda);
		
		frame.setSize(300, 300);
		frame.setTitle("Fenster");
		frame.setVisible(true);
		
	}
	
	class EngelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Tu es nicht, du könntest es bereuen!");
		}
	}
	
	class TeufelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Los, mach es!");
		}
	}

}
