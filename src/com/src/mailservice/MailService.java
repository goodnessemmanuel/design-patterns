package com.src.mailservice;

/**
 * Send mail demonstration.
 * The processes to send a mail
 * involves interaction with a mail server
 * i.e. connecting to the server,
 * authenticating against the server,
 * doing the actual act of sending
 * disconnecting when data has been sent
 * Not all these process is directly
 * related to the user of this mail service
 * hence the need to abstract some of this process
 */
public class MailService {
    /**
     * method to send mail
     */
    public void sendEmail(){
        connect();
        authenticate();
        //send mail here...
        disconnect();
    }

    /**
     * Notice connect, authenticate, disconnect
     * are all private because user need not know
     * what exactly goes on under the hood except
     * that they want to send mail.
     * This is abstraction because process happens eventually
     * but are hidden from the user
     */
    private void connect(){
        System.out.println("Connecting to server");
    }

    private void authenticate(){
        System.out.println("Authenticating user credentials");
    }

    private void disconnect(){
        System.out.println("Disconnecting from server");
    }
}
