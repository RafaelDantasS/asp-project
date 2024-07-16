package br.com.asp.dto;

import java.io.Serializable;
import java.util.Objects;

public class RedesSociaisDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String link;
	
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLink() {
		return link;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(link, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedesSociaisDto other = (RedesSociaisDto) obj;
		return Objects.equals(link, other.link) && Objects.equals(name, other.name);
	}
	
	
}
