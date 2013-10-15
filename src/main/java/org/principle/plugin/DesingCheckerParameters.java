package org.principle.plugin;

public class DesingCheckerParameters {
    
    private String basePackage;
    private String appPackage;
    private String domainPackage;
    private String infrastructurePackage;

    public DesingCheckerParameters(String basePackage, String appPackage, String domainPackage,
            String infrastructurePackage) {
        this.basePackage = basePackage;
        this.appPackage = appPackage;
        this.domainPackage = domainPackage;
        this.infrastructurePackage = infrastructurePackage;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getDomainPackage() {
        return domainPackage;
    }

    public String getInfrastructurePackage() {
        return infrastructurePackage;
    }
    
    

}
