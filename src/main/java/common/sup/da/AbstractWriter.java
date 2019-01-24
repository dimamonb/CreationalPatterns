package common.sup.da;

import common.sup.entity.template.v2.JsonParameters;

import java.util.List;

public abstract class AbstractWriter {
	
	public abstract List<JsonParameters> write(List<List<String>> arrayList) throws Exception;
	
}
