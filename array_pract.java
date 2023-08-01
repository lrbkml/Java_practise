public class array_pract
{

    public static void main(String[] args) {
        
        //Q1 add float num in strign , find average also 
   /* 
        float[] marks = {89.2f,23.4f,29.7f,99.9f} ;
float sum = 0 ;
float average;
        for(int i=0 ; i<marks.length ; i++)
        {        
            sum = sum + marks[i];
    
        }
        average= sum/marks.length;
            
        System.out.println(sum);
        System.out.println(average);
        */
        //Q1/>
        

        //Q2 check if the array is int or not
       /*  int[] marks = {89,23,29,99} ;

        for(int element:marks)
        {
        
                if(element >= -2147483648 && element <= 2147483647   ){
                    System.out.println("integer");
                }
       }
        */

       //Q4 find a num in array
       /*  int[] marks = {89,23,29,99} ;
        int num = 29;
        boolean isinarray = false;
        for(int element:marks)
        {
            if(num == element){
                isinarray = true;
                break;
            }}
            if(isinarray==true){
                System.out.println("Num is avaliable in array");
                
            }
            else{
                System.out.println("not aval");
            }
        
     */
    
            //Q5 adding two matrix
          /*   
            int [][]mat1 = {{1,2,3},
                            {4,5,6}
                                        };

             int [][]mat2 = {{1,2,3},
                            {4,5,6}
                                         };
               int [][]result = {{0,0,0},
                                 {0,0,0}
                                        }  ;  
          
                                        
                 for (int i = 0 ; i<mat1.length; i++ ){
                    for(int j =0 ; j<mat1[i].length ;j++){
                      result [i][j] = mat1[i][j] + mat2[i][j];
                      System.out.print(result[i][j] + "\t" );

                    }
                    System.out.println();
                 }
*/
    
 //Q6 reverse array

                /*  int [] arr = {1,2,3,4};
                 for (int i = arr.length-1 ; i>=0 ; i--){
                    System.out.print(arr[i]);
                 }
*/
 //Q 7 finding min or max value in array
                /*  int arr[] = {2,45,-436,6,3,67,3,7,4,};
                 int max=Integer.MIN_VALUE; //this will take minimum int value (for min INTEGER.MAX_VALUE)
                 for(int e :arr){
                    if(e>max)  // for min value (e<min)
                    {
                        max=e;
                    }
                 }
                 System.out.println(max); */

 //Q8 checking if array is sorted or not 
            
                 int arr[] = {1,2,3,4};
                boolean isSorted = true;
                 for (int i = 0 ; i<arr.length-1 ; i++)
                 {
                    if( arr[i] > arr[i+1]){
                        isSorted = false ; 
                         break ; 
                    }
                 }
                 if(isSorted==true){
                    System.out.println("The array is sorted ");
                 }
                 else{
                    System.out.println("not sorted" );
                 }
                 











                }
       }

    
