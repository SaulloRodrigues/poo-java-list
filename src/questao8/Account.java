package questao8;

public class Account {
    private int id_account;
    public Transaction transaction;
    public Client client;

    public Account() {
        this.id_account = (int) (Math.random() * 80000) + 10000;
    }

    public void addTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public int getIdAccount() {
        return this.id_account;
    }

    public void setClient(Client client) {
            this.client = client;
    }

}
