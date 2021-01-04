package br.com.clients.interceptor;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoggerInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private Environment environment;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

		if (request.getHeader("X-FORWARDED-FOR") != null) {
			log.info("remote host:{}, port:{}", request.getRemoteHost(), request.getRemotePort());
			return true;
		}

		log.info("hostname:{}",environment.getProperty("java.rmi.server.hostname"));
		log.info("serverPort:{}",environment.getProperty("local.server.port"));

		try {
			log.info(InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		return true;
	}
}
