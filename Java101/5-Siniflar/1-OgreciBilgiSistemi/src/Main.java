public class Main {
    public static void main(String[] args) {

        Teacher teacher1=new Teacher("Ali Hoca","MAT","555");
        Teacher teacher2=new Teacher("Mehmet Hoca","FZK","444");
        Teacher teacher3=new Teacher("Veli Hoca","KMY","333");

        Course courseMat=new Course("Matematik","101","MAT");
        Course courseFzk=new Course("Fizik","102","FZK");
        Course courseKmy=new Course("Kimya", "103","KMY");

        courseMat.addTeacher(teacher1);
        courseFzk.addTeacher(teacher2);
        courseKmy.addTeacher(teacher3);

        Student s1=new Student("Ahmet","178351","9",courseMat,courseFzk,courseKmy);
        s1.addBulkExamNote(25,45,35);
        s1.verbalNote(65,75,65);
        //s1.printNote();
        s1.isPass();


    }
}
