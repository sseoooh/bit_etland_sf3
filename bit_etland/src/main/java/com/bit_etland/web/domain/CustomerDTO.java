package com.bit_etland.web.domain;

import lombok.Data;

@Data
public class CustomerDTO {
	private String rnum,
				   customerID,
				   customerName,
				   password,
				   ssn,
				   photo,
				   phone,
				   city,
				   address,
				   postalcode;

}
