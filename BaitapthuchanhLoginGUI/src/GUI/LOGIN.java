package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textDangnhap;
    private JTextField textMatKhau;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LOGIN frame = new LOGIN();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LOGIN() {
        setTitle("Đăng nhập");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 742, 420);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Tên Đăng nhập");
        lblNewLabel.setBounds(40, 37, 117, 22);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Mật khẩu");
        lblNewLabel_1.setBounds(40, 115, 96, 14);
        contentPane.add(lblNewLabel_1);

        textDangnhap = new JTextField();
        textDangnhap.setBounds(146, 38, 463, 20);
        contentPane.add(textDangnhap);
        textDangnhap.setColumns(10);

        textMatKhau = new JTextField();
        textMatKhau.setBounds(146, 112, 463, 20);
        contentPane.add(textMatKhau);
        textMatKhau.setColumns(10);

        JButton btnLogin = new JButton("Đăng Nhập");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textDangnhap.getText();
                String password = textMatKhau.getText();

                if (username.equals("63CNTT") && password.equals("123")) {
                    Mainscreen mainscreen = new Mainscreen();
                    mainscreen.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không chính xác. Vui lòng thử lại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    textDangnhap.setText("");
                    textMatKhau.setText("");
                    textDangnhap.requestFocus();
                }
            }
        });
        btnLogin.setBounds(297, 204, 117, 23);
        contentPane.add(btnLogin);
    }
}