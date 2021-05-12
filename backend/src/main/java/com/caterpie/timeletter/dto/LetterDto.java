package com.caterpie.timeletter.dto;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LetterDto {
	private int userId;
	private String title;
	private String message;
	private String url;
	private String openDate;
	private String latitude;
	private String longitude;
	private boolean alert;
	private boolean isPrivate;
	private boolean isOpen;
}