/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiar.xd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
/**
 *
 * @author Alumno
 */
public class CopiarXd extends JFrame {
    

    private JTextField copiado;
    private JTextField pegado;
    private JButton btnCopiar;
    private JButton btnPegar;
    private String copiado1;

    public CopiarXd() {
        setTitle("Operaciones Básicas"); // Título de la ventana
        setSize(550, 300); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminar la ejecución al cerrar la ventana
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20)); // Layout de la ventana

        // Inicializar componentes
        copiado = new JTextField(20); // Ajustado el tamaño de la caja de texto
        pegado = new JTextField(20);
        btnCopiar = new JButton("Copiar");
        btnPegar = new JButton("Pegar");

        // Agregar componentes a la ventana
        add(new JLabel("Interfaz de Copiar y Pegar")); // Etiqueta de título
        add(copiado);
        add(pegado);
        add(btnCopiar);
        add(btnPegar);

        // Añadir acciones a los botones
        btnCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnPegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
    }

    private void btnCopiarActionPerformed(ActionEvent evt) {
        copiado1 = copiado.getText(); // Guardar el texto de la primera caja
    }

    private void btnPegarActionPerformed(ActionEvent evt) {
        pegado.setText(copiado1); // Pegar el texto en la segunda caja
    }

    public static void main(String[] args) {
        CopiarXd ventana = new CopiarXd();
        ventana.setVisible(true); // Activar la ventana
    }
    
    
}