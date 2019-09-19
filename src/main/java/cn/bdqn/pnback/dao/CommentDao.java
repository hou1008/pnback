package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Comment;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    /**
     * 获取总条目数
     */
    int getCount();
    /**
     * 获取商品信息通过page,从第一个开始，每页显示几条数据
     */
    List<Comment> getCommentPage(@Param("index") int index, @Param("pageCount") int pageCount);
    List<Comment> cha();
    int shan(int id);
    
}
