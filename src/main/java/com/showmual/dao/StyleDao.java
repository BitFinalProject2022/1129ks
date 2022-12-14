package com.showmual.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.showmual.model.ManStyleVo;
import com.showmual.model.WomanStyleVo;


@Mapper
@Repository("styleDao")
public interface StyleDao {
    
    public List<ManStyleVo> selectMenCoordinate() throws DataAccessException;
    
    public List<WomanStyleVo> selectWomenCoordinate() throws DataAccessException;    
    
}
