public class MedicalOffice
{
	protected String officeName;
	private static int noOfVaccinations;

	MedicalOffice (String officeName)
	{
		this.officeName = officeName;
		noOfVaccinations++;
	}

	public String getOfficeName()
	{
		return officeName;
	}

	public static int getNoOfVaccinations()
	{
		return noOfVaccinations;
	}
}
