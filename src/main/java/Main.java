
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        runner(sc);
    
    }
    
    public static void runner(Scanner sc){
        System.out.println("Welcome to the Patient Provider Portal!");
        userInput input = new userInput(); 
        MenuOptions menuOptions = MenuOptions.z;

        while (menuOptions != MenuOptions.q)
            try
            {
                menu();
                menuOptions = MenuOptions.valueOf(sc.nextLine());
                switch (menuOptions)
                {
                    case a:
                        input.CreateHospital(sc);
                        break;
                    case b:
                        input.CreateDoctor(sc);
                        break;
                    case c: 
                        input.CreatePatient(sc);
                        break;
                    case q:
                        System.out.println("Goodbye.");
                        break;

                    default:
                        System.out.println("Selection out of range. Try again");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Selection out of range. Try again:");
            }
    }

    enum MenuOptions{
        z("Continue"), a("Create a Hospital"), b("Create a Doctor"),  c("Display Genres"),
        d("Create a Patient"), q("Quit");

        // field
        private String meaning;
        // constructor
        MenuOptions(String meaning)
        {
            this.meaning = meaning;
        }
        // getters
        public String getMeaning()
        {
            return meaning;
        }

    }

    public static void menu()
    {
        System.out.println("\nEnter:");
        System.out.println("\ta. Create a Hospital");
        System.out.println("\tb. Create a Doctor");
        System.out.println("\tc. Create a Patient");
        System.out.println("\tq. Quit Application.");
        System.out.print("\nSelection -> ");

    }


}
