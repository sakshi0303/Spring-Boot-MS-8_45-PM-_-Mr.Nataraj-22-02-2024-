package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("purchaseService")
public class PurchaseOrderMgmtServiceImpl implements IPurchaseOrderMgmtService {
	@Autowired
	private  JavaMailSender  sender;
	@Value("${spring.mail.username}")
	private  String fromMail;

	@Override
	public String purchase(String[] items, double[] prices, String[] emails)throws Exception {
		//caculate bill Amt
		double billAmt=0.0;
		for(double p:prices) {
			billAmt=billAmt+p;
		}
		String msg=Arrays.toString(items)+" are purchsed having prices::"+Arrays.toString(prices)+" with the bill Amt::"+billAmt;
		
		 String mailStatus=sendMail(msg,emails);
		
		return msg+"....."+mailStatus;
	}
	
	private   String sendMail(String messageBody,String []ToEmails)throws Exception {
		//create MimeMessage obj
		MimeMessage  message=sender.createMimeMessage();
		//create MimeMessageHelper obj
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		//set  message headers
		helper.setFrom(fromMail);
		helper.setTo(ToEmails);
		helper.setSubject("Open it to know it");
		helper.setSentDate(new Date());
		helper.setText(messageBody);
		helper.addAttachment("nit.jpg", new ClassPathResource("nit.jpg"));
		sender.send(message);
		return "  mail  has been sent ";
	}

}
