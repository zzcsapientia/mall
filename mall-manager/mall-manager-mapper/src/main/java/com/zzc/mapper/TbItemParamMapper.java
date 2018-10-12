package com.zzc.mapper;


import com.zzc.pojo.TbItemParam;
import com.zzc.pojo.TbItemParamAndName;
import java.util.List;

public interface TbItemParamMapper {

    List<TbItemParamAndName> getItemParamList();

    TbItemParam getItemParamByCid(Long cid);

    Integer insertItemParam(TbItemParam tbItemParam);
}
