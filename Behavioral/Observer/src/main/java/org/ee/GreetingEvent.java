package org.ee;

public class GreetingEvent implements RegisterUserObserver{

    @Override
    public void onRegisterUser() {
        // Sending Email logic Here
        System.out.println("Welcome email sent");
    }
}
