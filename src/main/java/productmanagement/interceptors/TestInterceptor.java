package productmanagement.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("testTnterceptor destroy() method called");
	}

	@Override
	public void init() {
		System.out.println("testTnterceptor init() method called");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("pre-processing");
		System.out.println("action invocation executed");
		System.out.println("post-processing");
		return null;
	}

}
