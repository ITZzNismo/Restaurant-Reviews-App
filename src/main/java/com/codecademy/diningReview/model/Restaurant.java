package com.codecademy.diningReview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "RESTAURANT")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAME")
    private String name;
	
	@Column(name="ADDRESS_LINE")
    private String addressLine;
	
	@Column(name = "CITY")
    private String city;
	
	@Column(name = "POST_CODE")
    private String postCode;

	@Column(name = "PHONE_NUMBER")
    private String phoneNumber;
	
	@Column(name = "WEBSITE")
    private String website;
	
	@Column(name = "PEANUT_ALLERGY_SCORE")
	private byte peanutAllergyScore;
	
	@Column(name = "EGG_ALLERGY_SCORE")
	private byte eggAllergyScore;
	
	@Column(name = "DAIRY_ALLERGY_SCORE")
	private byte dairyAllergyScore;
	
	@Column(name = "OVERALL_ALLERGY_SCORE")
	private byte overallAllergyScore;

}
