

public class Customer 
{
    private int custID;
    private String name;
    private String PAN;
    private String Aadhaar;
    private String address;
    private String dob;
    private String phone_no;
    private java.util.ArrayList<String> nominees = new java.util.ArrayList<>();



    public Customer(int custID,String name, String PAN, String Aadhar,String address, String dob, String phone_no)
    {
        

        this.name = name;
        this.PAN = PAN;
        this.Aadhaar = Aadhar;
        this.address = address;
        this.dob = dob;
        this.phone_no = phone_no;
    }




    /* public Customer(int custId, String name, String pan, String aadhaar,
                    String address, String dob, String phoneNo) {
        this.custId = custId;
        this.name = name;
        this.pan = pan;
        this.aadhaar = aadhaar;
        this.address = address;
        this.dob = dob;
        this.phoneNo = phoneNo;
    }

    public int getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + custId);
        System.out.println("Name: " + name);
        System.out.println("PAN: " + pan);
        System.out.println("Aadhaar: " + aadhaar);
        System.out.println("Phone: " + phoneNo);
        System.out.println("----------------------------");
    }
 
    public void setCustID(int custID)
    {
        this.custID = custID;
    }

    public void getCustID()
    {
        System.err.println(custID);
    }

    public void setPAN(String PAN)
    {
        this.PAN = PAN;
    }

    public void getPAN()
    {
        System.err.println(PAN);
    }

    public void setAadhar(long Aadhar)
    {
        this.Aadhar = Aadhar;
    }

    public void getAadhar()
    {
        System.err.println(Aadhar);
    }*/



    public void addNominees(String... names) {
    for (String n : names) {
        nominees.add(n);
    }
}

    public void displayCustomer() {
        System.out.println("Customer ID: " + custID);
        System.out.println("Name: " + name);
        System.out.println("PAN: " + PAN);
        System.out.println("Aadhaar: " + Aadhaar);
        System.out.println("Phone: " + phone_no);
        System.out.println("Nominees: ");
       for (String n : nominees) 
        {
            System.out.println(n);
        }
    }}

    







