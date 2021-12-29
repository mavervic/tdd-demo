package com.fubon;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	@Test
	void indexOfAnyTestOneStr() {
		assertThat(StringUtils.indexOfAny("1", new String[] {"1", "2", "3"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("1", new String[] {"3", "2", "1"}) != -1).isEqualTo(true);
		
		assertThat(StringUtils.indexOfAny("1", new String[] {"1", "1", "2"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("1", new String[] {"1", "2", "1"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("1", new String[] {"2", "1", "1"}) != -1).isEqualTo(true);
		
		
		assertThat(StringUtils.indexOfAny("0", new String[] {"1", "2", "3"}) != -1).isEqualTo(false);
		assertThat(StringUtils.indexOfAny("0", new String[] {"3", "2", "1"}) != -1).isEqualTo(false);
		
		assertThat(StringUtils.indexOfAny("0", new String[] {"1", "1", "2"}) != -1).isEqualTo(false);
		assertThat(StringUtils.indexOfAny("0", new String[] {"1", "2", "1"}) != -1).isEqualTo(false);
		assertThat(StringUtils.indexOfAny("0", new String[] {"2", "1", "1"}) != -1).isEqualTo(false);
	}
	
	@Test
	void indexOfAnyTestTwoStr() {
		assertThat(StringUtils.indexOfAny("10", new String[] {"1", "2", "3"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("10", new String[] {"3", "2", "1"}) != -1).isEqualTo(true);
		
		assertThat(StringUtils.indexOfAny("10", new String[] {"1", "1", "2"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("10", new String[] {"1", "2", "1"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("10", new String[] {"2", "1", "1"}) != -1).isEqualTo(true);
		
		
		assertThat(StringUtils.indexOfAny("01", new String[] {"1", "2", "3"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("01", new String[] {"3", "2", "1"}) != -1).isEqualTo(true);
		
		assertThat(StringUtils.indexOfAny("01", new String[] {"1", "1", "2"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("01", new String[] {"1", "2", "1"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("01", new String[] {"2", "1", "1"}) != -1).isEqualTo(true);
	}
	
	@Test
	void indexOfAnyTestTwoStrTwoSearchStr() {
		assertThat(StringUtils.indexOfAny("10", new String[] {"10", "20", "30"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("10", new String[] {"30", "20", "10"}) != -1).isEqualTo(true);
		
		assertThat(StringUtils.indexOfAny("10", new String[] {"10", "10", "20"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("10", new String[] {"10", "20", "10"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("10", new String[] {"20", "10", "10"}) != -1).isEqualTo(true);
		
		
		assertThat(StringUtils.indexOfAny("01", new String[] {"10", "20", "30"}) != -1).isEqualTo(false);
		assertThat(StringUtils.indexOfAny("01", new String[] {"30", "20", "10"}) != -1).isEqualTo(false);
		
		assertThat(StringUtils.indexOfAny("01", new String[] {"10", "10", "20"}) != -1).isEqualTo(false);
		assertThat(StringUtils.indexOfAny("01", new String[] {"10", "20", "10"}) != -1).isEqualTo(false);
		assertThat(StringUtils.indexOfAny("01", new String[] {"20", "10", "10"}) != -1).isEqualTo(false);
	}
	
	@Test
	void indexOfAny() {
		assertThat(StringUtils.indexOfAny("COTAG017", new String[] {"COTAG017", "COTAG027", "30"}) != -1).isEqualTo(true);
		assertThat(StringUtils.indexOfAny("COTAG027", new String[] {"COTAG017", "COTAG027", "30"}) != -1).isEqualTo(true);
		
		assertThat(StringUtils.indexOfAny("COTAG018", new String[] {"COTAG017", "COTAG027", "30"}) != -1).isEqualTo(false);
		assertThat(StringUtils.indexOfAny("COTAG020", new String[] {"COTAG017", "COTAG027", "30"}) != -1).isEqualTo(false);
	}
}
