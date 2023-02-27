package com.madhu.util;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class DateUtil {
public DateUtil() {
System.out.println("current time is:"+new Date());
}
}
