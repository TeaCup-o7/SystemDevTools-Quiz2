import javax.swing.JOptionPane;
public class MIS3370AFall2021 
//six metods
{
    private static String[]  name    = new String  [10];                 // parallel array for patient name
    private static String[]  vaccine = new String  [10];                // parallel array for vaccine patient received
    private static boolean[] status  = new boolean [10];           // parallel array for 1st or 2nd dose
    private static String[]  office  = new String  [10] ;                 // parallel array for location where shot given
    
    private static Patient[] patientObject = new Patient[10];  //setup memory for array of objects
    private static int count = 0;
    
    public static void main(String[] args)
    {
        count = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of patients that have been vaccinated."));
        popArray();
    
    }
    public static void popArray()
    {
        for (int x = 0; x < count; x++)
        {
            office[x] = JOptionPane.showInputDialog(null, "Enter the name of the office");
            if (verifyOffice(office[x]) == true)
            {
                name[x] = JOptionPane.showInputDialog(null, "Enter the patient's name");
                //need to pass to cleaner come back to this
                vaccine[x] = JOptionPane.showInputDialog(null, "Enter the name of the vaccine the patient recieved");
                String stat = JOptionPane.showInputDialog(null, "Is this the patients first vaccine? Enter Yes or No");
                if (stat == "yes")
                    status[x] = true;
                else
                    status[x] = false;

            // what happens here if the office is false?
            }
        }
        createObjects();
        //print header
        System.out.println("Vaccine shots administered."
        + "\nOffice\t\tPatient\t\tVaccine Recieved Second dose");
        displayData();

    }
    public static void nameCleaner(String nameIn)
    //must clean XYZ, or xyz or xYZ from string name
    {

    }
    
    public static Boolean verifyOffice(String officeIn)
    {
        String officeUpper = "";
        Boolean check = false;
        officeUpper = officeIn.toUpperCase();
        switch(officeUpper)
        {
            case "DOWNTOWN":
            check = true;
            break;
            case "MAIN CAMPUS":
            check = true;
            break;
            default:
            System.out.println("The office name is bad");
            break;
        }
        return check;
    }
    public static void createObjects()
    // private static Patient[] patientObject = new Patient[10]
    {
        for(int x = 0; x < count; x++)
        {
            patientObject[x] = new Patient(office[x], name[x], status[x]);
            //patientObject[x].setHasFirst(status[x]); //woops this breaks

        }
    }
    public static void displayData()
    {
        for(int x = 0; x < count; x++)
        {
            String nam = patientObject[x].getName();
            String off = patientObject[x].getOfficeName();
            String type = patientObject[x].getType();
            Boolean hasFst = patientObject[x].hasFirst;
            
            
            System.out.println(nam + "\t\t" + off + "\t\t" + type + hasFst);

        }    
    }
}
