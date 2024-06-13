public class MultiArray {
    public static void main(String[] args) {
        String[][] multiArray = {
                {"Zelim", "Ilyas", "Rusya"},
                {"Evgenii", "Usyk", "Ilia"}
        };

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println(multiArray[i][j]);
            }
        }

        int counter[] = new int[3];
        int[] counter1 = new int[3];

    }
}
