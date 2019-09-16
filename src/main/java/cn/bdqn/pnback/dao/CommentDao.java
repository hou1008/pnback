package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Comment;

import java.util.List;

public interface CommentDao {
    List<Comment> cha();
    int shan(int id);
}
