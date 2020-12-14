package dssc.assignment.bank;

public class AccountNumber {
//hello luca
//hello Nicola
//hello Ivan - test

//TEST DEL PUSH 14/12222


    private Entry entry;

    public AccountNumber(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return entry.toString();
    }
}
