import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args){

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }
        sendEmailToUser("crisotbal@gmail.com");
        sendEmailToUser("cristobal@gmail.com", "Cristobal");

        var users = new ArrayList<>(Arrays.asList("brais@gmail.com", "moure@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("krs@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }

    //Funcion sin parametros y sin retorno
    public static void sendEmail(){
        System.out.println("Se ha enviado el email");
    }

    //Funcion con parametros y sobrecarga

    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email a " + email);
    }

    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envia el email a "+name + "(" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            sendEmailToUser(email);
        }
    }

    //Funcion con retorno

    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()) return false;
        System.out.println("Se envia el email a "+ email);
        return true;
    }

}
