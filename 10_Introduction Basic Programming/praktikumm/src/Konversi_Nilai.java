public class Konversi_Nilai {
    public static void main(String[] args) {
        int studentScore = 80;
        if(studentScore  >= 80 && studentScore <= 100){
            System.out.println("Nilai A");
        }else if(studentScore >= 65 && studentScore <= 79){
            System.out.println("Nilai B+");
        }else if(studentScore >= 64 && studentScore <= 50){
            System.out.println("Nilai B");
        }else if (studentScore >= 35 && studentScore <= 49){
            System.out.println("Nilai C");
        }else if(studentScore >= 0 && studentScore <= 34){
            System.out.println("Nilai D");
        }else{
            System.out.println("Invalid");
        }
    }
}
