package com.company.validation.xml.parser;

/**
 * 解析器工厂
 *
 * @author wangzhj
 */
public class ParserFactory {

    /**
     * 获取解析器
     *
     * @param type
     * @return Parser
     */
    public static Parser getParser(String type) {
        Parser parser = null;
        if ("string".equals(type)) {
            parser = new StringParser();
        } else if ("enum".equals(type)) {
            parser = new EnumParser();
        } else if ("number".equals(type)) {
            parser = new NumberParser();
        } else if ("date".equals(type)) {
            parser = new DateParser();
        }
        return parser;
    }
}
