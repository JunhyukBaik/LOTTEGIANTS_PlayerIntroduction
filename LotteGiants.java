import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;

public class LotteGiants extends JFrame implements ActionListener{

	
	public static final int WIDTH = 700;
	public static final int HEIGHT = 500;
	private JLabel title;
	private JPanel numberPanel;
	private static JPanel infoPanel = new JPanel(); // �ٸ� �޼ҵ忡�� �̹��� ������ ���ؼ� ���⿡ ����
	ImageIcon leedaeho = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\�̴�ȣ.png");
	Image daeho = leedaeho.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon ho = new ImageIcon(daeho);
	JLabel lee = new JLabel(ho);
	
	ImageIcon junjunwoo = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\���ؿ�.png");
	Image junwoo = junjunwoo.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon woo = new ImageIcon(junwoo);
	JLabel jun = new JLabel(woo);
	
	ImageIcon sonahsub = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\�վƼ�.png");
	Image ahsub = sonahsub.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon sub = new ImageIcon(ahsub);
	JLabel son = new JLabel(sub);
	
	ImageIcon minbyunghun = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\�κ���.png");
	Image byunghun = minbyunghun.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon hun = new ImageIcon(byunghun);
	JLabel min = new JLabel(hun);
	
	ImageIcon straily = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\��Ʈ���ϸ�.png");
	Image raily = straily.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon ily = new ImageIcon(raily);
	JLabel ly = new JLabel(ily);
	
	public static void main(String[] args) {
		LotteGiants gui = new LotteGiants();
		gui.setVisible(true);
	}
	
	public LotteGiants()
	{
		super("Lotte Giants BEST5 Player");
		setSize(WIDTH, HEIGHT);
		getContentPane().setBackground(Color.yellow);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		
		File file = new File("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\�λ갥�ű�.wav");
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		ImageIcon lotte = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\lotte.png");
		Image lott = lotte.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
		ImageIcon lot = new ImageIcon(lott);
		JLabel te = new JLabel(lot);
		
		title = new JLabel("�Ե� ���̾��� BEST5 ����");
		title.setSize(300,50);
		title.setLocation(210,40);
		title.setForeground(Color.BLUE);
		title.setFont(new Font("Serif", Font.BOLD, 22));
		add(title);
	
		numberPanel = new JPanel();
		numberPanel.setLayout(new GridLayout(10,1,10,10));
		numberPanel.setLocation(80,160);
		numberPanel.setSize(230,500);
		numberPanel.setBackground(Color.yellow);
		
		JButton pButton1 = new JButton("�̴�ȣ");
		pButton1.addActionListener(this);
		ImageIcon leei = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\�̴�ȣ ������.png");
		pButton1.setIcon(leei);
		pButton1.setBackground(Color.red);
		
		JButton pButton2 = new JButton("���ؿ�");
		pButton2.addActionListener(this);
		ImageIcon juni = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\���ؿ� ������.png");
		pButton2.setIcon(juni);
		pButton2.setBackground(Color.orange);
		
		JButton pButton3 = new JButton("�վƼ�");
		pButton3.addActionListener(this);
		ImageIcon soni = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\�վƼ� ������.png");
		pButton3.setIcon(soni);
		pButton3.setBackground(Color.green);
		
		JButton pButton4 = new JButton("�κ���");
		pButton4.addActionListener(this);
		ImageIcon mini = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\�κ��� ������.png");
		pButton4.setIcon(mini);
		pButton4.setBackground(Color.blue);
		
		JButton pButton5 = new JButton("��Ʈ���ϸ�");
		pButton5.addActionListener(this);
		ImageIcon sti = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\��Ʈ���ϸ� ������.png");
		pButton5.setIcon(sti);
		pButton5.setBackground(Color.magenta);

		numberPanel.add(pButton1);
		numberPanel.add(pButton2);
		numberPanel.add(pButton3);
		numberPanel.add(pButton4);
		numberPanel.add(pButton5);
		
		infoPanel.setBorder(new LineBorder(Color.blue,2));
		infoPanel.setLocation(360,130);
		infoPanel.setSize(280,320);
		infoPanel.add(te);
		
		mousepic();
		add(numberPanel);	
		add(infoPanel);
	}
	
	public void mousepic()
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		Image mouseimg = t.getImage("C:\\Users\\jhb60\\OneDrive\\���� ȭ��\\�İ�\\FinalProject\\src\\image\\���ű�.jpeg");
		Point pt = new Point(25,25);
		Cursor cs = t.createCustomCursor(mouseimg, pt, "GGiruk");
		numberPanel.setCursor(cs);
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		String playername = e.getActionCommand();
		infoPanel.removeAll();
		if (playername.equals("�̴�ȣ"))
		{
			infoPanel.add(lee);
		}
		else if (playername.equals("���ؿ�"))
		{
			infoPanel.add(jun);
		}
		else if (playername.equals("�վƼ�"))
		{
			infoPanel.add(son);
		}
		else if (playername.equals("�κ���"))
		{
			infoPanel.add(min);
		}
		else
		{
			infoPanel.add(ly);
		}
		infoPanel.updateUI();
	}
}
