class Program_1_Find_first_and_last_positions_of_an_element_in_a_sorted_array{
    
    public static void occurance(int[] arr,int x){
        boolean flag = false;
        int n1=0, n2=0;
        for(int i = 0 ; i < arr.length; i++){
            if(x == arr[i] && flag== false){
                n1 = i;
                flag = true;
            }
            if(x == arr[i] && flag == true){
                n2 = i;
            }
        }
        System.out.println(" first " + n1 + " Second " + n2);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        int x = 7;
        occurance(arr , x);
    }
}