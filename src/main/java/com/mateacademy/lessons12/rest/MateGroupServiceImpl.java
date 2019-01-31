package com.mateacademy.lessons12.rest;

import java.util.Arrays;

import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mateacademy.lessons11.*;


/**
 * @author spasko
 */
@Path("/rs/mate")
public class MateGroupServiceImpl implements MateGroupService {
	private MateGroup mateGroup = MateGroup.mateGroupExampleCreator();

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMateGroup() {
		return Response.status(Status.OK).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
	}

	@Override
	@PUT
	@Path("/{groupId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addStudents(@PathParam("groupId") int groupId, Person person) {
		if (groupId == mateGroup.getId()) {
			mateGroup.getStudents().addAll(Arrays.asList(person));
			return Response.status(Status.ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

//	@Override
//	@PUT
//	@Path("/{groupId}/teacher")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response putTeacher(@PathParam("groupId") int groupId, Teacher teacher) {
//		if (groupId == mateGroup.getId() ) {
//			return Response.status(Status.ACCEPTED).entity(mateGroup).type(MediaType.APPLICATION_JSON).build();
//		}
//		return Response.status(Status.NOT_FOUND).build();
//	}

}
