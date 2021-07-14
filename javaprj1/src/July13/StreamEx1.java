package July13;
import java.util.*;
public class StreamEx1 {
	public static void main(String[] args) {
        Random random = new Random();
    random.ints().limit(10).forEach(e->System.out.println(e));
}

}
