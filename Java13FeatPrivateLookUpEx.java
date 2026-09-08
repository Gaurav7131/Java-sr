
import java.lang.invoke.MethodHandles;

public class Java13FeatPrivateLookUpEx {
    public static void main(String[] args) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();

        // Passing primitive and array class
        try {
            lookup.in(int.class);// primitive class
        } catch (IllegalArgumentException e) {
            System.out.println("Rule Enforced cannot lookup in Primitive type:" + e.getMessage());
        }
        // array class
        try {
            lookup.in(String[].class);// array[] class
        } catch (IllegalArgumentException e) {
            System.out.println("Rule enforced cannot lookup in Array Type:" + e.getMessage());
        }

        // privateLookupin required PRIVATE MODE priviledge on caller lookup
        MethodHandles.Lookup publicLookup = MethodHandles.publicLookup();// publicLooop
        try {
            MethodHandles.privateLookupIn(String.class, publicLookup);// privateLookupin
        } catch (IllegalAccessException e) {
            System.out.println("Security Checks Passed:" + e.getMessage());
        }

    }
}
