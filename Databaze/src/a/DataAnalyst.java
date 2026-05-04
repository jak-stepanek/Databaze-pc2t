package a;

import java.util.Map;

public class DataAnalyst extends Employee {
	

	public DataAnalyst(String jmeno, String prijmeni, int RokNarozeni) {
		super( jmeno, prijmeni, RokNarozeni);
		
	}
	 public int najdiNejvicSpolecnych(Map<Integer, Employee> vsichni) {
	        int nejlepsiId = -1;
	        int maxShoda = -1;

	        for (int idKolegy : getKolegove().keySet()) {
	            Employee k = vsichni.get(idKolegy);
	            if (k == null) continue;

	            int shoda = 0;
	            for (int idSpolecneho : k.getKolegove().keySet()) {
	                if (this.getKolegove().containsKey(idSpolecneho)) {
	                    shoda++;
	                }
	            }

	            if (shoda > maxShoda) {
	                maxShoda = shoda;
	                nejlepsiId = idKolegy;
	            }
	        }
	        return nejlepsiId;
	    }
}
