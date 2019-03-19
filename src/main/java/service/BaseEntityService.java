package service;

import java.util.List;

import dao.BaseEntityDao;
import entity.BaseEntity;

public class BaseEntityService {

	private BaseEntityDao dao = new BaseEntityDao();

	public BaseEntity queryById(String baseId) {
		System.out.println("BaseEntityService::queryById()...");
		return dao.queryById(baseId);
	}

	public List<BaseEntity> queryList() {
		System.out.println("BaseEntityService::queryList()...");
		return dao.queryAll();
	}

	public void save(BaseEntity entity) {
		System.out.println("BaseEntityService::save()...");
		dao.save(entity);
	}

	public void update(BaseEntity entity) {
		System.out.println("BaseEntityService::update()...");
		dao.update(entity);
	}

}
