package com.workingwithdb.springbootdb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATE_TABLE")
public class sample {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long ID;
		private String NAME;
		private int AGE;
		private String DOJ;
		public Long getID() {
			return ID;
		}
		public void setID(Long iD) {
			ID = iD;
		}
		public String getNAME() {
			return NAME;
		}
		public void setNAME(String nAME) {
			NAME = nAME;
		}
		public int getAGE() {
			return AGE;
		}
		public void setAGE(int aGE) {
			AGE = aGE;
		}
		public String getDOJ() {
			return DOJ;
		}
		public void setDOJ(String dOJ) {
			DOJ = dOJ;
		}
		@Override
		public String toString() {
			return "sample [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", DOJ=" + DOJ + "]";
		}

	


}
