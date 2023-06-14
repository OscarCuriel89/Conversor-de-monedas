package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class VentanaCoversor2 extends JFrame {

	private JPanel contentPane;
	int monedaI, monedaF;
	double valor;
	private JTextField textMonto;
	private JLabel lblResultado;
	private JComboBox cmbI;
	private JComboBox cmbF;
	;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCoversor2 frame = new VentanaCoversor2();
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
	public VentanaCoversor2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(174, 10, 80, 20);
		contentPane.add(lblNewLabel);
		
		cmbI = new JComboBox();
		cmbI.addMouseListener(null);
		cmbI.setModel(new DefaultComboBoxModel(new String[] {"PESO", "USD", "EUR", "LIBRA ESTER", "YEN JAP", "WON "}));
		cmbI.setBounds(144, 85, 80, 21);
		contentPane.add(cmbI);
		
		cmbF = new JComboBox();
		cmbF.setModel(new DefaultComboBoxModel(new String[] {"PESO", "USD", "EUR", "LIBRA ESTER", "YEN JAP", "WON"}));
		cmbF.setBounds(144, 145, 80, 20);
		contentPane.add(cmbF);
		
		JLabel lblNewLabel_1 = new JLabel("Convertir de");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(31, 93, 80, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Convertir a");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(31, 153, 80, 13);
		contentPane.add(lblNewLabel_2);
		
		lblResultado = new JLabel("0.00");
		lblResultado.setBounds(144, 218, 91, 13);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(31, 217, 80, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {double valor= Double.parseDouble(textMonto.getText());
				
				int divisa1 = cmbI.getSelectedIndex();
				int divisa2 = cmbF.getSelectedIndex();
				
				
				Operaciones puente = new Operaciones();
				
				puente.setValor(valor);
				puente.setDivisa1(divisa1);
				puente.setDivisa2(divisa2);
			
				
				double resultado= puente.Operaciones();
				
			
				
				lblResultado.setText(resultado+"");}catch(NumberFormatException exception){
					JOptionPane.showMessageDialog(null, "Error ingreso de datos", 
							"ERROR", JOptionPane.ERROR_MESSAGE);
					System.out.println(exception.getMessage());
				}
				
				
			}
		});
		btnConvertir.setBounds(246, 186, 102, 21);
		contentPane.add(btnConvertir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMonto.setText("");
				lblResultado.setText("");
			}
		});
		btnLimpiar.setBounds(358, 186, 72, 20);
		contentPane.add(btnLimpiar);
		
		JButton btnNewButton = new JButton("Terminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(279, 232, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4_1 = new JLabel("Cantidad");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(31, 188, 80, 14);
		contentPane.add(lblNewLabel_4_1);
		
		textMonto = new JTextField();
		textMonto.setBounds(139, 187, 96, 19);
		contentPane.add(textMonto);
		textMonto.setColumns(10);
	}
}
