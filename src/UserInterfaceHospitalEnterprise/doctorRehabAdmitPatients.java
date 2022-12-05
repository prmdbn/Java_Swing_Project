package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class doctorRehabAdmitPatients extends JPanel {
	private JTable admittedRehabPatients;
	DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public doctorRehabAdmitPatients() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 32, 649, 211);
		add(scrollPane);
		
		admittedRehabPatients = new JTable();
		scrollPane.setViewportView(admittedRehabPatients);
		model= new DefaultTableModel();
		Object[] column= {"Patient ID","Name","Gender","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		admittedRehabPatients.setModel(model);
		
		JButton selectRehabPatientBtn = new JButton("Select Rehab Patient");
		selectRehabPatientBtn.setBounds(291, 255, 181, 29);
		add(selectRehabPatientBtn);
		
		textField = new JTextField();
		textField.setBounds(160, 320, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 370, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(160, 425, 130, 48);
		add(textArea);
		
		JLabel patientIDLb = new JLabel("Patient ID");
		patientIDLb.setBounds(80, 325, 61, 16);
		add(patientIDLb);
		
		JLabel patientNameLb = new JLabel("Patient Name");
		patientNameLb.setBounds(55, 375, 83, 16);
		add(patientNameLb);
		
		JLabel doctorCommentsLb = new JLabel("Doctor Comments");
		doctorCommentsLb.setBounds(29, 425, 119, 16);
		add(doctorCommentsLb);
		
		JButton readyDischargeBtn = new JButton("Ready for Discharge");
		readyDischargeBtn.setBounds(149, 514, 154, 29);
		add(readyDischargeBtn);

	}

}
