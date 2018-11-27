package com.wax.h2w.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulingConfig {
    private static Logger log = LoggerFactory.getLogger(SchedulingConfig.class);

    @Autowired

    @Scheduled(cron = "0 0 * * * ?")// 每小时运行一次
    public void getAccessTokenSchedule() {
        log.info(">>>>>>>>>>>>>>获取准入令牌定时任务");
    }

}
