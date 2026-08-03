import java.util.*;

 

// Custom exception for course full

class CourseFullException extends Exception {

    public CourseFullException(String message) {

        super(message);

    }

}

 

// Custom exception for missing prerequisite

class PrerequisiteNotMetException extends Exception {

    public PrerequisiteNotMetException(String message) {

        super(message);

    }

}

 

// Course class

class Course {

    private String name;

    private int maxCapacity;

    private int enrolledStudents;

    private String prerequisite;

 

    // Constructor

    public Course(String name, int maxCapacity, String prerequisite) {

        this.name = name;

        this.maxCapacity = maxCapacity;

        this.enrolledStudents = 0;

        this.prerequisite = prerequisite;

    }

 

    // Enroll student in course

    public void enrollStudent(Set<String> completedCourses) throws CourseFullException, PrerequisiteNotMetException {

        // Check if course is full

        if (enrolledStudents >= maxCapacity) {

            throw new CourseFullException("Error: CourseFullException - " + name + " has reached maximum capacity.");

        }

        // Check prerequisite

        if (prerequisite != null && !prerequisite.isEmpty() && !completedCourses.contains(prerequisite)) {

            throw new PrerequisiteNotMetException("Error: PrerequisiteNotMetException - Complete " + prerequisite + " before enrolling in " + name + ".");

        }

        // Enroll student

        enrolledStudents++;

        System.out.println("Successfully enrolled in " + name + ". Remaining slots: " + (maxCapacity - enrolledStudents));

    }

}

 

public class UniversityEnrollmentSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        // Define courses with max capacity and prerequisites

        Course coreJava = new Course("Core Java", 3, "");

        Course advancedJava = new Course("Advanced Java", 2, "Core Java");

 

        // Set to track completed courses

        Set<String> completedCourses = new HashSet<>();

 

        try {

            // Simulate student completing Core Java

            System.out.print("Have you completed Core Java? (yes/no): ");

            String hasCompleted = scanner.nextLine().trim().toLowerCase();

            if (hasCompleted.equals("yes")) {

                completedCourses.add("Core Java");

            }

 

            // Student tries to enroll in Advanced Java

            System.out.println("\nEnrolling in Advanced Java...");

            advancedJava.enrollStudent(completedCourses);

 

        } catch (CourseFullException | PrerequisiteNotMetException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: Invalid input.");

        } finally {

            scanner.close();

        }

    }

}

 

 

  {
    
}
