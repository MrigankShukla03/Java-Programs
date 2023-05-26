import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int semester;
    String course;
    ArrayList<Score> scores;

    public Student(String name, int semester, String course, ArrayList<Score> scores) {
        this.name = name;
        this.semester = semester;
        this.course = course;
        this.scores = scores;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return this.semester;
    }
    public void setName(int semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return this.course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public ArrayList<Score> getScores() {
        return this.scores;
    }
    public void setScores(ArrayList<Score> scores) {
        this.scores = scores;
    }
}

class Score {
    String subjectCode;
    String subject;
    int marks;

    public Score(String subjectCode, String subject, int marks) {
        this.subjectCode = subjectCode;
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubjectCode() {
        return this.subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return this.marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}


public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int n = 0;
        ArrayList<Student> students = new ArrayList<>();

        do {
            System.out.println("Menu:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Data");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number of students: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter the name of the student: ");
                        String name = sc.next();
                        System.out.println("Enter the semester of the student: ");
                        int semester = sc.nextInt();
                        System.out.println("Enter the course of the student: ");
                        String course = sc.next();
                        System.out.println("Enter the number of subjects for semester " + semester + ": ");
                        int numSubjects = sc.nextInt();
                        ArrayList<Score> scores = new ArrayList<Score>();
                        for (int j = 0; j < numSubjects; j++) {
                            System.out.println("Enter the subject name for subject " + (j + 1) + ": ");
                            String subject = sc.next();
                            System.out.println("Enter the subject code for subject " + (j + 1) + ": ");
                            String subjectCode = sc.next();
                            System.out.println("Enter the marks for subject " + (j + 1) + ": ");
                            int marks = sc.nextInt();
                            scores.add(new Score(subjectCode, subject, marks));
                        }
                        students.add(new Student(name, semester, course, scores));
                    }
                    break;
                case 2:
                System.out.println("Enter 'all' to display data of all students or enter student name to search: ");
                String searchName = sc.next();
                if (searchName.equalsIgnoreCase("all")) {
                    for (int i = 0; i < n; i++) {
                        System.out.println("Name: " + students.get(i).name);
                            System.out.println("Semester: " + students.get(i).semester);
                            System.out.println("Course: " + students.get(i).course);
                            ArrayList<Score> scores = students.get(i).scores;
                            for (int j = 0; j < scores.size(); j++) {
                                System.out.println("Subject: " + scores.get(j).subject);
                                System.out.println("Subject Code: " + scores.get(j).subjectCode);
                                System.out.println("Marks: " + scores.get(j).marks);
                        }
                    }
                } else {
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (students.get(i).name.equalsIgnoreCase(searchName)) {
                            found = true;
                            System.out.println("Name: " + students.get(i).name);
                            System.out.println("Semester: " + students.get(i).semester);
                            System.out.println("Course: " + students.get(i).course);
                            ArrayList<Score> scores = students.get(i).scores;
                            for (int j = 0; j < scores.size(); j++) {
                                System.out.println("Subject: " + scores.get(j).subject);
                                System.out.println("Subject Code: " + scores.get(j).subjectCode);
                                System.out.println("Marks: " + scores.get(j).marks);
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No student found with the given name.");
                    }
                }
                break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);
        sc.close();
    }
}
            
                               

