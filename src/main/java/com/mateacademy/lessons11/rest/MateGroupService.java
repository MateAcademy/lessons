package com.mateacademy.lessons11.rest;

import javax.ws.rs.core.Response;

import com.mateacademy.lessons11.Person;

/**
 * @author spasko
 */

public interface MateGroupService {

	public Response getMateGroup();

	public Response addStudents(int groupId, Person person);
}