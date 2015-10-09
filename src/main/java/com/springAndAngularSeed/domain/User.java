package com.springAndAngularSeed.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class User implements Serializable {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    
	    @Column(nullable=false, unique=true)
		@NotNull
	    private String username;
	    
	    @NotBlank
	    private String password;
	    
	    @NotBlank
	    private String name;
	    
		public long getId() {
			return id;
		}
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String firstName) {
			this.name = firstName;
		}
}
