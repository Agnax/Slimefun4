package me.mrCookieSlime.Slimefun.utils;

@Deprecated
public enum MachineType {
	
	CAPACITOR("Capacitor"),
	GENERATOR("Generator"),
	MACHINE("Machine");
	
	private final String suffix;
	
	private MachineType(String suffix) {
		this.suffix = suffix;
	}
	
	@Override
	public String toString() {
		return suffix;
	}

}
