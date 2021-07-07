public class deleteElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int arr1[] = deleteElArray(a,3);
        addElement.showArr(arr1);
    }
    public static int[] deleteElArray( int arr[], int index){
        if(index < 0) return arr;
        else if(index > arr.length) return arr;
        else{
            int newArr[] = new int[arr.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if(i < index){
                    newArr[i] = arr[i];
                }else if(i >= index){
                    newArr[i] = arr[i+1];
                }
            }
            return newArr;
        }
    }
}
