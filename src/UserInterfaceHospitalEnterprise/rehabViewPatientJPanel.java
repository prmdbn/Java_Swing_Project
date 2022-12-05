package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.SystemColor;

public class rehabViewPatientJPanel extends JPanel {
	private JTable viewRehabPatients;
	DefaultTableModel model;

	/**
	 * Create the panel.
	 */
	public rehabViewPatientJPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 52, 594, 201);
		add(scrollPane);
		
		viewRehabPatients = new JTable();
		scrollPane.setViewportView(viewRehabPatients);
		model= new DefaultTableModel();
		Object[] column= {"Patient ID","Name","Prescription","Severity","Rehab Req","Doctor Comments","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		viewRehabPatients.setModel(model);
		
		JButton admitPatientBtn = new JButton("Admit Patient");
		admitPatientBtn.setBounds(153, 265, 117, 29);
		add(admitPatientBtn);
		
		JButton dischargePatientBtn = new JButton("Discharge Patient");
		dischargePatientBtn.setBounds(344, 265, 159, 29);
		add(dischargePatientBtn);

	}

}
