public class Patient extends MedicalOffice
{
    public String name = "";
    public Boolean hasFirst = false;
    public String type = "";
    
    public Patient(String officeName, String patName, Boolean isSecond)
    {
        super(officeName);
        name = patName;
        hasFirst = isSecond; //is this suppose to be first or second vaccine??
    }

    @Override
    public String getOfficeName() 
    {
    return super.getOfficeName();
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getType() 
    {
        return type;
    }

    // i dont's see where has first vaccine is suppose to be set so i'm using a set method cause its nice
    public void setHasFirst(Boolean hasFirst) 
    {
        this.hasFirst = hasFirst;
    }
}
