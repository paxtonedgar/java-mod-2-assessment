import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Patient extends Doctor{
    private HashMap<String, String> patrons = new HashMap<>();
    protected HashMap<String, String> DoctorPatientMap = new HashMap<String, String>();

    public HashMap<String, String> getPatients() {
        return patrons;
    }

    public void addPeople(String name){
        patrons.put(name, name);
    }

    public void deletePeople(String name){
        patrons.remove(name);
    }

    public void printPeople(){
        patrons.keySet().forEach(System.out::println);
    }
    public void VisitsDoctor(String doc, String patient){

        if(!patrons.containsKey(doc) && !currentPatients.containsKey(doc)){
            List<String> patient_init = new ArrayList<>();
            patient_init.add(patient);
            patrons.put(patient, patient); 
            currentPatients.put(doc,patient_init);
        }else if (currentPatients.containsKey(doc)){
            currentPatients.get(doc).add(patient);
        }
    }
}
