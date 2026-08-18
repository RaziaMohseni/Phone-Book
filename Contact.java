
public class Contact {
    private String name;
    private String[] mobiles;
    private int mobileCount;

    public Contact(String name) {
        this.name = name;
        this.mobiles = new String[5];
        this.mobileCount = 0;
    }

    public String getName() {
        return name;
    }

    public boolean addMobile(String number) {
        if (mobileCount >= mobiles.length) return false;
        mobiles[mobileCount++] = number;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ": ");
        if (mobileCount == 0) return sb.append("(بدون شماره)").toString();
        for (int i = 0; i < mobileCount; i++) {
            sb.append(mobiles[i]);
            if (i < mobileCount - 1) sb.append(", ");
        }
        return sb.toString();
    }
}

