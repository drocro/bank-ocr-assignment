package dssc.assignment.bank;

public class AccountNumber {
//hello luca
//hello Nicola
    private Entry entry;

    public AccountNumber(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return entry.toString();
    }
}
