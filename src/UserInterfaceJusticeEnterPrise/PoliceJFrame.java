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

public class PoliceJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoliceJFrame frame = new PoliceJFrame();
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
	public PoliceJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel policeJPanel = new JPanel();
		policeJPanel.setBounds(6, 6, 935, 546);
		contentPane.add(policeJPanel);
		policeJPanel.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(6, 6, 923, 534);
		policeJPanel.add(splitPane);
		
		JPanel policeLeftJPanel = new JPanel();
		policeLeftJPanel.setBackground(Color.GRAY);
		splitPane.setLeftComponent(policeLeftJPanel);
		
		JButton viewPrisonerPatientBtn = new JButton("View Prisoner Patients");
		viewPrisonerPatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PoliceViewPrisonerPatient policeViewPrisonerPatient=new PoliceViewPrisonerPatient();
				splitPane.setRightComponent(policeViewPrisonerPatient);
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
		GroupLayout gl_policeLeftJPanel = new GroupLayout(policeLeftJPanel);
		gl_policeLeftJPanel.setHorizontalGroup(
			gl_policeLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_policeLeftJPanel.createSequentialGroup()
					.addGroup(gl_policeLeftJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_policeLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(viewPrisonerPatientBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_policeLeftJPanel.createSequentialGroup()
							.addGap(42)
							.addComponent(logoutBtn)))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_policeLeftJPanel.setVerticalGroup(
			gl_policeLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_policeLeftJPanel.createSequentialGroup()
					.addGap(68)
					.addComponent(viewPrisonerPatientBtn)
					.addPreferredGap(ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
					.addComponent(logoutBtn)
					.addGap(49))
		);
		policeLeftJPanel.setLayout(gl_policeLeftJPanel);
		
		JPanel policeRightJPanel = new JPanel();
		policeRightJPanel.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(policeRightJPanel);
	}

}
