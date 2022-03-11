package a15_lombok;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode 4개가 Data 랑 같음
@Data

public class Iphone {
	private int series;
	private String model;
	private String color;
	private int memorySize;
	private int releaseYear;
	
}