public class array2 {
    public static void main(String[] args) {
        int[] x = {20,30,40,50};
        int[][] y = {{20,30,40},
                     {40,50,60},
                     {50,70,80}};

        for(int i =0; i<x.length; i++){
            for(int j =0; j<y.length; j++) {
                    System.out.println(y[i][j]);


            }
        }

    }
}
