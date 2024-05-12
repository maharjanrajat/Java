class employee{
    private String name;
    private int age;
    private int id;

    public employee(String _name, int _age, int _id){
        name = _name;
        age = _age;
        id = _id;
    } 

    public void display(){
        System.out.print(name + " " +age+ " " +id);
    }
}