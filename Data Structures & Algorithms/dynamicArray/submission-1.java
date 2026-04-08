class DynamicArray {
    Integer[] arr = new Integer[5];
    public DynamicArray(int capacity) {
        arr = new Integer[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                arr[i] = n;
                return;
            }
        }
        int i=arr.length;
        resize();
        arr[i] = n;
    }

    public int popback() {
        int n = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                n = arr[i];
                arr[i] = null;
                break;
            }
        }
        return n;
    }

    private void resize() {
        Integer[] arr2 = new Integer[2*arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public int getSize() {
        int c = 0;
        for(Integer n:arr){
            if(n!=null) c++;
        }
        return c;
    }

    public int getCapacity() {
        return arr.length;
    }
}
