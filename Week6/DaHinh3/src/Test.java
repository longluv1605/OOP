public class Test {
    public Map map = new Map();
    
    public static void main(String[] args) {
        Test test = new Test();
        char[][] _map = test.map.getMap();
        int col = test.map.getCols();
        int row = test.map.getRows();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(_map[i][j] + " ");
            }
            System.out.println();
        }
    }
}