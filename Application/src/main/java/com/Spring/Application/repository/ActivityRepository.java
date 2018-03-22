package com.Spring.Application.repository;

import java.util.List;

import com.Spring.Application.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);

}