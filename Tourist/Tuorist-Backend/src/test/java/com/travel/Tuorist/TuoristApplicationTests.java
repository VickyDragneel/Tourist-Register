package com.travel.Tuorist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.travel.Tuorist.Model.TuoristModel;
import com.travel.Tuorist.Repository.TuoristRepository;



@SpringBootTest
class TuoristApplicationTests {

	@Autowired
	private TuoristRepository repo;
	
	@Test
	public void testCreate()
	{
		TuoristModel Tr= new TuoristModel();
		Tr.setId(19999);
		Tr.setFName("Malavika");
		Tr.setLName("Sathish");
		Tr.setGender("Female");
		Tr.setAge(32);
		Tr.setSource("Japan");
		Tr.setDaysOfVisit(100);
		repo.save(Tr);
		assertNotNull(repo.findById(9999).get());
		
	}
	@Test
	public void TestReadall()
	{
		List<TuoristModel> tm=repo.findAll();
		assertThat(tm).size().isGreaterThan(0);
	}

}
