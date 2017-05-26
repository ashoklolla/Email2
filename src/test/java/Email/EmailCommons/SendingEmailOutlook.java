package Email.EmailCommons;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendingEmailOutlook {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub

		Email email = new SimpleEmail();
		email.setHostName("smtp.outlook.com");
		email.setSmtpPort(4657);
		email.setAuthenticator(new DefaultAuthenticator("", ""));
		//email.setStartTLSEnabled(true);
		email.setSSLOnConnect(true);
		email.setFrom("ashokkumar.lolla@outlook.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("ashokkumar.lolla@gmail.com");
		email.send();
		System.out.println("Email sent successfully....");
	}

}
