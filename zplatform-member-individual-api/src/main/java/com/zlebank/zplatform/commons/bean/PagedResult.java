/* 
 * PageResult.java  
 * 
 * version TODO
 *
 * 2015-6-25 
 * 
 * Copyright (c) 2015,.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 分页查询结果
 *
 * @author guojia
 * @version
 * @date 2016年9月28日 上午11:03:50
 * @since
 */
public interface PagedResult<T> extends Serializable {
	/**
	 * 总行数
	 * @return 总行数
	 */
    long getTotal();
    
    /**
     * 分页数据结果集
     * @return 结果集
     * @throws IllegalAccessException
     */
    List<T> getPagedResult() throws  IllegalAccessException;
}
