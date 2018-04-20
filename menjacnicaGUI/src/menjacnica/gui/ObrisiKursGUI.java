package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField textField;
	private JLabel label_1;
	private JTextField textField_1;
	private JLabel label_2;
	private JTextField textField_2;
	private JLabel label_3;
	private JTextField textField_3;
	private JLabel label_4;
	private JTextField textField_4;
	private JLabel label_5;
	private JTextField textField_5;
	private JButton button;
	private JButton btnObrisi;
	private JCheckBox chckbxZaistaObrisiKurs;
	static JTextPane textPaneMain;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(JTextPane textPane) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getTextField());
		contentPane.add(getLabel_1());
		contentPane.add(getTextField_1());
		contentPane.add(getLabel_2());
		contentPane.add(getTextField_2());
		contentPane.add(getLabel_3());
		contentPane.add(getTextField_3());
		contentPane.add(getLabel_4());
		contentPane.add(getTextField_4());
		contentPane.add(getLabel_5());
		contentPane.add(getTextField_5());
		contentPane.add(getButton());
		contentPane.add(getBtnObrisi());
		contentPane.add(getChckbxZaistaObrisiKurs());
		setLocationRelativeTo(null);
		ObrisiKursGUI.textPaneMain = textPane;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Sifra");
			label.setBounds(10, 11, 200, 14);
		}
		return label;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(10, 27, 200, 20);
		}
		return textField;
	}

	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Prodajni kurs");
			label_1.setBounds(10, 58, 200, 14);
		}
		return label_1;
	}

	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(10, 74, 200, 20);
		}
		return textField_1;
	}

	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Srednji kurs");
			label_2.setBounds(10, 107, 200, 14);
		}
		return label_2;
	}

	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(10, 123, 200, 20);
		}
		return textField_2;
	}

	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Naziv");
			label_3.setBounds(222, 11, 200, 14);
		}
		return label_3;
	}

	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(222, 27, 200, 20);
		}
		return textField_3;
	}

	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Kupovni kurs");
			label_4.setBounds(220, 58, 202, 14);
		}
		return label_4;
	}

	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(220, 74, 200, 20);
		}
		return textField_4;
	}

	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Skraceni naziv");
			label_5.setBounds(222, 107, 200, 14);
		}
		return label_5;
	}

	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(222, 123, 200, 20);
		}
		return textField_5;
	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("Odustani");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button.setBounds(222, 174, 200, 23);
		}
		return button;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String kurs = "OBRISAN: Sifra kursa: " + textField.getText() + ", naziv: " + textField_3.getText()
							+ ", prodajni kurs: " + textField_1.getText() + ", kupovni kurs: " + textField_4.getText()
							+ ", srednji kurs: " + textField_2.getText() + ", skraceni naziv: " + textField_5.getText();
					MenjacnicaGUI.azurirajStatus(textPaneMain, kurs);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 174, 200, 23);
		}
		return btnObrisi;
	}

	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (chckbxZaistaObrisiKurs.isSelected())
						btnObrisi.setEnabled(true);
					else
						btnObrisi.setEnabled(false);
				}
			});
			chckbxZaistaObrisiKurs.setBounds(10, 150, 169, 17);
		}
		return chckbxZaistaObrisiKurs;
	}
}
