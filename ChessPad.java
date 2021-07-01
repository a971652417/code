package Chapter4;
import java.awt.*;
import java.awt.event.*;
public class ChessPad extends Panel implements MouseListener,ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x=-1,y=-1,chessmancolor=1;
	Button btn=new Button("重新开局");
	TextField text_1=new TextField("请黑棋下子");
	TextField text_2=new TextField();
	ChessPad(){ //棋盘构造方法
		this.setSize(440,400);//设置棋盘长宽
		this.setBackground(Color.pink);
		this.setLayout(null);
		addMouseListener(this);
		this.add(btn);
		//将两个提示文本框加入面板，并设置其位置和大小
		this.add(text_1);
		text_1.setBounds(90,5,90,24);
		this.add(text_2);
		text_2.setBounds(290,5,90,24);
		//设置文本框不被编辑
		text_1.setEditable(false);
		text_2.setEditable(false);
	}
	public void paint(Graphics g) {
		for(int i=40;i<=380;i=i+20) {
			g.drawLine(40,i,400,i);
		}
		g.drawLine(40, 400, 400, 400);
		for(int j=40;j<=380;j=j+20) {
			g.drawLine(j, 40, j, 400);
		}
		g.drawLine(400, 40, 400, 400);
		g.fillOval(97, 97, 6, 6);
		g.fillOval(337, 97, 6, 6);
		g.fillOval(97, 377, 6, 6);
		g.fillOval(377, 337, 6, 6);
		g.fillOval(217, 217, 6, 6);
	}
	@SuppressWarnings("deprecation")
	public void mousePressed(MouseEvent e){
		if(e.getModifiers()==InputEvent.BUTTON1_MASK) {
			x=(int)e.getX();
			y=(int)e.getY();
			ChessPoint_black blackPoint=new ChessPoint_black(this);
			ChessPoint_white whitePoint=new ChessPoint_white(this);
			int a=(x+10)/20,b=(y+10)/20;
			if(x/20<2||y/20<2||x/20>19||y/20>19) {
			}else {
				if(chessmancolor==1) {
					this.add(blackPoint);
					blackPoint.setBounds(a*20-7,b*20-7,16,16);
					chessmancolor=chessmancolor*(-1);
					text_2.setText("请白棋下子");
					text_1.setText("");
				}else if(chessmancolor==-1) {
					this.add(whitePoint);
					whitePoint.setBounds(a*20-7,b*20-7,16,16);
					chessmancolor=chessmancolor*(-1);
					text_1.setText("请黑棋下子");
					text_2.setText("");
				}
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		this.removeAll();
		chessmancolor=1;add(btn);
		btn.setBounds(10,5,60,26);
		text_1.setBounds(90,5,90,24);
		text_1.setText("请黑棋下子");
		add(text_1);
		text_2.setText("");
		text_2.setBounds(290,5,90,24);
		add(text_2);
		text_1.setEditable(false);
		text_2.setEditable(false);
	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}