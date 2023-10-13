package homework;

public class UserReport {
    private User user;

    public UserReport(User user) {
        this.user = user;
    }

    public void reportName(){
        System.out.println("Report for the user's name: " + user.getName());
    }
    public void reportEmail(){
        System.out.println("Report for the user's e-mail: " + user.getEmail());
    }
    public void reportAge(){
        System.out.println("Report for the user's age: " + user.getAge());
    }
}
