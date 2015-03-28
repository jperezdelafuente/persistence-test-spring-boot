package org.lab.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.ExampleSpringDataJPAApplication;
import org.lab.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ExampleSpringDataJPAApplication.class)
public class ServiceExample01basicImplTest {

	@Autowired
	private ServiceExample01basic service;

	@Before
	public void initialize() {
		Assert.assertNotNull(service);
	}

	@Test
	public void testFindAllMovie() {
		service.saveMovie("Jurasic Park");
		service.saveMovie("Blade runner");
		service.saveMovie("King Kong");

		List<Movie> listMovieWithList = service.findAllMovieWithList();
		Assert.assertEquals(3, listMovieWithList.size());

		service.printMovieWithStream();
	}
}
