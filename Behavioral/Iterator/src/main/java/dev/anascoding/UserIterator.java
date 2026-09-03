package dev.anascoding;

import java.util.List;

public class UserIterator implements Iterator<User>
{
    private final List<User> users;
    private int index = 0 ;

    public UserIterator(List<User> users)
    {
        this.users = users;
    }

    @Override
    public boolean hasNext()
    {
        return index < users.size();
    }

    @Override
    public User next()
    {
        return users.get(index++);
    }
}
