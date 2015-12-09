public class BreakerRefrigerator{
    public static void main(String[] args){
        int[][] initialArray = {    {1,0,1,0},
                {1,1,0,1},
                {0,1,1,0},
                {0,0,1,1}
        };
        int countStep = 0;
        Refrigerator refrigerator = new Refrigerator(initialArray);
        int[][] temporaryArray = countRotatedGrips(refrigerator.refrigeratorClone());
        int[] rotatadGrip = firstReversElement(temporaryArray);
        System.out.println(refrigerator);
        prinArrray(temporaryArray);
/*        while (!refrigerator.isOpen()){
                 refrigerator.rotateGrip(rotatadGrip[0],rotatadGrip[1]);
                 temporaryArray = countRotatedGrips(refrigerator.refrigeratorClone());
             System.out.println(refrigerator);
                 rotatadGrip = firstReversElement(temporaryArray);
            countStep++;
        }
        System.out.println(countStep);
        System.out.println(refrigerator);*/
    }
    public static int [][] countRotatedGrips(int[][] array){
        int countRevers = 0;
        int[][] temporaryArray = new int[4][4];
        for (int i = 0; i < temporaryArray.length; i++){
            for (int j = 0; j < temporaryArray[i].length; j++){
                if (array[i][j]!= 0){
                    temporaryArray[i][j] = fillRotatedGrips(array, i, j);
                }
            }

        }
        return temporaryArray;
    }
    public static int fillRotatedGrips(int[][] array, int row,int collumn ){
        int countRevers = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i==row){
                    countRevers += (array[i][j]==0) ? 0:1;
                }else if (j==collumn){
                    countRevers += (array[i][j]==0) ? 0:1;
                }
            }

        }
        return countRevers;
    }
    public static int[] firstReversElement(int[][] array){
        int maxIrow= 0, maxJcollumn = 0,maxCount = 0;
        int[] rotatedGrips = new int[2];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > array[maxIrow][maxJcollumn]){
                    maxIrow = i;
                    maxJcollumn = j;
                }

            }
            if (maxCount < array[maxIrow][maxJcollumn]){
                maxCount = array[maxIrow][maxJcollumn];
                rotatedGrips[0] = maxIrow;
                rotatedGrips[1]= maxJcollumn;
            }

        }
        return rotatedGrips;
    }
    public static void prinArrray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
