package com.ryx.server.service;

import com.ryx.server.Msg.Result;
import com.ryx.server.bean.User;

/**
 * Created by ryx on 2016/10/10.
 */
public interface UserService {
    String insert(User user);
    String query(String id);
    String delete(String id);
}
