package net.tngou.util;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

    private static final Logger log = LoggerFactory.getLogger(DateUtil.class);
    private static final String ZID = "Asia/Shanghai"; // 上海

    /**
     * @param @param  stime 开始时间
     * @param @param  etime 结束时间
     * @param @return 时间间隔
     * @return Duration
     * Duration.toDays();  取得时间间隔的天数
     * Duration.toHours(); 取得时间将的小时数
     * Duration.toMinutes(); 取得时间间隔的分钟数
     * @throws
     * @Title: between
     * @Description: TODO
     */
    public static Duration between(LocalDateTime stime, LocalDateTime etime) {

        return Duration.between(stime, etime);
    }


    /**
     * @param @param  str
     * @param @return 设定文件
     * @return LocalDateTime    返回类型
     * @throws
     * @Title: parse
     * @Description: 把字符串转为时间
     */
    public static LocalDateTime parse(String str) {
        String[] parsePatterns = {
                "yyyy-MM-dd",
                "HH:mm:ss",
                "yyyy-MM-dd HH:mm:ss",
                "yyyyMMdd HHmmss",
                "yyyyMMddHHmmss",
                "yyyy-MM-dd'T'HH:mm:ss",
                "yyyy-MM-dd'T'HH:mm:ss.SSS",
                "EEEE MMM dd HH:mm:ss Z yyyy",
                "MMM d, yyyy HH:mm:ss a",
                "yyyy年MM月dd日 HH时mm分ss秒"};
        Date date = new Date();
        try {
            date = DateUtils.parseDate(str, Locale.US, parsePatterns);

            return toLocalDateTime(date);
        } catch (ParseException e) {

            log.error("时间转换错误{},暂且没有相对应时间格式", str);
            e.printStackTrace();
            return null;
        }

    }


    /**
     * @param @param  localDateTime
     * @param @param  pattern
     * @param @return 设定文件
     * @return String    返回类型
     * @throws
     * @Title: format
     * @Description: 时间转换为字符串
     */
    public static String format(LocalDateTime localDateTime, String pattern) {
        if (pattern == null)
            pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return localDateTime.format(formatter);


    }


    /**
     * @param @param  date
     * @param @return 设定文件
     * @return LocalDateTime    返回类型
     * @throws
     * @Title: toLocalDateTime
     * @Description: TODO Date 转为  LocalDateTime
     */
    public static LocalDateTime toLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        return LocalDateTime.ofInstant(instant, ZoneId.of(ZID));
    }

    /**
     * @param @param  localDateTime
     * @param @return 设定文件
     * @return Date    返回类型
     * @throws
     * @Title: toDate
     * @Description: LocalDateTime 转为  Date
     */
    public static Date toDate(LocalDateTime localDateTime) {
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(ZID));
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }


}
