package Baithuchanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textA;
	private JTextField textB;
	private JTextField textField_4;
	private JTextField textketqua;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhTinhToan frame = new ManHinhTinhToan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ManHinhTinhToan() {
		setTitle("Chuong trinh tinh toan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhap so a");
		lblNewLabel.setBounds(49, 36, 89, 29);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(42, 40, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("nhap so b");
		lblNewLabel_1.setBounds(49, 112, 89, 29);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(42, 116, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textA = new JTextField();
		textA.setBounds(196, 40, 278, 20);
		contentPane.add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setBounds(198, 115, 275, 20);
		contentPane.add(textB);
		textB.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả");
		lblNewLabel_2.setBounds(24, 276, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 273, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textketqua = new JTextField();
		textketqua.setEditable(false);
		textketqua.setBounds(128, 273, 324, 20);
		contentPane.add(textketqua);
		textketqua.setColumns(10);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.setBounds(49, 192, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnTru.setBounds(145, 192, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.setBounds(250, 192, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChia.setBounds(349, 192, 89, 23);
		contentPane.add(btnChia);
	}
}
