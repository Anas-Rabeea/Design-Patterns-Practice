package dev.anascoding;

import java.util.List;

public class UserDirectory
{
    private final List<User> users;

    public UserDirectory(List<User> users)
    {
        this.users = List.copyOf(users);
    }

    public Iterator<User> iterator()
    {
        return new UserIterator(users);
    }



}
