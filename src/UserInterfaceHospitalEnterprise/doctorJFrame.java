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
import javax.swing.LayoutStyle.ComponentPlacement;

public class doctorJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctorJFrame frame = new doctorJFrame();
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
	public doctorJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel doctorJPanel = new JPanel();
		doctorJPanel.setBounds(6, 6, 947, 559);
		contentPane.add(doctorJPanel);
		doctorJPanel.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(6, 6, 935, 547);
		doctorJPanel.add(splitPane);
		
		JPanel doctorLeftJPanel = new JPanel();
		doctorLeftJPanel.setBackground(Color.GRAY);
		splitPane.setLeftComponent(doctorLeftJPanel);
		
		JButton viewPatientDoctorBtn = new JButton("View Patient");
		viewPatientDoctorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doctorViewPatientJPanel doctorViewPatientPanel= new doctorViewPatientJPanel();
				splitPane.setRightComponent(doctorViewPatientPanel);
			}
		});
		
		JButton patientDiagonsisBtn = new JButton("Patient Diagonsis");
		patientDiagonsisBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doctorAssignedPatientPanel doctorAssignedPatientPanel= new doctorAssignedPatientPanel();
				splitPane.setRightComponent(doctorAssignedPatientPanel);
				
			}
		});
		
		JButton rehabPatients = new JButton("View Rehab Patients");
		rehabPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doctorRehabAdmitPatients doctorRehabAdmitPatients= new doctorRehabAdmitPatients();
				splitPane.setRightComponent(doctorRehabAdmitPatients);
				
			}
		});
		
		JButton prisonerPatientBtn = new JButton("Prisoner Diagonsis");
		prisonerPatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doctorViewPrisonerPatients doctorViewPrisonerPatients = new doctorViewPrisonerPatients ();
				splitPane.setRightComponent(doctorViewPrisonerPatients);
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
		GroupLayout gl_doctorLeftJPanel = new GroupLayout(doctorLeftJPanel);
		gl_doctorLeftJPanel.setHorizontalGroup(
			gl_doctorLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_doctorLeftJPanel.createSequentialGroup()
					.addGroup(gl_doctorLeftJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_doctorLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(patientDiagonsisBtn))
						.addGroup(gl_doctorLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(viewPatientDoctorBtn, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_doctorLeftJPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_doctorLeftJPanel.createSequentialGroup()
								.addContainerGap()
								.addComponent(prisonerPatientBtn, 0, 0, Short.MAX_VALUE))
							.addComponent(rehabPatients))
						.addGroup(gl_doctorLeftJPanel.createSequentialGroup()
							.addGap(40)
							.addComponent(logoutBtn)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_doctorLeftJPanel.setVerticalGroup(
			gl_doctorLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_doctorLeftJPanel.createSequentialGroup()
					.addGap(58)
					.addComponent(viewPatientDoctorBtn)
					.addGap(62)
					.addComponent(patientDiagonsisBtn)
					.addGap(75)
					.addComponent(rehabPatients)
					.addGap(79)
					.addComponent(prisonerPatientBtn)
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addComponent(logoutBtn)
					.addGap(29))
		);
		doctorLeftJPanel.setLayout(gl_doctorLeftJPanel);
		
		JPanel doctorRightJPanel = new JPanel();
		doctorRightJPanel.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(doctorRightJPanel);
	}
}
