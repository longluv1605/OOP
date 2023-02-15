public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Phuong thuc khoi tao khong tham so.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Phuong thuc khoi tao 3 tham so.
     * @param name - String of name
     * @param email - String of email
     * @param id - String of id
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Phuong thuc khoi tao sao chep doi tuong.
     * @param s - Doi tuong Student da cho
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Getter cho thuoc tinh name.
     * @return String of name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter cho thuoc tinh id.
     * @return String of id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter cho thuoc tinh group.
     * @return String of group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * Getter cho thuoc tinh email.
     * @return String of email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter cho thuoc tinh name.
     * @param name - String of name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter cho thuoc tinh id.
     * @param id - String of id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Setter cho thuoc tinh group.
     * @param group - String of group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Setter cho thuoc tinh email.
     * @param email - String of email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method which return full student's information.
     * @return String of full information: name - id - group - email
     */
    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}