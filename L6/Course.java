public class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents;

    public Course() {
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] tmp = new String[numberOfStudents * 2];
            System.arraycopy(students, 0, tmp, 0, students.length);
            students = tmp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        boolean noStudent = true;
            for (int i = 0; i < numberOfStudents; i++) {
                if (students[i].equals(student)) {
                    System.arraycopy(students, i + 1, students, i, students.length - i - 1);
                    numberOfStudents--;
                    noStudent = false;
                    break;
                }
            }
            if (noStudent) {
                System.out.println("not have student name "+ student + " in this class");
            }
    }

    public void clear() {
        students = new String[2];
        numberOfStudents = 0;
    }
}
