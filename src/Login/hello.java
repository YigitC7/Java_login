package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class hello extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello frame = new hello();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hello() {
		setBackground(new Color(255, 120, 0));
		setTitle("Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 346);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 120, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giriş Başarılı");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 43));
		lblNewLabel.setForeground(new Color(246, 245, 244));
		lblNewLabel.setBounds(92, 112, 349, 82);
		contentPane.add(lblNewLabel);
	}

}
