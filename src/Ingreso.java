import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso extends JFrame{
    private JPanel ingresoPanel;
    private JButton divisionButton;
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton multiplicacionButton;
    private JButton restaButton;
    private JButton sumaButton;

    Double numero1 = 0.0;
    Double numero2 = 0.0;
    public Ingreso(){
        super("Ingreso de numeros");
        setContentPane(ingresoPanel);
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obtenerDatos();
                suma(numero1,numero2);
            }
        });
        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    obtenerDatos();
                    multiplicacion(numero1,numero2);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        });
    }
    public void obtenerDatos(){
        String num1 = num1Field.getText();
        String num2 = num2Field.getText();

        numero1 = Double.parseDouble(num1);
        numero2 = Double.parseDouble(num2);

    }

    public void seteo(){
        num1Field.setText("");
        num2Field.setText("");
    }

    public void suma(double num1, double num2){
        JOptionPane.showMessageDialog(null, "Su resultado es: "+(num1+num2));
        seteo();
    }
    public void multiplicacion(double num1, double num2){
        JOptionPane.showMessageDialog(null, "Su resultado es: "+(num1*num2));
        seteo();
    }

}

