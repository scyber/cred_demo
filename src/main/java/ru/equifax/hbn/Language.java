package ru.equifax.hbn;
// default package
// Generated 21.10.2017 15:03:38 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Formula;



/**
 * Language generated by hbm2java
 */
@Entity
@Table(name="language_test", schema="sakila")
public class Language implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="language_id", columnDefinition="int")
	private long languageId;
	
	@Column(name="name", columnDefinition="CHAR")
	private String name;
	@Column(name="last_update")
	private Date lastUpdate;
	
	@Transient
	private Set filmsForLanguageId = new HashSet(0);
	@Transient
	private Set filmsForOriginalLanguageId = new HashSet(0);
	
	
	
	
	public Language() {
	}

	public Language(String name, Date lastUpdate) {
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	/*public Language(String name, Date lastUpdate, Set filmsForLanguageId, Set filmsForOriginalLanguageId) {
		this.name = name;
		this.lastUpdate = lastUpdate;
		this.filmsForLanguageId = filmsForLanguageId;
		this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
	}*/
	@Transient
	private Integer fValue;
	@Formula("123+234")
	public Integer getfValue(){
		return this.fValue;
	}
	public void setfValue(int value){
		this.fValue = value;
	}
	
	
	
	
	public long getLanguageId() {
		return this.languageId;
	}
	
	
	
	public void setLanguageId(byte languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/*public Set getFilmsForLanguageId() {
		return this.filmsForLanguageId;
	}

	public void setFilmsForLanguageId(Set filmsForLanguageId) {
		this.filmsForLanguageId = filmsForLanguageId;
	}

	public Set getFilmsForOriginalLanguageId() {
		return this.filmsForOriginalLanguageId;
	}

	public void setFilmsForOriginalLanguageId(Set filmsForOriginalLanguageId) {
		this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
	}*/

}
