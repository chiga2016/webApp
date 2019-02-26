package practice1;

import java.util.Date;

public class Message {
    
    private final String author;
    private final String recepient; // null -> сообщение для всех
    
    private final String text;
    private final Date date;

    public Message(String user1,String user2, String text) {
        this.author = user1;
        this.recepient = user2;
        this.text = text;
        this.date = new Date(System.currentTimeMillis());
    }

    public Message(String user1, String text) {
        this.author = user1;
        this.text = text;
        this.recepient = "Всем";
        this.date = new Date(System.currentTimeMillis());
    }
    
    public Date getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getRecepient() {
        return recepient;
    }
    
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "<font color = green>" +date.toString()+"</font>: From <font color = blue>"+author+"</font> to <font color = purple>"+recepient+"</font>: ---"+text+"---";
    }

    
}
