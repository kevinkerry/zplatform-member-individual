/* 
 * PrimayKeyDAO.java  
 * 
 * version TODO
 *
 * 2015年9月11日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.dao;

import java.util.List;
import java.util.Map;

import com.zlebank.zplatform.member.commons.dao.BaseDAO;
import com.zlebank.zplatform.member.individual.pojo.PojoParaDic;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月11日 下午3:12:32
 * @since 
 */
public interface ParaDicDAO extends BaseDAO<PojoParaDic>{
        public PojoParaDic getPrimay(String paraType);
        public List<Map<String, Object>> getSeq(String sequences);
        public String getSeqNextval(String sequences);
}
