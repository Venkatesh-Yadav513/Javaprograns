package printstarprograms;

public class leftstar {
    public static void main(String[] args) {
        int row,column,numofrows=8;
        for(row=0;row<numofrows;row++){
            for(column=0;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
}
