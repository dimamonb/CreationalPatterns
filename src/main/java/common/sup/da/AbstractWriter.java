package common.sup.da;

import common.sup.entity.template.v3.JsonParameters;

import java.util.List;

public abstract class AbstractWriter {
	
	public abstract List<JsonParameters> write(List<List<String>> arrayList) throws Exception;
	
}
