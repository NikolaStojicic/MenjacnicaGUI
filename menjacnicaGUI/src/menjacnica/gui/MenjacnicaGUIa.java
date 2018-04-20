package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUIa extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUIa frame = new MenjacnicaGUIa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUIa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUIa.class.getResource("/icons/icon.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 476);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmNewMenuItem.setIcon(
				new ImageIcon(MenjacnicaGUIa.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		mnFile.add(mntmNewMenuItem);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmSave.setIcon(
				new ImageIcon(MenjacnicaGUIa.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mnFile.add(mntmSave);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setAutoCreateRowSorter(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }));
		table.setToolTipText("");
		scrollPane.setViewportView(table);

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);

		JMenuItem menuItem = new JMenuItem("Open");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		menuItem.setIcon(
				new ImageIcon(MenjacnicaGUIa.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		popupMenu.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("Save");
		menuItem_1.setIcon(new ImageIcon(
				MenjacnicaGUIa.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		menuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		popupMenu.add(menuItem_1);

		JMenuItem menuItem_2 = new JMenuItem("Exit");
		menuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		popupMenu.add(menuItem_2);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(120, 120));
		panel.setMaximumSize(new Dimension(120, 120));
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnNewButton = new JButton("Dodaj kurs");
		btnNewButton.setPreferredSize(new Dimension(115, 25));
		panel.add(btnNewButton);

		JButton btnObrisiKurs = new JButton("Obri\u0161i kurs");
		btnObrisiKurs.setPreferredSize(new Dimension(115, 25));
		panel.add(btnObrisiKurs);

		JButton btnIzvrsiZamenu = new JButton("Izvr\u0161i zamenu");
		btnIzvrsiZamenu.setPreferredSize(new Dimension(115, 25));
		panel.add(btnIzvrsiZamenu);

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 70));
		panel_1.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane_2 = new JScrollPane();
		panel_1.add(scrollPane_2);

		JTextPane textPane = new JTextPane();
		scrollPane_2.setViewportView(textPane);
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

	public void ucitaj() {
		JFileChooser fc = new JFileChooser();

		int opcija = fc.showOpenDialog(null);

		if (opcija == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();

			try {
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
