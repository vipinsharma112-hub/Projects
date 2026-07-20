import java.util.*;
public class TestMap{
	public static void main(String[] args){
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Kathy",42);
		scores.put("Bert",423);
		scores.put("Skyler",346);
		System.out.println(scores);
		System.out.println(scores.get("Bert"));
	}
}
