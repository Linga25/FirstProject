
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Locale;
public class task {
	public static void main(String []args)
	{
	var sb= new StringBuilder();
	try (Formatter happy = new Formatter(sb,Locale.US)) {
		happy.format("%3$s FRNDS %3$s FRNDS %3$s", "SIVA", "RAM", "DHINESH");
	}
	System.out.println(sb);
	
	String pivalue= String.format("the pi value is %c", 0x1d70b);
	System.out.println(pivalue);
	
	String formattedE=String.format(Locale.FRANCE,"e=%-10.4f is Euler " + "constant", Math.E );
	System.out.println(formattedE);
	
	
	LocalDate birthday=LocalDate.of(1980,4,12);
	String hi= String.format("%1$tB %1$te,"+" %1$tY",birthday );
	System.out.println(hi);

	}
}
 