public class Main {
    public static void main(String[] args) {
        String login = "login123";
        String password = "ni_GG_a";
        String confirmPassword = "ni_GG_a";
try{
    Validator.validate(login, password, confirmPassword);
}
catch (WrongLoginException | WrongPasswordException exception){
    exception.printStackTrace();
}
    }
    }



