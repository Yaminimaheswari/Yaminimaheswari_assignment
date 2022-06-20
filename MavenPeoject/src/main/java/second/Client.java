package second;

public class Client {
	int max;
    int min;
    public Client(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    Client min_max(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        Client ret_obj= new Client(min,max);
        return ret_obj;
    }
    @Override
    public String toString(){
        return min+" "+max;
    }
}


