package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ItemTest {

	@Nested
	public class 名前がnullの場合 {
		private Item sut;
		@BeforeEach
		public void setUp() {
			this.sut = new Item();
		}
		@Test
		public void nameがnullを返す() {
			assertThat(sut.getName()).isNull();
		}
	}

		@Nested
	public class 名前が商品Aの場合 {
		private Item sut;
		@BeforeEach
		public void setUp() {
			this.sut = new Item();
			sut.setName("商品A");
		}
		@Test
		public void nameが商品Aである() {
			String expected = "商品A";
			assertThat(sut.getName()).isEqualTo(expected);
		}
	}
}
