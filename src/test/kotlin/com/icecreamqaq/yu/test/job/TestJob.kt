package com.icecreamqaq.yu.test.job

import com.IceCreamQAQ.Yu.annotation.Cron
import com.IceCreamQAQ.Yu.annotation.JobCenter
import com.IceCreamQAQ.Yu.util.DateUtil
import javax.inject.Inject

@JobCenter
class TestJob{

    @Inject
    private lateinit var dateUtil: DateUtil

    @Cron("1m5s",async = false)
    fun c1(){
        println("时间：${dateUtil.formatDateTimeSSS()}，c1 定时任务触发。")
        Thread.sleep(10000)
    }

    @Cron("10s",async = false)
    fun c2(){
        println("时间：${dateUtil.formatDateTimeSSS()}，c2 定时任务触发。")
        Thread.sleep(20000)
    }

}