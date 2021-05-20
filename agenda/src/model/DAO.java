package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * CAMADA MODEL DO MODELO MVC
 * 
 * @author gabriel da silva
 *
 */

public class DAO {
	/* conexao com o banco de dados */
	/* parametrosde conexao */
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.101:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "silva";
	private String password = "Senac@123456";

	/**
	 * conexao com o banco de dados
	 * 
	 * @return con
	 */

	private Connection conectar() {
		// criar um obijeto para conexao co mo banco
		Connection con = null;
		// tratamento de exceçoes
		try {
			// execuçao do driver
			Class.forName(driver);
			// esta linha executa a conexao
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * texte de conexao
	 */
	public void testarConexao() {
		try {
			//estabelecer conexao (metodo conectar()(abrir a jeladera))
			Connection con = conectar();
			// escreve no console
			System.out.println("texte de conexao");
			System.out.println(con);
			//finalizar a conexao (fechar a porta da geladeira)
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	

	/* CRUD CREATE */

	/* CRUD READ */

	/*  CRUD  UPDATE */

	/*  CRUD DELETE */

}
