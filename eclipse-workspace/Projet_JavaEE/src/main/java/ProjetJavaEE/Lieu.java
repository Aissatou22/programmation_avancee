package ProjetJavaEE;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="lieu")
public class Lieu implements Serializable{

	/**
	 * id seulement dans les clés primaires
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String codeInsee;
	@Column
	private String nomCom;
	@Column
	private double longitude;
	@Column
	private double latitude;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "codeM")
	private Set<Monument> monuments;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Departement.class)
    @JoinColumn(name="dep")
	private String departement ;
	
	
	public Lieu(String codeInsee, String nomCom, double longitude, double latitude, Set<Monument> monuments, String departement) {
		super();
		this.codeInsee = codeInsee;
		this.nomCom = nomCom;
		this.longitude = longitude;
		this.latitude = latitude;
		this.monuments = monuments;
		this.departement = departement ;
		
	}
	
	
	@Override
	public String toString() {
		return "Lieu [codeInsee=" + codeInsee + ", nomCom=" + nomCom + ", longitude=" + longitude + ", latitude="
				+ latitude + ", monuments=" + monuments + ", departement=" + departement + "]";
	}


	public String getCodeInsee() {
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public Set<Monument> getMonuments() {
		return monuments;
	}
	public void setMonuments(Set<Monument> monuments) {
		this.monuments = monuments;
	}
	
	
	
	
	
	}