package org.brijframework.json.schema.factories;

import java.lang.reflect.Field;

public class ReflectionUtils {
	
	public static Object getInstance(String cls) {
		try {
			return Class.forName(cls).getConstructor().newInstance();
		} catch (Exception e) {
			System.out.println("error for getInstance of cls ="+cls);
		}
		return null;
	}

	public static  void setField(Object instance, Object fieldVal, String fieldName) {
		try {
			Field fieldInfo= findField(instance.getClass(), fieldName);
			if(fieldInfo==null) {
				return;
			}
			fieldInfo.setAccessible(true);
			fieldInfo.set(instance, fieldVal);
		} catch (Exception e) {
			System.out.println(instance + ", fieldName="+fieldName);
			
			e.printStackTrace();
		}
	}

	private static Field findField(Class<?> cls, String fieldName) throws NoSuchFieldException {
		Field fieldInfo=null;
		if(cls.equals(Object.class)) {
			return null;
		}
		try {
			fieldInfo = cls.getDeclaredField(fieldName);
		}catch (NoSuchFieldException e) {
			fieldInfo=findField(cls.getSuperclass(), fieldName);
		}
		return fieldInfo;
	}
	
	public static  Object getField(Object instance, String fieldName) {
		try {
			Field fieldInfo = null;
			try {
				fieldInfo = instance.getClass().getDeclaredField(fieldName);
			}catch (NoSuchFieldException e) {
			}
			if(fieldInfo==null) {
				fieldInfo=instance.getClass().getSuperclass().getDeclaredField(fieldName);
			}
			return  getField(instance, fieldInfo);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Object getField(Object instance, Field fieldInfo) {
		try {
			if(fieldInfo==null) {
				return null;
			}
			fieldInfo.setAccessible(true);
			return fieldInfo.get(instance);
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			System.out.println(instance);
			e.printStackTrace();
		}
		return null;
	}
}
