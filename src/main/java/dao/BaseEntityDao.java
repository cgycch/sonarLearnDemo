package dao;

import java.util.ArrayList;
import java.util.List;

import entity.BaseEntity;

public class BaseEntityDao {

	public BaseEntity queryById(String baseId) {
		System.out.println("BaseEntityDao::queryById()...");
		return new BaseEntity(baseId, "baseName-" + baseId);
	}

	public List<BaseEntity> queryAll() {
		System.out.println("BaseEntityDao::queryAll()...");
		List<BaseEntity> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new BaseEntity("baseId-" + i, "baseName-" + i));
		}
		return list;
	}

	public int save(BaseEntity entity) {
		System.out.println("success save entity: " + entity.toString());
		return 1;
	}

	public int update(BaseEntity entity) {
		System.out.println("success update entity: " + entity.toString());
		return 1;
	}

}
