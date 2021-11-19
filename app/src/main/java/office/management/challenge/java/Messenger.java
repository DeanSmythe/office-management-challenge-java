package office.management.challenge.java;
// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Messenger {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
    public static final String FROM_NUMBER = System.getenv("DS_OUT_NUMBER");
    public static final String TO_NUMBER = System.getenv("DS_PHONE_NUMBER");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(FROM_NUMBER),
                        new com.twilio.type.PhoneNumber(TO_NUMBER),
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}