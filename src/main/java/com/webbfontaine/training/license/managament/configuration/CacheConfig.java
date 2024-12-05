//package com.webbfontaine.training.license.managament.configuration;
//
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.cache.CacheManager;
//
//@Configuration
//@EnableCaching
//public class CacheConfig {
//
//    @Bean
//    public CacheManager cacheManager() {
//        return new EhCacheCacheManager(ehCacheManagerFactoryBean().getObject());
//    }
//
//    @Bean
//    public net.sf.ehcache.CacheManager ehCacheManagerFactoryBean() {
//        return net.sf.ehcache.CacheManager.newInstance("classpath:ehcache.xml");
//    }
//}
