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
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LegalAdviserJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LegalAdviserJFrame frame = new LegalAdviserJFrame();
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
	public LegalAdviserJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel legalAdviserJPanel = new JPanel();
		legalAdviserJPanel.setBounds(6, 6, 937, 547);
		contentPane.add(legalAdviserJPanel);
		legalAdviserJPanel.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(6, 6, 925, 535);
		legalAdviserJPanel.add(splitPane);
		
		JPanel legalAdviserLeftJPanel = new JPanel();
		legalAdviserLeftJPanel.setBackground(Color.GRAY);
		splitPane.setLeftComponent(legalAdviserLeftJPanel);
		
		JButton viewPrisonerPatientBtn = new JButton("View Prisoner Patient");
		viewPrisonerPatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LegalAdviserViewPrisonerPatient legalAdviserViewPrisonerPatient= new LegalAdviserViewPrisonerPatient();
				splitPane.setRightComponent(legalAdviserViewPrisonerPatient);
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
		GroupLayout gl_legalAdviserLeftJPanel = new GroupLayout(legalAdviserLeftJPanel);
		gl_legalAdviserLeftJPanel.setHorizontalGroup(
			gl_legalAdviserLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_legalAdviserLeftJPanel.createSequentialGroup()
					.addGroup(gl_legalAdviserLeftJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_legalAdviserLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(viewPrisonerPatientBtn))
						.addGroup(gl_legalAdviserLeftJPanel.createSequentialGroup()
							.addGap(42)
							.addComponent(logoutBtn)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_legalAdviserLeftJPanel.setVerticalGroup(
			gl_legalAdviserLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_legalAdviserLeftJPanel.createSequentialGroup()
					.addGap(72)
					.addComponent(viewPrisonerPatientBtn)
					.addPreferredGap(ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
					.addComponent(logoutBtn)
					.addGap(34))
		);
		legalAdviserLeftJPanel.setLayout(gl_legalAdviserLeftJPanel);
		
		JPanel legalAdviserRightJPanel = new JPanel();
		legalAdviserRightJPanel.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(legalAdviserRightJPanel);
	}

}
