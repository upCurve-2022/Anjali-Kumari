public class Q29 {
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 67, 89, 90};
int last=arr.length-1;
        int key = 100;
        binary(arr,0,last,key);
    }
    public static void binary(int arr[],int first,int last,int key){

        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]==key){
                System.out.println("found");
                break;
            }
            else
                last=mid-1;
            mid=(last+first)/2;

        }
        if(first>last)
            System.out.println("not found");
    }
}
