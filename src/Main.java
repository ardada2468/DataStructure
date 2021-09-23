/**
 * Arnav Dadarya
 * 9/23/2021
 */
public class Main {

    public static void main(String[]args) {
        Map map = new Map();
        map.add("Arnav", "Blue");
        map.add("James", "Black");
        map.add("Jill", "Green");
        System.out.println(map);
        List list = new List();
        list.add(new Object[]{10,20,30,40,50,60,70,80});
        System.out.println(list);
        StorageList SL = new StorageList();
        SL.add(new String[]{"New York","Trumbull","Los Angeles"}); 
        SL.ReadData("List.txt");
        SL.save("List.txt");
        SL.remove(0);
        System.out.println(SL);

    }
    
}
