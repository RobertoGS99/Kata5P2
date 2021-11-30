/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Mail;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> list){
        Histogram<String> histo = new Histogram<>();
        for (Mail mail : list) {
            histo.increment(mail.getDomain());
        }
        return histo;
    }
}
