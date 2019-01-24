package common.sup.da;

import common.sup.entity.template.v1.Fallback;

import java.util.List;

public abstract class AbstractReader {

    public abstract Fallback read(String Url) throws Exception;

}
