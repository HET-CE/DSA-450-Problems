
public class Array_17_Best_time_to_buy_and_Sell_stock {
	public static void main(String args[]) {
		int pre_profit = Integer.MIN_VALUE;
		int profit = 0;
		int arr[] = {7,1,5,3,6,4};
//		int arr[] = {7,6,4,3,1};
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j=i+1 ; j< arr.length ; j++) {
				profit = arr[j]-arr[i];
					if(profit>pre_profit) {
						pre_profit  = profit;
				}	
			}
		}
		if(pre_profit>0)
		System.out.println(pre_profit);
		else {
			pre_profit = 0 ;
			System.out.println(pre_profit);
		}
	}
}
