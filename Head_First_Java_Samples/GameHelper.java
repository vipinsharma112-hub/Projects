import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];

    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toLowerCase();
    }

    public ArrayList<String> placeStartup(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;

        while (!success && attempts++ < 200) {
            int location = (int) (Math.random() * gridSize);
            int x = 0;
            success = true;

            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += 1;

                    if (location >= gridSize || location % gridLength == 0) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }

        for (int i = 0; i < comSize; i++) {
            grid[coords[i]] = 1;
            int row = coords[i] / gridLength;
            int col = coords[i] % gridLength;
            String temp = "" + alphabet.charAt(col) + row;
            alphaCells.add(temp);
        }

        return alphaCells;
    }
}
