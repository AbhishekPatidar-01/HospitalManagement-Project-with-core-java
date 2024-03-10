import java.util.*;

class Patient 
{
    static int count = 1;
    int Choice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("patient : "+count);
        count++;
        System.out.println("Your choice only 1(for Appointment) and 0(for exit)");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }
}

class Doctor 
{   
    String B_apointment(List<List> patient_details_list,int P_appoint_Doc)
    {   
        List list_of_patient=new ArrayList();
        String d="error in saving";
        if(P_appoint_Doc > 3)
        {
            System.out.println("Please try to Appointment on Tommorow");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter Your Name : ");
            String P_name = sc.nextLine();

            System.out.print("Please Enter Your Age : ");
            int age = sc.nextInt();

            System.out.print("Please Enter Your Disease : ");
            String Disease = sc.next();
           
            list_of_patient.add("Name : " + P_name);
            list_of_patient.add("Age : " +age);
            list_of_patient.add("Disease : " +Disease);

            patient_details_list.add(list_of_patient);

            System.out.println("***************************************************");

            System.out.println("If you show your details Click 1 Otherwise click 0 For next Step");
            Scanner s1 = new Scanner(System.in);
            int temp = s1.nextInt();
            if(temp == 1)
            {
                for(int i=0;i<list_of_patient.size();i++)
                {
                    System.out.println(list_of_patient.get(i));
                }
            }
            P_appoint_Doc++;
            String s="your details are saved";
            return s;

        }
        return d;
    }
    public static void main(String [] args) 
    {
        Patient p = new Patient();
        int a = p.Choice();
        Doctor d=new Doctor();
        int P_appoint_Doc=0;
        List<List> patient_details_list=new ArrayList();
        
        while(P_appoint_Doc<3)
        {
            if(a==1)
            {
                String confirmation= d.B_apointment(patient_details_list,P_appoint_Doc);
                System.out.println(confirmation);
                System.out.println("***************************************************");
                P_appoint_Doc++;
            }
            else
            {
                System.out.println("your choice is 0 So, you can exit");
                System.out.println("***************************************************");
            }
            a= p.Choice();
        }

        System.out.println("***************************************************");
        System.out.println("If you see all patient details click 1 OtherWise 0 ");
        Scanner s2 = new Scanner(System.in);
        int temp = s2.nextInt();
        if(temp==1)
        {
            for(int i=0; i<patient_details_list.size(); i++)
            {
                System.out.println(patient_details_list.get(i));
            }
        }
        else
        {
            System.out.println("***************************************************");
        } 
    }
}
