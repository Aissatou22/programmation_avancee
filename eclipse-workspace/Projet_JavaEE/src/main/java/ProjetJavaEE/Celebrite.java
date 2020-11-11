package ProjetJavaEE;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name="celebrite")
public class Celebrite implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int numCelebrite;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String nationalite;
	@Column
	private String epoque;
	
	@ManyToMany(mappedBy = "associeA") //ou associeAcelebrite ??
	private Set<Monument> associeAmonuments;

	
	public Celebrite(int numCelebrite, String nom, String prenom, String nationalite, String epoque, Set<Monument> associeAmonuments) {
		super();
		this.numCelebrite = numCelebrite;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
		this.associeAmonuments = associeAmonuments;
	}
	

	@Override
	public String toString() {
		return "Celebrite [numCelebrite=" + numCelebrite + ", nom=" + nom + ", prenom=" + prenom + ", nationalite="
				+ nationalite + ", epoque=" + epoque + ", associeAmonuments=" + associeAmonuments + "]";
	}


	public int getNumCelebrite() {
		return numCelebrite;
	}

	public void setNumCelebrite(int numCelebrite) {
		this.numCelebrite = numCelebrite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getEpoque() {
		return epoque;
	}

	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}

	public Set<Monument> getAssocieAmonuments() {
		return associeAmonuments;
	}

	public void setAssocieAmonuments(Set<Monument> associeAmonuments) {
		this.associeAmonuments = associeAmonuments;
	}
	
	
	
	
	
	

}