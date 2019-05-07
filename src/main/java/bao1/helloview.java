package bao1;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @Title helloview
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\26 0026 11:18
 */

@Component
public class helloview implements View{
//    @Override
    public String getContentType() {
        return "text/html";
    }

//    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       httpServletResponse.getWriter().print("hello"+new Date());
    }

}
