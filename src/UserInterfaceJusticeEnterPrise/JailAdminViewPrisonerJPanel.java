package UserInterfaceJusticeEnterPrise;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;

public class JailAdminViewPrisonerJPanel extends JPanel {
	private JTable jailAdminViewPrisoner;
	DefaultTableModel model;
	private JTextField prisonerIDTxt;
	private JTextField prisonerNameTxt;

	/**
	 * Create the panel.
	 */
	public JailAdminViewPrisonerJPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 31, 645, 188);
		add(scrollPane);
		
		jailAdminViewPrisoner = new JTable();
		scrollPane.setViewportView(jailAdminViewPrisoner);
		model= new DefaultTableModel();
		Object[] column= {"Prisoner Id","Name","Age","Gender"};
		Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		jailAdminViewPrisoner.setModel(model);
		
		JButton selectPrsionerForExamine = new JButton("Select Prisoner for Examine");
		selectPrsionerForExamine.setBounds(305, 231, 215, 29);
		add(selectPrsionerForExamine);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(102, 272, 637, 232);
		add(desktopPane);
		
		JLabel prisonerPicLb = new JLabel("Prisoner Pic");
		prisonerPicLb.setBounds(383, 6, 130, 124);
		desktopPane.add(prisonerPicLb);
		
		prisonerIDTxt = new JTextField();
		prisonerIDTxt.setBounds(157, 20, 130, 26);
		desktopPane.add(prisonerIDTxt);
		prisonerIDTxt.setColumns(10);
		
		prisonerNameTxt = new JTextField();
		prisonerNameTxt.setBounds(157, 80, 130, 26);
		desktopPane.add(prisonerNameTxt);
		prisonerNameTxt.setColumns(10);
		
		JTextArea jailAdminCommentsTxtAre = new JTextArea();
		jailAdminCommentsTxtAre.setBounds(157, 139, 130, 45);
		desktopPane.add(jailAdminCommentsTxtAre);
		
		JLabel jaildAdminCommentsLb = new JLabel("Jail Admin Comments");
		jaildAdminCommentsLb.setBounds(9, 139, 136, 16);
		desktopPane.add(jaildAdminCommentsLb);
		
		JLabel prisonerNameLb = new JLabel("Prisoner Name");
		prisonerNameLb.setBounds(44, 85, 101, 16);
		desktopPane.add(prisonerNameLb);
		
		JLabel prisonerIdLb = new JLabel("Prisoner ID");
		prisonerIdLb.setBounds(63, 25, 82, 16);
		desktopPane.add(prisonerIdLb);
		
		JButton raiseMentalConcernBtn = new JButton("Raise Mental Concern");
		raiseMentalConcernBtn.setBounds(241, 196, 172, 29);
		desktopPane.add(raiseMentalConcernBtn);

	}

}
