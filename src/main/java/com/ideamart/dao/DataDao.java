package com.ideamart.dao;

import com.ideamart.entity.Receive;

import java.util.List;

/**
 * Created by chathura on 6/11/15.
 */
public interface DataDao {

    public int insertRow(Receive receive);
    public List<Receive> getList();
    public int deleteRow(int id);
}
