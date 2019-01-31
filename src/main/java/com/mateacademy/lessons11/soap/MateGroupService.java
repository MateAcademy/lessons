package com.mateacademy.lessons11.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mateacademy.lessons11.MateGroup;
import com.mateacademy.lessons11.Person;

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
}