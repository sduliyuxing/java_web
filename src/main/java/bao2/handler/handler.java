package bao2.handler;

import bao2.dao.departmentdao;
import bao2.dao.persondao;
import bao2.entity.person;
import javafx.util.converter.PercentageStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Title handler
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\26 0026 14:47
 */
@SessionAttributes("person")
@Controller
public class handler {
    @Autowired
    persondao persondao;
    @Autowired
    departmentdao departmentdao;

//    @ModelAttribute
//    public void get(@RequestParam(value = "id",required = false) Integer id, Map<String,Object>map){
//        if (id!=null){
//            map.put("person",persondao.get(id));
//        }
//    }

    @RequestMapping("/persons")
    public String all(Map<String,Object>map){
        map.put("person",persondao.getall());
        return "list";
    }
    @RequestMapping(value = "/person",method = RequestMethod.GET)
     public String add(Map<String,Object> map)
    {
        map.put("department",departmentdao.getdepartments());
        map.put("person",new person());
        return "redirect:add.jsp";
    }

    @RequestMapping(value = "/person/{id}",method = RequestMethod.GET)
    public String gettopost(@PathVariable("id") Integer id,Map<String,Object> map){
        map.put("person",persondao.get(id));
        return "add";
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") Integer id,Map<String,Object>map){
        map.put("person",persondao.get(id));
        return "delete";
    }
    @RequestMapping(value = "/person",method = RequestMethod.POST)
    public String add(person p){
        persondao.save(p);
      return "redirect:/persons";
    }
    @RequestMapping(value ="/person",method = RequestMethod.PUT)
    public String edit(person p){
        persondao.save(p);
        return "redirect:/persons";
    }

    @RequestMapping(value = "/person",method = RequestMethod.DELETE)
    public String delete(person p) {
        System.out.println(p);
        persondao.delete(p.getId());
        return "redirect:/persons";
    }
}
