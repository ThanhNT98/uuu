package objectclass;

public class DoctorDetails {
	 String name;
	    String specialization;
	    int hours;
	    String docCode;
	    public DoctorDetails(){}

	    public DoctorDetails(final String code, final String lastname, final String speciality, final int hours) {
	        this.docCode= code;
	        this.name = lastname;
	        this.specialization = speciality;
	        this.hours = hours;
	    }

	   
	    
	    
	    public String toString(){
	        return "\nDoctor code = "+ docCode +"\nName = "+ name +
	                "\nSpecialization = "+ specialization +"\nAvailability = "+ hours;
	    }
	}

