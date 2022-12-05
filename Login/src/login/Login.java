/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.*;

import java.sql.SQLException;

public class Login {
 public void agregar()
	{
		Connection conexion = null;
		Statement sentencia = null;
		ResultSet registros = null;
		
                String cadenaSql="";
		
                    //1.- inicializar el driver
		try
		{	Class.forName("com.mysql.jdbc.Driver");	
			System.out.println("Ya inicialicé el Driver");
		} 
		catch (Exception e)
		{	System.err.println("No se pudo inicializar el driver!");
			e.printStackTrace();				
		}
	
		//2.- Establecer la conexion
		//De la Clase DriverManager utilizaremos el método getConnection
		try
		{	conexion = DriverManager.getConnection("jdbc:mysql://localhost/Recaudacion_rentas","root", "");
			System.out.println("Ya hice el getConnection");
		}		
		catch(SQLException e)
		{	System.err.println("No se pudo conectar a la Base de Datos");
		}
		
		//3.- Para consultar, insertar nuevos registros, modificar los existentes o borrar 
		//se debe crear un objeto de tipo Statement.
		try
		{	sentencia = conexion.createStatement();
                        cadenaSql="INSERT INTO registro de contribuyente VALUES('nombre','ID')";
		      
                       sentencia.executeUpdate(cadenaSql);
			System.out.println("Ya ejecuté la sentencia SQL");
		}
		catch(Exception e)
		{	System.err.println("No se pudo ejecutar la sentencia!!");
			System.err.println(e.getMessage() );
		}
		
		
	}//modificar
    public static void main(String[] args) {
        Login escolaresIniciar=new Login();
        
        escolaresIniciar.agregar();
       
    }
    
}
