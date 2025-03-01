package questao8;

public class Client {
    public String name;
    public String address;
    public Account account;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }
}
