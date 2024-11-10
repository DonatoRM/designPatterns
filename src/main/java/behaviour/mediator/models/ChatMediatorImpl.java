package behaviour.mediator.models;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private final List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        users.forEach(u -> {
            if (u != user) {
                u.receiveMessage(message);
            }
        });
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
