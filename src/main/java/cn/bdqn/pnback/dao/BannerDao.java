package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Banner;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.Range;

import java.util.List;

public interface BannerDao {
    List<Banner> tcha(@Param("zhuangtai") int zhuangtai);
    int tgai(@Param("id") int id);

    List<Banner> tcha1(@Param("zhuangtai") int zhuangtai);
    int tgai1(@Param("id") int id);
}
