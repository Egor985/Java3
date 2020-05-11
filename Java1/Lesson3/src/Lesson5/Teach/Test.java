package Lesson5.Teach;

public class Test {

    public static void main(String[] args) {
        // создаем студентов
        Student s1 = new Student("Ivanov", "Ivan", "Ivanovich");
        Student s2 = new Student("Petrov", "Petr", "Ivanovich");
        // создаем группу
        Group group = new Group();
        // создание расписание для группы
        group.schedule = new Schedule(group);
        Schedule schedule = group.schedule;
    //добавили студентов в группу
        s1.addToGroup(group);
        s2.addToGroup(group);
    // создание предметов
        Subject sub1 = new Subject("math", "12:00");
        Subject sub2 = new Subject("inf", "15:30");
        // добавить все это в расписание
        schedule.addSubject(sub1);
        schedule.addSubject(sub2);
        //оздание учителя
        Teacher mathTeacher = new Teacher("Gleym", "Eric", "Hildson");
        Teacher infTeacher = new Teacher("Korotkevich", "Gennadiy", "Batkovich");
        //обявили предметы учителям
        sub1.applyTeacher(mathTeacher);
        sub2.applyTeacher(infTeacher);

        System.out.println(group.groupId);
        System.out.println(group.students);
        System.out.println(group.schedule);
        // кто ведет конкретный предмет
        System.out.println(group.schedule.subjects.get(0).teachers);
        System.out.println(group.schedule.subjects.get(1).teachers);
        System.out.println(mathTeacher.subjects);  // список предметов этого учителя
        System.out.println(mathTeacher.subjects.get(0).schedule.group.students);  // в какой группе ведет math учитель
        System.out.println(infTeacher.subjects);
        System.out.println(s1.getGroup().schedule.subjects.get(0).teachers.get(0));  //найти преподавателя студента
        s1.showTeachersInfo();  // узнать всех преполдавателей студента
//        for (Subject subject : s1.getGroup().schedule.subjects){  //иттерация по всем предметам
//            System.out.println(subject + " : ");  //предмет, который ведет какой то преподаватель
//            for(Teacher teacher : subject.teachers){  //иттерация по всем преподавателям
//                System.out.println(teacher);  // вывод преподавателя
//            }
//        }
    }
}
