import java.util.regex.Pattern;

public class Validator {
    public static void validate(String login, String password, String confirmPassword) {
        if (!Pattern.matches("^[a-zA-Z0-9_]{1,20}$", login)) {
            throw new WrongLoginException(" Неверный формат логина ");
        }

            if (!Pattern.matches("^[a-zA-Z0-9_]{1,19}$", password)) {
                throw new WrongPasswordException(" Неверный формат пароля ");
            }
            if(!password.equals(confirmPassword)){
                throw new WrongPasswordException("Введенный пароль неверный");
            }
        }

    }
