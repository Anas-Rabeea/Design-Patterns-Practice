package org.ee;
import java.util.ArrayList;
import java.util.List;
public class RegisterUserPublisher {

    private final List<RegisterUserObserver> events =
            new ArrayList<>();

    // add notifiers to be notified when certain action happens
    public void addEvent(RegisterUserObserver user)
    {
        events.add(user);
    }

    public void registerUser()
    {
        System.out.println("User Registered");
        publishEvents();
    }

    private void publishEvents()
    {
        for (RegisterUserObserver o : events)
        {
            o.onRegisterUser();
        }
    }


}
