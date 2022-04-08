package Service;

import java.util.*;

public class Authorization {
    private Map<String, String> list_of_users = new HashMap();
    Scanner sc = new Scanner(System.in);

    public Authorization() {
        list_of_users.put("petrov_m_n", "01.05.03");
        list_of_users.put("andreev_n_m", "12.07.02");
        list_of_users.put("nikitin_m_n", "09.12.00");
        list_of_users.put("zoloyov_m_n", "01.11.05");
        list_of_users.put("perov_m_n", "11.08.04");
    }

    public void check(String l, String p) {
        for (int i = 0; i < list_of_users.size(); i++) {
            if (list_of_users.containsKey(l) && list_of_users.get(l).equals(p)) {
                System.out.println("Authentication passed successfully");
                break;
            } else {
                registration();
                break;
            }
        }
    }

    public void registration() {
        System.out.println("The user was not found. Enter your login and password for registration");
        String login = sc.nextLine();
        String password = sc.nextLine();
        list_of_users.put(login, password);
    }

}
