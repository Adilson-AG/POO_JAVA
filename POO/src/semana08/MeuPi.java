package semana08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeuPi extends JFrame{

	private JButton btOriginal;
	private BotaoPi btPersonal;

	public MeuPi() {
		setTitle("projeto Interdisciplinar");
		setBounds(0,0,500,300);
		setResizable(false);
		setLayout(null);
		btOriginal = new JButton("Original");
		btPersonal = new BotaoPi("personal");
		btOriginal.setBounds(10,10,100,25);
		btPersonal.setBounds(10,50,100,25);
		add(btOriginal);
		add(btPersonal);
		definirEventos();

	}

	public void definirEventos() {
		btOriginal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btOriginal,"original");

			}
		});
		btPersonal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btPersonal,"personal");

			}
		});
	}
	public static void main(String[] args) {

		MeuPi pi = new MeuPi();
		pi.setVisible(true);






	}

}
