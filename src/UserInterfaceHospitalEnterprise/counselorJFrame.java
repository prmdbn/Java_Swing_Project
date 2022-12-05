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

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class counselorJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					counselorJFrame frame = new counselorJFrame();
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
	public counselorJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel counselorJPanel = new JPanel();
		counselorJPanel.setBounds(6, 6, 939, 626);
		contentPane.add(counselorJPanel);
		counselorJPanel.setLayout(null);
		
		JSplitPane counselorsplitPane = new JSplitPane();
		counselorsplitPane.setBounds(6, 5, 927, 615);
		counselorJPanel.add(counselorsplitPane);
		
		JPanel counselorLeftPanel = new JPanel();
		counselorLeftPanel.setBackground(Color.GRAY);
		counselorsplitPane.setLeftComponent(counselorLeftPanel);
		
		JButton viewPatientBtn = new JButton("View Patient");
		viewPatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counselorViewPatientJPanel counselorPatientPanel= new counselorViewPatientJPanel();
				counselorsplitPane.setRightComponent(counselorPatientPanel);
			}
		});
		
		JButton viewPrisonerpatientBtn = new JButton("View Prisoner Patient");
		viewPrisonerpatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counselorViewPrisonerPatientJPanel counselorViewPrisonerPatientJPanel = new counselorViewPrisonerPatientJPanel();
				counselorsplitPane.setRightComponent(counselorViewPrisonerPatientJPanel);
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
		GroupLayout gl_counselorLeftPanel = new GroupLayout(counselorLeftPanel);
		gl_counselorLeftPanel.setHorizontalGroup(
			gl_counselorLeftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_counselorLeftPanel.createSequentialGroup()
					.addGroup(gl_counselorLeftPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_counselorLeftPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_counselorLeftPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(viewPrisonerpatientBtn, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(viewPatientBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
						.addGroup(gl_counselorLeftPanel.createSequentialGroup()
							.addGap(42)
							.addComponent(logoutBtn)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_counselorLeftPanel.setVerticalGroup(
			gl_counselorLeftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_counselorLeftPanel.createSequentialGroup()
					.addGap(82)
					.addComponent(viewPatientBtn)
					.addGap(46)
					.addComponent(viewPrisonerpatientBtn)
					.addGap(351)
					.addComponent(logoutBtn)
					.addGap(45))
		);
		counselorLeftPanel.setLayout(gl_counselorLeftPanel);
		
		JPanel counselorRightPanel = new JPanel();
		counselorRightPanel.setBackground(SystemColor.textHighlight);
		counselorsplitPane.setRightComponent(counselorRightPanel);
		GroupLayout gl_counselorRightPanel = new GroupLayout(counselorRightPanel);
		gl_counselorRightPanel.setHorizontalGroup(
			gl_counselorRightPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 765, Short.MAX_VALUE)
		);
		gl_counselorRightPanel.setVerticalGroup(
			gl_counselorRightPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 611, Short.MAX_VALUE)
		);
		counselorRightPanel.setLayout(gl_counselorRightPanel);
	}
}
