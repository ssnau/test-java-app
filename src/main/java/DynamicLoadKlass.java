public class DynamicLoadKlass {
    public static void run() {
        ClassLoader classLoader = DynamicLoadKlass.class.getClassLoader();

        try {
            Class aClass = classLoader.loadClass("com.jenkov.MyClass");
            System.out.println("aClass.getName() = " + aClass.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
