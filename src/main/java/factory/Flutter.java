package factory;

public class Flutter {
	private SupportedPlatform platform;
	
	public Flutter(SupportedPlatform platform) {
		this.platform = platform;
	}
	
	public UIFactory craeteUIFactory(SupportedPlatform platform) {
		return UIFactoryFactory.createUIFactory(platform);
	}
}
