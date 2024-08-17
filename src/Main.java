public class Main {
    public static void main(String[] args) {

        User clarice = new User("Clarice", "Santos", "claricesantos123@gmail.com", 22, "vila velha");

        UserMethods methodUser = new UserMethods();
        methodUser.onCreate(clarice);
        System.out.println(methodUser.getUsers());
    }
}