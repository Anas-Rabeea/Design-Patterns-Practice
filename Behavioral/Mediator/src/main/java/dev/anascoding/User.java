package dev.anascoding;

public record User(
  String name,
  ChatMediator chatMediator
)
{
//    public void sendMessage(String message)
//    {
//        chatMediator.sendMessage(this,message);
//    }
    public void receiveMessage(String message)
    {
        System.out.println(message);
    }
}
