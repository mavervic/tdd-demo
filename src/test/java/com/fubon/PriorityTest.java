package com.fubon;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class PriorityTest {

	public String getOneOrTwo(String m390, String m400) {
        return StringUtils.equals(m390, m400) ||
        		StringUtils.isNotEmpty(m390) ||
        		StringUtils.isEmpty(m400)? "1": "2";
	}
	
	@Test
	void m390_is_null_m400_is_not_null_then_get_two() {
		assertThat(getOneOrTwo(null, "a")).isEqualTo("2");
	}
	
	@Test
	void m390_is_not_null_m400_is_null_then_get_one() {
		assertThat(getOneOrTwo("a", null)).isEqualTo("1");
	}
	
	@Test
	void m390_is_null_m400_is_null_then_get_one() {
		assertThat(getOneOrTwo(null, null)).isEqualTo("1");
	}
	
	@Test
	void m390_is_not_null_and_equals_m400_then_get_one() {
		assertThat(getOneOrTwo("a", "a")).isEqualTo("1");
	}
	
	@Test
	void m390_is_not_null_and_diff_m400_then_get_one() {
		assertThat(getOneOrTwo("a", "b")).isEqualTo("1");
	}
	
	
}
