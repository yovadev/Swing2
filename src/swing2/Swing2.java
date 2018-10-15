package swing2;
/* importar libreria */
import javax.swing.*;
/* importar libreria de eventos */
import java.awt.event.*;


public class Swing2 extends JFrame implements ActionListener {
    
    private JTextField camporellenable;
    private JLabel etiqueta;
    private JButton boton;
    private JButton botonsalida; 
    
    public Swing2() {
        setLayout(null);
        etiqueta = new JLabel("Escribir titulo de la ventana");
        etiqueta.setBounds(10, 10, 200, 50);
        add(etiqueta);
        
        camporellenable = new JTextField();
        camporellenable.setBounds(170, 20, 150, 30);
        add(camporellenable);
        
        boton = new JButton("Cambiar");
        boton.setBounds(170, 60, 120, 30);
        add(boton);
        boton.addActionListener(this);
              
          
        /** boton */
        botonsalida = new JButton("Salir");
        botonsalida.setBounds(170, 100, 100, 30);
        add(botonsalida);
        botonsalida.addActionListener(this);
        
    
        
    }
      
    
    /** codigo boton poner titulo*/
    public void actionPerformed(ActionEvent ex){
    if(ex.getSource() == boton){
        String titulo = camporellenable.getText();
        setTitle(titulo);
    }
    
    if(ex.getSource() == botonsalida){
           System.exit(0);
    }
   
    }
    /** fin codigo boton poner titulo*/

    public static void main(String[] args) {
        Swing2 ventana1 = new Swing2();
        /* tamaño de la ventana */
        ventana1.setBounds(10, 10, 330,250);
        /* visibilidad de la ventana */
        ventana1.setVisible(true);
        /* escalabilidad de la ventana*/
        ventana1.setResizable(false);
    }

}
