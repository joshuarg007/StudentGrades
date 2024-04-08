public class Student {  // Declare the Student class

    private String name;  // Declare private field for student name
    private String address;  // Declare private field for student address
    private double GPA;  // Declare private field for student GPA

    public Student(String studentName, String studentAddress, double studentGPA) {  // Constructor with parameters for name, address, and GPA
        this.name = studentName;  // Initialize name field with provided studentName
        this.address = studentAddress;  // Initialize address field with provided studentAddress
        this.GPA = studentGPA;  // Initialize GPA field with provided studentGPA
    }  // END constructor

    public String getName() {  // Getter method for name
        return name;  // Return the value of name
    }  // END getName

    public void setName(String name) {  // Setter method for name
        this.name = name;  // Set the value of name to the provided value
    }  // END setName

    public String getAddress() {  // Getter method for address
        return address;  // Return the value of address
    }  // END getAddress

    public void setAddress(String address) {  // Setter method for address
        this.address = address;  // Set the value of address to the provided value
    }  // END setAddress

    public double getGPA() {  // Getter method for GPA
        return GPA;  // Return the value of GPA
    }  // END getGPA

    public void setGPA(double GPA) {  // Setter method for GPA
        this.GPA = GPA;  // Set the value of GPA to the provided value
    }  // END setGPA
}  // END Student class
