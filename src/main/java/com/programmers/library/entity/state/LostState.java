package com.programmers.library.entity.state;

import java.time.LocalDateTime;

import com.programmers.library.entity.BookStateType;
import com.programmers.library.exception.BookException;
import com.programmers.library.exception.ErrorCode;

public class LostState implements State {
	@Override
	public BookStateType getType() {
		return BookStateType.LOST;
	}

	@Override
	public State borrow() {
		throw new BookException(ErrorCode.BOOK_LOST);
	}

	@Override
	public State returned() {
		return new OrganizingState(LocalDateTime.now());
	}

	@Override
	public State lost() {
		throw new BookException(ErrorCode.BOOK_LOST);
	}

	@Override
	public State organize() {
		return this;
	}
}
