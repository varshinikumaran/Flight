package com.flightbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="airport")
public class Airport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="airport_id")
	private long airportId;
	
	@Column(name="airport_name")
	private String airportName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="code")
	private String code;
	
	@OneToMany(mappedBy="destinationAirport")
	private List<Flight> flights;
	
}
