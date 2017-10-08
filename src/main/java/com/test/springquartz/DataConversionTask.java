package com.test.springquartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("taskJob")
public class DataConversionTask {
    /** 日志对象 */
    private static final Logger LOG = LoggerFactory.getLogger(DataConversionTask.class);
    public void run() {
//        if (LOG.isInfoEnabled()) {
//            LOG.info("数据转换任务线程开始执行"+System.currentTimeMillis());
//        }
        System.out.println("成功"+System.currentTimeMillis());
    }
}
