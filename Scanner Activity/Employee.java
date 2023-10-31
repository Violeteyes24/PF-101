import java.util.Scanner;

class Employee {
    private String Name;
    private String Address;
    private String Emailaddress;

    public Employee() {
        this.Name = "";
        this.Address = "";
        this.Emailaddress = "";
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmailaddress() {
        return Emailaddress;
    }

    public void setEmailaddress(String Emailaddress) {
        this.Emailaddress = Emailaddress;
    }
}