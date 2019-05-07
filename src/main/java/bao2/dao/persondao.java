package bao2.dao;

import bao2.entity.department;
import bao2.entity.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title persondao
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\26 0026 14:14
 */
@Repository
public class persondao {
    private static Map<Integer,person> map=new HashMap<Integer, person>();
    @Autowired
    departmentdao departmentdao;
    static {
        map.put(1,new person(1,"p-aa","aa@x.com",0,new department(101, "D-AA")));
        map.put(2,new person(2,"p-bb","bb@x.com",1,new department(102, "D-BB")));
        map.put(3,new person(3,"p-cc","cc@x.com",0,new department(103, "D-CC")));
        map.put(4,new person(4,"p-dd","dd@x.com",1,new department(104, "D-DD")));
        map.put(5,new person(5,"p-ee","ee@x.com",0,new department(105, "D-EE")));
    }
    private static Integer n=6;

    public void save(person p){
        if (p.getId()==null){
            p.setId(n++);
        }
        p.setD(departmentdao.get(p.getD().getId()));
        map.put(p.getId(),p);
    }
    public void delete(Integer id){
        map.remove(id);
    }
    public Collection<person> getall(){
        return map.values();
    }
    public person get(Integer id){
        return map.get(id);
    }
}
