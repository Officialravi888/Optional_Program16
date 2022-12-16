import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String str = "ravi";
//        Optional <String> obj=Optional.empty();
        Optional<String> A= Optional.ofNullable(str);
        System.out.println(A.isPresent());
        System.out.println();
    }
}