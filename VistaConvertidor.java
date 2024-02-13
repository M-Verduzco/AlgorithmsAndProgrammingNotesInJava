package Ejecutables;
import javax.swing.*;
public class VistaConvertidor extends JFrame{
	
	private JLabel lbPesos, lbDolares;
	private JTextField txPesos, txDolares;
	private JPanel pnPanel;
	
	public VistaConvertidor() {
		lbPesos = new JLabel("Pesos:");
		lbDolares = new JLabel("Dolares:");
		txPesos = new JTextField(16);
		txDolares = new JTextField(16);
		pnPanel = new JPanel();		
		
		pnPanel.add(lbPesos);
		pnPanel.add(txPesos);
		pnPanel.add(lbDolares);
		pnPanel.add(txDolares);
		
		this.add(pnPanel);
		
		this.setBounds(500,500,300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);;
	}
	
	
	
	
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
	
}