package lamda.functional_interface.pack;

public class AnonymousVsFunctionalInterface {

    public static void main(String[] args) {

        CustomFunctionalInterface customFunctionalInterface = () -> System.out.println("Custom Functional Interface");
        customFunctionalInterface.display();

        AnonymousInterface anonymousInterface = new AnonymousInterface() {

            @Override
            public void service() {
                System.out.println("service()");
            }

            @Override
            public void init() {
                System.out.println("init()");
            }

            @Override
            public void destroy() {
                System.out.println("destroy()");
            }
        };

        anonymousInterface.init();
        anonymousInterface.service();
        anonymousInterface.destroy();
    }

}
