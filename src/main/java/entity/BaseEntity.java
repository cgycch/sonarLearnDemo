package entity;

public class BaseEntity {
	private String baseId;
	private String baseName;

	public BaseEntity() {
		super();
	}

	public BaseEntity(String baseId, String baseName) {
		super();
		this.baseId = baseId;
		this.baseName = baseName;
	}

	public String getBaseId() {
		return baseId;
	}

	public void setBaseId(String baseId) {
		this.baseId = baseId;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	@Override
	public String toString() {
		return "BaseEntity [baseId=" + baseId + ", baseName=" + baseName + "]";
	}

}
