package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerService {
    List<Banner> tcha(@Param("zhuangtai") int zhuangtai);
    int tgai(@Param("id") int id);

    List<Banner> tcha1(@Param("zhuangtai") int zhuangtai);
    int tgai1(@Param("id") int id);
}
