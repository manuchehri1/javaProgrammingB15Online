package day44.sub;

import day44.SlackUser;

public class SlackAdminUser_My extends SlackUser {
    int adminId;


    public void deleteMessege(){
        System.out.println(name+"s\' messages is deleted");
    }
    public SlackAdminUser_My(String name, String status, int adminId){
        this.name=name;
        this.status=status;
        this.adminId=adminId;
    }


    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SlackAdminUser_My a1 = new SlackAdminUser_My("Akbar","online",102);

        a1.deleteMessege();
        a1.sendMessage();

        System.out.println("a1 = " + a1);
    }
    
}

