package bao1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title hello
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\22 0022 16:52
 */

@Controller
public class hello {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "success";
    }

}
