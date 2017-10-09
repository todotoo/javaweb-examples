package org.wg.filter.demo;

import javax.servlet.*;
import java.io.IOException;

public class OneFilter implements Filter {
    /**
     * 创建之后马上执行，用来做初始化！
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("OneFilter.init()");
    }

    /**
     * 每次过滤时都会执行
     */
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("OneFilter#start");
        chain.doFilter(request, response);//放行！
        System.out.println("OneFilter#end");
    }

    /**
     * 销毁之前执行，用来做对非内存资源进行释放
     */
    public void destroy() {
        System.out.println("OneFilter.destroy()");
    }
}
