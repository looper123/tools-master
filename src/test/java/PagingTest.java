//import com.itcast.yitao.dao.impl.UserDao;
//import com.itcast.yitao.pojo.UserEntity;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
///**
// * Created by 311198 on 2016/11/29.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring.xml"})
//public class PagingTest {
//
//    @Autowired
//    private UserDao userDao;
//
//
//    @Test
//    public void testQueryAll(){
//        List<UserEntity> userEntities = userDao.queryAllUser(1);
//        for (UserEntity userEntity :userEntities) {
//            System.out.println("-------------"+userEntity.getEmpName());
//        }
//    }
//
//    @Test
//    public void testCounts(){
//        System.out.println("==========="+userDao.counts());
//    }
//
//
//}
