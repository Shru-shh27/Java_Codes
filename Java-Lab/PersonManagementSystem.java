
// abstract class StudentDeatils {
//     String name;
//     int age;

//     void details() {
//         System.out.println("student details");
//     }
// }
//  class Teacher extends StudentDeatils {
//     int rollNumber ;

//     void display(){
//         System.out.println("teachers details");
//     }
// }

// public class Student {
//     public static void main(String[] args) {
       
//     }
// }


// abstract class Person {
//     String name ;
//     int age ;

//     Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     abstract void displayDeatils();

// }


// class Student extends Person {
//         int rollNumber;
//         Studnet(String name , int age , int rollNumber){
//             super(name,age);
//             this.rollNumber= rollNumber;
//         }
//     @Override
//     void displayDetails(){
//         System.out.println("Student Details");
//         System.out.println("Name" + name); 
    
//     }
// }

// class Teacher extends Person {
//     String subject;
//     Teacher(String name,int age, String subject){
//         super(name,age);
//         this.subject=subject;

//     }
//     @Override
//     voud 

// }

// public class PersonManagementSystem{
//     public static void main(String[] args){

//     }
// }

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void displayDetails();
}

// Student class
class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Teacher class
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class PersonManagementSystem {
    public static void main(String[] args) {

        Student s = new Student("Shruti", 20, 101);
        Teacher t = new Teacher("Shreya
        ", 35, "Java");

        s.displayDetails();
        System.out.println();

        t.displayDetails();
    }
}