package com.rinfotek.springmongodbonetomany.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="student_masterDB")
public class Student {

	@Id
	private int id;

	private Integer sr_no;
	private String name;
	private String current_class;
	private Integer roll_no;
	private String session;
	private List<Fee> fees;
	
}
