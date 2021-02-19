package com.github.sourcehot.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class CrudServiceTest {

	@Test
	public void testSave() {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\desktop\\git_repo\\cglib\\sourcehot-cglib\\proxy");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CrudService.class);
		FirstMethodInterceptor firstMethodInterceptor = new FirstMethodInterceptor();
		enhancer.setCallback(firstMethodInterceptor);

		Object o = enhancer.create();
		if (o instanceof CrudService) {
			((CrudService) o).save();
		}
	}
}