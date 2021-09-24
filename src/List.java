import java.util.Scanner;


/**
 * Arnav Dadarya
 * 9/23/2021
 */
public class List {
    private node root = new node(0);
    private node current = root;
    protected int lenght = 0;
    
    public void add(Object obj){
        current.next = new node(obj);
        current = current.next;
        lenght++;
    }

    public Object get(int i){
        if(i > lenght){
            try {
                throw new Exception("Invalid Index");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        i = i +1;
        node localroot = root;
        for (int j = 0; j < i; j++) {
            if(localroot.next!= null){
                localroot= localroot.next;
            }
        }
        return localroot.Value;
    }


    public void add(int Index, int value){
        node current = root;
        if(Index > lenght){
            try {
                throw new Exception("Error invalid Index " + Index);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < Index; i++) {
            current = current.next;
        }
        node nextnode = current.next;
        current.next = new node(value);
        current.next.next = nextnode;
        // System.out.println(current.next.next.next.Value);
        lenght++;
    }

    public void add(Object[] objarray) {
        for (int i = 0; i < objarray.length; i++) {
            add(objarray[i]);
        }
    }

    private node getNode(int i){
        i = i +1;
        node localroot = root;
        for (int j = 0; j < i; j++) {
            if(localroot.next!= null){
                localroot= localroot.next;
            }
        }
        return localroot;
    }

    public void remove(int i){
        if(i > lenght){
            try {
                throw new Exception("Invalid Index: "+ i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
        node localroot = root;
        for (int j = 0; j < i-1; j++) {
            if(localroot.next!= null){
                localroot= localroot.next;
            }
        }
        if(localroot.next.next != null){
            localroot.next = localroot.next.next;
        }else localroot.next = null;
        lenght--;
    }


    }
    @Override
    public String toString() {
        String x = "{";
        for (int i = 0; i < lenght; i++) {
            x+=get(i).toString();
            if(i != lenght - 1)
                x+=",";
        }
        return x+"}";

    }
}
class node{
    node next = null;
    Object Value = null;

    public node(Object obj){
        Value = obj;
    }

}

