class College {
    String collegeName;

    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName, course;

        void setData(String s, String c) {
            studentName = s;
            course = c;
        }

        void display() {
            System.out.println("College: " + collegeName);
            System.out.println("Student: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        College c = new College("ABC College");
        College.Admission a = c.new Admission();
        a.setData("Rahul", "Computer Engineering");
        a.display();
    }
}