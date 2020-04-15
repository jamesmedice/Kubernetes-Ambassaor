package com.medici.app.storage.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@RedisHash("Operation")
public class Operation {

	@Id
	private Long id;
	private Long timestamp;
	private String num1;
	private String num2;
	private String op;
	private String result;

}
