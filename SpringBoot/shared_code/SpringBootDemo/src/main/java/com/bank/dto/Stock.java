package com.bank.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(value = "Stock model holds information about a specific stock")
public class Stock {
	private int id;
	@ApiModelProperty(value = "Stock Name")
	private String name;
	private String marketName;
	private double price;
}

