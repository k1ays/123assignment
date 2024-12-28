
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Harry", "Potter", 21, true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);

        Student student2 = new Student("Ron", "Qeasley", 22, true);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        student2.addGrade(82);

        Student student3 = new Student("Hermione","Granger",19,false);
        student3.addGrade(100);
        student3.addGrade(99);
        student3.addGrade(95);
        student3.addGrade(98);
        student3.addGrade(100);
        student3.addGrade(96);
        student3.addGrade(97);

        Student student4 = new Student("Luna", "Lovegood", 20, false);
        student4.addGrade(46);
        student4.addGrade(87);
        student4.addGrade(67);
        student4.addGrade(79);
        student4.addGrade(96);
        student4.addGrade(58);
        student4.addGrade(83);

        Student student5 = new Student("Draco", "Malfoy", 19, true);
        student5.addGrade(21);
        student5.addGrade(45);
        student5.addGrade(0);
        student5.addGrade(9);
        student5.addGrade(51);
        student5.addGrade(43);

        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000);
        Teacher teacher3 = new Teacher("Minerva","McGonagall",62,false,"Sociology",17,1100000);
        Teacher teacher4 = new Teacher("Bellatrix","Lestrange",35,false,"Programming",3,570000);
        Teacher teacher5 = new Teacher("Sirius","Black",49,true,"Physics",9,750000);


        if (teacher1.yearsOfExperience > 10) {
            teacher1.giveRaise(10);
        }
        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(student3);
        school.addMember(student4);
        school.addMember(student5);

        school.addMember(teacher1);
        school.addMember(teacher2);
        school.addMember(teacher3);
        school.addMember(teacher4);
        school.addMember(teacher5);


        System.out.println("School Members:");
        System.out.println(school);

        System.out.println(student1.name + "'s GPA: " + student1.calculateGPA());
        System.out.println(student2.name + "'s GPA: " + student2.calculateGPA());
        System.out.println(student3.name + "'s GPA: " + student3.calculateGPA());
        System.out.println(student4.name + "'s GPA: " + student4.calculateGPA());
        System.out.println(student5.name + "'s GPA: " + student5.calculateGPA());

        System.out.println();

        System.out.println(teacher1.name + "'s new salary: " + teacher1.salary);
        System.out.println(teacher2.name + "'s new salary: " + teacher2.salary);
        System.out.println(teacher3.name + "'s new salary: " + teacher3.salary);
        System.out.println(teacher4.name + "'s new salary: " + teacher4.salary);
        System.out.println(teacher5.name + "'s new salary: " + teacher5.salary);
    }
}