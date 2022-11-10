package printstarprograms;

public class pyramid {
    public static void main(String[] args) {
        int row,column;
        for(row=0;row<6;row++){
            for(column=6-row;column>1;column--){
                System.out.print(" ");
            }
            for(column=0;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
