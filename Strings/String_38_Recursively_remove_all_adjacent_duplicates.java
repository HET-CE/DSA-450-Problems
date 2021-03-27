public class String_38_Recursively_remove_all_adjacent_duplicates{
    
    public static String removeDupli(String str){
        char[] arr = str.toCharArray();
        char[] newStr = new char[arr.length];
        int j = 0; 
        for(int i = 0 ; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                newStr[j] = arr[i];
                j++;
            }
        }
        if(arr.length-1 != arr.length-2){
            newStr[j] = arr[arr.length-1];
            j++;
        }
        String newString = new String(newStr);
        return newString;
        // System.out.print(newStr);
    }
    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(removeDupli(str));
    }
}