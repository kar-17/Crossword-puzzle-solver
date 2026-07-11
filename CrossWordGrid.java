public class CrossWordGrid {
        private char[][] grid;
        public CrossWordGrid(char[][] a){
            this.grid = a;
        }
    public void display() {
        for (char[] x : grid) {
            for (char b : x) {
                System.out.print(b);
            }
            System.out.println();

        }
    }}

