package xin.qhongchen.crm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   22:51
 */
//@Configuration
public class PropertiesConfig {
    @Bean(name="conversionService")
    public ConversionServiceFactoryBean getConversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        Set<Converter> converters = new HashSet<>();
        converters.add(new StringToDateConverter());
        bean.setConverters(converters);
        return bean;
    }

    public static class StringToDateConverter implements Converter<String, Date> {
        public Date convert(String source) {
            try {
                // 把字符串转换为日期类型
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = simpleDateFormat.parse(source);

                return date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            // 如果转换异常则返回空
            return null;
        }


    }
}