package bao2.dao;

import bao2.entity.department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title departmentdao
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\26 0026 11:51
 */

@Repository
public class departmentdao {
    private static Map<Integer,department> departments=new HashMap<Integer, department>();
    static{
        departments.put(101, new department(101, "D-AA"));
        departments.put(102, new department(102, "D-BB"));
        departments.put(103, new department(103, "D-CC"));
        departments.put(104, new department(104, "D-DD"));
        departments.put(105, new department(105, "D-EE"));
    }

    public Collection<department> getdepartments(){
      return departments.values();
    }
    public department get(Integer id){
        return departments.get(id);
    }
}

