package com.fd.api.domain;

import com.fd.api.common.ErrorCode;

public class Response {
	
	private int errorCode;
	private String errorMessage;
	private int statusCode;
	
	public static final Response SUCESS = new Response(ErrorCode.SUCESS,"SUCESS",ErrorCode.SUCESS);
	public static final Response FAILURE = new Response(ErrorCode.FAILURE,"Operation filed",ErrorCode.FAILURE);
	public static final Response BAD_REQUEST = new Response(ErrorCode.BAD_REQUEST,"Bad request",ErrorCode.BAD_REQUEST);


	
	public Response() {
		this.errorCode = ErrorCode.SUCESS;
		this.errorMessage = "SUCESS";
		this.statusCode = ErrorCode.SUCESS;
		
	}
	
	public Response(final int errorCode,final String message,final int statusCode) {
		this.errorCode = errorCode;
		this.errorMessage = message;
		this.statusCode = statusCode;
	}
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	

    
}
