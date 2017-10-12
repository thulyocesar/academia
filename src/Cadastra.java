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
import java.awt.Font;

public class Cadastra extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfMatri;
	private JTextField tfTipoEx;
	private JTextField tfEnd;
	private JTextField tfCPF;
	private JTextField tfTel;
	private JTextField textField;

	
	public Cadastra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(74, 39, 45, 17);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(74, 56, 468, 21);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sexo:");
		lblNewLabel.setBounds(421, 83, 39, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblMatricula = new JLabel("ID:");
		lblMatricula.setBounds(10, 39, 30, 17);
		contentPane.add(lblMatricula);
		
		tfMatri = new JTextField();
		tfMatri.setBounds(10, 56, 45, 21);
		contentPane.add(tfMatri);
		tfMatri.setColumns(10);
		
		JLabel lblTipoDeExerco = new JLabel("Tipo de Exercicio:");
		lblTipoDeExerco.setBounds(10, 83, 115, 17);
		contentPane.add(lblTipoDeExerco);
		
		tfTipoEx = new JTextField();
		tfTipoEx.setBounds(10, 103, 125, 21);
		contentPane.add(tfTipoEx);
		tfTipoEx.setColumns(10);
		ImageIcon img2 = new ImageIcon("/Users/administrador/Pictures/final.jpg");;
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(421, 103, 123, 21);
		contentPane.add(comboBox);
		comboBox.addItem("Masculino");
		comboBox.addItem("Feminino");
		
		tfEnd = new JTextField();
		tfEnd.setBounds(10, 153, 263, 21);
		contentPane.add(tfEnd);
		tfEnd.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(283, 103, 128, 21);
		contentPane.add(tfCPF);
		tfCPF.setColumns(10);
		
		tfTel = new JTextField();
		tfTel.setBounds(145, 103, 128, 21);
		contentPane.add(tfTel);
		tfTel.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CPF:");
		lblNewLabel_5.setBounds(283, 84, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setBounds(145, 84, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Endere\u00E7o:");
		lblNewLabel_3.setBounds(10, 135, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnSalvarCadastro = new JButton("Salvar ");
		btnSalvarCadastro.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSalvarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SistemaAcademia cadastro = new SistemaAcademia();
				try {
					//String nome, int matricula, String TipoDeExercicio
					
					cadastro.cadastrarAluno(tfNome.getText(), Integer.parseInt(tfMatri.getText()), tfTipoEx.getText());
					JOptionPane.showMessageDialog(null, "Usuario cadastradado com sucesso");
					limparAluno();
					
					
				} catch (AlunoInexistenteException  | NumberFormatException e1) {
				
					
					JOptionPane.showMessageDialog(null,e1.getMessage());	
				}
				
			}
		});
		btnSalvarCadastro.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSalvarCadastro.setBounds(352, 197, 89, 23);
		contentPane.add(btnSalvarCadastro);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.setBounds(451, 197, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Alterar");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBounds(208, 197, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Remover");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBounds(109, 197, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Inserir");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_4.setBounds(10, 197, 89, 23);
		contentPane.add(button_4);
		
		JButton button = new JButton("Voltar para o menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuEntrada voltar = new MenuEntrada();
				voltar.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.setBounds(380, 252, 162, 27);
		contentPane.add(button);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(283, 135, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel_4 = new JLabel("Estado:");
		lblNewLabel_4.setBounds(421, 135, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(283, 153, 128, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(421, 153, 123, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel(img2);
		lblNewLabel_1.setBounds(-33, -31, 620, 321);
		contentPane.add(lblNewLabel_1);
		
		setLocationRelativeTo( null );
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void limparAluno (){
		tfNome.setText("");
		tfMatri.setText("");
		tfTipoEx.setText("");
	}
}
