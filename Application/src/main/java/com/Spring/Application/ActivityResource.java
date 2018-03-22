package com.Spring.Application;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.Spring.Application.model.Activity;
import com.Spring.Application.model.User;
import com.Spring.Application.repository.ActivityRepository;
import com.Spring.Application.repository.ActivityRepositoryStub;

@Path("activities") //http://localhost:8080/Application/webapi/activities
public class ActivityResource {

	private ActivityRepository activityRepository = new ActivityRepositoryStub();

@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public List<Activity> getAllActivities(){
	return activityRepository.findAllActivities();
}

@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Path("{activityId}")   //http://localhost:8080/Application/webapi/activities/1234
public Activity getActivity(@PathParam("activityId") String activityId){
	return activityRepository.findActivity(activityId);
}


@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Path("{activityId}/user")   //http://localhost:8080/Application/webapi/activities/1234/user
public User getActivityuser(@PathParam("activityId") String activityId){
	return activityRepository.findActivity(activityId).getUser();
}

}
