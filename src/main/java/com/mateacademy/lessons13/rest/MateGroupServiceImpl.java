package com.mateacademy.lessons13.rest;

import com.mateacademy.lessons11.HumanResource;
import com.mateacademy.lessons11.MateGroup;
import com.mateacademy.lessons11.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static javax.ws.rs.core.Response.Status.ACCEPTED;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.OK;

/**
 * Created by KL Sergey on 02.02.2019.
 */

@Path("/rs/mate/{groupId}")
public class MateGroupServiceImpl implements MateGroupService{
	private static Map<Integer, MateGroup> mateGroups = Arrays.asList(MateGroup.mateGroupExampleCreator()).stream()
			.collect(Collectors.toMap(MateGroup::getId, Function.identity()));

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMateGroup(@PathParam("groupId") int groupId) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			return Response.status(OK).entity(mateGroups.get(groupId)).type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(NOT_FOUND).build();
	}

	@Override
	@PUT
	@Path("/students")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addStudent(@PathParam("groupId") int groupId, Person person) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			mateGroup.getStudents().addAll(Arrays.asList(person));
			return Response.status(ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(NOT_FOUND).build();
	}

	@Override
	@PUT
	@Path("/students/{surname}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateStudent(@PathParam("groupId") int groupId, @PathParam("surname")String surname,
								  @QueryParam("name")String name) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup == null) {
			return Response.status(NOT_FOUND).build();
		}
		mateGroup.getStudents().stream().filter(student -> student.getSurname().equals(surname)).
				forEach(student -> student.setName(name));
		return Response.status(ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
	}


	@Override
	@DELETE
	@Path("/students/{surname}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeStudent(@PathParam("groupId")int groupId, @PathParam("surname")String surname) {
		MateGroup mateGroup = mateGroups.get(groupId);

		if (mateGroup == null) {
			return Response.status(500).build();
		}

		mateGroup.getStudents().removeIf(student -> student.getSurname().equals(surname));

		return Response.status(ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
	}

	@Override
	@PUT
	@Path("/hrs")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addHR(@PathParam("groupId")int groupId, HumanResource newHR) {

		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			mateGroup.getHumanResources().add(newHR);
			return Response.status(ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

	@Override
	@DELETE
	@Path("/hrs/{surname}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeHR(@PathParam("groupId")int groupId, @PathParam("surname")String surname) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			mateGroup.getHumanResources().removeIf(f -> f.getSurname().equals(surname));
//			return Response.status(Status.OK).entity(mateGroups.get(groupId).getHumanResources()).type(MediaType.APPLICATION_JSON).build();
			return Response.status(ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

	@Override
	@PUT
	@Path("/hrs/{surname}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateStartWorkYearHR(@PathParam("groupId") int groupId, @PathParam("surname") String surname,
										  @QueryParam("newStartWorkYear") int newStartWorkYear) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			mateGroup.getHumanResources().stream().filter((f -> f.getSurname().equals(surname)))
					.collect(Collectors.toList()).forEach(f -> f.setStartWorkYear(newStartWorkYear));
//			return Response.status(Status.OK).entity(mateGroups.get(groupId).getHumanResources()).type(MediaType.APPLICATION_JSON).build();
			return Response.status(ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

	@Override
	@GET
	@Path("/hrs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response showAllHRs(@PathParam("groupId") int groupId) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			return Response.status(Status.OK).entity(mateGroups.get(groupId).getHumanResources())
					.type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

	@Override
	@GET
	@Path("/hrs/{surname}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response showSingleHR(@PathParam("groupId") int groupId, @PathParam("surname") String surname) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			return Response.status(Status.OK)
					.entity(mateGroups.get(groupId).getHumanResources().stream()
							.filter(hr -> hr.getSurname().equals(surname)).collect(Collectors.toList()))
					.type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
}