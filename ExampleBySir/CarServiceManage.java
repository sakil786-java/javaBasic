package ExampleBySir;
import java.util.*;
class Employee{
    String name;
    String gender;
    String address;
    String aadharCardNo;
    String Emp_Id;
    String grade;
    int salary;
    int rating;
    String getEmployeeDetails(){
        return "EMP NO:"+Emp_Id+"\nName:"+name+"\nGender:"+gender+"\nAddress:"+address+"\nRating:"+rating;
    }
    int rateEmployee(Employee e,int rating){
        return  this.rating=rating;
    }

    public String getEmp_Id() {
        return Emp_Id;
    }
}
class Technician extends Employee{
    String specializationBrand;//specialized in which brand of car or in which type of repairing
    String designation;//like head Technician,junior Technician,helper etc.
    int experience;
}
class Receptionist extends Employee{
    String responsibility;//role
}
class ManagementStaff extends Employee{
    String responsibility;//role
}
class securityStaff extends Employee{
    String deploymentLocation;
    String shift;
}
class Customer{
    String name;
    String drivingLicenceNo;
    String Address;

    String noOfVisits;
    String phNo;
    String emailId;
    String registrationId;


    public Customer(String name, String drivingLicenceNo, String address, String noOfVisits, String phNo, String emailId, String registrationId  ) {
        this.name = name;
        this.drivingLicenceNo = drivingLicenceNo;
        Address = address;

        this.noOfVisits = noOfVisits;
        this.phNo = phNo;
        this.emailId = emailId;
        this.registrationId = registrationId;

    }

    public String getCustomerDetails() {
        return name+registrationId;
    }

    public String getRegistrationId() {
        return registrationId;
    }
}
class vehicle{
    String registeredNo;
    String repairId;
    String ownerName;
    String brandName;
    String modelName;
    String kilometer;//At Servicing Time how many Kilometer in Display
    String color;
    String assignedTechnicianName;
    String repairingStatus;
}
class TwoWheeler extends vehicle{
    String problem;
}
class FourWheeler extends vehicle{
    String type;//mini or sedan or SUV or what?
    String problem;
}
class Parts{
    String name;
    String applicableFor;
    int stockLeft;
    double price;
}


class Billing{
    int balance;
   String Billing_Status;
   String Billing_Type;
}

class costCalculation{
    String date;
    double spending;
    double  income;
    double profit;
}
class CarServiceManage{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        Employee[] earray=new Employee[1000];//form a Employee array to store Employee object
        Customer[] carray=new Customer[1000];//form a Customer array to store Customer object
        System.out.println("1.Customer Enquiry\n2.Employee Enquiry\n3.Check Account");
        System.out.println("Enter your option:");
        int op=ip.nextInt();
        if(op==1){
            System.out.println("1.Register New Customer\n2.Existing Customer\n3.Order Enquiry\n");
            System.out.println("Enter your option:");
            int op1=ip.nextInt();
            if(op1==1){
                //enter the detils as input
                Customer e=new Customer("Sakil","LV125","Howrah","5","954864665","xyz@gmail.com","kEWY4854");//use parameterized constructor
                int cc=0;
                carray[cc++]=e;//adding new Customer to Customer record array
            }
            if(op1==2){
                System.out.println("Enter the Customer Id :");
                String registrationId=ip.next();
                for(int i=0;i<carray.length;i++){
                    if(carray[i].getRegistrationId().equals(registrationId)){//if matches
                        System.out.println(carray[i].getCustomerDetails());
                    }
                }
            }
        }
        if(op==2){

            System.out.println("Enter your option:");
            int op1=ip.nextInt();
            if(op1==1){
                //enter the detils as input
                Employee e=new Employee();//use parameterized constructor
                int ec=0;
                earray[ec++]=e;//adding new Employee to Employee record array
            }
            if(op1==2){
                System.out.println("Enter the Employee Id");
                String Emp_Id=ip.next();
                for(int i=0;i<earray.length;i++){
                    if(earray[i].getEmp_Id().equals(Emp_Id)){//if matches
                        System.out.println(earray[i].getEmployeeDetails());
                    }
                }
            }
        }

    }
}