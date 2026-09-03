package dev.anascoding;

public interface ChatMediator
{
    void sendMessage(User sender , String message);
    void register(User user);
}
