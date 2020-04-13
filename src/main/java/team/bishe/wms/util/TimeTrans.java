package team.bishe.wms.util;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TimeTrans
 * @Description
 * @Author RJ
 * @Date 2020/4/12 22:25
 * @Version 1.0
 **/
@Slf4j
public class TimeTrans {
    /**
     * 对输入的开始日期结束日期转换
     */
    public String intDateFormat(String format, String date) {
        String time = null;
        try {
            Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            time = new SimpleDateFormat(format).format(dt);
        } catch (Exception e) {
            log.warn("intDateFormat convert error :{}", date);
        }
        return time;
    }

    /**
     * @对输出的日期转换
     * @Author rj257
     */
    public String outDateFormat(String date) {
        String trim = date.trim();
        String time = null;
        try {
            if (trim.length() == 8) {
                Date dt = new SimpleDateFormat("yyyyMMdd").parse(trim);
                time = new SimpleDateFormat("yyyy-MM-dd").format(dt);
            } else {
                Date dt = new SimpleDateFormat("yyyyMMddHHmmss").parse(date);
                time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dt);
            }
        } catch (Exception e) {
            log.warn("OutDateFormat convert error :{}", date, e);
        }
        return time;
    }
}
