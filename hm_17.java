public class hm_17 {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };
        
        // 修改指定位置的元素，例如將array[1][1][1]改為99
        array[1][1][1] = 99;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("array[" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
                }
            }
        }
    }
}
