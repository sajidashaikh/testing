package pack2.method_ref;

import java.util.function.Function;

public class ClassFunctionInterface {
	public static void main(String args[]) {
		Function<Integer,Double> f= a->a/5.7;
		System.out.println(f.apply(20));
		
		Function<Integer,Integer> f1=b->b/14;
		//f1 = f1.andThen(b->5 + b);
		f1 = f1.compose(b->0*b);
		//System.out.println(f1);
		System.out.println(f1.apply(5));
		Function<Integer,Integer> p = Function.identity();
		System.out.println(p.apply(20));
		
		/*Function p = Function.identity();
		System.out.println(p);*/
		
		/*Function<String,String> f2=b->b+"world";
		//f2 = f2.andThen(b->"Hello" + "world");
		f2 = f2.compose(b->0 + b);
		System.out.println(f2.apply("Hello"));*/
	}

}
