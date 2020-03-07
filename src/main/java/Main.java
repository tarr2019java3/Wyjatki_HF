import Wyjatki.EmailException;
import Wyjatki.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        User user = new User();
        user.setLogin("login");
        try {
            user.setEmail("email");
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }
}
