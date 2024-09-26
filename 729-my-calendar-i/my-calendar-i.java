class MyCalendar {

    HashMap<Integer,Integer> map;
    public MyCalendar() {
        this.map = new HashMap();
    }
    
    public boolean book(int start, int end) {
        for(int i : this.map.keySet()) {
            if((start >= i && start < map.get(i)) || (end>i && end<=map.get(i)) || (start < i && end > map.get(i))) {
                return false;
            }
        }
        map.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */