class LinkedList {
    ArrayList<Integer> slink = new ArrayList<>();

    public LinkedList() {
    }

    public int get(int index) {
        if(index>=slink.size()){
            return -1;
        }
        return slink.get(index);
    }

    public void insertHead(int val) {
        slink.add(0,val);
    }

    public void insertTail(int val) {
        slink.add(val);
    }

    public boolean remove(int index) {
        if(index>=slink.size()){
            return false;
        }
        slink.remove(index);
        return true;
    }

    public ArrayList<Integer> getValues() {
        return slink;
    }
}
