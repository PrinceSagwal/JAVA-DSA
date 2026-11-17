

public class AccessModifiers {
    public static void main(String[] args) {
        bankAccount myAcc= new bankAccount();
        myAcc.username="Prince Sagwal";
        myAcc.setPassword("abcdefghijklmnop");
    }
}
class bankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}