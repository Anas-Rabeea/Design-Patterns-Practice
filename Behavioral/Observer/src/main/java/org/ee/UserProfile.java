package org.ee;

public class UserProfile implements RegisterUserObserver{

    @Override
    public void onRegisterUser() {
        // Create A User Profile Here
        System.out.println("User Profile Created!");
    }
}
