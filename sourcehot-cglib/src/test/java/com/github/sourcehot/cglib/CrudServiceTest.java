package com.github.sourcehot.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class CrudServiceTest {


	@Test
	public void testSave() {
//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:/desktop/git_repo/cglib/sourcehot-cglib/proxy");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CrudService.class);
		FirstMethodInterceptor firstMethodInterceptor = new FirstMethodInterceptor();
		enhancer.setCallback(firstMethodInterceptor);

		Object o = null;
		try {
			o = enhancer.create();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		if (o instanceof CrudService) {
			((CrudService) o).save();
		}
	}

}