package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class doctorAssignedPatientPanel extends JPanel {
	private JTable patientAssignedtoDoctor;
	DefaultTableModel model;
	private JTextField patientIDTxt;
	private JTextField patientNameTxt;
	/**
	 * Create the panel.
	 */
	public doctorAssignedPatientPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 28, 638, 209);
		add(scrollPane);
		
		patientAssignedtoDoctor = new JTable();
		scrollPane.setViewportView(patientAssignedtoDoctor);
		model= new DefaultTableModel();
		Object[] column= {"Patient ID","Name","Gender","BloodPressure  ","Weight","PHQ-9","GAD7","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		patientAssignedtoDoctor.setModel(model);
		
		JButton patientSelectByDoctor = new JButton("Select Patient");
		patientSelectByDoctor.setBounds(330, 249, 117, 29);
		add(patientSelectByDoctor);
		
		patientIDTxt = new JTextField();
		patientIDTxt.setBounds(111, 301, 130, 26);
		add(patientIDTxt);
		patientIDTxt.setColumns(10);
		
		patientNameTxt = new JTextField();
		patientNameTxt.setBounds(111, 355, 130, 26);
		add(patientNameTxt);
		patientNameTxt.setColumns(10);
		
		JComboBox issueTypeCombobox = new JComboBox<String>();
		issueTypeCombobox.setBounds(111, 406, 130, 27);
		issueTypeCombobox.addItem(" ");
		issueTypeCombobox.addItem("Autism");
		issueTypeCombobox.addItem("Bipolar Disorder");
		issueTypeCombobox.addItem("Schizophrenia");
		add(issueTypeCombobox);
		
		JComboBox caseSeverityCombobox = new JComboBox<String>();
		caseSeverityCombobox.setBounds(111, 460, 130, 27);
		caseSeverityCombobox.addItem(" ");
		caseSeverityCombobox.addItem("Low");
		caseSeverityCombobox.addItem("Medium");
		caseSeverityCombobox.addItem("High");
		add(caseSeverityCombobox);
		
		JTextArea doctorCommentsTxtArea = new JTextArea();
		doctorCommentsTxtArea.setBounds(398, 300, 161, 46);
		add(doctorCommentsTxtArea);
		
		JTextArea prescriptionCommentsTxtArea = new JTextArea();
		prescriptionCommentsTxtArea.setBounds(398, 373, 161, 46);
		add(prescriptionCommentsTxtArea);
		
		JComboBox rehabRequiredCombobox = new JComboBox<String>();
		rehabRequiredCombobox.setBounds(398, 463, 117, 20);
		rehabRequiredCombobox.addItem(" ");
		rehabRequiredCombobox.addItem("YES");
		rehabRequiredCombobox.addItem("NO");
		add(rehabRequiredCombobox);
		
		JButton saveDiagonsisBtn = new JButton("Save Diagonsis");
		saveDiagonsisBtn.setBounds(111, 499, 130, 29);
		add(saveDiagonsisBtn);
		
		JButton sendtoPharmacyBtn = new JButton("Send to Pharmacy");
		sendtoPharmacyBtn.setBounds(389, 499, 149, 29);
		add(sendtoPharmacyBtn);
		
		JButton sendtoRehabBtn = new JButton("Send to Rehab");
		sendtoRehabBtn.setBounds(584, 459, 117, 29);
		add(sendtoRehabBtn);
		
		JLabel patientIDLb = new JLabel("Patient ID");
		patientIDLb.setBounds(23, 306, 76, 16);
		add(patientIDLb);
		
		JLabel patientNameLb = new JLabel("Patient Name");
		patientNameLb.setBounds(6, 360, 93, 16);
		add(patientNameLb);
		
		JLabel issueTypeLb = new JLabel("Issue Type");
		issueTypeLb.setBounds(23, 410, 76, 16);
		add(issueTypeLb);
		
		JLabel caseSeverityLb = new JLabel("Case Severity");
		caseSeverityLb.setBounds(6, 464, 93, 16);
		add(caseSeverityLb);
		
		JLabel doctorCommentsLb = new JLabel("Doctor Comments");
		doctorCommentsLb.setBounds(273, 306, 115, 16);
		add(doctorCommentsLb);
		
		JLabel prescriptionLb = new JLabel("Prescription");
		prescriptionLb.setBounds(296, 373, 87, 16);
		add(prescriptionLb);
		
		JLabel rehabLb = new JLabel("Rehab Required");
		rehabLb.setBounds(279, 464, 107, 16);
		add(rehabLb);

	}
}
