package controller;

import java.util.List;

import entity.BaseEntity;
import service.BaseEntityService;

public class BaseEntityController {
	public BaseEntityService service = new BaseEntityService();

	public BaseEntity queryBaseEntity(String baseId) {
		System.out.println("BaseEntityController::queryBaseEntitys()...");
		return service.queryById(baseId);
	}

	public List<BaseEntity> queryBaseEntitys() {
		System.out.println("BaseEntityController::queryBaseEntitys()...");
		return service.queryList();
	}

	public void save() {
		System.out.println("BaseEntityController::save()...");
		service.save(new BaseEntity("baseId0", "baseName0"));
	}

	public void update() {
		System.out.println("BaseEntityController::update()...");
		service.update(new BaseEntity("baseId1", "baseName1"));
	}

}
