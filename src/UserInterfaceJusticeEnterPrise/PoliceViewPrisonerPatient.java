package UserInterfaceJusticeEnterPrise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import javax.swing.JButton;

public class PoliceViewPrisonerPatient extends JPanel {
	private JTable policePrisonerPatientJTable;
	DefaultTableModel model;
	/**
	 * Create the panel.
	 */
	public PoliceViewPrisonerPatient() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 46, 594, 175);
		add(scrollPane);
		
		policePrisonerPatientJTable = new JTable();
		scrollPane.setViewportView(policePrisonerPatientJTable);
		model= new DefaultTableModel();
		Object[] column= {"Prisoner Id","Name","Doctor Comments","Legal Comments","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		policePrisonerPatientJTable.setModel(model);
		
		JButton selectPrisonerPatientforPhyscWardBtn = new JButton("Select Patient for Shift to Physc ward");
		selectPrisonerPatientforPhyscWardBtn.setBounds(210, 253, 258, 29);
		add(selectPrisonerPatientforPhyscWardBtn);

	}

}
