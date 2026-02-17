public class Student 
{
    public int PRN;
    public String firstName; // the s of String needs to be uppercase
    public String lastName;
    public int age;
    public int curYear;
    public double fees; // double is longer than float
    public String branch;
    // these all can be written on one line by using commas

    public void study(String subject, int hours) //study is a member method, here we are describing the characteristics of a student
    {
        System.out.println("You have utilised " + hours + " hours for the study of " + subject);

    }
    public void enroll(String courseCode, int PRN)
    {
        //System.out.println("Your PRN is " + PRN);
        System.out.println("You are enrolled in " + courseCode + " with PRN " + PRN);
    }
    public void clubsJoined(String ClubName)
    {
        System.out.println("You have joined " + ClubName);
    }
    //without defining main method, nothing gets executed like c language
    // uptil main, it is just a blueprint and doesnt take any physical memory
    // object on the other hand, occupies memory

    public static void main(String[] args) 
    {
        Student s1 = new Student(); // Student() means we have created an object of the class
        s1.PRN = 2025100210;
        s1.firstName = "Kritika";
        s1.lastName = "Kapoor";
        s1.age = 20;
        s1.branch = "AIML";
        s1.curYear = 3;
        s1.fees = 300000;
        s1.enroll("AIML12345", s1.PRN);
        s1.study("Java", 6);  
        s1.clubsJoined("AI Club");
    }
    
}
