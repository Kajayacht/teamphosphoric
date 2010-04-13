package com.Elemental;

public class XMLDataSet {
	private String name = null;
	private String sym = null;
	private int atomicnumber = 0;
	private double aw = 0;
	private String rmst = null;
	private String cat = null;
	private double den = 0;
	private double meltpt = 0;
	private double boilpt = 0;
	private String critpt = null;
	private String crabun = null;
	private String ocabun = null;
	private double ionen = 0;
	private String elpshell = null;
	private String vid = null;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getsym() {
		return sym;
	}

	public void setsym(String sym) {
		this.sym = sym;
	}

	public int getatomicnumber() {
		return atomicnumber;
	}

	public void setatomicnumber(int atomicnumber) {
		this.atomicnumber = atomicnumber;
	}

	public double getaw() {
		return aw;
	}

	public void setaw(double aw) {
		this.aw = aw;
	}

	public String getrmst() {
		return rmst;
	}

	public void setrmst(String rmst) {
		this.rmst = rmst;
	}

	public String getcat() {
		return cat;
	}

	public void setcat(String cat) {
		this.cat = cat;
	}

	public double getden() {
		return den;
	}

	public void setden(double d) {
		this.den = d;
	}

	public double getmeltpt() {
		return meltpt;
	}

	public void setmeltpt(double d) {
		this.meltpt = d;
	}

	public double getboilpt() {
		return boilpt;
	}

	public void setboilpt(double d) {
		this.boilpt = d;
	}

	public String getcritpt() {
		return critpt;
	}

	public void setcritpt(String attrValue) {
		this.critpt = attrValue;
	}

	public String getcrabun() {
		return crabun;
	}

	public void setcrabun(String crabun) {
		this.crabun = crabun;
	}

	public String getocabun() {
		return ocabun;
	}

	public void setocabun(String ocabun) {
		this.ocabun = ocabun;
	}

	public double getionen() {
		return ionen;
	}

	public void setionen(double d) {
		this.ionen = d;
	}

	public String getelpshell() {
		return elpshell;
	}

	public void setelpshell(String elpshell) {
		this.elpshell = elpshell;
	}

	public String getvid() {
		return vid;
	}

	public void setvid(String vid) {
		this.vid = vid;
	}

	public String toString() {
		return "Name = " + this.name + "\nSymbol = " + this.sym
				+ "\nAtomic Number = " + this.atomicnumber
				+ "\nAtomic Weight = " + this.aw + "\nRoom State = "
				+ this.rmst + "\nCatagory = " + this.cat + "\nDensity = "
				+ this.den + "\nMelting Point = " + this.meltpt
				+ "\nBoil Point = " + this.boilpt + "\nCritical Point = "
				+ this.critpt + "\nCrust Abundance = " + this.crabun
				+ "\nOcean Abundance = " + this.ocabun
				+ "\nIonization Energy = " + this.ionen
				+ "\nElectrons per Shell = " + this.elpshell;

	}
}