package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender mailSender;
	
	public EmailNotifier(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public EmailNotifier() {
		this.mailSender = !"true".equalsIgnoreCase(System.getProperty("DRY_RUN")) ? new SmtpClient() : new DefaultClient();
	}

	public void welcome(User user) {
		mailSender.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
