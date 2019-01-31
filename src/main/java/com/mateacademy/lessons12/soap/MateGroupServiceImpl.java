package com.mateacademy.lessons12.soap;

import java.util.List;

import javax.jws.WebService;

import com.mateacademy.lessons11.MateGroup;
import com.mateacademy.lessons11.Person;
import com.mateacademy.lessons11.Teacher;

/**
 * @author spasko
 */
// Service Implementation
@WebService(endpointInterface = "com.mateacademy.lessons12.soap.MateGroupService")
public class MateGroupServiceImpl implements MateGroupService {
	private MateGroup mateGroup = MateGroup.mateGroupExampleCreator();
	

	@Override
	public MateGroup getMateGroup() {
		return mateGroup;
	}

	@Override
	public MateGroup addStudents(List<Person> persons) {
		mateGroup.getStudents().addAll(persons);
		return mateGroup;
	}

//	@Override
//	public MateGroup putTeacher(Teacher teacher) {
//		mateGroup.setTeacher(teacher);
//		return mateGroup;
//	}

}