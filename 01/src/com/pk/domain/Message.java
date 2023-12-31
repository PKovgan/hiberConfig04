package com.pk.domain;

public class Message {
	
	private Long id;
	private String text;
	public Message() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + "]";
	}
}
