public class addElement {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7,8,9};
        int arr2[] = insertNewElement(a,5, 10 );
        showArr(arr2);
    }

    public static int[] insertNewElement(int arr[], int index, int newElement) {
        if (index < 0) return arr;
        else if (index > arr.length) return arr;
        else {
            int newArr[] = new int[arr.length + 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index){
                    newArr[index] = newElement;
                }else if(i > index){
                    newArr[i] = arr[i-1];
                }
            }
            return newArr;
        }
    }

    public static void showArr(int show[]){
        if (show != null){
            for (int i = 0; i < show.length; i++) {
                System.out.print(show[i] + "\t");
            }
        }
    }
}
