// Java 17

package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class giris1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField input_userPasw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giris1 frame = new giris1();
					frame.setSize(800,494);
					frame.setResizable(false);
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
	public giris1() {
		setTitle("Giriş Sayfası");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(28, 113, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField input_userNa = new JFormattedTextField();
		input_userNa.setFont(new Font("Dialog", Font.BOLD, 14));
		input_userNa.setBounds(491, 73, 254, 33);
		contentPane.add(input_userNa);
		
		Label label = new Label("Kullanıcı Adı");
		label.setForeground(new Color(246, 245, 244));
		label.setFont(new Font("Dialog", Font.PLAIN, 26));
		label.setBounds(491, 27, 218, 40);
		contentPane.add(label);
		
		input_userPasw = new JPasswordField();
		input_userPasw.setFont(UIManager.getFont("PasswordField.font"));
		input_userPasw.setBounds(491, 199, 254, 33);
		contentPane.add(input_userPasw);
		
		Label label_1 = new Label("Şifre");
		label_1.setForeground(new Color(246, 245, 244));
		label_1.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1.setBounds(491, 148, 218, 40);
		contentPane.add(label_1);
		
		Button btnLogin = new Button("Giriş");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] passwordGet = input_userPasw.getPassword();
				String password = new String(passwordGet);
				
				if(input_userNa.getText().equals(user.userName) && password.equals(user.userPassword)) {
					System.out.println("Giriş Başarılı");
					hello giris_basarili = new hello();
					giris_basarili.setVisible(true);
				}else {
					System.out.println("Giriş Başarısız");
				}
			}
		});
		btnLogin.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnLogin.setBackground(new Color(255, 163, 72));
		btnLogin.setForeground(new Color(246, 245, 244));
		btnLogin.setBounds(491, 270, 113, 40);
		contentPane.add(btnLogin);
		
		Label Title_2 = new Label("Java Login App");
		Title_2.setAlignment(Label.CENTER);
		Title_2.setBackground(new Color(46, 194, 126));
		Title_2.setFont(new Font("Dialog", Font.BOLD, 40));
		Title_2.setForeground(new Color(246, 245, 244));
		Title_2.setBounds(28, 0, 396, 211);
		contentPane.add(Title_2);
		
		Label label_2_1 = new Label("Giriş");
		label_2_1.setBackground(new Color(46, 194, 126));
		label_2_1.setAlignment(Label.CENTER);
		label_2_1.setForeground(new Color(246, 245, 244));
		label_2_1.setFont(new Font("Dialog", Font.BOLD, 33));
		label_2_1.setBounds(28, 148, 396, 211);
		contentPane.add(label_2_1);
		
		Label detay_2 = new Label("");
		detay_2.setBackground(new Color(255, 255, 102));
		detay_2.setBounds(-60, 422, 315, 161);
		contentPane.add(detay_2);
		
		Label detay_1 = new Label("");
		detay_1.setBackground(new Color(248, 228, 92));
		detay_1.setBounds(-108, 406, 389, 261);
		contentPane.add(detay_1);
		
		Label label_3 = new Label("");
		label_3.setBackground(new Color(46, 194, 126));
		label_3.setBounds(0, 0, 472, 456);
		contentPane.add(label_3);
	}
}
