package homework;

public class Persister{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public void saveName(){
        System.out.println("Save the user's name: " + user.getName());
    }
    public void saveEmail(){
        System.out.println("Save the user's e-mail: " + user.getEmail());
    }
    public void saveAge(){
        System.out.println("Save the user's age: " + user.getAge());
    }
}
