import java.util.HashMap;
import java.util.Objects;

class MagicKey {
    int id;

    MagicKey(int id) {
        this.id = id;
    }

    // hashcode
    @Override
    public int hashCode() {
        return Objects.hash(id);// Objects
    }

    @Override
    public boolean equals(Object obj) // Object
    {
        // Mem check
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())// security check for exact class
            return false;
        return id == ((MagicKey) obj).id; // value/data check
    }
}

public class HashCodeNEqualsEx {
    public static void main(String[] args) {
        HashMap<MagicKey, String> locker = new HashMap<>();

        MagicKey key = new MagicKey(100);
        // add in secure locker
        locker.put(key, "Original Key");
        // get key
        System.out.println("Get key" + locker.get(key));

        // Lost key problem
        key.id = 101;
        // locker.put(key, "Alter key");
        System.out.println("Get alter key:" + locker.get(key));

    }
}