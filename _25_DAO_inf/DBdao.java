package _25_DAO_inf;

import java.util.ArrayList;

import _25_DTO.WordDTO;

public interface DBdao {
	public void add(WordDTO wdto);
	public ArrayList<WordDTO> selectAll();
	public void mod(WordDTO wdto);
	public void delete(WordDTO wdto);
}
