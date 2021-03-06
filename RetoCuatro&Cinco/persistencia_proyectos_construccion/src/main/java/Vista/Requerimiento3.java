package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_3;

public class Requerimiento3 extends JFrame{
    JTable tabla = new JTable();

    public Requerimiento3() throws SQLException {
        this.tabla = initUI();
    }
    //Metodo
    public JTable initUI() throws SQLException{
        String[]nombres= {"Proveedor", "Pagado", "Constructora"};
        JTable tabla = new JTable(mostrar(), nombres ); //objeto tabla
     
        //Color de fondo de las celdas
        tabla.setBackground(new Color(208, 255, 233));
        // Opciones de fuente de los celdas
        tabla.setFont(new Font("Monospaced", Font.ITALIC, 15));

        // Color de fondo de los titulos
        tabla.getTableHeader().setBackground(new Color(80, 211, 202));
        //Opciones de fuente de los titulos
        tabla.getTableHeader().setFont(new Font("Monospaced", Font.BOLD, 18));
        tabla.getTableHeader().setForeground(Color.WHITE);
        return tabla;
    }

    public String[][] mostrar() throws SQLException{ //crea una matriz

        ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>(); //generar objeto crea array que contiene la info del controlado
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos(); //crea objeto

        lista= controlador.consultarRequerimiento3();
        String matriz [][]= new String [lista.size()][5]; //primer corchete a fila y seguno a columna
        for (int i=0; i< lista.size(); i++){
            matriz[i][0]=lista.get(i).getProveedor();
            matriz[i][1]=lista.get(i).getPagado();
            matriz[i][2]=lista.get(i).getConstructora();
        }
        return matriz;
    } 
}
