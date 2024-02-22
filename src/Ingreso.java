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
                //obtenerDatos();
                //suma(numero1,numero2);
            }
        });
    }

}

