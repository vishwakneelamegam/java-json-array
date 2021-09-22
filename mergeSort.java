import org.json.JSONArray;

public class mergeSort {
    public void sort(JSONArray input){
        try{
            int size = input.length();
            if(size < 2){
                return;
            }
            int mid = size / 2;
            JSONArray left = new JSONArray();
            JSONArray right = new JSONArray();
            for(int i = 0;i < mid;i++){
                left.put(input.getString(i));
            }
            for(int j = mid;j < size;j++){
                right.put(input.getString(j));
            }
            sort(right);
            sort(left);
            merge(input,left,right);
        }
        catch (Exception ignored){
        }
    }
    private void merge(JSONArray input,JSONArray left,JSONArray right){
        try{
            int leftSize = left.length();
            int rightSize = right.length();
            int i = 0, j = 0, k = 0;
            while(i < leftSize && j < rightSize){
                if(left.getString(i).compareTo(right.getString(j)) < 0){
                    input.put(k,left.getString(i));
                    i++;
                }
                else{
                    input.put(k,right.getString(j));
                    j++;
                }
                k++;
            }
            while(i < leftSize){
                input.put(k,left.getString(i));
                i++;
                k++;
            }
            while(j < rightSize){
                input.put(k,right.getString(j));
                j++;
                k++;
            }

        }
        catch (Exception ignored){}
    }
}
