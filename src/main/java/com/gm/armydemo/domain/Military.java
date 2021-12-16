package com.gm.armydemo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gm.armydemo.domain.enums.Rank;

@Entity
public class Military implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String militaryId;
	private Integer rank;
	
	public Military() {
		
	}

	public Military(Integer id, String name, String militaryId, Rank rank) {
		this.id = id;
		this.name = name;
		this.militaryId = militaryId;
		this.rank = rank.getCode();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMilitaryId() {
		return militaryId;
	}

	public void setMilitaryId(String militaryId) {
		this.militaryId = militaryId;
	}

	public Rank getRank() {
		return Rank.toEnum(rank);
	}

	public void setRank(Rank rank) {
		this.rank = rank.getCode();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Military other = (Military) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}