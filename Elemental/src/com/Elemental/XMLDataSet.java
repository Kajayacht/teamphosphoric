package com.Elemental;

public class XMLDataSet {
	private String name = null;
	private String sym = null;
	private int atomicnumber = 0;
	private String aw = null;
	private String rmst = null;
	private String cat = null;
	private String den = null;
	private String meltpt = null;
	private String boilpt = null;
	private String critpt = null;
	private String crabun = null;
	private String ocabun = null;
	private String ionen = null;
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

	public String getaw() {
		return aw;
	}

	public void setaw(String aw) {
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

	public String getden() {
		return den;
	}

	public void setden(String d) {
		this.den = d;
	}

	public String getmeltpt() {
		return meltpt;
	}

	public void setmeltpt(String d) {
		this.meltpt = d;
	}

	public String getboilpt() {
		return boilpt;
	}

	public void setboilpt(String d) {
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

	public String getionen() {
		return ionen;
	}

	public void setionen(String d) {
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