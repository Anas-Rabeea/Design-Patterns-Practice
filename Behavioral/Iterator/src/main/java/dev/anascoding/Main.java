package dev.anascoding;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        UserDirectory directory = new UserDirectory(List.of(
          new User("anas", "1234"),
          new User("ali", "456"),
          new User("admin", "7489")
        ));

        Iterator<User> iterator = directory.iterator();
        while ( iterator.hasNext() )
        {
            System.out.println("Current User is " + iterator.next().username());
        }


    }
}