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
	private static JPanel infoPanel = new JPanel(); // 다른 메소드에서 이미지 변경을 위해서 여기에 선언
	ImageIcon leedaeho = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\이대호.png");
	Image daeho = leedaeho.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon ho = new ImageIcon(daeho);
	JLabel lee = new JLabel(ho);
	
	ImageIcon junjunwoo = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\전준우.png");
	Image junwoo = junjunwoo.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon woo = new ImageIcon(junwoo);
	JLabel jun = new JLabel(woo);
	
	ImageIcon sonahsub = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\손아섭.png");
	Image ahsub = sonahsub.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon sub = new ImageIcon(ahsub);
	JLabel son = new JLabel(sub);
	
	ImageIcon minbyunghun = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\민병헌.png");
	Image byunghun = minbyunghun.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
	ImageIcon hun = new ImageIcon(byunghun);
	JLabel min = new JLabel(hun);
	
	ImageIcon straily = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\스트레일리.png");
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
		
		File file = new File("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\부산갈매기.wav");
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		ImageIcon lotte = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\lotte.png");
		Image lott = lotte.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
		ImageIcon lot = new ImageIcon(lott);
		JLabel te = new JLabel(lot);
		
		title = new JLabel("롯데 자이언츠 BEST5 선수");
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
		
		JButton pButton1 = new JButton("이대호");
		pButton1.addActionListener(this);
		ImageIcon leei = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\이대호 아이콘.png");
		pButton1.setIcon(leei);
		pButton1.setBackground(Color.red);
		
		JButton pButton2 = new JButton("전준우");
		pButton2.addActionListener(this);
		ImageIcon juni = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\전준우 아이콘.png");
		pButton2.setIcon(juni);
		pButton2.setBackground(Color.orange);
		
		JButton pButton3 = new JButton("손아섭");
		pButton3.addActionListener(this);
		ImageIcon soni = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\손아섭 아이콘.png");
		pButton3.setIcon(soni);
		pButton3.setBackground(Color.green);
		
		JButton pButton4 = new JButton("민병헌");
		pButton4.addActionListener(this);
		ImageIcon mini = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\민병헌 아이콘.png");
		pButton4.setIcon(mini);
		pButton4.setBackground(Color.blue);
		
		JButton pButton5 = new JButton("스트레일리");
		pButton5.addActionListener(this);
		ImageIcon sti = new ImageIcon("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\스트레일리 아이콘.png");
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
		Image mouseimg = t.getImage("C:\\Users\\jhb60\\OneDrive\\바탕 화면\\컴공\\FinalProject\\src\\image\\갈매기.jpeg");
		Point pt = new Point(25,25);
		Cursor cs = t.createCustomCursor(mouseimg, pt, "GGiruk");
		numberPanel.setCursor(cs);
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		String playername = e.getActionCommand();
		infoPanel.removeAll();
		if (playername.equals("이대호"))
		{
			infoPanel.add(lee);
		}
		else if (playername.equals("전준우"))
		{
			infoPanel.add(jun);
		}
		else if (playername.equals("손아섭"))
		{
			infoPanel.add(son);
		}
		else if (playername.equals("민병헌"))
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
