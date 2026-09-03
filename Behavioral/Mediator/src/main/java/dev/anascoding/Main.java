package dev.anascoding;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("test");

        ChatMediator chatroom = new ChatRoom();
        User user1 = new User("user1", chatroom);
        User user2 = new User("user2", chatroom);
        User user3 = new User("user3", chatroom);

        chatroom.register(user1);
        chatroom.register(user2);
        chatroom.register(user3);
        // We replaced many-to-many coupling with many-to-one communication.
        chatroom.sendMessage(user1 , "This message will be " +
          "sent to the rest of users without specifying them");


    }
}