public class Client extends User {
    private int membershipDuration; // in months

    public Client(String name, String number, boolean isMember, int membershipDuration) {
        super(name, number, isMember);
        this.membershipDuration = membershipDuration;
    }

    public int getMembershipDuration() {
        return membershipDuration;
    }

    public void setMembershipDuration(int membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    public void attendClass() {
        System.out.println("Attending a gym class...");
    }
}