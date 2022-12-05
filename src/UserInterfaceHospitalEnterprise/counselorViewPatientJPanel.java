package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class counselorViewPatientJPanel extends JPanel {
	private JTable viewPatientJTable;
	private JTextField patientIDTxt;
	private JTextField patientNameTxt;
	private JTextField patientGenderTxt;
	private JTextField bloodPressureTxt;
	private JTextField wieghtTxt;
	DefaultTableModel model;
	private JTextField patientAgeTxt;

	/**
	 * Create the panel.
	 */
	public counselorViewPatientJPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(257, 51, 454, 257);
		add(scrollPane);
		
		viewPatientJTable = new JTable();
		scrollPane.setViewportView(viewPatientJTable);
		model= new DefaultTableModel();
		Object[] column= {"Patient ID","Name","Gender","Age","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		viewPatientJTable.setModel(model);
		
		patientIDTxt = new JTextField();
		patientIDTxt.setBounds(104, 76, 122, 26);
		add(patientIDTxt);
		patientIDTxt.setColumns(10);
		
		patientNameTxt = new JTextField();
		patientNameTxt.setBounds(104, 127, 122, 26);
		add(patientNameTxt);
		patientNameTxt.setColumns(10);
		
		patientGenderTxt = new JTextField();
		patientGenderTxt.setBounds(104, 176, 122, 26);
		add(patientGenderTxt);
		patientGenderTxt.setColumns(10);
		
		JLabel recordVitalsLb = new JLabel("Record Patient Vitals");
		recordVitalsLb.setBounds(94, 292, 130, 16);
		add(recordVitalsLb);
		
		JButton viewPatientBtn = new JButton("View Patient");
		viewPatientBtn.setBounds(439, 320, 117, 29);
		add(viewPatientBtn);
		
		bloodPressureTxt = new JTextField();
		bloodPressureTxt.setBounds(109, 337, 117, 26);
		add(bloodPressureTxt);
		bloodPressureTxt.setColumns(10);
		
		wieghtTxt = new JTextField();
		wieghtTxt.setBounds(109, 383, 117, 26);
		add(wieghtTxt);
		wieghtTxt.setColumns(10);
		
		JComboBox phq9Score = new JComboBox <Integer>();
		phq9Score.setBounds(109, 432, 117, 27);
		phq9Score.addItem(" ");
		phq9Score.addItem(1);
		phq9Score.addItem(2);
		phq9Score.addItem(3);
		phq9Score.addItem(4);
		phq9Score.addItem(5);
		phq9Score.addItem(6);
		phq9Score.addItem(7);
		phq9Score.addItem(8);
		phq9Score.addItem(9);
		phq9Score.addItem(10);
		phq9Score.addItem(11);
		phq9Score.addItem(12);
		phq9Score.addItem(13);
		phq9Score.addItem(14);
		phq9Score.addItem(15);
		phq9Score.addItem(16);
		phq9Score.addItem(17);
		phq9Score.addItem(18);
		phq9Score.addItem(19);
		phq9Score.addItem(20);
		phq9Score.addItem(21);
		phq9Score.addItem(22);
		phq9Score.addItem(23);
		phq9Score.addItem(24);
		phq9Score.addItem(25);
		phq9Score.addItem(26);
		phq9Score.addItem(27);
		add(phq9Score);
		
		JComboBox gad7Score = new JComboBox<Integer>();
		gad7Score.setBounds(109, 483, 117, 27);
		gad7Score.addItem(" ");
		gad7Score.addItem(1);
		gad7Score.addItem(2);
		gad7Score.addItem(3);
		gad7Score.addItem(4);
		gad7Score.addItem(5);
		gad7Score.addItem(6);
		gad7Score.addItem(7);
		gad7Score.addItem(8);
		gad7Score.addItem(9);
		gad7Score.addItem(10);
		gad7Score.addItem(11);
		gad7Score.addItem(12);
		gad7Score.addItem(13);
		gad7Score.addItem(14);
		gad7Score.addItem(15);
		gad7Score.addItem(16);
		gad7Score.addItem(17);
		gad7Score.addItem(18);
		gad7Score.addItem(19);
		gad7Score.addItem(20);
		gad7Score.addItem(21);
		add(gad7Score);
		
		JButton savePatientVitalBtn = new JButton("Save Patient Vitals");
		savePatientVitalBtn.setBounds(94, 536, 158, 29);
		add(savePatientVitalBtn);
		
		JButton sendPatientDtBtn = new JButton("Send Patient Details to Doctor");
		sendPatientDtBtn.setBounds(451, 536, 233, 29);
		add(sendPatientDtBtn);
		
		JLabel patientIDLb = new JLabel("PatientID");
		patientIDLb.setBounds(31, 81, 61, 16);
		add(patientIDLb);
		
		JLabel patientNamelb = new JLabel("Patient Name");
		patientNamelb.setBounds(9, 132, 83, 16);
		add(patientNamelb);
		
		JLabel patientGenderLb = new JLabel("Patient Gender");
		patientGenderLb.setBounds(6, 181, 96, 16);
		add(patientGenderLb);
		
		JLabel bloodPressureLb = new JLabel("Blood Pressure");
		bloodPressureLb.setBounds(9, 342, 93, 16);
		add(bloodPressureLb);
		
		JLabel weightLb = new JLabel("Weight");
		weightLb.setBounds(54, 388, 43, 16);
		add(weightLb);
		
		JLabel phq9scoreLb = new JLabel("PHQ -9 Score");
		phq9scoreLb.setBounds(9, 436, 88, 16);
		add(phq9scoreLb);
		
		JLabel gad7ScoreLb = new JLabel("GAD7 Score");
		gad7ScoreLb.setBounds(9, 487, 83, 16);
		add(gad7ScoreLb);
		
		patientAgeTxt = new JTextField();
		patientAgeTxt.setBounds(104, 222, 117, 26);
		add(patientAgeTxt);
		patientAgeTxt.setColumns(10);
		
		JLabel patientAgeLb = new JLabel("Patient Age");
		patientAgeLb.setBounds(21, 227, 71, 16);
		add(patientAgeLb);

	}
}
