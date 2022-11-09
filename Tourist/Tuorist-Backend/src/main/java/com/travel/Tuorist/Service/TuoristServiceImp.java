package com.travel.Tuorist.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.travel.Tuorist.Model.TuoristModel;
import com.travel.Tuorist.Repository.TuoristRepository;

@Service
public class TuoristServiceImp implements TuoristService {
	@Autowired
	TuoristRepository repo;	
	@Override
	public List<TuoristModel> display() {
		
		List<TuoristModel> passengers = new ArrayList<TuoristModel>();
		Iterable<TuoristModel> pass = repo.findAll();

		for (TuoristModel p : pass)
		{
			passengers.add(p);
		}
	      return passengers;
	}

	@Override
	public void Add(TuoristModel pass) {
		// TODO Auto-generated method stub
		repo.save(pass);
		
	}

	@Override
	public List<TuoristModel> findAllOrderByNameDesc() {
		List<TuoristModel> passengers = repo.findAll(Sort.by(Sort.Direction.DESC, "FName"));
		return passengers;
	}
	@Override
	public void update(int id, TuoristModel pass) {
		// TODO Auto-generated method stub
		TuoristModel t=repo.findById(id).get();
		if(pass.getSource()==null)
		{
		}
		else
		{
			t.setSource(pass.getSource());
			
		}
		repo.save(t);
	}
	
}
