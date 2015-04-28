package model;


public class ModelLoginBean {

	private String name, password;
	private Boolean sesion = true;
	
	
	
	
	public Boolean getSesion() {
		return this.sesion;
	}

	public void setSesion(boolean sesion) {
		this.sesion = sesion;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void conexion(){
		
		conexion con1 = new conexion();
		this.setSesion(con1.Start(this.name, this.password));
		
	}
	//public boolean validate(){
	//	if(name.equals("root") && password.equals("admin")){ 
	//		this.sesion = true;
	//		return true;
	//	}
	//	else{
	//		this.sesion = false;
	//		return false;
	//	}
			
	}

