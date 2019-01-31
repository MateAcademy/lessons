package lesson11.soap;

import java.util.List;

import javax.jws.WebService;

import lesson10.xmljson.MateGroup;
import lesson10.xmljson.Person;

/**
 * @author spasko
 */
// Service Implementation
@WebService(endpointInterface = "lesson11.soap.MateGroupService")
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

}


