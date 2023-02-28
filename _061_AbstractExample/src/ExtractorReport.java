import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ExtractorReport {
    public abstract Pattern getPattern();
    public abstract String getReportName();

    private String parse(String path) throws FileNotFoundException {
        String out="";
        File file = new File(path);
        Scanner scan = new Scanner(file);
        if(scan.hasNext()){
            scan.nextLine();
        }else{
            return "Empty File";
        }

        while(scan.hasNext()){
            String nextLine = scan.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();
            if(matches){
                out = out+nextLine+"\n";
            }
        }
        return out.isBlank() ? "Empty file" : out;



    }
    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("starting report... "+getReportName()+"...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("sent report... "+getReportName()+"...");
    }

}
