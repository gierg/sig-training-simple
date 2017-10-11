

import eu.sig.training.ch05.buildandsendmail.EmailContent;
import eu.sig.training.ch05.buildandsendmail.Mail;
import eu.sig.training.ch05.buildandsendmail.MailFont;
import eu.sig.training.ch05.buildandsendmail.MailMessage;
import eu.sig.training.ch05.buildandsendmail.Person;

public class BuildAndSendMail {

    public void buildAndSendMail(Mail mail, Person person,  EmailContent emailContent) {
        // Format the email address
        String mId = person.getFirstName().charAt(0) + "." + person.getLastName().substring(0, 7) + "@"
            + person.getDivision().substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(mail.getMailFont(),
            emailContent.getMessage1() + emailContent.getMessage2()+ emailContent.getMessage3());
        // Send message
        mail.getMailMan().send(mId, emailContent.getSubject(), mMessage);
    }
    
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

}