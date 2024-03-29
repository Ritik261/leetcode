class MyCircularQueue {
public:

    int count = 0;
    int front = 0;
    int size;
    vector<int>  q;
    MyCircularQueue(int k) : q(k){
        size = k;
    }
    
    bool enQueue(int value) {
      if(count == size){
        return false;
      }
      q[(count + front)% size] = value;
      count++;
      return true;
        
    }
    
    bool deQueue() {
        if (count == 0){
            return false;
        }
        front = (front + 1) % size;
        count--;
        return true;
        
    }
    
    int Front() {
        if (count == 0) return -1;
        return q[front];
        
    }
    
    int Rear() {
         if (count == 0) return -1;
         return q[(front + count -1) % size];
        
    }
    
    bool isEmpty() {
        return count == 0;
        
    }
    
    bool isFull() {
        return count == size;
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */