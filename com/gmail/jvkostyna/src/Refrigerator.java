public class Refrigerator{
    int[][] initialArray;
    Refrigerator(int[][] initialArray){
        this.initialArray = initialArray;
    }

    public boolean isOpen(){
        boolean refrigeratorIsOpen = true;
        for (int i = 0; i < initialArray.length; i++){
            for (int j = 0; j < initialArray[i].length; j++){
                if (initialArray[i][j]!=0){
                    refrigeratorIsOpen = false;
                    break;
                }
            }
        }
        return refrigeratorIsOpen;
    }
    public void rotateGrip(int row,int collumn){
        for (int i = 0; i < initialArray.length; i++){
            for (int j = 0; j < initialArray[i].length; j++){
                if (i==row){
                    initialArray[i][j] = (initialArray[i][j]==0) ? 1:0;
                }else if (j==collumn){
                    initialArray[i][j] = (initialArray[i][j]==0) ? 1:0;
                }
            }

        }
    }
    public int[][] refrigeratorClone(){
        int[][] refrigeratorClones = new int[initialArray.length][initialArray.length];
        for (int i = 0; i < initialArray.length; i++){
            for (int j = 0; j < initialArray[i].length; j++){
                refrigeratorClones[i][j] = initialArray[i][j];
            }

        }
        return refrigeratorClones;
    }

    @Override
    public String toString()
    {
        return "Refrigerator" + "\n"+
                "{state of grips}" + "\n"
                + initialArray[0][0] + " "+ initialArray[0][1] + " "+ initialArray[0][2] + " "+ initialArray[0][3] + "\n"
                + initialArray[1][0] + " "+ initialArray[1][1] + " "+ initialArray[1][2] + " "+ initialArray[1][3] + "\n"
                + initialArray[2][0] + " "+ initialArray[2][1] + " "+ initialArray[2][2] + " "+ initialArray[2][3] + "\n"
                + initialArray[3][0] + " "+ initialArray[3][1] + " "+ initialArray[3][2] + " "+ initialArray[3][3] + "\n";
    }
}
