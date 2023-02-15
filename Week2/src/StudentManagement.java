public class StudentManagement {
    private static Student[] students = new Student[100];
    private static String[] listGr;
    private static int N = 0;

    /**
     * Phuong thuc kiem tra xem 2 sinh vien co chung group hay khong.
     *
     * @param s1 - Student 1.
     * @param s2 - Student 2.
     * @return True if have same Gr, False if have different Gr.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Phuong thuc them sinh vien vao lop.
     *
     * @param newStudent - Student whom we want to add
     */
    public static void addStudent(Student newStudent) {
        for (int i = 0; i < N; i++) {
            if (students[i].getId().equals(newStudent.getId())) {
                return;
            }
        }
        students[N++] = newStudent;
    }

    /**
     * Phuong thuc loc danh sach group.
     */
    public static String[] getGr() {
        listGr = new String[100];

        listGr[0] = students[0].getGroup();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                if (listGr[j] == null) {
                    listGr[j] = students[i].getGroup();
                }
                if (listGr[j] == students[i].getGroup()) {
                    break;
                }
            }

        }

        return listGr;
    }

    /**
     * Phuong thuc in sinh vien theo danh sach group.
     *
     * @return String of Group with group's students
     */
    public static String studentsByGroup() {
        String list = "";
        //listGr = new String[100];
        listGr = getGr();

        for (int i = 0; i < N; i++) {
            if (listGr[i] == null) {
                break;
            }

            list += (listGr[i] + "\n");

            for (int j = 0; j < N; j++) {
                if (students[j] == null) {
                    break;
                }
                if (students[j].getGroup() == listGr[i]) {
                    list += (students[j].getInfo() + "\n");
                }
            }
        }
        return list;
    }

    /**
     * Phuong thuc xoa sinh vien ra khoi group.
     *
     * @param id - id of Student whom we want to delete
     */
    public static void removeStudent(String id) {
        int idx = -1;

        for (int i = 0; i < N; i++) {
            if (students[i].getId().equals(id)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            return;
        }

        while (idx < N && idx != 99) {
            students[idx] = students[idx + 1];
            idx++;
        }

        students[99] = null;
        N--;
    }

    /**
     * main method.
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        addStudent(new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn"));
        addStudent(new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn"));
        addStudent(new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn"));
        addStudent(new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn"));
        addStudent(new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn"));
        students[0].setGroup("K62Ca");
        students[1].setGroup("K62Cb");
        students[2].setGroup("K62Cc");
        students[3].setGroup("K62Cd");

        System.out.println(sameGroup(students[0], students[1]));
        System.out.println(N);
        System.out.println();

        System.out.println();

        System.out.println(studentsByGroup());

        removeStudent("17020002");

        System.out.println();

        System.out.println(studentsByGroup());
    }
}
