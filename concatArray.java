class ConcatArrayGFG {
    public int[] getConcatenation(int[] nums) {
        int arr[]=nums.clone();
        int Arr[]=new int[nums.length*2];
        System.arraycopy(arr,0,Arr,0,arr.length);
        System.arraycopy(arr,0,Arr,arr.length,arr.length);
        return Arr;
    }
}