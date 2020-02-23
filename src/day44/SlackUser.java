package day44;
/*
* Create a class called SlackUser
attributes :
	 name  ,  status (make it protected)
behaviours :
	 sendMessage
	 callSomeone
	 addEmoji
Creare 1 subClass SlackAdminUser
attribute :
	adminId
behaviour :
	 sendAtChannelMessage
	 deleteMessage
	 addChannel
	 toString method
constructor :
	 3 argument constructor to set all fields value
* */


public class SlackUser {

    protected String name;
    protected String status;


    public void callSomeone(){
        System.out.println(name+" is calling");
    }
    public void sendMessage(){
        System.out.println("message is sent");
    }
    public void addEmoji(){
        System.out.println("emoji added");
    }




}
