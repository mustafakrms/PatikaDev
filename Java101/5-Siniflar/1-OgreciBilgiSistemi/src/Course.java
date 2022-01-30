public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher courseTeacher) {
        if (this.prefix.equals(courseTeacher.branch)) {
            this.courseTeacher = courseTeacher;
        } else {
            System.out.println(courseTeacher.name + " Akademisyeni Bu Dersi Veremez !");
        }
    }

    void printTeacher() {
        if (this.courseTeacher != null) {
            System.out.println(this.name + " Dersinin Akademisyeni : " + this.courseTeacher.name);
        } else
            System.out.println(this.name + " Dersine Akademisyen Atanmamıştır!");
    }


}
