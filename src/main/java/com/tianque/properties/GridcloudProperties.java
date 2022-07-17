package com.tianque.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author fades
 * @description
 * @date 2022/7/10 21:42
 */
@Data
//@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "gridcloud")
@EnableConfigurationProperties(GridcloudProperties.class)
public class GridcloudProperties {

    @NestedConfigurationProperty
    Common common = new Common();

    @NestedConfigurationProperty
    Db db = new Db();

    @NestedConfigurationProperty
    Custom property = new Custom();

    public static class Custom{
        Boolean enabled = true;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }
    }
    @Data
    public static class Common{

        /**
         * fastjson dateformat
         */
        String dateFormat = "yyyy.MM.dd G 'at' HH:mm:ss z";
    }
    @Data
    public static class Db{

        /**
         * sqltime拦截器开关 默认关闭
         */
        Boolean sqltimeTnterceptor = false;

        /**
         * 关注时间 单位秒 默认5
         */
        Double noticeTime = 5.0;
    }
}