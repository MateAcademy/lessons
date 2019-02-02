package com.mateacademy.lessons13.rest;

import javax.ws.rs.core.Response;

import com.mateacademy.lessons11.*;
/**
 * @author spasko
 */

public interface MateGroupService {

	public Response getMateGroup(int groupId);

	public Response addStudent(int groupId, Person person);
	
	public Response removeStudent(int groupId, String surname);

	public Response updateStudent(int groupId, String surname, String newname);

	public Response addHR(int groupId, HumanResource newHR);

	public Response removeHR(int groupId, String name);

	public Response updateStartWorkYearHR(int groupId, String name, int newStartWorkYear);

	public Response showAllHRs(int groupId);

	public Response showSingleHR(int groupId, String surname);
}