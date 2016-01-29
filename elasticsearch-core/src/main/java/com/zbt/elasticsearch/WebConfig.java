package com.zbt.elasticsearch;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.Arrays;

/**
 * java对象和json的转换
 * @author zhuzhengwei
 *
 */
@Configuration
public class WebConfig {
	@Bean
	public HttpMessageConverters customConverters() {
		AbstractHttpMessageConverter<?> stringConverter = new StringHttpMessageConverter();
		stringConverter.setSupportedMediaTypes(Arrays.asList(MediaType
				.valueOf("text/plain;charset=UTF-8")));
		AbstractHttpMessageConverter<?> jackson2Converter = new MappingJackson2HttpMessageConverter();
		jackson2Converter.setSupportedMediaTypes(Arrays.asList(
				MediaType.valueOf("text/plain;charset=UTF-8"),
				MediaType.valueOf("application/json;charset=UTF-8")));
		return new HttpMessageConverters(stringConverter, jackson2Converter);
	}
}
