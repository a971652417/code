package Chapter4;
import java.awt.*;
import java.awt.event.*;
public class Chess extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ChessPad cp=new ChessPad();
	Chess(){
		this.setLayout(null);
		Label lb=new Label("µ¥»÷×ó¼üÏÂ×Ó£¬Ë«»÷³Ô×Ó£¬ÓÒ¼ü»ÚÆå",Label.CENTER);
		lb.setBounds(70,55,440,26);
		lb.setBackground(Color.orange);
		add(lb);
		add(cp);
		cp.setBounds(70,90,440,440);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(600,550);
		setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		Chess cs = new Chess();
	}
}
