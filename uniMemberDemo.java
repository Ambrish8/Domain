class uniMember {
    String name;
    String gender;

    class Student {
        int rollNumber;

        void enterDetails() {
            System.out.print("Enter Student Name: ");
            name = System.console().readLine();
            System.out.print("Enter Student Gender: ");
            gender = System.console().readLine();
            System.out.print("Enter Student Roll Number: ");
            rollNumber = Integer.parseInt(System.console().readLine());
        }

        void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Student Gender: " + gender);
            System.out.println("Student Roll Number: " + rollNumber);
        }
    }

    class Faculty {
        int employeeId;

        void enterDetails() {
            System.out.print("Enter Faculty Name: ");
            name = System.console().readLine();
            System.out.print("Enter Faculty Gender: ");
            gender = System.console().readLine();
            System.out.print("Enter Faculty Employee ID: ");
            employeeId = Integer.parseInt(System.console().readLine());
        }

        void displayDetails() {
            System.out.println("Faculty Name: " + name);
            System.out.println("Faculty Gender: " + gender);
            System.out.println("Faculty Employee ID: " + employeeId);
        }
    }
}

class uniMemberDemo {
    public static void main(String args[]) {
System.out.println("AMBRISH KALIA 2230143");
        uniMember member = new uniMember();

        uniMember.Student student = member.new Student();
        student.enterDetails();
        student.displayDetails();

        uniMember.Faculty faculty = member.new Faculty();
        faculty.enterDetails();
        faculty.displayDetails();
    }
}