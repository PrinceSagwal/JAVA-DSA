public class CopyConstructor {
    public static void main(String[] args) {
         // 1. Create original student object
         Student s1 = new Student();
         s1.name = "Shradha";
         s1.roll = 123;
         s1.password = "abcd";
         s1.marks[0] = 100;
         s1.marks[1] = 90;
         s1.marks[2] = 80;
 
         // 2. Use copy constructor to copy s1 data into s2
         Student s2 = new Student(s1);
         s2.password = "xyz"; // Changing password won't affect s1
 
         // 3. Modifying s2 array changes s1 too (due to line 31 shallow copy)
         s2.marks[2] = 100; 
 
         // Display results to see the shallow copy effect
         System.out.println("s1 marks[2]: " + s1.marks[2]); // Outputs 100
         System.out.println("s2 marks[2]: " + s2.marks[2]); // Outputs 100
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Non-parameterized Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor called...");
    }

    // Parameterized Constructor
    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }

    // copy constructor (Shallow Copy as shown in your image)
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; // Pointing to the same array reference
    }}