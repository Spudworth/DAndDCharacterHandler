public class Account {
    private boolean isPremium = false;
    private String username;



    public Account(boolean isPremium, String username)
    {
        setIsPremium(isPremium);
        setUsername(username);
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setIsPremium(boolean isPremium) {
       this.isPremium = isPremium;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
