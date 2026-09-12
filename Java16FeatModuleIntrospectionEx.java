import java.util.Set;

public class Java16FeatModuleIntrospectionEx {
    public static void main(String[] args) {
        // Direct Package introspection java.lang
        Module basModule = String.class.getModule();// Module
        Set<String> basepackage = basModule.getPackages();// Package

        System.out.println("Total Packages:" + basepackage.size());
        System.out.println("Contains java.lang:" + basepackage.contains("java.lang"));// T/F
    }
}
