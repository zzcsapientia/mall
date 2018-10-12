package com.zzc.mapper;


import com.zzc.pojo.TbItemCat;
import java.util.List;

public interface TbItemCatMapper {
    List<TbItemCat> getItemCatByParentId(long parentId);

    String getItemCatNameById(long id);
}
