package com.yebelo.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class demoTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryCode;
	private int value;

}
