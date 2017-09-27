package com.bldz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;



/**
 * Zuul 实现过滤
 * @author pactera
 *
 */
@Component
public class MyFilter  extends  ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public boolean shouldFilter() {
		System.out.println("逻辑判断---->");
		return true;
	}

	@Override
	public Object run() {
		log.info("执行过滤开始----->");
		RequestContext cxt = RequestContext.getCurrentContext();
		HttpServletRequest   request   = cxt.getRequest();
		log.info("请求地址1----> " + request.getRequestURL());
		log.info("请求地址2----> " + request.getLocalAddr());
		log.info("请求方法----> " + request.getMethod());
		String token = request.getParameter("token");
		HttpServletResponse response = cxt.getResponse();
		response.reset();
		PrintWriter writer = null;
		if(StringUtils.isEmpty(token)){
			log.info("请求参数token为空！");
			try {
				response.setCharacterEncoding("UTF-8");
				response.setHeader("Content-type", "text/html;charset=UTF-8");  
				writer = response.getWriter();
				writer.write("请求参数token为空！");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(writer!=null){
					writer.close();
				}
			}
		}/*else{
			log.info("请求参数token：" + token);
			try {
				cxt.getResponse().getWriter().write("请求参数token：" + token);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		log.info("执行过滤结束----->");
		return null;
	}

	
	public String filterType() {
		log.info("路由之前");
		return "pre";
	}

	@Override
	public int filterOrder() {
		System.out.println("过滤的顺序--->");
		return 0;
	}
	
	

}
