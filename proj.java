/**
* This is the main class that implements the java app
* @author Karen Sobtafo
* @version 1.00, 15 January 2019
*/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class proj {

	private JFrame frame;
	private final JTextField textField = new JTextField();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proj window = new proj();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public proj() {
		initialize();
	}
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JButton btnCityhall = new JButton("Circle #35");
		btnCityhall.setIcon(new ImageIcon("C:\\Users\\jordan\\Desktop\\circle_yellow"));
		btnCityhall.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCityhall.setBackground(Color.GRAY);
		btnCityhall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton btnnew = new JButton("idk yet");
				JOptionPane.showMessageDialog(null, "Circle ID: 35, radius: 2, color: yellow ");

			}
		});
		frame.getContentPane().add(btnCityhall, BorderLayout.SOUTH);

		//--------------------------------------------------------------------
		JButton btnSchool = new JButton("Square#103");
		btnSchool.setIcon(new ImageIcon("C:\\Users\\jordan\\Desktop\\square_shape"));
		btnSchool.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSchool.setBackground(Color.BLUE);
		btnSchool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Square ID: 103, side: 3 , color: yellow ");
			}
		});
		frame.getContentPane().add(btnSchool, BorderLayout.EAST);
		//-------------------------------------------------------------------------
		JButton btnTriangle = new JButton("Triangle#324");
		btnTriangle.setIcon(new ImageIcon("C:\\Users\\jordan\\Desktop\\triangle.png"));
		btnTriangle.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTriangle.setBackground(Color.WHITE);
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Triangle ID: 324, side1: 8, side2: 2, side3: 1, color: red ");
				
			}
		});
		frame.getContentPane().add(btnTriangle, BorderLayout.CENTER);
		//-----------------------------------------------------------------------
			JButton btnRectangle = new JButton("Rectangle#210");
		btnRectangle.setIcon(new ImageIcon("C:\\Users\\jordan\\Desktop\\triangle.jpg"));
		btnRectangle.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRectangle.setBackground(Color.ORANGE);
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " Rectangle ID: 210, length: 9, width: 1, color: blue");
			}
		});
		frame.getContentPane().add(btnRectangle, BorderLayout.WEST);
	}

}
