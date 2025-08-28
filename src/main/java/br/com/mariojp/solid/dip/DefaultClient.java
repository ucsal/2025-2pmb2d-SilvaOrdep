package br.com.mariojp.solid.dip;

public class DefaultClient implements MailSender {

	@Override
	public void send(String to, String subject, String body) {
		System.out.println("Teste de envio para: "+to+"\nAssunto: "+subject+"\nCorpo: "+body);
	}

}
