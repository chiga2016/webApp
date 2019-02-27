package practice1;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Locale.ENGLISH;

public class Message {
    
    private final String author;
    private final String recepient; // null -> сообщение для всех
    
    private final String text;
    private final Date date;

    public String getDateTxt() {
        return dateTxt;
    }

    private String dateTxt="";

    public Message(String user1,String user2, String text) {
        this.author = user1;
        this.recepient = user2;
        this.text = text;
        this.date = new Date(System.currentTimeMillis());
        this.dateTxt = new SimpleDateFormat("MMM dd, yyyy", ENGLISH).format(date);
    }

    public Message(String user1, String text) {
        this.author = user1;
        this.text = text;
        this.recepient = "Всем";
        this.date = new Date(System.currentTimeMillis());
        this.dateTxt = new SimpleDateFormat("MMM dd, yyyy", ENGLISH).format(date);
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
        //SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy", ENGLISH);
        //String result = newDateFormat.format(date);
        //new SimpleDateFormat("MMM dd, yyyy", ENGLISH).format(date);

        return "<font color = green>" +dateTxt+"</font>: From <font color = blue>"+author+"</font> to <font color = purple>"+recepient+"</font>: ---"+text+"---";
    }

    
}
