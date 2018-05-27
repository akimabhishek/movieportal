package com.test.movieportal.service;

import java.util.List;

import com.test.movieportal.entity.Actors;

public interface ActorsPortalService {
	
	public List<Actors> ListAllActors();
	public void updateActor(Actors actor);
	public void deleteActor(String name);
	public Actors getActorbyName(String name);
	
}
