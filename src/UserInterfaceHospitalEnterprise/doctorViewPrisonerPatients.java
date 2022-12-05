package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;

public class doctorViewPrisonerPatients extends JPanel {
	private JTable viewPrisonerPatient;
	DefaultTableModel model;
	private JTextField prisonerIDTxt;
	private JTextField prisonerNameTxt;

	/**
	 * Create the panel.
	 */
	public doctorViewPrisonerPatients() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 49, 553, 181);
		add(scrollPane);
		
		viewPrisonerPatient = new JTable();
		scrollPane.setViewportView(viewPrisonerPatient);
		model= new DefaultTableModel();
		Object[] column= {"Prisoner ID","Name","Gender","Age","BloodPressure","Weight","PHQ9","GAD7","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		viewPrisonerPatient.setModel(model);
		
		JButton viewPrisonerPatientBtn = new JButton("select Prisoner for Examine");
		viewPrisonerPatientBtn.setBounds(227, 242, 199, 29);
		add(viewPrisonerPatientBtn);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(60, 292, 553, 263);
		add(desktopPane);
		
		JComboBox issueTypeCombobox = new JComboBox();
		issueTypeCombobox.setBounds(383, 18, 93, 27);
		desktopPane.add(issueTypeCombobox);
		
		JComboBox severityCombobox = new JComboBox();
		severityCombobox.setBounds(383, 70, 93, 27);
		desktopPane.add(severityCombobox);
		
		JComboBox mentallyIllCombobox = new JComboBox();
		mentallyIllCombobox.setBounds(383, 134, 93, 27);
		desktopPane.add(mentallyIllCombobox);
		
		JLabel issueTypeLb = new JLabel("Issue Type");
		issueTypeLb.setBounds(286, 22, 68, 16);
		desktopPane.add(issueTypeLb);
		
		JLabel severityLb = new JLabel("Case Severity");
		severityLb.setBounds(271, 74, 100, 16);
		desktopPane.add(severityLb);
		
		JLabel lblNewLabel_4 = new JLabel("Mentally unfit");
		lblNewLabel_4.setBounds(271, 138, 100, 16);
		desktopPane.add(lblNewLabel_4);
		
		prisonerIDTxt = new JTextField();
		prisonerIDTxt.setBounds(129, 17, 130, 26);
		desktopPane.add(prisonerIDTxt);
		prisonerIDTxt.setColumns(10);
		
		prisonerNameTxt = new JTextField();
		prisonerNameTxt.setBounds(129, 69, 130, 26);
		desktopPane.add(prisonerNameTxt);
		prisonerNameTxt.setColumns(10);
		
		JTextArea doctorCommentsTxtArea = new JTextArea();
		doctorCommentsTxtArea.setBounds(129, 138, 130, 56);
		desktopPane.add(doctorCommentsTxtArea);
		
		JLabel prisonerIDlb = new JLabel("Prisoner ID");
		prisonerIDlb.setBounds(39, 22, 78, 16);
		desktopPane.add(prisonerIDlb);
		
		JLabel nameLb = new JLabel("Name");
		nameLb.setBounds(66, 74, 41, 16);
		desktopPane.add(nameLb);
		
		JLabel doctorCommentsLb = new JLabel("Doctor Comments");
		doctorCommentsLb.setBounds(6, 138, 115, 16);
		desktopPane.add(doctorCommentsLb);
		
		JButton savePrisonerExamineBtn = new JButton("Save Prisoner Examination");
		savePrisonerExamineBtn.setBounds(89, 216, 203, 29);
		desktopPane.add(savePrisonerExamineBtn);
		
		JButton sendLegalConsiderationBtn = new JButton("Send Legal Consideration");
		sendLegalConsiderationBtn.setBounds(345, 191, 182, 54);
		desktopPane.add(sendLegalConsiderationBtn);

	}

}
