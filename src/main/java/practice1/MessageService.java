package practice1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MessageService {
    private final ArrayList<Message> messages;

    public MessageService() {
        messages=new ArrayList<>(100);
        addMessage("admin", "Добро пожаловать!");
        addMessage("guest1", "Hello!");
        addMessage("guest2", "Hello!");
    }

    public final void addMessage(String from,String user2, String text ) {
        messages.add(new Message(from, user2, text));
    }
    public final void addMessage(String from, String text ) {
        messages.add(new Message(from, text));
    }

    public List<Message> getAllMessages() {
        return Collections.unmodifiableList(messages);
        // вызвавшие не смогут удалить или добавить сообщения
        // теоретически, получив сслыку на список, можно изменять содержимое его элементов
        // но наши сообщения неизменямы (Immutable)
    }
    
    public List<Message> getGlobalMessages() {
      // выбрать тех, у кого адресат=null
        List<Message> lst = messages.stream().filter(p -> p.getRecepient().equals("Всем")).collect(Collectors.toList());
        return lst;
    }
    
    
    public List<Message> getMessagesTo(String user) {
        List<Message> lst = messages.stream().filter(p -> p.getRecepient().equals(user)).collect(Collectors.toList());
         return lst;
    }
}
