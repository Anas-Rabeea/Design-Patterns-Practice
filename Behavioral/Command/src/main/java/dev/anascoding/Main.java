package dev.anascoding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

public class Main
{
    public static void main(String[] args)
    {
        OrderService orderService = new OrderService();
        Command command = new CreateOrderCommand(
          orderService,new UUID(2566,654885));

        command.execute();

        // now we have a queue of commands
        Queue<Command> commandsQueue = new LinkedList<>();

        commandsQueue.offer(new CreateOrderCommand(orderService, new UUID(46564,99)));
        // now the queue wants to execute the commands in the command queue
        Command nextCommand = commandsQueue.poll();
        nextCommand.execute();


    }
}