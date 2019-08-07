package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createDistillery() {
		Distillery distillery1 = new Distillery("Glendronach", "Highland");
		distilleryRepository.save(distillery1);
	}

	@Test
	public void createWhisky() {
		Distillery distillery1 = new Distillery("Glendronach", "Highland");
		distilleryRepository.save(distillery1);
		Whisky whisky1 = new Whisky("The Glendronach Revival", 15, 2018, distillery1);
		whiskyRepository.save(whisky1);
	}

}
