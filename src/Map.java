/**
 * Arnav Dadarya
 * 9/23/2021
 */

public class Map {

    mapnode root = new mapnode("","");
    mapnode current = root;
    int lenght = 0;
    public void add(Object key, Object value){
        current.next = new mapnode(key, value);
        lenght++;
        current = current.next;
    }

    public Object get(Object key){
        mapnode local = root;
        for (int i = 0; i < lenght; i++) {
            if(local.key.equals(key)){
                return local.value;
            }
            local = local.next;
        }
        return null;
    }

    @Override
    public String toString(){
        mapnode local = root.next;
        String str = "{ ";
        int counter = 0;
        while(local != null){
           
            if(local.next == null){
                str+= local.toString() + "}";
                return str;
            }else{
            
                str+= local.toString() + ", ";
                local = local.next;
            }
            counter++;
        }
        return str + "}";
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

    @Override
    public String toString() {
        return "" + key.toString() + " : " + value.toString();
    }
}