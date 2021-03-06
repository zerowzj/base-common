package com.company.validation.annot.validator;

import java.lang.annotation.Annotation;

/**
 * 验证器
 *
 * @author wangzhj
 */
public interface Validator {

	/**
	 * 支持类型
	 *
	 * @param clazz
	 * @return boolean
	 */
	public boolean support(Class<?> clazz);

	/**
	 * 验证
	 *
	 * @param paramName
	 * @param value
	 * @param rule
	 */
	public void validate(String paramName, Object value, Annotation rule);
}
