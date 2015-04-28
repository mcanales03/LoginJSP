package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

	public class conexion {
	   private String name,pass;
	   private Boolean estado = false;
		public Boolean Start(String name ,String password )
	   {
	      this.name = name;
	      this.pass = password;
	      System.out.println("0");
	      try
	      {
	    	  System.out.println("1");
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  System.out.println("1.1");
	    	   Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/persona","root","root");
	    			  System.out.println("6");
	    			  
	    			  Statement st = conexion.createStatement();

	         ResultSet rs = st.executeQuery("select * from persona" );
	         System.out.println("2");
	         while (rs.next())
	         {
	            if(this.estado != true){
	            	this.estado = this.validate(rs.getString("usuario"),rs.getString("contraseña"));
	            	System.out.println("3");
	            }else{
	            		break;
	            } 	 
	         }
	         rs.close();
	         st.close();
	         conexion.close();
	      }
	      catch (Exception e)
	      {
	    	  System.out.println("4");
	    	  return false;
	         
	      }
	      return this.estado;
	   }
		
		public Boolean validate(String nombre, String password){
			if(name.equals(nombre) && pass.equals(password)){ 
				return true;
			}
			else{
				
				return false;
			}
	}
	}
