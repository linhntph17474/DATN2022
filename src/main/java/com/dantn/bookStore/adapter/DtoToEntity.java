package com.dantn.bookStore.adapter;

public interface DtoToEntity<DTO,ENTITY> {
	public ENTITY changeToEntity(DTO dto);
}
