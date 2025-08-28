package br.com.mariojp.solid.dip;

public class SmtpClient implements MailSender {

	@Override
	public void send(String to, String subject, String body) {
        if(to == null || !to.contains("@")) throw new IllegalArgumentException("email inválido");
        System.out.println("Enviando email para: "+to+"\nAssunto: "+subject+"\nCorpo: "+body);
        // envia ...
	}

}
