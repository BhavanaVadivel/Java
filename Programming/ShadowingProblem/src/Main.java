
public class Main {

    int id;
    String name;
    String gender;
    String email;
    long phone;
    public Main(int id,String name, String gender, String email, long phone){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.email= email;
        this.phone=phone;
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void sleep(){
        System.out.println(name+" who is a "+gender+" is sleeping");
    }
}
