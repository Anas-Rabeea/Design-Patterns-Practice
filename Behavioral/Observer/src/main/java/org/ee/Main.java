package org.ee;

import org.ee.order.EmailNotificationConsumer;
import org.ee.order.OrderAnalyticsConsumer;
import org.ee.order.OrderEventPublisher;
import org.ee.order.OrderPlacementEvent;

import java.math.BigDecimal;

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

        System.out.println("******************************************");
        OrderEventPublisher publisher2 = new OrderEventPublisher();

        publisher2.subscribe(new EmailNotificationConsumer());
        // we can comment this line also
        publisher2.subscribe(new OrderAnalyticsConsumer());

        publisher2.publish(new OrderPlacementEvent("36-qq-QQ" , "Ahmed" ,
          new BigDecimal("33.33")));

    }
}