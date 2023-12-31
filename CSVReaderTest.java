/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - CSV
 */

import java.io.*;

public class CSVReaderTest {
    public static final String delimiter = ",";
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr;
         while((line = br.readLine()) != null) {
            tempArr = line.split(delimiter);
            for(String tempStr : tempArr) {
               System.out.print(tempStr + " ");
            }
            System.out.println();
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
   }
}
