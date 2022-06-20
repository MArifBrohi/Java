class Employee{
    private String firstName;
    private String lastName;
    private String cNIC;
    Employee(){
        super();     
    }

    Employee(String firstName , String lastName, String cNIC){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cNIC = cNIC;
    }

    public String toString(){
        return "FirstName "+firstName+" LastName "+lastName+" CNIC# "+cNIC;
    }
    
    public double earning(){
        return 0.00;
    }
}
class SalriedEmployee extends Employee{
        private  String firstName;
        private String lastname;
        private String cNIC;
        private double weeklySalary;
        SalriedEmployee(){
            super();
        }
        SalriedEmployee(String fname , String lname , String cnic , double welsal){
           super(fname, lname ,  cnic);
            if(welsal>0.0){
            this.weeklySalary = welsal;
            }
        }
        public double earning(){
            return weeklySalary;
        }
        
        
    }
        
        






class PayRollSystemtest{
    public static void main(String args[]){
        Employee firstEmployee = new SalriedEmployee("Muhammad" ,"Ali","11111-1111", 800.00 ); 
        firstEmployee.toString(); 
    }
}
