package com.safelight.emarkt.services;

import org.springframework.mail.SimpleMailMessage;

import com.safelight.emarkt.domain.Cliente;
import com.safelight.emarkt.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
