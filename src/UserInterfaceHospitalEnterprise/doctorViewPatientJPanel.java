package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class doctorViewPatientJPanel extends JPanel {
	private JTable doctorViewPatient;
	DefaultTableModel model;
	private JTable doctorViewPrsioner;

	/**
	 * Create the panel.
	 */
	public doctorViewPatientJPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 56, 577, 164);
		add(scrollPane);
		
		doctorViewPatient = new JTable();
		scrollPane.setViewportView(doctorViewPatient);
		model= new DefaultTableModel();
		Object[] column= {"Patient ID","Name","Gender","BloodPressure","Weight","PHQ-9","GAD7","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		doctorViewPatient.setModel(model);
		model= new DefaultTableModel();
		Object[] column1= {"Prisoner ID","Name","Gender","BloodPressure","Weight","PHQ-9","GAD7","Status"};
		Object[] row1= new Object[0];
		model.setColumnIdentifiers(column1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(40, 6, 660, 253);
		add(desktopPane);
		
		JButton doctorAssignBtn = new JButton("Assign to Me");
		doctorAssignBtn.setBounds(288, 218, 117, 29);
		desktopPane.add(doctorAssignBtn);
		
		JLabel doctorPatientDetails = new JLabel("Patient Details");
		doctorPatientDetails.setBounds(288, 6, 97, 16);
		desktopPane.add(doctorPatientDetails);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(40, 271, 660, 261);
		add(desktopPane_1);
		
		JButton doctorAssignBtn_1 = new JButton("Assign to Me");
		
		doctorAssignBtn_1.setBounds(278, 227, 117, 29);
		desktopPane_1.add(doctorAssignBtn_1);
		
		JLabel lblPrisonerDetails = new JLabel("Prisoner Details");
		lblPrisonerDetails.setBounds(292, 6, 105, 16);
		desktopPane_1.add(lblPrisonerDetails);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(49, 34, 577, 188);
		desktopPane_1.add(scrollPane_1);
		
		doctorViewPrsioner = new JTable();
		scrollPane_1.setViewportView(doctorViewPrsioner);
		doctorViewPrsioner.setModel(model);

	}
}
