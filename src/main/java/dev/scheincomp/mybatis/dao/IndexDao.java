package dev.scheincomp.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import dev.scheincomp.mybatis.vo.*;

import java.util.List;


@Mapper
public interface IndexDao {
    public IndexEntity indexEntity();

    public List<IndexEntity> listIndex();
}