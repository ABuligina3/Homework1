public class Main {
    public static void main (String[] args) {
        int ao;

        Student student1 = new Student(20, "Григорий", 2);
        System.out.println("Имя студента: " + student1.getName());
        System.out.println("Возраст студента: " + student1.getAge());
        System.out.println("Курс студента: " + student1.getCourse());
        System.out.println();

        Student student2 = new Student(20, "Инна", 2);
        System.out.println("Имя студента: " + student2.getName());
        System.out.println("Возраст студента: " + student2.getAge());
        System.out.println("Курс студента: " + student2.getCourse());
        System.out.println();

        Student student3 = new Student(20, "Анита", 2);
        System.out.println("Имя студента: " + student2.getName());
        System.out.println("Возраст студента: " + student2.getAge());
        System.out.println("Курс студента: " + student2.getCourse());
        System.out.println();

        Teacher teacher = new Teacher(50, "Анжелика", student1, student2, student3);
        System.out.println("Преподаватель: " + teacher.getName());
        System.out.println("Возраст преподаватель: " + teacher.getAge());
        for (Student item : teacher.getStudent()) {
            System.out.println("Ученик преподавателя: " + item.getName() + ", возраст: " + item.getAge());
        }
        System.out.println();
    }
}