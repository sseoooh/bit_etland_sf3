package com.bit_etland.web.proxy;

import javax.servlet.http.HttpServletResponse;


public class ResponseProxy implements Proxy{
	private HttpServletResponse response;
	@Override
	public void carryOut(Object o) {
		System.out.println(":::(4)ResponseProxy지나감:::");
		System.out.println("ResponseProxy에서 o가 널아님");
		setResponse((HttpServletResponse)o);
		
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
}
