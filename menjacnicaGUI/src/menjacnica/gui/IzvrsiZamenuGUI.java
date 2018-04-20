package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.beans.PropertyChangeListener;
import java.io.UTFDataFormatException;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField textField;
	private JLabel lblVauta;
	private JComboBox comboBox;
	private JTextField textField_1;
	private JLabel lblProdajniKurs;
	private JLabel lblIznos;
	private JTextField textField_2;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	static JTextPane textPaneMain;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(JTextPane textPane) {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 409, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField());
		contentPane.add(getLblVauta());
		contentPane.add(getComboBox());
		contentPane.add(getTextField_1());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblIznos());
		contentPane.add(getTextField_2());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "USD", "CHF" }));
		textField_2.setText(String.valueOf(slider.getValue()));
		IzvrsiZamenuGUI.textPaneMain = textPane;
		setLocationRelativeTo(null);
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 11, 87, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 29, 145, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JLabel getLblVauta() {
		if (lblVauta == null) {
			lblVauta = new JLabel("Vauta");
			lblVauta.setBounds(165, 11, 46, 14);
		}
		return lblVauta;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(165, 29, 72, 20);
		}
		return comboBox;
	}

	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(250, 29, 145, 20);
		}
		return textField_1;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(250, 11, 87, 14);
		}
		return lblProdajniKurs;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 80, 46, 14);
		}
		return lblIznos;
	}

	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(10, 98, 184, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(225, 80, 93, 14);
		}
		return lblVrstaTransakcije;
	}

	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setSelected(true);
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(235, 105, 124, 23);
		}
		return rdbtnKupovina;
	}

	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(235, 130, 124, 23);
		}
		return rdbtnProdaja;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textField_2.setText(String.valueOf(slider.getValue()));
				}
			});
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setBounds(10, 168, 385, 44);
		}
		return slider;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = (rdbtnKupovina.isSelected())
							? "Kupovina: " + comboBox.getSelectedItem().toString() + ", iznos: " + textField_2.getText()
							: "Prodaja: " + comboBox.getSelectedItem().toString() + ", iznos: " + textField_2.getText();
					MenjacnicaGUI.azurirajStatus(textPaneMain, text);
					dispose();
				}
			});
			btnIzvrsiZamenu.setBounds(23, 223, 151, 23);
		}
		return btnIzvrsiZamenu;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(230, 223, 151, 23);
		}
		return btnOdustani;
	}
}
