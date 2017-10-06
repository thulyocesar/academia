import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Cadastra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	
	public Cadastra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(90, 39, 45, 17);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(155, 103, 128, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sexo:");
		lblNewLabel.setBounds(222, 39, 39, 17);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 56, 125, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(20, 39, 69, 17);
		contentPane.add(lblMatricula);
		
		textField_2 = new JTextField();
		textField_2.setBounds(20, 56, 60, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTipoDeExerco = new JLabel("Tipo de Exercicio:");
		lblTipoDeExerco.setBounds(20, 83, 115, 17);
		contentPane.add(lblTipoDeExerco);
		
		textField_3 = new JTextField();
		textField_3.setBounds(20, 103, 125, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnVoltarParaO = new JButton("Voltar para o menu");
		btnVoltarParaO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuEntrada voltar = new MenuEntrada();
				voltar.setVisible(true);
				dispose();
			}
		});
		btnVoltarParaO.setBounds(113, 224, 162, 27);
		contentPane.add(btnVoltarParaO);
		
		JButton btnSalvarCadastro = new JButton("Salvar cadastro");
		btnSalvarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SistemaAcademia cadastro = new SistemaAcademia();
				try {
					cadastro.cadastrarAluno(textField.getText(), textField_1.getText(), Integer.parseInt(textField_2.getText()), textField_3.getText());
					JOptionPane.showMessageDialog(null, "Usuario cadastradado com sucesso");
					
				} catch (AlunoInexistenteException  | NumberFormatException e1) {
				
					
				e1.getMessage();	
				}
				
			}
		});
		btnSalvarCadastro.setBounds(285, 224, 142, 27);
		contentPane.add(btnSalvarCadastro);
		ImageIcon img2 = new ImageIcon("/Users/administrador/Pictures/fundo6.jpg");;
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(222, 56, 61, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Masculino");
		comboBox.addItem("Feminino");
		
		textField_4 = new JTextField();
		textField_4.setBounds(20, 153, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(113, 153, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(209, 153, 74, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CPF:");
		lblNewLabel_5.setBounds(209, 135, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setBounds(155, 84, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Endere\u00E7o:");
		lblNewLabel_3.setBounds(20, 135, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dat.nasc:");
		lblNewLabel_4.setBounds(113, 135, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel(img2);
		lblNewLabel_1.setBounds(-47, 0, 501, 284);
		contentPane.add(lblNewLabel_1);
		
		setLocationRelativeTo( null );
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
