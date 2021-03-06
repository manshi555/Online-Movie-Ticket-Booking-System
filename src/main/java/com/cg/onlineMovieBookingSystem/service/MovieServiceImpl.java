package com.cg.onlineMovieBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineMovieBookingSystem.Entity.Movie;
import com.cg.onlineMovieBookingSystem.dao.MovieDao;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieDao movieDao;
	@Override
	public List<Movie> showAllMovies() {
		return movieDao.showAllMovies();
	}

	@Override
	public void saveMovie(Movie movie) {
		movieDao.saveMovie(movie);
		
	}

}
