package model;

/**
 * encapsulamento dos dados
 * 
 * 
 * @author gabriel da silva (fluxo)
 *
 */

public class JavaBeans {
	// varieveis encapisuladas usadas no fluxo//
	private String idcon;
	private String nome;
	private String fone;
	private String email;

	/**
	 * get idcon
	 * 
	 * @return idcon
	 */

	public String getIdcom() {
		return idcon;
	}

	/**
	 * set idcon
	 * 
	 * @param idcon
	 */
	public void setIdcom(String idcon) {
		this.idcon = idcon;
	}

	/**
	 * gat nome
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * fone
	 * 
	 * @return fone
	 */
	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	/**
	 * email
	 * 
	 * @return email
	 */

	public String getElail() {
		return email;
	}

	public void setElail(String email) {
		this.email = email;
	}
	/**
	 * contrutor padrao
	 */

	public JavaBeans() {
		super();
	}
	/**
	 * contrutor para uso do arraylist
	 * 
	 * @param idcon
	 * @param nome
	 * @param fone
	 * @param email
	 */

	public JavaBeans(String idcon, String nome, String fone, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}
	
	

}
