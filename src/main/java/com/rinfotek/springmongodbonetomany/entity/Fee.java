package com.rinfotek.springmongodbonetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fee {
	
	private Integer studentsr_no;
	private String month;
	private Integer fee;
	private Integer fee_paid;
	private String date_of_payment;

}
