package homework;

public class UsersNoEmail extends User {
    private final String name;
    private final String email;
    private final int age;

    public UsersNoEmail(String name, String email, int age) {
        super(name, email, age);
        this.name = name;
        this.email = email;
        this.age = age;
    }



    @Override
    public String getEmail() {
        System.out.println("This user has no email");
        return null;
    }
}
