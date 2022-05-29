package ExampleBySir1;

class Employee {
    String name;
    String gender;
    String address;
    String addharCardNo;
    String Emp_Id;
    String grade;
    int salary;
    int rating;
    int experience_in_year;
}

class Technician extends Employee {
    String specializationBrand;//specialized in which brand of car or in which type of repairing
    String designation;//like head Technician,junoir Technician,helper etc.

}

class Receptionist extends Employee {
    String responsibility;//role
}

class ManagementStaff extends Employee {
    String responsibility;//role
}

class securityStaff extends Employee {

    String shift;
}

class Customer {
    String name;
    String drivingLicenceNo;
    String Address;
    String noOfVisits;
    String phNo;
    String emailId;
    String registrationId;
}

class vehicle {
    String registeredNo;
    String repairId;//somehow if problem create after Service,by using id,they will find who service that car
    String ownerName;
    String brandName;
    String modelName;
    int noOfWheels;
    String issue;
    String color;
    String assignedTechnicianName;
    String repairingStatus;
}

class TwoWheeler extends vehicle {
    String problem;
}

class FourWheeler extends vehicle {
    String type;//mini or sedan or SUV or what?
    String problem;
}

class Parts {    // parts for service
    String name;
    String applicableFor;
    int stockLeft;
    double price;
}

class Account {  //maintain the account of service
    int balance;
    int lastWithdrawn;
}

class costCalculation { // for everyday calculation will be calculated
    String date;
    String spending;
    String income;
    String profit;
}

public class CarServiceManage1 {
    Employee[] earray = new Employee[1000];//form a Employee array to store Employee object
    Customer[] carray = new Customer[1000];//form a Customer array to store Customer object

}
