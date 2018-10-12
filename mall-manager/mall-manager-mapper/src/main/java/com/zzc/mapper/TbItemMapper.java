package com.zzc.mapper;


import com.zzc.pojo.TbItem;
import java.util.List;

public interface TbItemMapper {

    TbItem selectByPrimaryKey(Long id);

    List<TbItem> getItemList();

    void insert(TbItem item);
}