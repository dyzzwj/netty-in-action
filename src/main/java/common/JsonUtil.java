package common;

import com.google.gson.Gson;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName JsonUtil.java
 * @Description TODO
 * @createTime 2020年08月18日 23:45:00
 */
public class JsonUtil {

    private static final Gson GSON = new Gson();

    private JsonUtil(){}

    public static String toJson(Object o){
        return GSON.toJson(o);
    }

    public static <T> T fromJson(String jsonStr,Class<T> clazz){
        return GSON.fromJson(jsonStr,clazz);
    }
}
