import java.io.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

        public class Sorting {

    	public static void main (String[] args) throws IOException {
    	Locale Turkish = new Locale("tr", "TR");
    	Collator TurkishCollator = Collator.getInstance(Turkish);	
        String inputFile = "friends.txt";
        String outputFile = "sorting_friends.txt";

	String inputLine;

        List<String> lineList = new ArrayList<String>();

        FileReader fileReader = new FileReader(inputFile);

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile),"UTF8"));
        
	while ((inputLine = bufferReader.readLine()) != null) 
	{
            lineList.add(inputLine);
        }

	Collections.sort(lineList, TurkishCollator);

        fileReader.close();

        bufferReader.close();
        
        FileWriter fileWriter = new FileWriter(outputFile);

        PrintWriter out = new PrintWriter(fileWriter);
        
	for (String outputLine : lineList) 
	{
            out.println(outputLine);
        }
	
	out.close();
        fileWriter.close();
	out.flush();

    }
}