package fr.projet.perso.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.perso.dao.IArticleDAO;
import fr.projet.perso.entities.Article;
import fr.projet.perso.services.IArticleService;

@Service
public class ArticleServiceImpl implements IArticleService {

	@Autowired
	private IArticleDAO articleDAO;
	
	@Override
	@Transactional
	public Article findById(Long id) {
		return articleDAO.findById(id);
	}

	@Override
	@Transactional
	public List<Article> findAll() {
		return articleDAO.findAll();
	}

	@Override
	@Transactional
	public void add(Article article) {
		articleDAO.add(article);
	}

	@Override
	@Transactional
	public void update(Article article) {
		articleDAO.update(article);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		articleDAO.removeById(id);
	}

}
