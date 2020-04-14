package team.bishe.wms.util;

public class MyPageUtil {
    public static int convert(int page, int num, int sum) {
        page--;
        if (page < 1) page = 0;
        if (num <= 0) num = 10;
        int startP = sum / num;
        if(page >= startP){
            page = startP;
            if(sum % num == 0) {
                page--;
            }
        }
        return page * num;
    }
}
