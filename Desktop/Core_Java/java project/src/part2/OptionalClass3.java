package part2;
import java.util.Optional;
public class OptionalClass3 {
	public static void main(String[] args) {
		String[] s1= new String[10];
		Optional<String> str1 = Optional.of("INDIANS");
		Optional<String> str2 = Optional.empty();
		System.out.println(str2.orElse("Nothing"));
		System.out.println(str1.orElse("Default"));
		System.out.println(str2.orElseGet(()->"New Value"));
		Optional<Integer> op = Optional.of(1234);
		System.out.println("use of get:" +op);
		System.out.println(op.get());
		System.out.println(op.getClass());
		
	}
}
