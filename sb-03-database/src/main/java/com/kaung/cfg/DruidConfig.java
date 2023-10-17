package com.kaung.cfg;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DruidConfig{

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    //后台监控功能
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean =
                new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*" );

        //后台需要有人登录账号密码
        HashMap<String, String> initParameters = new HashMap<>();
        initParameters.put("loginUsername", "admin");
        initParameters.put("loginPassword", "123456");

        bean.setInitParameters(initParameters);//设置初始化参数
        return bean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean  = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        HashMap<String, String> initParameters = new HashMap<>();
        //这些东西不进行统计
        initParameters.put("exclusions", "*.js,*.css,/druid/*");
        //过滤那些请求
        bean.setInitParameters(initParameters);

        return bean;
    }
}
