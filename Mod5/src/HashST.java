import java.util.ArrayList;

public class HashST<Key, Value> {
    private int m = 1024;
    private Node[] lists = new Node[m];
    private int n = 0;

    /*
    Implement the following methods for HashST.java (pg. 638 in your textbook):

    contains(): Returns true if this symbol table contains the specified key.
    size(): Returns the number of key-value pairs in this symbol table.
    keys(): Returns all keys in the symbol table.

     */

    private static class Node{
        private Object key;
        private Object val;
        private Node next;

        public Node(Object key, Object val, Node next) {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    private int hash(Key key) {
        return Math.abs(key.hashCode() % m);
    }

    public Value get(Key key) {
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next)
            if (key.equals(x.key))
                return (Value) x.val;
        return null;
    }

    public void put(Key key, Value val) {
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next){
            if (key.equals(x.key)){
                x.val = val;
                return;
            }
        }
        lists[i] = new Node(key, val, lists[i]);
        n++;
    }

    //contains(): Returns true if this symbol table contains the specified key.
    public boolean contains(Key target){
        return get(target) != null;
    }
    // size(): Returns the number of key-value pairs in this symbol table.
    public int size(){
        return n;
    }
    // keys(): Returns all keys in the symbol table.
    public ArrayList<Key> keys(){
        ArrayList<Key> allKeys = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for (Node x = lists[i]; x != null; x = x.next){
                allKeys.add((Key) x.key);
            }
        }
        return allKeys;
    }

    public static void main(String[] args) {
        HashST<String, Integer> table = new HashST<>();
        table.put("apple", 10);
        table.put("orange", 20);
        System.out.println(table.get("apple"));
        System.out.println(table.contains("orange"));
        System.out.println(table.contains("banana"));
        System.out.println(table.size());
        System.out.println(table.keys());
    }

}
