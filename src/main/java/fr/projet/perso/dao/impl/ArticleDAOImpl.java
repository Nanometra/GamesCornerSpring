package fr.projet.perso.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IArticleDAO;
import fr.projet.perso.entities.Article;

@Repository
public class ArticleDAOImpl implements IArticleDAO {

	@Override
	public Article findById(Long id) {
		
		return null;
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Article article) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Article article) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

}
