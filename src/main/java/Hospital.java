import java.util.HashMap;
import java.util.List;

public class Hospital {
    protected HashMap<String, String> location = new HashMap<>();
    protected HashMap<String, List<String>> currentEmployees = new HashMap<String, List<String>>();  

    public String getLocation(String name) {
        return location.get(name);
    }

    public Boolean doesHospitalExist(String name){
        Boolean check = location.containsValue(name);
        return check;
    }

    public void setLocation(HashMap<String, String> location) {
        this.location = location;
    } 

    public void addLocation(String name){
        location.put(name, name);
    }

    public void deleteLocation(String name){
        location.remove(name);
    }

    public void printLocations(){
        location.keySet().forEach(System.out::println);
    }




}
