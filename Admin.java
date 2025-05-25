public class Admin extends User {
    private String adminId;

    public Admin(String name, String number, boolean isMember, String adminId) {
        super(name, number, isMember);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void manageGym() {
        System.out.println("Managing gym operations...");
    }
}