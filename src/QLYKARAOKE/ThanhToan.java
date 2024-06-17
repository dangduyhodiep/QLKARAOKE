package QLYKARAOKE;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class ThanhToan extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ThanhToan() {
		
		setBounds(0, 0, 595, 840);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Karaoke Nice Lmao test");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 35));
		lblNewLabel.setBounds(10, 10, 575, 81);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("69 Tr\u1EA7n Duy H\u01B0ng, Diep Ho\u00E0, C\u1EA7u Gi\u1EA5y, H\u00E0 N\u1ED9i");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 101, 565, 50);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("H\u00F3a \u0111\u01A1n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblNewLabel_2.setBounds(88, 161, 389, 67);
		add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 238, 575, 559);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EAn");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 10, 110, 28);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ph\u00F2ng");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(10, 48, 110, 28);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gi\u1EDD b\u1EAFt \u0111\u1EA7u");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(10, 86, 110, 28);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Gi\u1EDD k\u1EBFt th\u00FAc");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_3.setBounds(10, 124, 110, 28);
		panel.add(lblNewLabel_3_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 150, 555, 346);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"T\u00EAn ", "S\u1ED1 l\u01B0\u1EE3ng", "Th\u00E0nh ti\u1EC1n"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("T\u1ED5ng ti\u1EC1n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(273, 506, 99, 28);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("9999999999 VND");
		lblNewLabel_4_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(382, 506, 183, 28);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("Ch\u1ED7 n\u00E0y test");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_4.setBounds(130, 10, 435, 28);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Ch\u1ED7 n\u00E0y test");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_4_1.setBounds(130, 56, 435, 28);
		panel.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Ch\u1ED7 n\u00E0y test");
		lblNewLabel_3_4_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_4_2.setBounds(130, 94, 435, 28);
		panel.add(lblNewLabel_3_4_2);
		
		JLabel lblNewLabel_3_4_3 = new JLabel("Ch\u1ED7 n\u00E0y test");
		lblNewLabel_3_4_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_4_3.setBounds(130, 124, 435, 28);
		panel.add(lblNewLabel_3_4_3);

	}

}
