package com.globant;
import org.junit.*;

import com.globant.domains.Show;
import com.globant.domains.Vanue;

public class JsonServiceTest {
	@Test
	public void testMyResponse(){
		
		// mock the response object
		Show json = new Show();
		json.setId(1);
		json.setName("first nameMadonna World Tour 2019");
		
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
		
		
	}

}
