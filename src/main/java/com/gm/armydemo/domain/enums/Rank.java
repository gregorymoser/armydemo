package com.gm.armydemo.domain.enums;

public enum Rank {
	
	PRIVATE (1, "Private"),
	SPECIALIST (2, "Specialist"),
	SERGEANT (3, "Sergeant"),
	SERGEANTMAJOR (4, "Sergeant Major"),
	LIEUTENANT (5, "Lieutenant"),
	CAPITAN (6, "Capitan"),
	MAJOR (7, "MAjor"),
	COLONEL (8, "Colonel"),
	GENERAL (9, "General");
	
	private int code;
	private String description;
	
	private Rank(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public static Rank toEnum(Integer code) {

		if (code == null) {
			return null;
		}

		for (Rank x : Rank.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Invalid code: " + code);
	}
}