package com.ideamart.service;

import com.ideamart.entity.Receive;

import java.util.List;

/**
 * Created by chathura on 6/11/15.
 */

public interface DataService {

    int insertRow(Receive receive);
    List<Receive> getList();
    int deleteRow(int id);
}
