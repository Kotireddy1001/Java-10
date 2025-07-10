public class WrapperClassExample {
    public static void main(String[] args) {
        int primitiveInt = 50;

        Integer wrapperInt = primitiveInt;

        int newPrimitive = wrapperInt;

        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Wrapper (Autoboxed): " + wrapperInt);
        System.out.println("Unboxed: " + newPrimitive);
    }
}
