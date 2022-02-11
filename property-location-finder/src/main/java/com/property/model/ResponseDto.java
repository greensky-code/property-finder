package com.property.model;

import org.springframework.http.HttpStatus;

public class ResponseDto<T> {

	private T response;
	private HttpStatus status;

	public ResponseDto(T response, HttpStatus status) {
		this.response = response;
		this.status = status;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}
