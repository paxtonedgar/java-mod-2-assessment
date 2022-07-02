import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Doctor extends Hospital {

    private HashMap<String, String> people = new HashMap<>();
    protected HashMap<String, String> DoctorSpecialtyMap = new HashMap<String, String>();  
    protected HashMap<String, List<String>> currentPatients = new HashMap<String, List<String>>();  


    public String getDoctor(String name) {
        return people.get(name);
    }

    public void addPeople(String name){
        people.put(name, name);
    }

    public Boolean isDoctorRegistered(String name){
        Boolean check = people.containsValue(name);
        return check;
    }

    public void deletePeople(String name){
        people.remove(name);
    }

    public void printPeople(){
        people.keySet().forEach(System.out::println);
    }

    public void addSpecialty(String doc, String specialty){
        DoctorSpecialtyMap.put(people.get(doc), specialty);
    }

    public void belongs_To_Hospital(String name, String doc){

        if(!location.containsKey(name) && !currentEmployees.containsKey(name)){
            List<String> doc_init = new ArrayList<>();
            doc_init.add(doc);
            location.put(name, name); 
            currentEmployees.put(name,doc_init);
        }else if (currentEmployees.containsKey(name)){
            currentEmployees.get(name).add(doc);
        }
    }

    
}
