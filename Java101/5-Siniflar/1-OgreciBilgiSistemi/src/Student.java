public class Student {
    Course courseMat;
    Course courseFzk;
    Course courseKmy;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course courseMat, Course courseFzk, Course courseKmy) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.courseMat = courseMat;
        this.courseFzk = courseFzk;
        this.courseKmy = courseKmy;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat <= 100 && mat >= 0) {
            this.courseMat.note = mat;
        }
        if (fizik <= 100 && fizik >= 0) {
            this.courseFzk.note = fizik;
        }
        if (kimya <= 100 && kimya >= 0) {
            this.courseKmy.note = kimya;
        }
    }

    void verbalNote(int verbalMat, int verbalFzk, int verbalKmy) {
        if (verbalMat <= 100 && verbalMat >= 0) {
            this.courseMat.verbalNote = verbalMat;
        }
        if (verbalFzk <= 100 && verbalFzk >= 0) {
            this.courseFzk.verbalNote = verbalFzk;
        }
        if (verbalKmy <= 100 && verbalKmy >= 0) {
            this.courseKmy.verbalNote = verbalKmy;
        }
    }

    double matAverage() {
        return (this.courseMat.note * 0.80) + (this.courseMat.verbalNote * 0.20);
    }

    double fzkAverage() {
        return (this.courseFzk.note * 0.80) + (this.courseFzk.verbalNote * 0.20);
    }

    double kmyAverage() {
        return (this.courseKmy.note * 0.80) + (this.courseKmy.verbalNote * 0.20);
    }

    void calcAverage() {
        this.average = (matAverage() + fzkAverage() + kmyAverage()) / 3;
    }

    void isPass() {
        if (this.courseMat.note == 0 || this.courseFzk.note == 0 || this.courseKmy.note == 0) {
            System.out.println("Notlar Tam Olarak Girilmemiş!");
        } else if (this.courseMat.verbalNote == 0 || this.courseFzk.verbalNote == 0 || this.courseKmy.verbalNote == 0) {
            System.out.println("Sözlüler Tam Olarak Girilmemiş!");
        } else {
            calcAverage();
            printNote();
            System.out.println("Öğrencinin Genel Ortalaması : " + this.average);
            if (this.average >= 55) {
                System.out.println("Sınıfı Geçti!");
            } else {
                System.out.println("Sınıfta Kaldı!");
            }
        }
    }

    void printNote() {
        System.out.println("===============================");
        System.out.println("Öğrencinin Adı : " + this.name);
        System.out.println("Öğrencinin Numarası : " + this.stuNo);
        System.out.println("===============================");
        System.out.println(this.courseMat.name + " Dersinin Notu : " + this.courseMat.note);
        System.out.println(this.courseMat.name + " Dersinin Sözlüsü : " + this.courseMat.verbalNote);
        System.out.println(this.courseMat.name + " Dersinin Ortalaması : " + matAverage());
        System.out.println("===============================");
        System.out.println(this.courseFzk.name + " Dersinin Notu : " + this.courseFzk.note);
        System.out.println(this.courseFzk.name + " Dersinin Sözlüsü : " + this.courseFzk.verbalNote);
        System.out.println(this.courseFzk.name + " Dersinin Ortalaması : " + fzkAverage());
        System.out.println("===============================");
        System.out.println(this.courseKmy.name + " Dersinin Notu : " + this.courseKmy.note);
        System.out.println(this.courseKmy.name + " Dersinin Sözlüsü : " + this.courseKmy.verbalNote);
        System.out.println(this.courseKmy.name + " Dersinin Ortalaması : " + kmyAverage());
        System.out.println("===============================");
    }
}
