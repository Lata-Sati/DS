package Problem;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] intarr={1,2,4,5,7};
        int target=12;
        findTwoSum(intarr,target);

    }

    public static void findTwoSum(int arr[], int sum){
        if(arr.length>1){
            Map<Integer, Integer> mapObj= new HashMap<Integer, Integer>();
            for(int i=0; i< arr.length; i++){
                if(mapObj.containsKey(sum-arr[i])){
                    System.out.println("two locations are "+i+" and "+mapObj.get(sum-arr[i]));

                }

                else {
                    mapObj.put(arr[i],i);
                }
            }
        }

        else {
            System.out.println("insufficient array");
        }
    }
}
