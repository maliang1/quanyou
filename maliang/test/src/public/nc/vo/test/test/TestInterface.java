package nc.vo.test.test;

import java.util.List;
import java.util.Map;

import com.yonyou.itf.mdm0303.building.mdload.extend.IOuterSystemPointcutAdvisor;


public class TestInterface implements IOuterSystemPointcutAdvisor{

	@Override
	public List<Map<String, Object>> afterQuery(List<Map<String, Object>> arg0) {
		// TODO �Զ����ɵķ������
		
		System.out.println("query: "+arg0);
		return null;
	}

	@Override
	public void beforeInsert(List<Map<String, Object>> arg0) {
		// TODO �Զ����ɵķ������
		System.out.println("insert: "+arg0);
	}


	


}
