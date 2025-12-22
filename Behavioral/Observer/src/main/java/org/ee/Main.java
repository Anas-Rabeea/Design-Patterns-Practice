package org.ee;

public class Main {
    public static void main(String[] args) {

        /*
        When a user registers, multiple independent actions must happen:
            Send a welcome email
            Create a user profile
            Notify analytics system
         */
        RegisterUserPublisher publisher = new RegisterUserPublisher();
        publisher.addEvent(new GreetingEvent());
        publisher.addEvent(new UserProfile());
        publisher.addEvent(new AnalyticsTeamEvent());

        publisher.registerUser(); // this will call all the events behind the scenes



    }
}