public class Mean {
    private static float Mean(float[] numbers){
        float sum = 0;
        float average;

        for(int i=0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        average = sum/numbers.length;
        return average;

    }
    public static void main(String[] args) {

        // create an array
        float[] value = { 1, 2, 3, 4 };

        System.out.println(Mean(value));
    }
}
