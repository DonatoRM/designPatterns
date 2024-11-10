package behaviour.mediator.models;

public class SpecificUser extends User {
    public SpecificUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.printf("%s envía: %s\n", this.name, message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.printf("%s recibe: %s\n", this.name, message);
    }
}
