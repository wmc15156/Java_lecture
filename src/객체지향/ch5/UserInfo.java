package 객체지향.ch5;

public class UserInfo {
    public String userId;
    public  String userPassword;
    public String userName;
    public String address;
    public int phoneNumber;

    public UserInfo(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + " 이고, 등록된 이름은 " + userName + " 입니다.";
    }
}
