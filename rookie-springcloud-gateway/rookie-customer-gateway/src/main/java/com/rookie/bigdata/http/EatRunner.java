package com.rookie.bigdata.http;

import com.rookie.bigdata.filter.EatuulFilter;
import com.rookie.bigdata.filter.post.SendResponseFilter;
import com.rookie.bigdata.filter.pre.RequestWrapperFilter;
import com.rookie.bigdata.filter.route.RoutingFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Class EatRunner
 * @Description
 * @Author rookie
 * @Date 2024/9/20 13:40
 * @Version 1.0
 */
public class EatRunner {
    //静态写死过滤器
    private ConcurrentHashMap<String, List<EatuulFilter>> hashFiltersByType = new ConcurrentHashMap<String, List<EatuulFilter>>(){{
        put("pre",new ArrayList<EatuulFilter>(){{
            add(new RequestWrapperFilter());
        }});
        put("route",new ArrayList<EatuulFilter>(){{
            add(new RoutingFilter());
        }});
        put("post",new ArrayList<EatuulFilter>(){{
            add(new SendResponseFilter());
        }});
    }};

    public void init(HttpServletRequest req, HttpServletResponse resp) {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setRequest(req);
        ctx.setResponse(resp);
    }

    public void preRoute() throws Throwable {
        runFilters("pre");
    }

    public void route() throws Throwable{
        runFilters("route");
    }

    public void postRoute() throws Throwable{
        runFilters("post");
    }

    public void runFilters(String sType) throws Throwable {
        List<EatuulFilter> list = this.hashFiltersByType.get(sType);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                EatuulFilter zuulFilter = list.get(i);
                zuulFilter.run();
            }
        }
    }
}
