package com.cg.onlineMovieBookingSystem.dao;

import java.util.List;

import com.cg.onlineMovieBookingSystem.Entity.Screen;
import com.cg.onlineMovieBookingSystem.Entity.Show;

public interface ScreenDao {

	public List<Show> findShowByShowName(Show show);

	public void addScreen(Screen screen);

	public List<Screen> showAllScreens();

	public List<Show> getShowsInScreen(int screenId);

}
