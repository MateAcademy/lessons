package lesson11.soap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.jws.WebService;

import lesson10.xmljson.MateGroup;
import lesson10.xmljson.Person;

/**
 * @author spasko
 */
// Service Implementation
@WebService(endpointInterface = "lesson11.soap.MateGroupService")
public class MateGroupServiceImpl implements MateGroupService {
	private Map<Integer, MateGroup> mateGroups = Arrays.asList(MateGroup.mateGroupExampleCreator()).stream()
			.collect(Collectors.toMap(MateGroup::getId, Function.identity()));

	@Override
	public MateGroup getMateGroup(Integer groupId) {
		return mateGroups.get(groupId);
	}

	@Override
	public MateGroup addStudents(Integer groupId, List<Person> persons) {
		MateGroup mateGroup = mateGroups.get(groupId);
		if (mateGroup != null) {
			mateGroup.getStudents().addAll(persons);
			return mateGroup;
		} else
			return null;
	}

}