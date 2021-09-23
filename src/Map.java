public class Map {

    mapnode root = new mapnode(null, null);
    mapnode current = root;
    int lenght = 0;
    public void add(Object key, Object value){
        current.next = new mapnode(key, value);
        lenght++;
    }
    public void get(Object key){
        mapnode local = root;
        for (int i = 0; i < lenght; i++) {
          
        }
    }
    
}

class mapnode{
    Object key;
    Object value;
    mapnode next = null;

    public mapnode(Object Key, Object Value){
        key = Key;
        value = Value;
    }
}