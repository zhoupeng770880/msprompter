package com.ruoyi.prompter.business.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateUtils {

    public static final String DATE_PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private static final String GMT_8 = "GMT+8";

    public static final ZoneId ZONE_ID = TimeZone.getTimeZone(GMT_8).toZoneId();

    /**
     * 获取本地时间, 时区是GMT+8.
     *
     * @return 时区GMT+8的本地时间
     */
    public static LocalDateTime nowGmt8() {
        return LocalDateTime.now(ZONE_ID);
    }

    /**
     * 将java.utl.Date时间转换成时区GM+8的LocalDateTime时间
     *
     * @param date 要转换的Date
     * @return 时区GMT+8的date时间
     */
    public static LocalDateTime ofInstant(Date date) {
        Objects.requireNonNull(date, "date is null");
        return LocalDateTime.ofInstant(date.toInstant(), ZONE_ID);
    }

}