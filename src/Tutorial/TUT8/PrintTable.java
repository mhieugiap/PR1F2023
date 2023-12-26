package Tutorial.TUT8;

public class PrintTable {
    public static void main(String[] args) {
        int[][] table = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        int[][] table2 = new int[3][3];
        table2[0] = new int[]{8, 1, 6};
        table2[1] = new int[]{3, 5, 7};

        System.out.println(table[0][1]);

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j]);
            }
        }


        System.out.println("+-----------+");
        for (int[] rows : table) {
            System.out.print("|");
            for (int value : rows) {
                System.out.print(" " + value + " |");
            }
            System.out.println();
            System.out.println("+-----------+");
        }
    }
}
