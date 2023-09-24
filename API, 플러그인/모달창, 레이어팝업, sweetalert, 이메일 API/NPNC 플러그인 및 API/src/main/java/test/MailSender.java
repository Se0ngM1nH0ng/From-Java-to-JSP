package test;
 
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import model.EmailVO;
import model.MemberVO;


public class MailSender {
	
	static public void mailSender(MemberVO mVO) {
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("rkdtmdcks012@gmail.com", "plfuxryfkbhhzaej");
			}
		});
		
		String receiver = mVO.getEmail(); // 메일 받을 주소 // 회원가입한 사람의 이메일 주소
		String title = "감사합니다 센세~";
		String content = "<h2 style='color:blue'> 회원가입을 축하드립니다~!! </h2>";
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("rkdtmdcks012@gmail.com", "관리자", "utf-8"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
			message.setSubject(title);
			message.setContent(content, "text/html; charset=utf-8");
			
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static public void mailSender(EmailVO eVO) {
		
	      Properties props = new Properties();
	      props.put("mail.smtp.host", "smtp.gmail.com");
	      props.put("mail.smtp.port", "587");
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	      
	      Session session = Session.getInstance(props, new Authenticator() {
	         @Override
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication("rkdtmdcks012@gmail.com", "plfuxryfkbhhzaej");
	         }
	      });
	      
	      String receiver = eVO.getReceiver(); // 메일 받을 주소 // 회원가입한 사람의 이메일 주소
	      String title = eVO.getTitle();
	      String content = eVO.getContent();
	      Message message = new MimeMessage(session);
	      try {
	         message.setFrom(new InternetAddress("rkdtmdcks012@gmail.com", "관리자", "utf-8"));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
	         message.setSubject(title);
	         message.setContent(content, "text/html; charset=utf-8");
	 
	         Transport.send(message);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
}