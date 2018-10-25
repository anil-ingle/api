package com.krushidj.util;

import java.util.List;

public interface Util<T> {
	public List<T> getALlById(Long id) throws Throwable;

	public void save(T entity) throws Throwable;

	public void update(T entity) throws Throwable;
}
