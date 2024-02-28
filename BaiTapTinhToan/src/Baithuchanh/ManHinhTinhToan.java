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
	private JTextField textA;
	private JTextField textB;
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
		
		JLabel lblNewLabel_1 = new JLabel("nhap so b");
		lblNewLabel_1.setBounds(49, 112, 89, 29);
		contentPane.add(lblNewLabel_1);
		
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
		
		textketqua = new JTextField();
		textketqua.setEditable(false);
		textketqua.setBounds(128, 273, 324, 20);
		contentPane.add(textketqua);
		textketqua.setColumns(10);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamSuLyCong();
			}
		});
		btnCong.setBounds(49, 192, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamSuLyTru();
			}
		});
		btnTru.setBounds(163, 192, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamSuLyNhan();
			}
		});
		btnNhan.setBounds(278, 192, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamSuLyChia();
			}
		});
		btnChia.setBounds(397, 192, 89, 23);
		contentPane.add(btnChia);
	}
	void HamSuLyCong() {
		String str_A = textA.getText();
		String str_B = textB.getText();
		double A = Double.parseDouble(str_A);
		double B = Double.parseDouble(str_B);
		double Tong = A + B;
		textketqua.setText(String.valueOf(Tong));
	}
	void HamSuLyTru() {
	    String str_A = textA.getText();
	    String str_B = textB.getText();
	    double A = Double.parseDouble(str_A);
	    double B = Double.parseDouble(str_B);
	    double Hieu = A - B;
	    textketqua.setText(String.valueOf(Hieu));
	}
	void HamSuLyNhan() {
	    String str_A = textA.getText();
	    String str_B = textB.getText();
	    double A = Double.parseDouble(str_A);
	    double B = Double.parseDouble(str_B);
	    double Tich = A * B;
	    textketqua.setText(String.valueOf(Tich));
	}
	void HamSuLyChia() {
	    String str_A = textA.getText();
	    String str_B = textB.getText();
	    double A = Double.parseDouble(str_A);
	    double B = Double.parseDouble(str_B);
	    double Thuong = A / B;
	    textketqua.setText(String.valueOf(Thuong));
	}
}
