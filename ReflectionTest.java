package reflectionAPIExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException,
	InstantiationException,IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		// TODO Auto-generated method stub
		Constructor<Example> pcc = Example.class.getDeclaredConstructor();
		pcc.setAccessible(true);
		Example privateConstructorInstance = pcc.newInstance();
		
		Method method = Example.class.getDeclaredMethod("test",null);
		method.setAccessible(true);
		method.invoke(privateConstructorInstance);
		
		//using different class that is example2
//		Example2 e = new Example2();
//		Method method1 = Example2.class.getDeclaredMethod("test", null);
//		method1.setAccessible(true);
//		
//		System.out.println(method1.invoke(e));
		
		//using parameters
		Example2 e = new Example2();
		Method method1 = Example2.class.getDeclaredMethod("test", String.class);
		method1.setAccessible(true);
		
		System.out.println(method1.invoke(e,"Hello"));

	}

}
