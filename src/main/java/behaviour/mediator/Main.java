package behaviour.mediator;

import behaviour.mediator.models.ChatMediator;
import behaviour.mediator.models.ChatMediatorImpl;
import behaviour.mediator.models.SpecificUser;
import behaviour.mediator.models.User;

public class Main {
    public static void main() {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new SpecificUser(chatMediator, "Juan");
        User user2 = new SpecificUser(chatMediator, "Ana");
        User user3 = new SpecificUser(chatMediator, "Pedro");
        User user4 = new SpecificUser(chatMediator, "Marta");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.sendMessage("Hello World!");
    }
}
