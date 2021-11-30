
package Controller;

import Model.Histogram;
import View.MailHistogramBuilder;
import View.MailListReader;
import View.HistogramDisplay;
import Model.Mail;
import View.MailListReaderBD;
import View.MailReader;
import java.util.List;

public class Main {
    private List<Mail> mailList;
    private Histogram<String> histo;
    private HistogramDisplay histogramDisplay;
    private final String fileName;

    public Main(String fileName) {
        this.fileName = fileName;
    }
    public static void main(String[] args) {
        
        Main main = new Main("C:\\Users\\Roberto GS\\Desktop\\IS2\\Kata4_RGS\\email.txt");
        main.execute();
        
    }
    
    private void input(){
        MailReader mr = new MailListReaderBD();
        mailList = mr.read(fileName);
    }
    
    private void process(){
        histo = MailHistogramBuilder.build(mailList);;
        histogramDisplay= new HistogramDisplay(histo);
    }
    
    private void output(){
        histogramDisplay.execute();
    }

    private void execute(){
        input();
        process();
        output();
    }
}
