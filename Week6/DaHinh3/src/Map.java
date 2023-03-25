import java.io.BufferedReader;
import java.io.FileReader;

public class Map {
    private char[][] map;
    private int level, rows, cols;
    
    public void loadMap(){
        try {
            FileReader file = new FileReader("src\\Level1.txt");
            BufferedReader bufferReader = new BufferedReader(file);
            String s = bufferReader.readLine();
            String[] l = s.split(" ");
            level = Integer.parseInt(l[0]);
            rows = Integer.parseInt(l[1]);
            cols = Integer.parseInt(l[2]);

            map = new char[rows][cols];

            for (int i = 0; i < rows; i++) {
                s = bufferReader.readLine();
                for (int j = 0; j < cols; j++) {
                    map[i][j] = s.charAt(j);
                }
            }
            bufferReader.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public Map() {
        loadMap();
    }

    public char[][] getMap() {
        return map;
    }

    public int getLevel() {
        return level;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
