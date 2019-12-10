package com.mapper;

import com.domain.Tenderingprj;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TenderingprjMapper extends Mapper<Tenderingprj> {


    List<Tenderingprj> selectprjAllBySignAndUserid(Tenderingprj tenderingprj);

    Tenderingprj selectDetailedInformationById(int id);

    int tongguoTenderngprjById(Tenderingprj tenderingprj);
}
