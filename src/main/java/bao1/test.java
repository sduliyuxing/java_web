package bao1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\23 0023 17:59
 */

@SessionAttributes(value = "book")
@Controller
public class test {

    public static final String x="success";

    @RequestMapping("/testmapping")
    public String testmapping(){
        System.out.println("testmapping");
        return x;
    }

    @RequestMapping(value="/testmethod",method = RequestMethod.POST)
    public String testmethod(){
        System.out.println("testmethod");
        return x;
    }

    @RequestMapping("mvc/*/abc")
    public String testparamsandheaders()
    {
        System.out.println("mvc/*/abc");
        return x;
    }

    @RequestMapping("/testid/{id}")
    public String testid(@PathVariable("id") int id){
        System.out.println(id);
        return x;
    }

    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    public String testget(@PathVariable("id") int id){
        System.out.println("testget");
        return x;
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String testpost(){
        System.out.println("testpost");
        return x;
    }

//    如何发送 PUT 请求和 DELETE 请求呢 ? 1. 需要配置 HiddenHttpMethodFilter 2. 需要发送 POST 请求
//	 * 3. 需要在发送 POST 请求时携带一个 name="_method" 的隐藏域, 值为 DELETE 或 PUT

    @RequestMapping(value = "/test/{id}",method = RequestMethod.PUT)
    public String testput(@PathVariable("id") int id){
       System.out.println("put");
       return x;
    }
    @RequestMapping(value = "/test/{id}",method = RequestMethod.DELETE)
    public String testdelete(@PathVariable("id") int id){
        System.out.println("delete");
        return x;
    }

//    @RequestParam 来映射请求参数. value 值即请求参数的参数名 required 该参数是否必须.
//    默认为 truedefaultValue 请求参数的默认值
    @RequestMapping("/testparam")
    public String testparam(@RequestParam(value = "id",required = false,defaultValue = "8") int id,
                            @RequestParam(value = "name") String name)
    {
        System.out.println(id+" "+name);
        return x;
    }
    @RequestMapping("/testheader")
    public String testheader(@RequestHeader(value = "Accept-Language") String t)
    {
        System.out.println(t);
        return x;
    }
    @RequestMapping("/testcookie")
    public String testcookie(@CookieValue("JSESSIONID") String id){
        System.out.println(id);
        return x;
    }
    @RequestMapping("/testpojo")
    public String testpojo(person p){
        System.out.println(p);
        return x;
    }
    @RequestMapping("/testmodelview")
    public ModelAndView testmodelview()
    {
        String name="success";
        ModelAndView modelAndView=new ModelAndView(name);
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }
    @RequestMapping("/testmap")
    public String testmap(Map<String,Object> map){
        map.put("name",Arrays.asList("a","b","c"));
        return x;
    }
//    @SessionAttributes 除了可以通过属性名指定需要放到会话中的属性外(实际上使用的是 value 属性值),
//	 * 还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中(实际上使用的是 types 属性值)
//	注意: 该注解只能放在类的上面. 而不能修饰放方法.
    @RequestMapping("/testsessionattributes")
    public String testsessionattributes(Map<String,Object> map){
        book b=new book();
        b.setId(1);
        b.setBname("java");
        map.put("book",b);
        return x;
    }
    @RequestMapping("/testmodelattribute")
    public String testmodelattribute(book b)
    {
        System.out.println(b);
        return x;
    }
//    @ModelAttribute
    public void getbook(@RequestParam(value = "id") Integer id,Map<String,Object>map)
    {
        System.out.println("model");
        if (id !=null){
            System.out.println(id);
            book b=new book();
            b.setBname("math");
            b.setId(101);
            System.out.println("获取："+b);
            map.put("book",b);
        }
    }
    @RequestMapping("testredirect")
    public String testredirect(){
        System.out.println("testredirect");
        return "redirect:/index.jsp";
    }
//    @RequestMapping("testview")
//    public String testview()
//    {
//        return "bao1/helloview";
//    }

}
