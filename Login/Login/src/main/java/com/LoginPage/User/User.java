package com.LoginPage.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long Id;
		private String Username;
		private String Password;
		private String Mailid;
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getMailid() {
			return Mailid;
		}
		public void setMailid(String mailid) {
			Mailid = mailid;
		}
		
		
}
