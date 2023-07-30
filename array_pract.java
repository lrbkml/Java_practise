public class array_pract
{

    public static void main(String[] args) {
        
        float[] marks = {89.2f,23.4f,29.7f,99.9f} ;
float sum = 0 ;
        for(int i=0 ; i<marks.length ; i++)
        {
            
            sum = sum + marks[i];

        }
        System.out.println(sum);
        
        
    }
}