package com.miaosha;

import com.miaosha.dao.UserDOMapper;
import com.miaosha.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.miaosha"})
@RestController
@MapperScan("com.miaosha.dao")
public class MiaoshaApp
{
    @Autowired
    private UserDOMapper  userDOMapper;

    @RequestMapping("/")
    public String home(){
        UserDO user = userDOMapper.selectById("E32391B2-738B-4186-A473-565F9CFD24A6");
        return user.getName();
    }
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        SpringApplication.run(MiaoshaApp.class,args);
    }
}
