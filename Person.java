import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Person{ // create Class Person
    public static void main (String args[]){
    //create a File
    //File file = new File("test.txt");
    // variable of the File
    String [] team = {"John", "Paul", "George", "Ringo"};
// write file 
    try{    
        BufferedWriter fileWriter = new BufferedWriter (new FileWriter("test.txt"));
        for (String person: team){
            fileWriter.write("\n" + person);
        }
        fileWriter.close();
    }catch (IOException e){
            e.printStackTrace();
        }

    // Read file using FileReader using a buffer
    try{
        BufferedReader fileReader = new BufferedReader (new FileReader("test.txt"));
    String line;
    while((line = fileReader.readLine())!=null) {
        System.out.println(line);
    }
    fileReader.close(); 
    } catch (IOException e){
        e.printStackTrace();
    }
}   
}      