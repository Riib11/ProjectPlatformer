package system;
import java.awt.Graphics;
import java.awt.Graphics2D;


//imports
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MainOperator extends JFrame {
	
	static JFrame window;
	
	String gameState = "StartMenu";
	
	StartMenu startMenu = new StartMenu();
	GameScreen gameScreen = new GameScreen();
	
	public MainOperator(){
		
		
		
		
	}
	
	public static void main(String[] args){
		
		window = new MainOperator();
		window.setSize(300, 300);
		window.setResizable(false);
		window.setTitle("Project Platformer");
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
	}
	
	//TODO Finish this Screen/Component thing
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		//window.add(arg0);
		
	}
	
	
	
	
	
	
	
	
}





