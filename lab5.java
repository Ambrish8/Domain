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

    public Student(String name, String gender, String course, String branch) {
        super(name, gender);
        this.course = course;
        this.branch = branch;
    }

    public void displayCourseAndBranch() {
        System.out.println("Course: " + course);
        System.out.println("Branch: " + branch);
    }
}

class Year extends Student {
    String yearID;
    int semID;
    double SGPA;

    public Year(String name, String gender, String course, String branch, String yearID, int semID, double SGPA) {
        super(name, gender, course, branch);
        this.yearID = yearID;
        this.semID = semID;
        this.SGPA = SGPA;
    }

    public void displayYearIDSemIDSGPA() {
        System.out.println("Year ID: " + yearID);
        System.out.println("Sem ID: " + semID);
        System.out.println("SGPA: " + SGPA);
    }
}

public class lab5 {
    public static void main(String[] args) {
	System.out.println("Ambrish Kalia 2230143");
        Year firstYear = new Year("Ambrish kalia", "Male", "BTech", "Computer Science", "1st", 1, 9.5);
        firstYear.displayNameAndGender();
        firstYear.displayCourseAndBranch();
        firstYear.displayYearIDSemIDSGPA();
    }
}