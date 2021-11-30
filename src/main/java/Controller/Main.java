
package Controller;

import Model.Histogram;
import Model.MailHistogramBuilder;
import Model.MailListReader;
import View.HistogramDisplay;
import View.Mail;
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
        mailList = MailListReader.read(fileName);
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
