package zw.co.mike.chol.dbconnection;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Database {
        private static Database dbObject;

        private Database() {}

        public static Database getInstance() {
            if(dbObject == null) {
                dbObject = new Database();
            }
            return dbObject;
        }

        public void getConnection(String msg) {
            System.out.println("You are now connected to the database."+ msg);
        }
}
