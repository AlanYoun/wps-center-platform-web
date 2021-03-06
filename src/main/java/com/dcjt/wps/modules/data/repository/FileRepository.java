package com.dcjt.wps.modules.data.repository;

import com.dcjt.wps.modules.data.entity.WFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 描述信息
 * 文件持久层接口
 *
 * @author 杨祎
 * @date 2020/10/10
 */
@Repository
public interface FileRepository extends JpaRepository<WFile, String> {
}
