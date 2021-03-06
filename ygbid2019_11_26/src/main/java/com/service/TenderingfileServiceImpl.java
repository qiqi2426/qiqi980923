package com.service;

import com.domain.Tenderingfile;
import com.mapper.TenderingfileMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TenderingfileServiceImpl implements TenderingfileService{

    @Resource
    private TenderingfileMapper tenderingfileMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tenderingfileMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Tenderingfile record) {
        return tenderingfileMapper.insert(record);
    }

    @Override
    public int insertSelective(Tenderingfile record) {
        return tenderingfileMapper.insertSelective(record);
    }

    @Override
    public Tenderingfile selectByPrimaryKey(Integer id) {
        return tenderingfileMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Tenderingfile record) {
        return tenderingfileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tenderingfile record) {
        return tenderingfileMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Tenderingfile> selectAllFileByPrjid(int id) {
        return tenderingfileMapper.selectAllBuPrjid(id);
    }

}
