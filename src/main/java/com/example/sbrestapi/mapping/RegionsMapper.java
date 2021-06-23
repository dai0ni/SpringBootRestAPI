package com.example.sbrestapi.mapping;

import com.example.sbrestapi.entity.Regions;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RegionsMapper {

    @Select("select id, name, short_name as shortname from regions;")
    List<Regions> findAll();

    @Select("select id, name, short_name as shortname from regions where id = #{id};")
    Regions findById(Long id);

    @Insert("insert into regions(id, name, short_name) values (#{id},#{name},#{shortName})")
    void save(Regions region);

    @Update("update regions set name=#{name}, short_name=#{shortName} where id=#{id}")
    void update(Regions region);

    @Delete("delete from regions where id=#{id}")
    void deleteById(Long id);
    
}
