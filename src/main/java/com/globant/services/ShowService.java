package com.globant.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.globant.domains.Show;
import com.globant.domains.Vanue;

@Service
public class ShowService {

	List<Show> jsonList = new ArrayList<Show>();

	@PostConstruct
	public void init() {
		Show json = new Show();
		json.setId(1);
		json.setName("Madonna World Tour 2019");
		Vanue vanue = new Vanue();
		vanue.setCity("Norman");
		vanue.setId(1);
		vanue.setName("Normandy Music Center");
		vanue.setState("OK");
		vanue.setZip("96607-8068");
		json.setVanue(vanue);

		Show json2 = new Show();
		json2.setId(2);
		json2.setName("Ben and Jerry Exotic World Tour 2019");
		Vanue vanue2 = new Vanue();
		vanue2.setId(2);
		vanue2.setName("Collier-Wisoky Stadium");
		vanue2.setCity("Las Vegas");
		vanue2.setState("NV");
		vanue2.setZip("91807-1012");
		json2.setVanue(vanue2);

		Show json3 = new Show();
		json3.setId(3);
		json3.setName("Ben and Jerry Exotic World Tour 2019");
		Vanue vanue3 = new Vanue();
		vanue3.setId(3);
		vanue3.setName("Collier-Wisoky Stadium");
		vanue3.setCity("Las Vegas");
		vanue3.setState("NV");
		vanue3.setZip("91807-1012");
		json3.setVanue(vanue3);

		jsonList.add(json);
		jsonList.add(json2);
		jsonList.add(json3);
	}

	public List<Show> getAll() {
		return jsonList;
	}

	public void addEvent(Show json) {
		jsonList.add(json);

	}
}
