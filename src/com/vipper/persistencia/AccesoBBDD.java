package com.vipper.persistencia;

public class AccesoBBDD extends Conexion{
	public String verificarPassword(String usuario) {
		String sql="call abogados.verificarPassword(?);";
		CallableStatement st;
		ResultSet rs;
		String password;
		
		abrirConexion();
		
		st=miConexion.prepareCall(sql);
		
		st.setString(1, usuario);
		rs= st.executeQuery();
		if (rs.next ()) {
			password.rs.getString("password");
			
			
		}
	
		cerrarConexion();
		
		return password;
		
	}
}
