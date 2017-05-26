package Email.EmailCommons;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class SendingEmail {

	@Test 
	public static void TestMain() throws EmailException {
		// TODO Auto-generated method stub

		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("testgit789@gmail.com", "testgit@789"));
		email.setSSLOnConnect(true);
		email.setFrom("testgit789@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("ashokkumar.lolla@outlook.com");
		email.send();
		System.out.println("Email sent successfully....");
	}

}
