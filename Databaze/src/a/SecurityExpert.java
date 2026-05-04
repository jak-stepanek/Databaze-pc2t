package a;

import a.spoluprace.Spoluprace;

public class SecurityExpert extends Employee{

	public SecurityExpert(String jmeno, String prijmeni, int RokNarozeni) {
		super(jmeno, prijmeni, RokNarozeni);
		
	}
	

public double RiskScore(){
	if (getKolegove().isEmpty()) {
		return 0.0;
	}
	else {
		int pocetSpolupracovniku = getKolegove().size();
	int kvalitaSpolupracovniku = 0; 

	for (Spoluprace u : getKolegove().values()) {
	    if (u == Spoluprace.DOBRA) kvalitaSpolupracovniku += 6;
	    else if (u == Spoluprace.PRUMERNA) kvalitaSpolupracovniku += 3;
	    else if (u == Spoluprace.SPATNA) kvalitaSpolupracovniku += 1;
	}
		double avgKvalita = kvalitaSpolupracovniku/pocetSpolupracovniku;
		return ((avgKvalita*avgKvalita)*pocetSpolupracovniku)/10;
		
		
	}
		
}

	
	
	
}
