 class course {
    static int maxCapacity;
    String courseName;
    String studentName;

    int Student = 0;
    course(String courseName ){
            this.courseName = courseName;
            this.enrolledStudent = new String[maxCapacity];
            Student = 0;
//            this.studentName = StudentName;
    }
    String[] enrolledStudent = new String[maxCapacity];


    public void enrollStudent(String studentName){
        this.studentName = studentName;
//        System.out.println( this.studentName + " enrolled in " + this.courseName + " course thanks for joining");
        enrolledStudent[Student] = studentName;
        Student++;
    }
    public void unenrollStudent(String studentName){
        System.out.println(studentName + "is not enroll in this " + this.courseName + " ");
        Student--;
    }

    static int setMaxCapacity(int number ){
         course.maxCapacity = number;
         return maxCapacity;
    }

     public static void main(String[] args) {
         course Java = new course("Java Foundation" );

         Java.enrollStudent("kanhaiya");
     }

}
