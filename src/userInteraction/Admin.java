package userInteraction;

public class Admin implements User{
    private Receipt issueReceipt;

    @Override
    public String toString() {
        return "Admin{" +
                "issueReceipt=" + issueReceipt +
                '}';
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String password() {
        return null;
    }

    @Override
    public String emailAddress() {
        return null;
    }

    @Override
    public String phone() {
        return null;
    }

    @Override
    public Address homeAddress() {
        return null;
    }
}
