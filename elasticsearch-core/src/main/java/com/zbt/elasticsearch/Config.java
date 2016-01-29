package com.zbt.elasticsearch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * Created by Frank Zhang on 16/1/21.
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.zbt.elasticsearch.repository"})
public class Config {

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().loadConfigSettings(false)
        .local(true).node().client());
    }
}
