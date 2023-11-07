public class Main {
    public static void main(String[] args) {
        //int tab[] = {3, 2, -2, 5, -3}; //  3 and |-3|
        //int tab[] = {1, 1, 2, -1,2, -1}; // 1 and |-1|
        //int tab[ ] = {1, 2, 3, -4}; //Lack of pair
        //int tab[ ] = {1, 1}; // Lack of pair
        checkForPair(new int[]{1, 1});
    }
    public static void checkForPair(int[] tab){
        int biggest=0;
        boolean flag = false;
        for(int i = 0;i<tab.length;i++){
            int number=tab[i];
            for(int j = 0;j<tab.length;j++){
                if(-number==tab[j]){
                    flag=true;
                    if(biggest>number){}
                    else biggest=number;

                }
            }
        }
        if(flag == true){
            System.out.printf("Pair is: %d and |-%d|",biggest,biggest);
        }else{
            System.out.println("Lack of pair");
        }
    }
}
