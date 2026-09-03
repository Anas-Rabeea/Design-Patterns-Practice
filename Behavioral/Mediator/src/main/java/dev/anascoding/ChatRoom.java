package dev.anascoding;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator
{
    private final List<User> users = new ArrayList<>();

    @Override
    public void register(User user)
    {
        users.add(user);
    }

    @Override
    public void sendMessage(User sender, String message)
    {
        for ( User user : users )
        {
            if (user != sender)
            {
                user.receiveMessage(sender.name() + " to : " + user.name() + " ,message: " + message);
            }
        }
    }


}
