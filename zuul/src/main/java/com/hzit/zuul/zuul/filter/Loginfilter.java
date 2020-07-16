//package com.hzit.zuul.zuul.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Component
//public class Loginfilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    @Override
//    //该过滤器是否执行
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext requestContext=RequestContext.getCurrentContext();
//        HttpServletRequest request= requestContext.getRequest();
//        String token=request.getParameter("token");
//        if(StringUtils.isEmpty(token)){
//            requestContext.setSendZuulResponse(false);//过滤该请求，不进行路由
//            requestContext.setResponseStatusCode(401);
//            requestContext.setResponseBody("token is empty");
//            return null;
//        }
//        return null;
//    }
//}
