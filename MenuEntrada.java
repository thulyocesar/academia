import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;

public class MenuEntrada extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEntrada frame = new MenuEntrada();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	
	public MenuEntrada() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar Alunos");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Cadastra janela1 = new Cadastra();
				janela1.setVisible(true);
				dispose();
				
			}
		});
		btnCadastrar.setBounds(10, 6, 150, 27);
		contentPane.add(btnCadastrar);
		
		JButton btnListarAluno = new JButton("Listar Alunos");
		btnListarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListarAluno.setBounds(10, 82, 105, 27);
		contentPane.add(btnListarAluno);
		
		JButton btnExameFisco = new JButton("Exame Fisico");
		btnExameFisco.setBounds(10, 158, 120, 27);
		contentPane.add(btnExameFisco);
		
		JButton btnCadastrarInstrutor = new JButton("Cadastrar Funcionario");
		btnCadastrarInstrutor.setBounds(10, 44, 167, 27);
		contentPane.add(btnCadastrarInstrutor);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						        JOptionPane sair = new JOptionPane();
			        int Sair = sair.showConfirmDialog(null,"Você deseja sair do programa?","Sair",JOptionPane.YES_NO_OPTION);
			      if(Sair == JOptionPane.YES_OPTION){
			           System.exit(0);
			       this.dispose();

			      }else{
			         if(Sair == JOptionPane.NO_OPTION){

			         }
			      }


			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
	                  
				
			
		});
		btnSair.setBounds(329, 11, 105, 27);
		contentPane.add(btnSair);
		
		ImageIcon img = new ImageIcon("/Users/administrador/Pictures/fundo.jpg");;
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.setBounds(10, 120, 95, 27);
		contentPane.add(btnTurmas);
		
		JButton btnNewButton = new JButton("Produtos e Servi\u00E7os");
		btnNewButton.setBounds(10, 196, 167, 27);
		contentPane.add(btnNewButton);
		
		JLabel LabImg = new JLabel(img);
		LabImg.setBounds(-78, -23, 541, 295);
		contentPane.add(LabImg);
		
		setLocationRelativeTo( null );
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}
