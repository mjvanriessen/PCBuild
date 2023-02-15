/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Spring 2023
 * Feb 14, 2023
 */
package model;


public class PCBuilder {
	
	private String cpuComponent;
	private String gpuComponent;
	private String memorySize;
	private String powerSourceCapacity;
	
	public PCBuilder() {
		super();
	}
	
	public PCBuilder(String cpuComponent, String gpuComponent) {
		super();
		this.cpuComponent = cpuComponent;
		this.gpuComponent = gpuComponent;
	}
	
	public PCBuilder(String cpuComponent, String gpuComponent, String memorySize, String powerSourceCapacity) {
		super();
		this.cpuComponent = cpuComponent;
		this.gpuComponent = cpuComponent;
		this.memorySize = memorySize;
		this.powerSourceCapacity = powerSourceCapacity;
	}

	public String getCpuComponent() {
		return cpuComponent;
	}

	public void setCpuComponent(String cpuComponent) {
		this.cpuComponent = cpuComponent;
	}

	public String getGpuComponent() {
		return gpuComponent;
	}

	public void setGpuComponent(String gpuComponent) {
		this.gpuComponent = gpuComponent;
	}

	public String getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(String memorySize) {
		this.memorySize = memorySize;
	}

	public String getPowerSourceCapacity() {
		return powerSourceCapacity;
	}

	public void setPowerSourceCapacity(String powerSourceCapacity) {
		this.powerSourceCapacity = powerSourceCapacity;
	}
	
	public String recommendMemoryCap() {
		if(this.gpuComponent.equals("AMD Radeon RX 7900XTX") || this.gpuComponent.equals("NVIDIA RTX 4090")) {
			return "32 GB RAM Capacity";
		}
		else {
			return "16 GB RAM Capacity";
		}
	}
	
	public String recommendedWattCap() {
		if(this.gpuComponent.equals("AMD Radeon RX 7900XTX") || this.gpuComponent.equals("NVIDIA RTX 4090")) {
			return "1000W (Considering other PC components' additional power draw)";
		}
		if(this.gpuComponent.equals("AMD Radeon RX 6900XT") || this.gpuComponent.equals("NVIDIA RTX 3090")) {
			return "850W-900W (Considering other PC components' additional power draw)";
		}
		else {
			return "750W (Considering other PC components' additional power draw)";
		}
	}
	

	@Override
	public String toString() {
		return "PC Build: CPU: " + this.cpuComponent + " | GPU: " + this.gpuComponent + " | Memory Capacity: " + this.memorySize + " | Power Source Capacity: " + this.powerSourceCapacity + "W";
	}
	
	

}
