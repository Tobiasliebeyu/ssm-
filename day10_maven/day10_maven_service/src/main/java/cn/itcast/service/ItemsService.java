package cn.itcast.service;

import cn.itcast.domain.Items;
import org.springframework.stereotype.Service;

public interface ItemsService {
    public Items findById(Integer id);
}
