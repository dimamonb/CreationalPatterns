package common.sup.da.v1;

import common.sup.da.AbstractWriter;
import common.sup.entity.template.v2.Bundle;
import common.sup.entity.template.v2.JsonParameters;
import common.sup.entity.template.v2.Path;

import java.util.ArrayList;
import java.util.List;

public class JsonParameterWriter extends AbstractWriter {
	
	public List<JsonParameters> write(List<List<String>> arrayList) {
		ArrayList<JsonParameters> jsonParametersList = new ArrayList<>();
		
		for (List<String> list: arrayList) {
			jsonParametersList.add(fillJsonParam(list));
		}
		return jsonParametersList;
	}
	
	private static JsonParameters fillJsonParam(List<String> arrayList){
		JsonParameters parameters = new JsonParameters();
		parameters.setName(arrayList.get(0));
		parameters.setType(arrayList.get(4));
		parameters.setDescription(arrayList.get(1));
		parameters.setList(new Boolean(arrayList.get(2)));
		parameters.setBundle(createBundle(arrayList));
		parameters.setRoles(createRoleList(arrayList));
		return parameters;
	}
	
	private static List<Bundle> createBundle(List<String> arrayList) {
		List<Bundle> bundleList = new ArrayList<>();
		Bundle bundle = new Bundle();
		bundle.setPath(fillPaths(arrayList));
		bundle.setPath(fillPaths(arrayList));
		bundle.setValues(fillValues(arrayList));
		bundleList.add(bundle);
		return bundleList;
	}
	
	private static List<String> fillValues(List<String> arrayList) {
		List<String> valueList = new ArrayList<>();
		
		Integer isList = Integer.valueOf(arrayList.get(2));
		if (isList != 0) {
			for(int i = 7; i<arrayList.size(); ++i)
			{
				valueList.add(arrayList.get(i));
			}
		} else {
			valueList.add(arrayList.get(7));
		}
		return valueList;
	}
	
	private static List<Path> fillPaths(List<String> arrayList) {
		//todo заполнять path возможно получится через получение значений от входного списка
		List<Path> pathList = new ArrayList<>();
		pathList.add(fillPath("VERSION", "false"));
		pathList.add(fillPath("CHANNEL", arrayList.get(5)));
		pathList.add(fillPath("SUBSYSTEM", arrayList.get(6)));
		pathList.add(fillPath("TERBANK", ""));
		pathList.add(fillPath("OSB", ""));
		pathList.add(fillPath("VSP", ""));
		return pathList;
	}
	
	private static Path fillPath(String st1, String st2) {
		Path path = new Path();
		path.setCode(st1);
		path.setValue(st2);
		return path;
	}
	
	private static List<String> createRoleList(List<String> arrayList) {
		List<String> roleList = new ArrayList<>();
		roleList.add(arrayList.get(3));
		return roleList;
	}
	
}
