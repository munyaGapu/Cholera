package zw.co.mike.chol.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import zw.co.mike.chol.dbconnection.Database;
import zw.co.mike.chol.prototype.CholeraInfectionsCount;

@Component
public class Runner {
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Database db1 = (Database) context.getBean("database");
        db1.getConnection("1");
        System.out.println("Address of db1 "+db1);

        Database db2 = (Database) context.getBean("database");
        db2.getConnection("2");
        System.out.println("Address of db2 "+db2);

        CholeraInfectionsCount cic1 = (CholeraInfectionsCount) context.getBean("counter");
        System.out.println("This is the counter address at first "+  cic1);
        System.out.println(cic1.counterMethod());


        CholeraInfectionsCount cic2 = (CholeraInfectionsCount) context.getBean("counter");
        System.out.println("This is the counter address at second "+  cic2);
        System.out.println(cic2.counterMethod());

    }
}
