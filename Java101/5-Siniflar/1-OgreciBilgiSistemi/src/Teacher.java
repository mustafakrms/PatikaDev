public class Teacher {
    String name;
    String branch;
    String mpNo;

    Teacher(String name, String branch, String mpNo) {
        this.name = name;
        this.branch = branch;
        this.mpNo = mpNo;
    }

    public void printTeacher() {
        System.out.println("Hoca Adı : " + this.name);
        System.out.println("Branşı : " + this.branch);
        System.out.println("Telefon Numarası : " + this.mpNo);
    }

}

