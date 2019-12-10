package com.service;

import com.domain.Tenderingprj;

import java.util.List;

public interface TenderingprjService{


    int deleteByPrimaryKey(Integer id);

    int insert(Tenderingprj record);

    int insertSelective(Tenderingprj record);

    Tenderingprj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tenderingprj record);

    int updateByPrimaryKey(Tenderingprj record);

    List<Tenderingprj> selectprjAll(Tenderingprj tenderingprj);

    Tenderingprj selectDetailedInformationById(int id);

    int tongguoTenderngprjById(Tenderingprj tenderingprj);

}
