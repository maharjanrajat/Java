class question2{

    String studentName;
    int studentAge;

    //constructor
    question2(String name, int age){
    studentName = name;
    studentAge = age;
    }

    void display(){
    System.out.println(studentName+ " "+studentAge);
    }

    public static void main(String args[]) {
    question2 myObj = new question2("Rajat" , 20);
    myObj.display();
    }
    
}