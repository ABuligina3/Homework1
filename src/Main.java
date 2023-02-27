public class Main {
    public static void main(String[] args) {
        int ao;

        Teacher teacher = new Teacher();
        teacher.setName("Анжелика");
        teacher.setAge(50);
        System.out.println("Преподаватель: " + teacher.getName());
        System.out.println("Возраст преподаватель: " + teacher.getAge());
        System.out.println();



        Student student1 = new Student();
        student1.setName("Григорий");
        student1.setAge(20);
        student1.setCourse(2);
        System.out.println("Имя студента: " + student1.getName());
        System.out.println("Возраст студента: " + student1.getAge());
        System.out.println("Курс студента: " + student1.getCourse());
        System.out.println();


        Student student2 = new Student();
        student2.setName("Инна");
        student2.setAge(20);
        student2.setCourse(2);
        System.out.println("Имя студента: " + student2.getName());
        System.out.println("Возраст студента: " + student2.getAge());
        System.out.println("Курс студента: " + student2.getCourse());
        System.out.println();


        Student student3 = new Student();
        student3.setName("Анита");
        student3.setAge(20);
        student3.setCourse(2);
        System.out.println("Имя студента: " + student2.getName());
        System.out.println("Возраст студента: " + student2.getAge());
        System.out.println("Курс студента: " + student2.getCourse());
        System.out.println();
    }
}