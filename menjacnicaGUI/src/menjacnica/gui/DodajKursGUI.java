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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblProdajniKurs;
	private JTextField textField_2;
	private JLabel lblSrednjiKurs;
	private JTextField textField_3;
	private JLabel lblNaziv;
	private JTextField textField_4;
	private JLabel lblKupovniKurs;
	private JTextField textField_5;
	private JLabel lblSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;
	static JTextPane textPaneMain;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(JTextPane textPaneMain) {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 443, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField_2());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextField_3());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextField_4());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField_5());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		DodajKursGUI.textPaneMain = textPaneMain;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 200, 14);
		}
		return lblSifra;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(10, 27, 200, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(10, 74, 200, 20);
		}
		return textField_1;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 58, 200, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(10, 123, 200, 20);
		}
		return textField_2;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 107, 200, 14);
		}
		return lblSrednjiKurs;
	}

	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(222, 27, 200, 20);
		}
		return textField_3;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(222, 11, 200, 14);
		}
		return lblNaziv;
	}

	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(220, 74, 200, 20);
		}
		return textField_4;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(220, 58, 202, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(222, 123, 200, 20);
		}
		return textField_5;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(222, 107, 200, 14);
		}
		return lblSkraceniNaziv;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String kurs = "Sifra kursa: " + textField.getText() + ", naziv: " + textField_3.getText()
							+ ", prodajni kurs: " + textField_1.getText() + ", kupovni kurs: " + textField_4.getText()
							+ ", srednji kurs: " + textField_2.getText() + ", skraceni naziv: " + textField_5.getText();
					MenjacnicaGUI.azurirajStatus(textPaneMain, kurs);
				}
			});
			btnDodaj.setBounds(10, 174, 200, 23);
		}
		return btnDodaj;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(222, 174, 200, 23);
		}
		return btnOdustani;
	}
}
