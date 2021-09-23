import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StorageList extends List {
    String Path = null;
    public void save(String Path){
        this.Path = Path;
        try {
            FileWriter fw = new FileWriter(new File(Path));
            String writeString = "";
            for (int i = 0; i < super.lenght; i++) {
                writeString+= super.get(i).toString() + "\n";
            }
            fw.write(writeString);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void remove(int i){
        super.remove(i);
        save(Path);
    }

    //Saves all data as String
    public void ReadData(String Path){
        Scanner sc;
        try {
            sc = new Scanner(new File(Path));
            // sc.useDelimiter("");
            while(sc.hasNext()){
                add(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     
    }

    
}
