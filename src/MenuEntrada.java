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
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;

public class MenuEntrada extends JFrame {

	private JPanel contentPane;

	private Gravador gra = new Gravador("teste");
	SistemaAcademia sis = new SistemaAcademia();
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
		setBounds(100, 100, 451, 301);
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
				Listar janela2 = new Listar();
				janela2.setVisible(true);
				janela2.listarAluno(0);
				dispose();
			}
		});
		btnListarAluno.setBounds(10, 119, 150, 27);
		contentPane.add(btnListarAluno);
		
		JButton btnExameFisco = new JButton("Exame Fisico");
		btnExameFisco.setBounds(10, 195, 150, 27);
		contentPane.add(btnExameFisco);
		
		JButton btnCadastrarInstrutor = new JButton("Cadastrar Funcion\u00E1rios");
		btnCadastrarInstrutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionario janela1 = new Funcionario();
				janela1.setVisible(true);
				
				dispose();
				
			}
		});
		btnCadastrarInstrutor.setBounds(10, 44, 150, 27);
		contentPane.add(btnCadastrarInstrutor);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						        JOptionPane sair = new JOptionPane();
			        int Sair = sair.showConfirmDialog(null,"Você deseja sair do programa?","Sair",JOptionPane.YES_NO_OPTION);
			      if(Sair == JOptionPane.YES_OPTION){
			    	  String hg = "";
			    	  for(Aluno aa: sis.getAlunos()){
			    		 hg+= aa.toString();
			    	  }
			    	  try {
						gra.GravarDados(hg);
					} catch (IOException e) {
						
						e.printStackTrace();
					}
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
		
		
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.setBounds(10, 157, 150, 27);
		contentPane.add(btnTurmas);
		
		JButton btnNewButton = new JButton("Produtos e Servi\u00E7os");
		btnNewButton.setBounds(10, 234, 150, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Listar Funcion\u00E1rios");
		btnNewButton_1.setBounds(10, 82, 150, 26);
		contentPane.add(btnNewButton_1);
		
		ImageIcon img = new ImageIcon("/Users/administrador/Pictures/fundofim.jpg");;
		JLabel LabImg = new JLabel(img);
		LabImg.setBounds(-36, 0, 564, 301);
		contentPane.add(LabImg);
		
		setLocationRelativeTo( null );
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}
