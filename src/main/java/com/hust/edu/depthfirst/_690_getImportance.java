package com.hust.edu.depthfirst;

import java.util.List;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 690 员工的重要性
 * 给定一个保存员工信息的数据结构，它包含了员工唯一的id，重要度 和 直系下属的id。
 */
public class _690_getImportance {

    private int sum=0;

    public int getImportance(List<Employee> employees, int id) {
        getImportanceHelper(employees,id);
        return sum;
    }

    private void getImportanceHelper(List<Employee> employees, int id){
        for(Employee employee: employees){
            if(employee.id==id){
                sum+=employee.importance;
                for(int index:employee.subordinates)
                    getImportance(employees,index);
            }
        }
    }

    private class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
}
