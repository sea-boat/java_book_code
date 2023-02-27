package com.java.annotation;

import java.lang.reflect.Field;

public class Util {

	public static void validate(Object o) {
		Field[] fields = o.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(NotNull.class)) {
				NotNull notNull = field.getAnnotation(NotNull.class);
				try {
					Object obj = field.get(o);
					if (obj == null) {
						throw new Exception(notNull.message());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
