package com.test.movieportal.dao;

import java.util.List;

import com.test.movieportal.entity.Actors;

public interface ActorsPortalDao {
	
	public List<Actors> ListAllActors();
	public void updateActor(Actors movie);
	public void deleteActor(String name);
	public Actors getActorbyName(String name);
	
}
