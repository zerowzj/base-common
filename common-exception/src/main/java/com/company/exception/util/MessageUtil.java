package com.company.exception.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * <p>Message Util<／p>
 *
 * @author wangzhj
 * @time 2016-11-04 16:47
 */
public abstract class MessageUtil {

    private static final String MESSAGE_FILE = "com/company/exception/message.properties";

    private static final Properties prop = new Properties();

    static {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream(MESSAGE_FILE);
        try {
            prop.load(new InputStreamReader(is, "UTF-8"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 格式化信息
     *
     * @param key
     * @param args
     * @return String
     **/
    public static String format(String key, Object... args) {
        String pattern = prop.getProperty(key);
        MessageFormat msgFormat = new MessageFormat(pattern);
        return msgFormat.format(args);
    }
}
