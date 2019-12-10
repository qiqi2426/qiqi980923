package com.mapper;

import com.domain.Tenderingfile;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TenderingfileMapper extends Mapper<Tenderingfile> {

    List<Tenderingfile> selectAllBuPrjid(int id);
}