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

public class PharmacyJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PharmacyJFrame frame = new PharmacyJFrame();
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
	public PharmacyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pharmacyJPanel = new JPanel();
		pharmacyJPanel.setBounds(6, 6, 919, 538);
		contentPane.add(pharmacyJPanel);
		pharmacyJPanel.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(6, 6, 907, 526);
		pharmacyJPanel.add(splitPane);
		
		JPanel pharmacyLeftJPanel = new JPanel();
		pharmacyLeftJPanel.setBackground(Color.GRAY);
		splitPane.setLeftComponent(pharmacyLeftJPanel);
		
		JButton pharmacyBtn = new JButton("Pharmacy");
		pharmacyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmacyViewJPanel pharmacyViewJPanel =new pharmacyViewJPanel ();
				splitPane.setRightComponent(pharmacyViewJPanel);
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
		GroupLayout gl_pharmacyLeftJPanel = new GroupLayout(pharmacyLeftJPanel);
		gl_pharmacyLeftJPanel.setHorizontalGroup(
			gl_pharmacyLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pharmacyLeftJPanel.createSequentialGroup()
					.addGroup(gl_pharmacyLeftJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pharmacyLeftJPanel.createSequentialGroup()
							.addGap(16)
							.addComponent(logoutBtn))
						.addGroup(gl_pharmacyLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(pharmacyBtn)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_pharmacyLeftJPanel.setVerticalGroup(
			gl_pharmacyLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pharmacyLeftJPanel.createSequentialGroup()
					.addGap(73)
					.addComponent(pharmacyBtn)
					.addPreferredGap(ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
					.addComponent(logoutBtn)
					.addGap(49))
		);
		pharmacyLeftJPanel.setLayout(gl_pharmacyLeftJPanel);
		
		JPanel pharmacyRightJPanel = new JPanel();
		pharmacyRightJPanel.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(pharmacyRightJPanel);
	}

}
