import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {

    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=590;
        int coinCount=0;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while (coins[i]<=amount) {
                    coinCount++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }
            }
        }
        System.out.println("No. of Coins "+coinCount);
        System.out.println(ans);
    }
    
}
