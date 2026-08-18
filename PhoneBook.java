public class PhoneBook {
    private Contact[] contacts;
    private int count;

    public PhoneBook() {
        contacts = new Contact[10];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public boolean createContact(String name) {
        if (count >= contacts.length) return false;
        contacts[count++] = new Contact(name);
        return true;
    }

    public boolean deleteContact(int index) {
        if (index < 0 || index >= count) return false;
        for (int i = index; i < count - 1; i++) {
            contacts[i] = contacts[i + 1];
        }
        contacts[--count] = null;
        return true;
    }

    public Contact getContact(int index) {
        if (index < 0 || index >= count) return null;
        return contacts[index];
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("دفترچه خالی است.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(i + ". " + contacts[i]);
        }
    }
}
