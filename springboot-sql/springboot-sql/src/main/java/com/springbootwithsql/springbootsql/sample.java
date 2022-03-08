package com.springbootwithsql.springbootsql;

public class sample {
	
	private int ID;
	private String NAME;
	private int AGE;
	private String DOJ;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
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
