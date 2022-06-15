package oops.concepts.learning;

/* Java Assignment
5. Assignment for Arrays
Write a Class name EvenArray, inside it declare a int array with values [3,2,8,1,4,7]
Write method, which will count number of even numbers in array and will return count
 */
public class EvenArray {
    int[] arr = new int[]{3,2,8,1,4,7};

    public int countEven(int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0)
                count++;
        }
        return count;
    }
}
