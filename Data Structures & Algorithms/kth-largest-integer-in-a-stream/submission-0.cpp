class KthLargest {
public:
    priority_queue<int> pq;
    int pop = 0;
    KthLargest(int k, vector<int>& nums) {
        pop = k;
        for(int n:nums){
            pq.push(n);
        }
    }
    
    int add(int val) {
        pq.push(val);
        priority_queue<int> pp = pq;
        for(int i=0;i<pop-1;i++){
            pp.pop();
        }

        return pp.top();
    }
};
