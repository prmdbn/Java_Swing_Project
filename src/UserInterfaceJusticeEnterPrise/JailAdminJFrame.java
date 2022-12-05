package UserInterfaceJusticeEnterPrise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import UserInterfaceSignInSignUp.LandingPageJFrame;

import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JailAdminJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JailAdminJFrame frame = new JailAdminJFrame();
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
	public JailAdminJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jailAdminJPanel = new JPanel();
		jailAdminJPanel.setBounds(6, 6, 947, 543);
		contentPane.add(jailAdminJPanel);
		jailAdminJPanel.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(6, 6, 935, 531);
		jailAdminJPanel.add(splitPane);
		
		JPanel jaildAdminLeftJPanel = new JPanel();
		jaildAdminLeftJPanel.setBackground(Color.GRAY);
		splitPane.setLeftComponent(jaildAdminLeftJPanel);
		
		JButton viewPrisonersBtn = new JButton("View Prisoners");
		viewPrisonersBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JailAdminViewPrisonerJPanel jailAdminViewPrisonerJPanel = new JailAdminViewPrisonerJPanel();
						splitPane.setRightComponent(jailAdminViewPrisonerJPanel);
			}
		});
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LandingPageJFrame landingPageJFrame = new LandingPageJFrame();
				landingPageJFrame.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_jaildAdminLeftJPanel = new GroupLayout(jaildAdminLeftJPanel);
		gl_jaildAdminLeftJPanel.setHorizontalGroup(
			gl_jaildAdminLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jaildAdminLeftJPanel.createSequentialGroup()
					.addGroup(gl_jaildAdminLeftJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jaildAdminLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(viewPrisonersBtn, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jaildAdminLeftJPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(logoutBtn)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_jaildAdminLeftJPanel.setVerticalGroup(
			gl_jaildAdminLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jaildAdminLeftJPanel.createSequentialGroup()
					.addGap(83)
					.addComponent(viewPrisonersBtn)
					.addPreferredGap(ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
					.addComponent(logoutBtn)
					.addGap(38))
		);
		jaildAdminLeftJPanel.setLayout(gl_jaildAdminLeftJPanel);
		
		JPanel jailAdminRightJPanel = new JPanel();
		jailAdminRightJPanel.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(jailAdminRightJPanel);
	}

}
