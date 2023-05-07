package com.eventmaster.persistence.configs;

import com.eventmaster.domain.IEventMasterRepository;
import com.eventmaster.persistence.EventMasterRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceModuleConfig {

    @Bean
    public IEventMasterRepository eventMasterRepository(){
        return new EventMasterRepositoryImpl();
    }
}
