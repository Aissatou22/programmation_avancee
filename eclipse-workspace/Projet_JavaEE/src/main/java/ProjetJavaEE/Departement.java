package ProjetJavaEE;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="departement")
public class Departement implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String dep;
	@Column
	private String nomDep;
	@Column
	private int numReg;
	@Column
	private String cheflieude;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "codeInsee")
	private Set<Lieu> lieux;
	
	
	public Departement(String dep, String nomDep, int numReg, String cheflieude, Set<Lieu> lieux) {
		super();
		this.dep = dep;
		this.nomDep = nomDep;
		this.numReg = numReg;
		this.cheflieude = cheflieude;
		this.lieux = lieux;
	}

	

	@Override
	public String toString() {
		return "Departement [dep=" + dep + ", nomDep=" + nomDep + ", numReg=" + numReg + ", cheflieude=" + cheflieude
				+ ", lieux=" + lieux + "]";
	}



	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}


	public String getNomDep() {
		return nomDep;
	}


	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}


	public int getNumReg() {
		return numReg;
	}


	public void setNumReg(int numReg) {
		this.numReg = numReg;
	}
	
	public String getCheflieude() {
		return cheflieude;
	}
	public void setCheflieude(String cheflieude) {
		this.cheflieude = cheflieude;
	}


	public Set<Lieu> getLieux() {
		return lieux;
	}


	public void setLieux(Set<Lieu> lieux) {
		this.lieux = lieux;
	}

	
	

}

