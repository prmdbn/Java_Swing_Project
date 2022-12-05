package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;

public class counselorViewPrisonerPatientJPanel extends JPanel {
	private JTable viewPrisonerPatientJTable;
	DefaultTableModel model;
	private JTextField prisonerIDTxt;
	private JTextField prisonerNameTxt;
	private JTextField bpTxt;
	private JTextField weightTxt;

	/**
	 * Create the panel.
	 */
	public counselorViewPrisonerPatientJPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(136, 49, 523, 172);
		add(scrollPane);
		
		viewPrisonerPatientJTable = new JTable();
		scrollPane.setViewportView(viewPrisonerPatientJTable);
		model= new DefaultTableModel();
		Object[] column= {"Prisoner ID","Name","Gender","Age","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		viewPrisonerPatientJTable.setModel(model);
		
		JButton selectPrisonerBtn = new JButton("select Prisoner for Inspection");
		selectPrisonerBtn.setBounds(261, 233, 228, 29);
		add(selectPrisonerBtn);
		
		prisonerIDTxt = new JTextField();
		prisonerIDTxt.setBounds(148, 284, 130, 26);
		add(prisonerIDTxt);
		prisonerIDTxt.setColumns(10);
		
		prisonerNameTxt = new JTextField();
		prisonerNameTxt.setBounds(148, 334, 130, 26);
		add(prisonerNameTxt);
		prisonerNameTxt.setColumns(10);
		
		JLabel prisonerIDlb = new JLabel("Prisoner ID");
		prisonerIDlb.setBounds(51, 289, 74, 16);
		add(prisonerIDlb);
		
		JLabel prisonerNameLb = new JLabel("Prisoner Name");
		prisonerNameLb.setBounds(33, 339, 103, 16);
		add(prisonerNameLb);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(70, 372, 485, 172);
		add(desktopPane);
		
		JLabel recordVitalsLb = new JLabel("Record Vitals");
		recordVitalsLb.setBounds(201, 16, 87, 16);
		desktopPane.add(recordVitalsLb);
		
		JComboBox phq9Score = new JComboBox<Integer>();
		phq9Score.setBounds(370, 45, 77, 27);
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
		desktopPane.add(phq9Score);
		
		JComboBox gad7Score = new JComboBox<Integer>();
		gad7Score.setBounds(370, 91, 73, 27);
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
		desktopPane.add(gad7Score);
		
		bpTxt = new JTextField();
		bpTxt.setBounds(123, 44, 130, 26);
		desktopPane.add(bpTxt);
		bpTxt.setColumns(10);
		
		weightTxt = new JTextField();
		weightTxt.setBounds(123, 90, 130, 26);
		desktopPane.add(weightTxt);
		weightTxt.setColumns(10);
		
		JLabel bpLb = new JLabel("Blood Pressure");
		bpLb.setBounds(10, 48, 101, 16);
		desktopPane.add(bpLb);
		
		JLabel weightLb = new JLabel("Weight");
		weightLb.setBounds(49, 95, 50, 16);
		desktopPane.add(weightLb);
		
		JLabel phq9ScoreLb = new JLabel("PHQ -9 Score");
		phq9ScoreLb.setBounds(265, 48, 93, 16);
		desktopPane.add(phq9ScoreLb);
		
		JLabel gad7ScoreLb = new JLabel("GAD7 Score");
		gad7ScoreLb.setBounds(275, 95, 77, 16);
		desktopPane.add(gad7ScoreLb);
		
		JButton savePrisonerVitalBtn = new JButton("Save Prisoner Vital");
		savePrisonerVitalBtn.setBounds(180, 128, 157, 29);
		desktopPane.add(savePrisonerVitalBtn);
		
		JButton sendPrisonertoDoctorBtn = new JButton("Send Prisoner details to Doctor");
		sendPrisonertoDoctorBtn.setBounds(195, 548, 267, 29);
		add(sendPrisonertoDoctorBtn);

	}
}
