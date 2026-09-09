import java.lang.invoke.MethodType;

public class Java14FeatClassLoaderEx {
    public static void main(String[] args) {
        ClassLoader loader = Java14FeatClassLoaderEx.class.getClassLoader();
        String descriptor = "(Ljava/lang/String;)I";

        MethodType mt = MethodType.fromMethodDescriptorString(descriptor, loader);
        System.out.println("Return Type:" + mt.returnType());
        System.out.println("Parameter:" + mt.parameterType(0));// 1:indexoutofBoundError()
    }

}
