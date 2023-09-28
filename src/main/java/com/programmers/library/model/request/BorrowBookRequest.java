package com.programmers.library.model.request;

import static com.programmers.library.constants.MessageConstants.*;

public class BorrowBookRequest {
	private long id;

	public BorrowBookRequest(String id) {
		try {
			this.id = Long.parseLong(id);
		} catch (NumberFormatException | NullPointerException e) {
			throw new IllegalArgumentException(INVALID_ID);
		}
	}

	public long getId() {
		return id;
	}
}
