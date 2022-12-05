package UserInterfaceHospitalEnterprise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.SystemColor;

public class pharmacyViewJPanel extends JPanel {
	DefaultTableModel model;
	private JTable pharmacyViewPrescription;
	/**
	 * Create the panel.
	 */
	public pharmacyViewJPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(116, 67, 570, 212);
		add(scrollPane);
		
		JButton dispatchMedicineBtn = new JButton("Dispatch Medicine");
		dispatchMedicineBtn.setBounds(327, 291, 160, 29);
		add(dispatchMedicineBtn);

		
		
	
		
		pharmacyViewPrescription = new JTable();
		scrollPane.setViewportView(pharmacyViewPrescription);
		model= new DefaultTableModel();
		Object[] column= {"Patient ID","Name","Prescription","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		pharmacyViewPrescription.setModel(model);
	}

}
