package com.example.demo.mapper;


import com.example.demo.entity.ggCodeEntity;
import org.apache.ibatis.annotations.Select;

/**
 * ggcodeMapper
 *
 * @author ROG
 * @create 2017-11-20-11:18
 */
public interface ggcodeMapper {

    @Select("select * from ggcode where CODECODE =  #{0} and CODETYPE=#{1}")
    public ggCodeEntity getGgcode(String CODECODE,String CODETYPE );

}
