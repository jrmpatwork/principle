package org.tindalos.principle.infrastructure.plugin;

import org.tindalos.principle.domain.expectations.DesignQualityExpectations;
import org.tindalos.principle.domain.expectations.Layering;
import org.tindalos.principle.domain.expectations.PackageCoupling;

public class Checks implements DesignQualityExpectations {
	
	private Layering layering;
	private PackageCoupling packageCoupling;
	
	public Layering getLayering() {
		return layering;
	}
	
	public void setLayering(Layering layering) {
		this.layering = layering;
	}
	
	public PackageCoupling getPackageCoupling() {
		return packageCoupling;
	}
	
	public void setPackageCoupling(PackageCoupling packageCoupling) {
		this.packageCoupling = packageCoupling;
	}


}
