package com.test.movieportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.movieportal.dao.ActorsPortalDao;
import com.test.movieportal.entity.Actors;

public class ActorsPortalServiceImpl implements ActorsPortalService{

	@Autowired 
	ActorsPortalDao actorsPortalDao;
	
	public List<Actors> ListAllActors() {
		return actorsPortalDao.ListAllActors();
	}
	
	public void updateActor(Actors actor) {
		actorsPortalDao.updateActor(actor);
	}
	
	public void deleteActor(String name) {
		actorsPortalDao.deleteActor(name);
	}
	
	public Actors getActorbyName(String name) {
		return actorsPortalDao.getActorbyName(name);
	}
	
}
