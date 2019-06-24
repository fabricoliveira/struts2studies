package br.com.strutsmaven.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
	
	private Long id;
	private String name;
	private Integer price;

}