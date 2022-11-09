package com.travel.Tuorist.Service;

import java.util.List;

import com.travel.Tuorist.Model.TuoristModel;

public interface TuoristService {

	List<TuoristModel> display();

	void Add(TuoristModel pass);
	
	List<TuoristModel> findAllOrderByNameDesc();

	void update(int id, TuoristModel pass);

}
