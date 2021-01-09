package pack2.method_ref;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public class BiConsumerClass {
	public static void main(String[] args) {
		//BiConsumer<String, String> bi = (a,b)->{ System.out.println(a);System.out.println(a+b);
		BiFunction <String,String,String> b1 = (x,y)->{return x+x+y ;};
		};
	Function<String,String>p=x->x+"Java"
	System.out.print(p.andThen(p).apply("New Java Feature"));
		//bi.accept("Java Learning", "Need to improve more");
	//bi.andThen(bi).accept("Java Learning", "Need to improve more");
}




