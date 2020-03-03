import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        

        try {
            FileInputStream myInputFile = new FileInputStream("yoda.tif");
            int value;
            int[] array=new int[10000];
            int i=0;
            while((value = myInputFile.read()) != -1) {
//                System.out.println(value);
                array[i++]=value;
            }
            myInputFile.close();
            
             //header info
        System.out.print("----------------------------");
        System.out.print("Header Info");
        System.out.println("----------------------------");
        if (array[0]==73) {
            System.out.println("Byte order\t:4949");
        } else {
            System.out.println("Byte order\t:4D4D");
        }
        
        System.out.println("Version\t\t:"+Integer.toHexString(array[2]));
        System.out.println("Offset\t\t:"+Integer.toHexString(array[4]));
        
        
        
        } catch(IOException ex){
            System.out.println("File error!");
        }
        
       
    }
}
