package test7.sub01;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
	private String id;
	private String special;
	
	List<Patient> patients = new ArrayList();
	
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
	}

	@Override
	public String toString() {
		//return "의사: "+name+"(ID: "+id+", 전문분야: "+special+"\n"
		//+"담당 환자 목록:\n"+patients
		
		StringBuilder sb = new StringBuilder();
		sb.append("의사: ").append(name).append("(ID: ").append(id).append(", 전문분야: ").append(special).append("\n")
		.append("담당 환자 목록:\n");
		for(Patient patient : patients) {
			sb.append(patient);
		}
		return sb.toString();
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	
	
}
