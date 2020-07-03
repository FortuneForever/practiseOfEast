import Dao.UserDao;
import Pojo.User;
import org.junit.Test;

/**
 * @author OriKey
 * @create 2020- 07- 01 17:40
 * -- 平凡才是唯一的答案 --
 **/
public class Mytest {
    @Test
    public void test(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        UserDao dao = new UserDao();
        User u = new User();
        //u.setId(1);
        u.setName("傅晨");
        u.setPwd("1123");
        dao.add(u);
//        dao.getTotal();
//        for (int i=1;i<dao.getTotal();i++)
//        {
//            dao.delete(i);
//        }
    }
}
