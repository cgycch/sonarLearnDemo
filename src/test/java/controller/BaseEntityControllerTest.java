package controller;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import entity.BaseEntity;

public class BaseEntityControllerTest {

	private BaseEntityController controller = new BaseEntityController();

	@Test
	public void queryBaseEntityTest() {
		BaseEntity entity = controller.queryBaseEntity("001");
		System.out.println(entity);
		assertNotNull(entity);
	}

	@Test
	public void queryBaseEntitysTest() {
		List<BaseEntity> entitys = controller.queryBaseEntitys();
		System.out.println(entitys);
		assertNotNull(entitys);
	}

	@Test
	public void saveTest() {
		controller.save();
	}

	@Test
	public void updateTest() {
		controller.update();
	}

}
