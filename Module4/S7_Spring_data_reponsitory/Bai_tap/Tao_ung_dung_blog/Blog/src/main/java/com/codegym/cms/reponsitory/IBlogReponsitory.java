package com.codegym.cms.reponsitory;

import com.codegym.cms.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogReponsitory extends IGeneralRepository<Blog> {
}
