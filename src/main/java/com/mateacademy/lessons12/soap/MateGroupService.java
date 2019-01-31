package com.mateacademy.lessons12.soap;

import com.mateacademy.lessons11.*;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


/**
 * @author spasko
 */
// Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface MateGroupService {

	@WebMethod
	public MateGroup getMateGroup();

	@WebMethod
	public MateGroup addStudents(List<Person> persons);

//	@WebMethod
//	public MateGroup putTeacher(Teacher teacher);
}