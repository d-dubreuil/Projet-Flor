package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

public class Panier {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Float total;
	
	
	public Panier() {
		super();
	}
	public Panier(Float total) {
		super();

		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Panier [id=" + id + ", version=" + version + ", total=" + total + "]";
	}
	
}
