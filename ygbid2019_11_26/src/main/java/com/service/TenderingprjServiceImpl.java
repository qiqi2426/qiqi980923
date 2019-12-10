package com.service;

import com.domain.Tenderingprj;
import com.mapper.TenderingprjMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TenderingprjServiceImpl implements TenderingprjService{

    @Resource
    private TenderingprjMapper tenderingprjMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tenderingprjMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Tenderingprj record) {
        return tenderingprjMapper.insert(record);
    }

    @Override
    public int insertSelective(Tenderingprj record) {
        return tenderingprjMapper.insertSelective(record);
    }

    @Override
    public Tenderingprj selectByPrimaryKey(Integer id) {
        return tenderingprjMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Tenderingprj record) {
        return tenderingprjMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tenderingprj record) {
        return tenderingprjMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Tenderingprj> selectprjAll(Tenderingprj tenderingprj) {
        return tenderingprjMapper.selectprjAllBySignAndUserid(tenderingprj);
    }

    @Override
    public Tenderingprj selectDetailedInformationById(int id) {
        return tenderingprjMapper.selectDetailedInformationById(id);
    }

    @Override
    public int tongguoTenderngprjById(Tenderingprj tenderingprj) {
        return tenderingprjMapper.tongguoTenderngprjById(tenderingprj);
    }

}
