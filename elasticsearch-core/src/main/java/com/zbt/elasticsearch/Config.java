package com.zbt.elasticsearch;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * Created by Frank Zhang on 16/1/21.
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.zbt.elasticsearch.repository"})
public class Config {

    @Value("${elasticsearch.port}")
    Integer port;
    @Value("${elasticsearch.host}")
    String host;
    @Value("${elasticsearch.cluster.name}")
    String clusterName;

    /**
     * 启动在本地
     * @return ElasticsearchOperations
     */
    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().loadConfigSettings(false)
        .local(true).node().client());
    }

    /**
     * Transport Client（连接远程es服务）
     * @return ElasticsearchOperations
     */
/*    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }*/

/*    @Bean
    public Client client(){
        Settings settings = Settings.builder()
                .put("cluster.name",clusterName)
                .build();
        TransportClient client= TransportClient.builder().settings(settings).build();
        TransportAddress address = null;
        try {
            address = new InetSocketTransportAddress(InetAddress.getByName(host), port);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        client.addTransportAddress(address);
        return client;
    }*/
}
