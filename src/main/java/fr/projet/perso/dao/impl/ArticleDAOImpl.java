package fr.projet.perso.dao.impl;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IArticleDAO;
import fr.projet.perso.entities.Article;

@Repository
public class ArticleDAOImpl extends AbstractDAO<Article> implements IArticleDAO {

	public ArticleDAOImpl() {
		setClasse(Article.class);
	}
	
	@Override
	public Article findById(Long id) {
		return super.entityManager.find(Article.class, id);
	}


}
