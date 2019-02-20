package com.fanrui.common.repository;

import com.fanrui.common.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User,Long> {
}
