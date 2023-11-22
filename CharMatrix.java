public class CharMatrix {
    private char[][] grid;

    public CharMatrix(int rows, int cols) {
        grid = new char[rows][cols];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; r < grid[0].length; c++) {
                grid[r][c] = ' ';
            }
        }
    }

    public CharMatrix(int rows, int cols, char fill) {
        grid = new char[rows][cols];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; r < grid[0].length; c++) {
                grid[r][c] = fill;
            }
        }
    }

    public void display() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; r < grid[0].length; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
    }

    public int numRows() {
        return grid.length;
    }

    public int numCols() {
        return grid[0].length;
    }

    public char charAt(int row, int col) {
        return grid[row][col];
    } 

    public void setCharAt(int row, int col, char ch) {
        grid[row][col] = ch;
    }

    public boolean isEmpty(int row, int col) {
        return grid[row][col] == ' ';
    }   

    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for (int i = row0; i <= row1; i++) {
            for (int j = col0; j <= col1; j++) {
                grid[i][j] = fill;
            }
        }
    }

    public void clearRect(int row0, int col0, int row1, int col1) {
        fillRect(row0, col0, row1, col1, ' ');
    }

    public int countInRow(int row) {
        int count = 0;
        for (int j = 0; j < grid[row].length; j++) {
            if (grid[row][j] != ' ') {
                count++;
            }
        }
        return count;
    }
    public int countInCol(int col) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] != ' ') {
                count++;
            }
        }
        return count;
    }
}

