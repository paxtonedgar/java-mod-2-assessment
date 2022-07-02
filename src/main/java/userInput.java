import java.util.Scanner;

public class userInput {
    
    public void CreateHospital(Scanner sc){
        Hospital hospital = new Hospital(); 
        System.out.print("Would you like to establish a Hospital?");
        String res = sc.nextLine();
        res = res.trim().toLowerCase().toString();

        if(res.matches("^y(e)?(s)?$")){
            System.out.println("Please enter the name of the hospital: ");
            String hos = sc.nextLine();
            hos = hos.trim().toLowerCase().toString();
            hospital.addLocation(hos);
        }else{}
    }

    public void CreateDoctor(Scanner sc){
        Doctor doctor = new Doctor(); 
        System.out.print("Would you like to employ a Doctor? Y/N");
        String res = sc.nextLine();
        res = res.trim().toLowerCase().toString();

        if(res.matches("^y(e)?(s)?$")){
            System.out.println("Please enter the name of the Doctor: ");
            String doc = sc.nextLine();
            doc = doc.trim().toLowerCase().toString();
            doctor.addPeople(doc);
            System.out.println("Does the Doctor have a specialty? Y/N");
            res = sc.nextLine();
            if(res.matches("^y(e)?(s)?$")){
                System.out.println("Please enter the Doctor's Specialty: ");
                String spec = sc.nextLine();
                spec = spec.trim().toLowerCase().toString();
                doctor.addSpecialty(doc, spec);
            }         
            System.out.println("Does the Doctor work at a Hospital? Y/N");
            res = sc.nextLine();
            if(res.matches("^y(e)?(s)?$")){
                System.out.println("Please enter the Doctor's hospital: ");
                String hos = sc.nextLine();
                hos = hos.trim().toLowerCase().toString();
                Hospital hospital = new Hospital();
                if(hospital.doesHospitalExist(hos)){
                    doctor.belongs_To_Hospital(hos, doc);
                }else{
                    CreateHospital(sc);
                }
                
            }
        }else{}

    }

    public void CreatePatient(Scanner sc){
        Patient patient = new Patient(); 
        System.out.print("Would you like to register a new Patient? Y/N");
        String res = sc.nextLine();
        res = res.trim().toLowerCase().toString();

        if(res.matches("^y(e)?(s)?$")){
            System.out.println("Please enter the name of the Patient: ");
            String person = sc.nextLine();
            person = person.trim().toLowerCase().toString();
            patient.addPeople(person);
            System.out.println("Does the Patient have a Doctor? Y/N");
            res = sc.nextLine();

            if(res.matches("^y(e)?(s)?$")){
                System.out.println("Please enter the Doctor: ");
                String doc = sc.nextLine();
                doc = doc.trim().toLowerCase().toString();
                Doctor doctor = new Doctor(); 

                if(doctor.isDoctorRegistered(doc)){
                    doc = doctor.getDoctor(doc);
                    patient.VisitsDoctor(doc, person);
                }else{
                    CreateDoctor(sc);
                }

                
            } 
        }else{}

    }
}


