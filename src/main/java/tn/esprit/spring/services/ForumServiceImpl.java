package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Forum;
@Service
public class ForumServiceImpl implements IServiceForum {
@Autowired

	@Override
	public List<Forum> retrieveAllForum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Forum addForum(Forum f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteForum(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Forum updateForum(Forum f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Forum retrieveForum(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
