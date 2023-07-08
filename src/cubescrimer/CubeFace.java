package cubescrimer;

/**
 *
 * @author Tilen
 */
public class CubeFace {
    String faceColor;
    String[][] grid;

    public CubeFace(String color) {
        this.faceColor = color;
        this.grid = new String[3][3];
        gridSetup();
    }

    private void gridSetup() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = faceColor;
            }
        }
    }
    
    public String getFacePiece(int x, int y) {
        return grid[x][y];
    }
    
    public void setFacePiece(int x, int y, String color) {
        grid[x][y] = color;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sb.append(grid[i][j]).append(j == grid[i].length-1 ? "" : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
