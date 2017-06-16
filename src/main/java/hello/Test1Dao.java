package hello;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Surya_Bera on 6/16/2017.
 */
@Repository
public class Test1Dao {

    @Inject
    private JdbcTemplate jdbcTemplate;

    public List<Test1> getTestData(){
        String sql = "SELECT * FROM PJUS.TEST1";

        List<Test1> test1s = jdbcTemplate.query(sql,new BeanPropertyRowMapper(Test1.class));

        test1s.forEach(item->System.out.println(item.getId() + "-" + item.getName()));

        return test1s;
    }

}
