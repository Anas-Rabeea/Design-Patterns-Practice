package org.ee;

public class AnalyticsTeamEvent implements RegisterUserObserver{

    @Override
    public void onRegisterUser() {
        System.out.println("Analytics Team is Notofied");
    }
}
