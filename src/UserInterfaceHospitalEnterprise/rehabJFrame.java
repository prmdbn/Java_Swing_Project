package UserInterfaceHospitalEnterprise;

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

public class rehabJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rehabJFrame frame = new rehabJFrame();
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
	public rehabJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel rehabJPanel = new JPanel();
		rehabJPanel.setBounds(6, 6, 851, 551);
		contentPane.add(rehabJPanel);
		rehabJPanel.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(6, 6, 839, 539);
		rehabJPanel.add(splitPane);
		
		JPanel rehabPatientLeftJPanel = new JPanel();
		rehabPatientLeftJPanel.setBackground(Color.GRAY);
		splitPane.setLeftComponent(rehabPatientLeftJPanel);
		
		JButton rehabPatients = new JButton("View Rehab Patients");
		rehabPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rehabViewPatientJPanel rehabViewPatientJPanel= new rehabViewPatientJPanel();
				splitPane.setRightComponent(rehabViewPatientJPanel);
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
		GroupLayout gl_rehabPatientLeftJPanel = new GroupLayout(rehabPatientLeftJPanel);
		gl_rehabPatientLeftJPanel.setHorizontalGroup(
			gl_rehabPatientLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_rehabPatientLeftJPanel.createSequentialGroup()
					.addGroup(gl_rehabPatientLeftJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_rehabPatientLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(rehabPatients))
						.addGroup(gl_rehabPatientLeftJPanel.createSequentialGroup()
							.addGap(37)
							.addComponent(logoutBtn)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_rehabPatientLeftJPanel.setVerticalGroup(
			gl_rehabPatientLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_rehabPatientLeftJPanel.createSequentialGroup()
					.addGap(74)
					.addComponent(rehabPatients)
					.addPreferredGap(ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
					.addComponent(logoutBtn)
					.addGap(45))
		);
		rehabPatientLeftJPanel.setLayout(gl_rehabPatientLeftJPanel);
		
		JPanel rehabPatientRightJPanel = new JPanel();
		rehabPatientRightJPanel.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(rehabPatientRightJPanel);
	}

}
