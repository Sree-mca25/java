import javax.swing.*;
import java.awt.*;

public class MetricConversionApp extends JFrame {
private JLable cmLabel;
private JTextField CmTextField;
private JLable inchLabel;
private JTextField inchTextField;
private JButton convertButton;

public MetricConversionApp(){
setTitle("Metric Conversion");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(300, 150);
setLayout(new FlowLayout());

cmLabel = new JFrame("Centimeters:");
cmTextField = new JTextField(10);
inchLabel = new JLable("Inches:");
inchTextField = new JTextField(10);
convertButton = new JButton("Convert");

convertButton.addActionListener(e->{
  try{
     double centimeter = Double.parseDouble(cmTextField.getText());
	 double inches = centimeters /2.54;
	 inchTextField.setText(String.format("%.2f",inches));
	 }catch (NumberFormatExpection ex){
	 JOptionPane.showMessageDialog(null, "Invalid input. Enter a valid number.");
	 }
	 });
	 add(cmLabel);
	 add(cmTextField);
	 add(inchLabel);
	 add(inchTextField);
	 add(convertButton);
	 }
	 public static void main(String[] args){
	   SwingUtilities.invokeLater(()->{
	     MetricConversionApp app = new Metric();
		 app.getRootPane().setDefaultButton(app.convertButton);
		 app.setVisible(true);
		 });
		 }
		 }