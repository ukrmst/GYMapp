public class User {
    private String name;
    private String number;
    public boolean isMember = false;

    public User(String name, String number, boolean isMember) {
        this.name = name;
        this.number = number;
        this.isMember = isMember;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }
    public boolean getMember() {
        return isMember;
    }

    public void setInfo(String _name, String _number, boolean _isMember) {
        name = _name;
        number = _number;
        isMember = _isMember;
    }
    public String getInfo() {
        String userInfo = "Name: " + name + "\n" + "Number: " + number + "\n" + "Member: " + (isMember ? "Yes" : "No");
        return userInfo;
    }

    
}

 


