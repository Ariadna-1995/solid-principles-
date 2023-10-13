package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("John", "john@inbox.ru", 34);
        UserReport userReport = new UserReport(user);
        userReport.reportName();
        userReport.reportEmail();
        userReport.reportAge();
        Persister userPersister = new Persister(user);
        userPersister.saveName();
        userPersister.saveEmail();
        userPersister.saveAge();
        Persister userPersister2 = new Persister(new UsersNoEmail("Oscar", "Oscar@1234", 32));
        userPersister2.saveName();
        userPersister2.saveEmail();
        userPersister2.saveAge();
    }
}
