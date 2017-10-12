import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Listar extends JFrame {

	private JPanel contentPane;
	private JLabel exibir;
	private JLabel quantCad;
	private static SistemaAcademia l = new SistemaAcademia();
	private int num =0;
	private JButton btnNewButton;
	public Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		exibir = new JLabel("");
		exibir.setBounds(36, 126, 450, 32);
		contentPane.add(exibir);

		JLabel lblListaDeAlunos = new JLabel("Lista de alunos cadastrados");
		lblListaDeAlunos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblListaDeAlunos.setBounds(135, 11, 196, 37);
		contentPane.add(lblListaDeAlunos);

		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarAluno(num+1);
				
			}
		});
		btnPrximo.setBounds(242, 271, 89, 23);
		contentPane.add(btnPrximo);

	
		JButton btnVoltarMenu = new JButton("Voltar ao Menu");
		btnVoltarMenu.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVoltarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuEntrada voltar = new MenuEntrada();
				voltar.setVisible(true);
				dispose();
			}
		});
		btnVoltarMenu.setBounds(108, 271, 124, 23);
		contentPane.add(btnVoltarMenu);

		quantCad = new JLabel("");
		quantCad.setBounds(347, 187, 46, 14);
		contentPane.add(quantCad);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarAluno(num-0);
			}
		});
		btnAnterior.setBounds(9, 271, 89, 23);
		contentPane.add(btnAnterior);
		
		JLabel lblNewLabel = new JLabel("Total de alunos:");
		lblNewLabel.setBounds(251, 187, 115, 14);
		contentPane.add(lblNewLabel);
		
		ImageIcon img3 = new ImageIcon("/Users/administrador/Pictures/fundofim2.jpg");;
		JLabel lblImg = new JLabel(img3);
		lblImg.setBounds(0, 0, 465, 305);
		contentPane.add(lblImg);
		l  = new SistemaAcademia();
		
		setLocationRelativeTo( null );
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void listarAluno(int num) {

		
		List<Aluno> b = l.getAlunos();
		quantCad.setText(""+b.size());
		if(b.size()>=1 && num <= b.size()){
			exibir.setText(b.get(num).toString());
		}
	}
	}


