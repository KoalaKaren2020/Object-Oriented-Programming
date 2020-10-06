public class Person {

    //fields / global variables / class local space / class variables
    private String username, password;
    private Account account;
    //methods / pojo objects --> getter & setters

    public Person(String username, String password, Account account) {
        //constructer says how you build a new person
        this.username = username;
        this.password = password;
        this.account = account;

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        //remember to set this. so the class knows it's variables
        //this.name = name;
            this.username = username;
        }


    public String getPassword() {

        return password;
    }

    public Account getAccount() {
        return account;
    }
}
