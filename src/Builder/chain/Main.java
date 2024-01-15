package Builder.chain;

/*
    To do:
    - create inner Builder class inside type that we want to build
    - implement method in type that returns reference to the builder object
    - declare setters in builder that returns the reference to de builder object
    - implement build() method to terminate chain and return target object
    - in client code call method to get reference to builder and build object step-by-step
 */

public class Main {
    public static void main(String[] args) {
        Account account = Account.newBuilder()
                .setToken("hello")
                .setUserId("habr")
                .build();
        System.out.println(account);
    }
}
