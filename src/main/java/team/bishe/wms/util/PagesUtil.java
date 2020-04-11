package team.bishe.wms.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PageUtil
 * @Description
 * @Author RJ
 * @Date 2020/4/10 22:47
 * @Version 1.0
 **/
@Slf4j
public class PagesUtil {
    private static final PagesUtil pages = new PagesUtil();

    private PagesUtil(){}
    public static PagesUtil pages() {
        return pages;
    }
    /**默认页面*/
    public final static String DEFAULT_PAGE_INDEX = "1";
    /**默认每页数据*/
    public final static String DEFAULT_PAGE_SIZE = "10";

    public final static String PAGE_INDEX = "pageIndex";

    public final static String PAGE_SIZE = "pageSize";
    public final static String START_ROW= "startRow";
    public final static String END_ROW = "endRow";
    final static Map<String,Object> PARAM_MAP = new HashMap<>();
    static {
        PARAM_MAP.put(PAGE_INDEX,DEFAULT_PAGE_INDEX);
        PARAM_MAP.put(PAGE_SIZE,DEFAULT_PAGE_SIZE);
    }
    /**
     * 针对分页获取参数
     * @return
     */
    public <T> void pageParam(T t) {
        Field[] fields = t.getClass().getDeclaredFields();
        int pageSize = 0;
        int pageIndex = 1;
        for (Field field : fields){
            for(Map.Entry<String, Object> entry : PARAM_MAP.entrySet()){
                if(field.getName().equals(entry.getKey())){
                    field.setAccessible(true);
                    Object value;
                    try {
                        value = field.get(t)==null? Integer.valueOf(entry.getKey()):field.get(t);
                        field.set(t,value);
                        if(field.getName().equals(PAGE_INDEX)){
                            pageIndex = Integer.parseInt(value.toString());
                        }
                        else{
                            pageSize = Integer.parseInt(value.toString());
                        }
                    } catch (IllegalAccessException e) {
                        log.error("type convert error :{}",e);
                    }

                }
            }
        }
        try {

            Field field = t.getClass().getDeclaredField(START_ROW);
            field.setAccessible(true);
            Integer startRow =pageIndex==1?(pageIndex - 1) * pageSize:(pageIndex-1) * pageSize+1;
            field.set(t,startRow);
            Field field2 = t.getClass().getDeclaredField(END_ROW);
            field2.setAccessible(true);
            field2.set(t,startRow==0?pageSize:(startRow+pageSize-1));
        } catch (Exception e) {
            log.error("set pageStart error :{}",e);
        }
    }
}
