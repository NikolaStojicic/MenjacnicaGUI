package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Toolkit;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JPanel panel;
	private JButton btnDodajKurs;
	private JButton btnObriiKurs;
	private JButton btnIzvriZamenu;
	private JPanel panel_1;
	private JTextPane textPane;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frames.
	 */

	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/icon.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 687, 485);
		setJMenuBar(getMenuBar_2());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel_1(), BorderLayout.EAST);
		contentPane.add(getPanel_1_1(), BorderLayout.SOUTH);
		contentPane.add(getScrollPane_1(), BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

	private JMenuBar getMenuBar_2() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMenu_2());
			menuBar.add(getMenu_3());
		}
		return menuBar;
	}

	private JMenu getMenu_2() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMenuItem_5());
			mnFile.add(getMenuItem_6());
			mnFile.add(getMenuItem_7());
		}
		return mnFile;
	}

	private JMenu getMenu_3() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMenuItem_4());
		}
		return mnHelp;
	}

	private JMenuItem getMenuItem_4() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Aplikacija Menjacnica, autor Nikola Stojicic 270/16", "About",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}

	private JMenuItem getMenuItem_5() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ucitaj();
				}
			});
			mntmOpen.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}

	private JMenuItem getMenuItem_6() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sacuvaj();
				}
			});
			mntmSave.setIcon(
					new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}

	private JMenuItem getMenuItem_7() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izlaz();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}

	private JPanel getPanel_1() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(120, 10));
			panel.add(getBtnDodajKurs());
			panel.add(getBtnObriiKurs());
			panel.add(getBtnIzvriZamenu());
		}
		return panel;
	}

	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziDodajKursGUI();
				}
			});
			btnDodajKurs.setPreferredSize(new Dimension(115, 25));
		}
		return btnDodajKurs;
	}

	private JButton getBtnObriiKurs() {
		if (btnObriiKurs == null) {
			btnObriiKurs = new JButton("Obri\u0161i kurs");
			btnObriiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziObrisiKursGUI();
				}
			});
			btnObriiKurs.setPreferredSize(new Dimension(115, 25));
		}
		return btnObriiKurs;
	}

	private JButton getBtnIzvriZamenu() {
		if (btnIzvriZamenu == null) {
			btnIzvriZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvriZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziIzvrsiZamenuGUI();
				}
			});
			btnIzvriZamenu.setPreferredSize(new Dimension(115, 25));
		}
		return btnIzvriZamenu;
	}

	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(10, 80));
			panel_1.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setLayout(new GridLayout(0, 1, 0, 0));
			panel_1.add(getScrollPane());
		}
		return panel_1;
	}

	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
		}
		return textPane;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextPane());
		}
		return scrollPane;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTable());
		}
		return scrollPane_1;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setFillsViewportHeight(true);
			table.setModel(new DefaultTableModel(
					new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
					new String[] { "\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }));
			addPopup(table, getPopupMenu());
		}
		return table;
	}

	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private void izlaz() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete iz programa?", "Izlazak",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	public void ucitaj() {
		JFileChooser fc = new JFileChooser();

		int opcija = fc.showOpenDialog(null);

		if (opcija == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			try {
				if (textPane.getText().equals(""))
					textPane.setText("Ucitan fajl: " + f.getName() + ", gde: " + f.getAbsolutePath().toString()
							+ ", predstavlja putanju na disku do fajla kojeg je korisnik izabrao.");
				else
					textPane.setText(textPane.getText() + "\nUcitan fajl: " + f.getName() + ", gde: "
							+ f.getAbsolutePath().toString()
							+ ", predstavlja putanju na disku do fajla kojeg je korisnik izabrao.");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void sacuvaj() {
		JFileChooser fc = new JFileChooser();

		int opcija = fc.showSaveDialog(null);

		if (opcija == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();

			try {
				if (textPane.getText().equals(""))
					textPane.setText("Sacuvan fajl: " + f.getName() + ", gde: " + f.getAbsolutePath().toString()
							+ ", predstavlja putanju na disku do fajla kojeg je korisnik izabrao.");
				else
					textPane.setText(textPane.getText() + "\nSacuvan fajl: " + f.getName() + ", gde: "
							+ f.getAbsolutePath().toString()
							+ ", predstavlja putanju na disku do fajla kojeg je korisnik izabrao.");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void prikaziDodajKursGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI(textPane);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziDodajKursGUI();
				}
			});
		}
		return mntmDodajKurs;
	}

	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziObrisiKursGUI();
				}
			});
		}
		return mntmObrisiKurs;
	}

	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
			mntmIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziIzvrsiZamenuGUI();
				}
			});
		}
		return mntmIzvrsiZamenu;
	}

	public static void azurirajStatus(JTextPane textPane, String text) {
		if (textPane.getText().equals(""))
			textPane.setText(text);
		else
			textPane.setText(textPane.getText() + "\n" + text);
	}

	public void prikaziObrisiKursGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI(textPane);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void prikaziIzvrsiZamenuGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI(textPane);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
