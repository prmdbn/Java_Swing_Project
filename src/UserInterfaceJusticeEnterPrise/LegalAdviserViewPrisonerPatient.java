package UserInterfaceJusticeEnterPrise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class LegalAdviserViewPrisonerPatient extends JPanel {
	private JTable legalAdviserViewPrisonerPatiient;
	DefaultTableModel model;
	private JTextField prisonerIDTxt;
	private JTextField prsionerNameTxt;
	

	/**
	 * Create the panel.
	 */
	public LegalAdviserViewPrisonerPatient() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 25, 586, 206);
		add(scrollPane);
		
		legalAdviserViewPrisonerPatiient = new JTable();
		scrollPane.setViewportView(legalAdviserViewPrisonerPatiient);
		model= new DefaultTableModel();
		Object[] column= {"Prisoner Id","Name","Doctor Comments","Status"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		legalAdviserViewPrisonerPatiient.setModel(model);
		
		JButton selectPrisonerPatient = new JButton("select Prisoner Patient");
		selectPrisonerPatient.setBounds(294, 243, 167, 29);
		add(selectPrisonerPatient);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(84, 284, 586, 224);
		add(desktopPane);
		
		prisonerIDTxt = new JTextField();
		prisonerIDTxt.setBounds(238, 23, 130, 26);
		desktopPane.add(prisonerIDTxt);
		prisonerIDTxt.setColumns(10);
		
		prsionerNameTxt = new JTextField();
		prsionerNameTxt.setBounds(238, 78, 130, 26);
		desktopPane.add(prsionerNameTxt);
		prsionerNameTxt.setColumns(10);
		
		JTextArea legalAdviserTextArea = new JTextArea();
		legalAdviserTextArea.setBounds(238, 131, 135, 36);
		desktopPane.add(legalAdviserTextArea);
		
		JLabel prisonerIDLb = new JLabel("Prisoner ID");
		prisonerIDLb.setBounds(157, 28, 69, 16);
		desktopPane.add(prisonerIDLb);
		
		JLabel prisonerNameLb = new JLabel("Prisoner Name");
		prisonerNameLb.setBounds(128, 83, 98, 16);
		desktopPane.add(prisonerNameLb);
		
		JLabel legalAdviserCommentsLb = new JLabel("Legal Adviser Comments");
		legalAdviserCommentsLb.setBounds(64, 131, 162, 16);
		desktopPane.add(legalAdviserCommentsLb);
		
		JButton sendshiftRequesttoPoliceBtn = new JButton("Send Physc ward Shift request to Police");
		sendshiftRequesttoPoliceBtn.setBounds(156, 189, 298, 29);
		desktopPane.add(sendshiftRequesttoPoliceBtn);

	}

}
