package extra;

public class Amigos1Code {
    private String id;
    private String userName;
    private int Year;

    public Amigos1Code(String id, String userName, int year) {
        this.id = id;
        this.userName = userName;
        Year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
}
