/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Mail;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface MailReader {
    public List<Mail> read(String n); 
}
