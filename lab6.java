class UniversityMember {
    String name;
    String gender;

    public UniversityMember(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void displayNameAndGender() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Student extends UniversityMember {
    String course;
    String branch;
    int yearID;
    int semID;
    int rollNumber;

    public Student(String name, String gender, String course, String branch, int yearID, int semID, int rollNumber) {
        super(name, gender);
        this.course = course;
        this.branch = branch;
        this.yearID = yearID;
        this.semID = semID;
        this.rollNumber = rollNumber;
    }

    public void displayCourseBranchYearIDSemIDRollNumber() {
        System.out.println("Course: " + course);
        System.out.println("Branch: " + branch);
        System.out.println("Year ID: " + yearID);
        System.out.println("Sem ID: " + semID);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Employee extends UniversityMember {
    int employeeID;

    public Employee(String name, String gender, int employeeID) {
        super(name, gender);
        this.employeeID = employeeID;
    }

    public void displayEmployeeID() {
        System.out.println("Employee ID: " + employeeID);
    }
}

class Teaching extends Employee {
    String designation;

    public Teaching(String name, String gender, int employeeID, String designation) {
        super(name, gender, employeeID);
        this.designation = designation;
    }

    public void displayDesignation() {
        System.out.println("Designation: " + designation);
    }
}

class NonTeaching extends Employee {
    String designation;

    public NonTeaching(String name, String gender, int employeeID, String designation) {
        super(name, gender, employeeID);
        this.designation = designation;
    }

    public void displayDesignation() {
        System.out.println("Designation: " + designation);
    }
}

public class lab6 {
    public static void main(String[] args) {
	System.out.println("Ambrish Kalia 2230143");
        Teaching teaching = new Teaching("atul ", "Male", 123, "Professor");
        teaching.displayNameAndGender();
        teaching.displayEmployeeID();
        teaching.displayDesignation();

        Student student = new Student("riya", "Female", "BTech", "Computer Science", 1, 1, 1234);
        student.displayNameAndGender();
        student.displayCourseBranchYearIDSemIDRollNumber();
    }
}