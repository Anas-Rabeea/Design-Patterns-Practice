package org.ee;

public class GreetingEvent implements RegisterUserObserver{


    @Override
    public void onRegisterUser() {
        // SEnding Emaul logic Here
        System.out.println("Welcome email sent");
    }
}
