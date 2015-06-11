package com.ideamart.service;

import com.ideamart.dao.DataDao;
import com.ideamart.entity.Receive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chathura on 6/11/15.
 */
@Service("dataService")
public class DataServiceImpl implements DataService {

    @Autowired
    DataDao dataDao;

    @Override
    public int insertRow(Receive receive) {
        return dataDao.insertRow(receive);
    }

    @Override
    public List<Receive> getList() {
        return dataDao.getList();
    }

    @Override
    public int deleteRow(int id) {
        return dataDao.deleteRow(id);
    }
}
