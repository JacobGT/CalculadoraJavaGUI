package gui;

import java.awt.Color;
//import java.awt.Dimension; se importa para set minimum y maximum size
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ventana extends JFrame{    
    public Ventana() {
        setSize(500, 700); //Establecemos el tamaño de la ventana
        //setLocation(300, 250); //Establecemos la posicion inicial de la ventana
        //setBounds(300, 250, 500, 700); //este metodo utiliza y unifica los metodos setLocation y setSize en ese mismo orden
        // this.setBounds(x, y, width, height);
        setLocationRelativeTo(null); //Establecemos la posicion inicial de la ventana relativa a el centro de la pantalla
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Establecemos que el codigo se detenga al cerrar la ventana
        setTitle("Inicio / Tutorial"); //Establecemos el titulo de la ventana
        
        //this.getContentPane();//Obtenemos el contenido de la ventana
        this.getContentPane().setBackground(Color.BLACK);//Establecemos el color de la ventana
        getContentPane().setForeground(Color.green);//Establecemos el color de las letras
        
        setResizable(false); //Establecemos si la ventana puede cambiar de tamaño
        //setMinimumSize(new Dimension (200, 200));//Establecemos un tamaño minimo
        //setMaximumSize(new Dimension (700, 900)); //Establecemos un tamaño maximo  
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        //Paneles
        JPanel p1 = new JPanel();
        getContentPane().add(p1);//Agregamos el panel a la ventana
        p1.setLayout(null);//Desactivamos el layout default
        p1.setBackground(Color.BLACK);
        
        //Etiquetas
        //Las etiquetas puden ser texto o imagenes
        //Las siguientes dos lineas es una forma de hacerlo
        //String texto = "Aqui ponemos el texto.";
        //JLabel l1 = new JLabel(texto);//Creamos etiqueta de texto
        //Tambien se puede hacer lo siguiente //JLabel label = new JLabel("Aqui ponemos el texto.");
        JLabel l1 = new JLabel();
        l1.setText("Hola."); //Este es otra forma de hacerlo.
        //Si no desactivamos el layout en el panel, la etiqueta aparece en el entro
        l1.setBounds(200, 10, 30, 20);//Si desactivamos el layout default ya podemos definir los bordes y posicion
        l1.setForeground(Color.GREEN);
        //l1.setOpaque(true);//Quitamos la transparencia de la qtiqueta
        //l1.setBackground(Color.white);//Le ponemos color de fondo a la etiqueta
        
            
        p1.add(l1);//Agregamos etiqueta al panel
        
        
        
        }
}
