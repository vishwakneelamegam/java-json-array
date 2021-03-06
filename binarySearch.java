import org.json.JSONArray;

public class binarySearch {
    public int search(JSONArray dataArray,String searchElement){
        try{
            int lowerBound = 0;
            int upperBound = dataArray.length() - 1;
            while (lowerBound <= upperBound){
                int mid = lowerBound + (upperBound - lowerBound) / 2;
                System.out.println(mid);
                int compareValue = searchElement.compareTo(dataArray.getString(mid));
                if(compareValue == 0){
                    return mid;
                }
                if(compareValue > 0){
                    lowerBound = mid + 1;
                }
                else{
                    upperBound = mid - 1;
                }
            }
            return -1;
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
