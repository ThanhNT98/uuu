package objectclass;

import java.util.*;

public class DoctorHash {
	HashMap<String,DoctorDetails> DoctorHashMap; // chua hieu
    public DoctorHash(){
        DoctorHashMap = new HashMap<String, DoctorDetails>(); ///?????
        
    }
    
    void add(){
        String doctorName = "";
        String specialization = "";
        int hours = 0;
        String code = "";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Doctor code: ");
        code = sc.nextLine();
        
        System.out.println("Enter the name of the doctor: ");
        doctorName = sc.nextLine();
        
        System.out.println("Enter the specialization of the doctor: ");
        specialization = sc.nextLine();
        
        System.out.println("Enter the availability of the doctor in hours: ");
        hours = sc.nextInt();
        
        DoctorDetails doctorFields = new DoctorDetails(code, doctorName, specialization, hours);
        
        DoctorHashMap.put(code, doctorFields);
    }
    
    void display() {
        String searchCode = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Doctor code: ");
        searchCode = sc.nextLine();
        
        if(DoctorHashMap.containsKey(searchCode)) {
            DoctorDetails docObj = DoctorHashMap.get(searchCode);
            System.out.println(docObj);
        }
        else {
            System.out.println("Doctor not found");
        }
    }
    
    void publish(){
        
        System.out.println("The size of DoctorHashMap = "+ DoctorHashMap.size());
        System.out.println("The Doctors in the panel are: ");
        
        Set set = DoctorHashMap.keySet();
        Iterator iter = set.iterator();
        int i = 1;
        while (iter.hasNext()) {
            System.out.println(" "+ i +" ) "+ DoctorHashMap.get(iter.next()));
            i++;
        }
    }
}


