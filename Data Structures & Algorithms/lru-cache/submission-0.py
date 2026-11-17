#create a node class 
class Node: 
    def __init__(self, key, val):
        self.key = key
        self.val = val
        self.prev = None 
        self.next = None


class LRUCache:

    def __init__(self, capacity: int): # only inituallizes the cache wth a capacity integer
        self.capacity = capacity
        self.cache = {} # dict (hashmap)
        self.leftNode = Node(0,0) # calls the Node class to create LRU mode
        self.rightNode = Node(0,0) # calls node class to create MRU node
        self.leftNode.next = self.rightNode
        self.rightNode.prev = self.leftNode
    def insert(self, node):
        prev = self.rightNode.prev
        nxt = self.rightNode
        prev.next = node
        nxt.prev = node
        node.next = nxt
        node.prev = prev
    def remove(self, node):
        nxt = node.next
        prev = node.prev
        prev.next = nxt
        nxt.prev = prev

    def get(self, key: int) -> int:
        if key in self.cache: # if its already in the cache, then return it and reinsert it in mru 
            self.remove(self.cache[key]) # remove item from hashmap, wherever it is
            self.insert(self.cache[key]) #reinsert at rightmost 
            return self.cache[key].val #return the val in the cache at [key]
        return -1 #if not there, return -1 

        

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            self.remove(self.cache[key])
        self.cache[key] = Node(key,value) #ad to cache
        self.insert(self.cache[key]) # add node 
        
        if len(self.cache) > self.capacity:
            lru = self.leftNode.next 
            self.remove(lru) #remove the lru node
            del self.cache[lru.key] #remove the cache key/val
        
