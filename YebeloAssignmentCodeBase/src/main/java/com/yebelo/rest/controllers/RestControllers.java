package com.yebelo.rest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yebelo.rest.models.demoTable;
import com.yebelo.rest.models.incommingRequest;
import com.yebelo.rest.repositories.demoTableRepository;

@RestController
public class RestControllers {
	
	@Autowired
	demoTableRepository demoTableRepo;
	
	int getNumOfDigits(int inputNo) {
		int numOfDigits=0,q=inputNo,sum=0;
		while(q!=0) {q=q/10;numOfDigits++;}
		return numOfDigits;
	}
	int sumOfDigits(int inputNo,int noOfDigits) {
		int sum=0;
		int temp=inputNo;
		for(int i=0;i<noOfDigits;i++) {
			sum=sum+(temp%10);
			temp=temp/10;
		}
		return sum;
	}
	
	@GetMapping(path = "/FetchNextNumber")
	public ResponseEntity<?> fetchNextNumber(@RequestBody incommingRequest inJson) throws InterruptedException {
		
		//introducing Delay
		Thread.sleep(5000);
		
		demoTable tableRow = demoTableRepo.findByCategoryCode(Integer.valueOf(inJson.getCategoryCode()));
		
		int oldValue=tableRow.getValue();
//		int oldValue=10;
		
		int temp=oldValue;
		int check=0;
		int newValue=0;
		
		while(check==0) {
			temp++;
			int checkSum=temp;
			
			while(getNumOfDigits(checkSum)!=1) {checkSum=sumOfDigits(checkSum,getNumOfDigits(checkSum));}
			
			if(checkSum==1) {check++;newValue=temp;}
		}
		
		demoTableRepo.save(new demoTable(Integer.valueOf(inJson.getCategoryCode()), newValue));
		return new ResponseEntity<>("\"oldValue\":\""+oldValue+"\",\"newValue\":\""+newValue+"\"", HttpStatus.OK);
	}

}
