package org.criteria_query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

public class CriteriaMain {

    Session session = getSession();

    public static void main(String[] args) {
        CriteriaMain cm = new CriteriaMain();

//        List<Employee> employees = cm.getEmployees();
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

//        List<Employee> employeesWithSalaryGreaterThan = cm.singleWhere_condition(10000);
//        for (Employee employee : employeesWithSalaryGreaterThan) {
//            System.out.println(employee);
//        }

//        List<Employee> empNameEquals = cm.multiWhere_condition("dev",25);
//        for(Employee e: empNameEquals)
//            System.out.println(e);

//        List<String> col = cm.getColumn("name");
//        for(String s: col)
//            System.out.println(s);

//        List<Object[]> cols = cm.getColumns("name","age");
//        for(Object[] obs: cols){
//            for(Object o: obs)
//                System.out.print(o+",  ");
//            System.out.println();
//        }

//        List<Employee> li = cm.executeHQL("from Employee");
//        for(Employee e: li)
//            System.out.println(e);

        for(Employee e: cm.executeHQL("from Employee e where e.age > 25"))
            System.out.println(e);

    }

    private Session getSession() {
        Configuration configuration = new Configuration();
        configuration.configure();
        return configuration.buildSessionFactory().openSession();
    }

    List<Employee> getEmployees() {
        Criteria criteria = session.createCriteria(Employee.class);
        return criteria.list();
    }

    List<Employee> singleWhere_condition(int salary) {
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.gt("salary", salary));
        return criteria.list();
    }

    List<Employee> multiWhere_condition(String profile, int age){
        Criteria c = session.createCriteria(Employee.class);
        c.add(Restrictions.eq("profile",profile));
        c.add(Restrictions.gt("age",age));
        return c.list();
    }

    List<String> getColumn(String col){
        Criteria c = session.createCriteria(Employee.class);
        Projection pr = Projections.property(col);
        return c.setProjection(pr).list();

    }
    List<Object[]> getColumns(String col1, String col2){
        Criteria c = session.createCriteria(Employee.class);
        Projection pr1 = Projections.property(col1);
        Projection pr2 = Projections.property(col2);
        ProjectionList plist = Projections.projectionList();
        plist.add(pr1);
        plist.add(pr2);
        return c.setProjection(plist).list();
    }
    List<Employee> executeHQL(String q){
        Query qr = session.createQuery(q);
        return  qr.list();
    }

}
