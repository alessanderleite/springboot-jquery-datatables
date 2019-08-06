package br.com.alessanderleite.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	
	@Column(name = "username", nullable = false, unique = true)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String plasswordHash;
	
	@Column(name = "role", nullable = false)
	private String role;

	public User() {}

	public User(String username, String plasswordHash, String role) {
		super();
		this.username = username;
		this.plasswordHash = plasswordHash;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPlasswordHash() {
		return plasswordHash;
	}

	public void setPlasswordHash(String plasswordHash) {
		this.plasswordHash = plasswordHash;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
