class stringScore {
    public int scoreOfString(String s) {
        int sum=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            int a=arr[i];
            int b=arr[i+1];
            sum+=Math.abs(a-b);
            a=b;
            b=a;
        }
        return sum;
    }
}