package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.CommentDao;
import cn.bdqn.pnback.pojo.Comment;
import cn.bdqn.pnback.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService  {
    @Autowired
    private CommentDao CommentDao;

    @Override
    public int getCount() {
        return CommentDao.getCount();
    }

    @Override
    public List<Comment> getCommentPage(int index, int pageCount) {
        return CommentDao.getCommentPage(index,pageCount);
    }

    @Override
    public List<Comment> cha() {
        return CommentDao.cha();
    }

    @Override
    public int shan(int id) {
        return CommentDao.shan(id);
    }
}
